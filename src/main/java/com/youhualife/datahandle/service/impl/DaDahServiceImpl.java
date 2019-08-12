package com.youhualife.datahandle.service.impl;

import com.youhualife.datahandle.entity.DaDah;
import com.youhualife.datahandle.mapper.DaDahMapper;
import com.youhualife.datahandle.service.IDaBkbService;
import com.youhualife.datahandle.service.IDaDahService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 档案盒 服务实现类
 * </p>
 *
 * @author hunji
 * @since 2019-08-12
 */
@Service
@Slf4j
public class DaDahServiceImpl extends ServiceImpl<DaDahMapper, DaDah> implements IDaDahService {
    @Autowired
    private IDaBkbService bkbService;

    @Override
    public void test() {
        System.out.println(bkbService.count());
        log.info("测试");
        log.error("测试");
    }
}
