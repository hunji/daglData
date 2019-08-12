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
 * 档案室
 * </p>
 *
 * @author hunji
 * @since 2019-08-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("DA_DAS")
public class DaDas implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 档案室ID
     */
    @TableId("DAS_ID")
    private String dasId;

    /**
     * 档案室编号
     */
    @TableField("DASBH")
    private String dasbh;

    /**
     * 档案室名称
     */
    @TableField("DASMC")
    private String dasmc;

    /**
     * 面积（m2）
     */
    @TableField("MJ")
    private Double mj;

    /**
     * 库房管理员
     */
    @TableField("KFGLY")
    private String kfgly;

    /**
     * 备注
     */
    @TableField("BZ")
    private String bz;

    @TableField("QZDM")
    private String qzdm;


}
