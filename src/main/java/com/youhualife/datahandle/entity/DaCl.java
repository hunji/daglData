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
 * 材料
 * </p>
 *
 * @author hunji
 * @since 2019-08-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("DA_CL")
public class DaCl implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 材料ID
     */
    @TableId("CL_ID")
    private String clId;

    /**
     * 档案ID
     */
    @TableField("DA_ID")
    private String daId;

    /**
     * 材料名称
     */
    @TableField("CLMC")
    private String clmc;

    /**
     * 材料编码
     */
    @TableField("CLBM")
    private String clbm;

    /**
     * 起始页
     */
    @TableField("QSY")
    private Integer qsy;

    /**
     * 结束页
     */
    @TableField("JSY")
    private Integer jsy;

    /**
     * 排序号
     */
    @TableField("PXH")
    private Integer pxh;

    /**
     * 页数
     */
    @TableField("YS")
    private Integer ys;

    /**
     * 数据来源：0： 归档过来的 1：档案系统新增的
     */
    @TableField("SJLY")
    private Integer sjly;

    @TableField("BZ")
    private String bz;

    @TableField("CLXS")
    private String clxs;


}
