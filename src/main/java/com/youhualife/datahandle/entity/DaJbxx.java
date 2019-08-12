package com.youhualife.datahandle.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 档案基本信息
 * </p>
 *
 * @author hunji
 * @since 2019-08-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("DA_JBXX")
public class DaJbxx implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 档案ID
     */
    @TableId("DA_ID")
    private String daId;

    /**
     * 业务号
     */
    @TableField("YWH")
    private String ywh;

    /**
     * 年度
     */
    @TableField("ND")
    private Integer nd;

    /**
     * 案卷序号
     */
    @TableField("AJXH")
    private String ajxh;

    /**
     * 档案号
     */
    @TableField("DAH")
    private String dah;

    /**
     * 档案位置
     */
    @TableField("DAWZ")
    private String dawz;

    /**
     * 题名
     */
    @TableField("TM")
    private String tm;

    /**
     * 密级编码
     */
    @TableField("MJBM")
    private String mjbm;

    /**
     * 密级
     */
    @TableField("MJMC")
    private String mjmc;

    /**
     * 分类代码
     */
    @TableField("FLDM")
    private String fldm;

    /**
     * 分类
     */
    @TableField("FLMC")
    private String flmc;

    /**
     * 不动产单元号
     */
    @TableField("BDCDYH")
    private String bdcdyh;

    /**
     * 权利类型编码
     */
    @TableField("QLLXBM")
    private String qllxbm;

    /**
     * 权利类型
     */
    @TableField("QLLXMC")
    private String qllxmc;

    /**
     * 登记类型编码
     */
    @TableField("DJLXBM")
    private String djlxbm;

    /**
     * 登记类型
     */
    @TableField("DJLXMC")
    private String djlxmc;

    /**
     * 坐落
     */
    @TableField("ZL")
    private String zl;

    /**
     * 保管期限编码
     */
    @TableField("BGQXBM")
    private String bgqxbm;

    /**
     * 保管期限
     */
    @TableField("BGQXMC")
    private String bgqxmc;

    /**
     * 归档时间
     */
    @TableField("GDSJ")
    private LocalDateTime gdsj;

    /**
     * 录入人员
     */
    @TableField("LRRY")
    private String lrry;

    /**
     * 录入时间
     */
    @TableField("LRSJ")
    private LocalDateTime lrsj;

    /**
     * 序列号
     */
    @TableField("XLH")
    private Integer xlh;

    /**
     * 全宗代码
     */
    @TableField("QZDM")
    private String qzdm;

    /**
     * 档案盒ID
     */
    @TableField("DAH_ID")
    private String dahId;

    /**
     * 状态，0待整理、1已整理、2已入库
     */
    @TableField("ZT")
    private Integer zt;

    /**
     * 房屋编码
     */
    @TableField("FWBM")
    private String fwbm;

    /**
     * 档案类型编码
     */
    @TableField("DALXBM")
    private String dalxbm;

    /**
     * 总页数
     */
    @TableField("ZYS")
    private Integer zys;

    /**
     * 档案数据来源 0：不动产登记系统归档 1：档案系统新增
     */
    @TableField("DASJLY")
    private Integer dasjly;

    @TableField("CFJG")
    private String cfjg;

    @TableField("CFWH")
    private String cfwh;

    @TableField("QLRSTR")
    private String qlrstr;

    @TableField("BDCQZHSTR")
    private String bdcqzhstr;

    @TableField("YWRSTR")
    private String ywrstr;

    @TableField("DZH")
    private String dzh;

    @TableField("DAJ_ID")
    private String dajId;

    @TableField("DBSJ")
    private LocalDateTime dbsj;

    @TableField("ZHSJ")
    private LocalDateTime zhsj;

    @TableField("ZSZM")
    private Integer zszm;


}
