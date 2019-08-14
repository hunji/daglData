package com.youhualife.datahandle.management;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.youhualife.datahandle.entity.*;
import com.youhualife.datahandle.service.*;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

/**
 * 核心操作类
 */
@Component
@Slf4j
@AllArgsConstructor
public class HandleWork {
    private IDaQzxxService qzxxService;
    private IDaJbxxService jbxxService;
    private IDaDasService dasService;
    private IDaDagService dagService;
    private IDaDageService dageService;
    private IDaDahService dahService;

    public void Handle() throws Exception {
        // 1.0 导入历史数据（目前是从excel中读入到内存）
        //      如果数据量大可以Sax读取方式--》或者之后可以定制从别的数据库中读取
        // 2.1 处理数据
        // 2.2 处理附件信息
        List<HistoryDA> historyDAList = getHistoryDAList();
        HandleData(historyDAList);
        log.error("---------------处理完成---------------");
    }

    /**
     * 1.0
     * @return
     */
    private List<HistoryDA> getHistoryDAList() {
        // 这个
        ExcelReader reader = ExcelUtil.getReader("e:/历史数据.xlsx");
        List<HistoryDA> historyDAList = reader.readAll(HistoryDA.class);

        log.error("---------------共有"+historyDAList.size()+"条历史数据。---------------");
        return historyDAList;
    }

    /**
     * 2.1
     * @param historyDatas
     */
    private void HandleData(List<HistoryDA> historyDatas) throws Exception {
        int countNum = 1;
        String qzdm;
        // 查找全宗号：如果没有进行提示，需要在档案系统中进行设置
        List<DaQzxx> list = qzxxService.list();
        if(list==null || list.size()!=1){
            throw new Exception("系统全宗信息不正确");
        }else{
            qzdm = list.get(0).getQzdm();
        }

        for (HistoryDA historyData : historyDatas) {
            log.error("正在处理第"+ countNum++ +"条数据,档案号为："+historyData.get档案号());

            // 根据档案号查找档案是否已经存在，避免重复导入
            int daCount = jbxxService.count(new QueryWrapper<DaJbxx>().eq("DAH", historyData.get档案号()));
            if(daCount>0){
                log.error("已导入，不可重复导入!");
                continue;
            }

            // 2.1.1 位置信息
            // 档案室编号-档案柜编号-排-列 1-1-2-3
            // zt:0,1,2 分别为未装盒，装盒，上架
            int zt=1;
            String DAGEId="";
            String DAHId="";
            // 当存储位置不为空，且格式正确时进行处理
            if (!historyData.get存储位置().equals("")) {
                String[] wzList = historyData.get存储位置().split("-");
                if(wzList.length == 4){
                    DaDas dasEntity = dasService.getOne(new QueryWrapper<DaDas>().eq("DASBH", wzList[0]));
                    if(dasEntity!=null){
                        DaDag dagEntity = dagService.getOne(new QueryWrapper<DaDag>()
                                .eq("DAGBH", wzList[1])
                                .eq("DAS_ID",dasEntity.getDasId()));
                        if(dagEntity!=null){
                            DaDage dageEntity = dageService.getOne(new QueryWrapper<DaDage>()
                                    .eq("DAGEBH", wzList[2] + "-" + wzList[3])
                                    .eq("DAG_ID", dagEntity.getDagId()));
                            if(dageEntity != null){
                                DAGEId = dageEntity.getDageId();
                            }else{
                                log.error("档案格编号不存在："+ wzList[2]+"-"+wzList[3]);
                            }

                        }else{
                            log.error("档案柜编号不存在："+ wzList[1]);
                        }
                    }else{
                        log.error("档案室编号不存在："+ wzList[0]);
                    }
                }else{
                    log.error("存储位置格式不正确："+historyData.get存储位置());
                }
            }
            if(!DAGEId.equals("")){
                zt = 2;
            }
            if(historyData.get盒号().equals("")){
                zt = 0;
            }
            // 2.1.2基本信息
            String newId = UUID.randomUUID().toString().replace("-", "");
            DaJbxx daJbxx = new DaJbxx();
            daJbxx.setDaId(newId);
            daJbxx.setQzdm(qzdm);
            daJbxx.setDasjly(1);
            daJbxx.setDah(historyData.get档案号());
            daJbxx.setAjxh(historyData.get案卷号());
            daJbxx.setZt(zt);

            // 2.1.3附件信息
            // 2.1.4挂接附件
            jbxxService.save(daJbxx);
        }
    }

}
