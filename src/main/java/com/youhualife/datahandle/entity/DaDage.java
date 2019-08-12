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
 * 档案格
 * </p>
 *
 * @author hunji
 * @since 2019-08-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("DA_DAGE")
public class DaDage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 档案格ID
     */
    @TableId("DAGE_ID")
    private String dageId;

    /**
     * 档案柜ID
     */
    @TableField("DAG_ID")
    private String dagId;

    /**
     * 档案格编号
     */
    @TableField("DAGEBH")
    private String dagebh;

    /**
     * 档案格名称
     */
    @TableField("DAGEMC")
    private String dagemc;

    /**
     * 所在层
     */
    @TableField("SZC")
    private Integer szc;

    /**
     * 所在列
     */
    @TableField("SZL")
    private Integer szl;


}
