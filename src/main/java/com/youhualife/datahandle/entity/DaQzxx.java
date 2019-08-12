package com.youhualife.datahandle.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 全宗信息
 * </p>
 *
 * @author hunji
 * @since 2019-08-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("DA_QZXX")
public class DaQzxx implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 全宗ID
     */
    @TableId("QZ_ID")
    private String qzId;

    /**
     * 全宗代码
     */
    @TableField("QZDM")
    private String qzdm;

    /**
     * 全宗名称
     */
    @TableField("QZMC")
    private String qzmc;

    /**
     * 级别
     */
    @TableField("JB")
    private Integer jb;

    /**
     * 上级全宗ID
     */
    @TableField("QZID_SJ")
    private String qzidSj;

    /**
     * 行政区编码
     */
    @TableField("XZQBM")
    private String xzqbm;

    /**
     * 备注
     */
    @TableField("BZ")
    private String bz;

    /**
     * 机构编号
     */
    @TableField("ORGID")
    private String orgid;


}
