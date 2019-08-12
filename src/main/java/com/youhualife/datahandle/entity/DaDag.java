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
 * 档案柜
 * </p>
 *
 * @author hunji
 * @since 2019-08-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("DA_DAG")
public class DaDag implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 档案柜ID
     */
    @TableId("DAG_ID")
    private String dagId;

    /**
     * 档案室ID
     */
    @TableField("DAS_ID")
    private String dasId;

    /**
     * 档案柜编号
     */
    @TableField("DAGBH")
    private String dagbh;

    /**
     * 档案柜名称
     */
    @TableField("DAGMC")
    private String dagmc;

    /**
     * 层(行)数
     */
    @TableField("CHS")
    private Integer chs;

    /**
     * 组(列)数
     */
    @TableField("ZLS")
    private Integer zls;

    /**
     * 档案柜位置（排）
     */
    @TableField("DAGWZ_P")
    private Integer dagwzP;

    /**
     * 档案柜位置（列）
     */
    @TableField("DAGWZ_L")
    private Integer dagwzL;

    /**
     * 存储格容量
     */
    @TableField("CCGRL")
    private Integer ccgrl;


}
