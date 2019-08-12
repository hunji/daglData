package com.youhualife.datahandle.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.sql.Blob;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 附件
 * </p>
 *
 * @author hunji
 * @since 2019-08-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("DA_CL_FJ")
public class DaClFj implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 附件ID
     */
    @TableId("FJ_ID")
    private String fjId;

    /**
     * 材料ID
     */
    @TableField("CL_ID")
    private String clId;

    /**
     * 文件名
     */
    @TableField("WJM")
    private String wjm;

    /**
     * 文件大小
     */
    @TableField("WJDX")
    private Long wjdx;

    /**
     * 文件格式
     */
    @TableField("WJGS")
    private String wjgs;

    /**
     * 存储方式
     */
    @TableField("CCFS")
    private String ccfs;

    /**
     * 路径
     */
    @TableField("LJ")
    private String lj;

    /**
     * 文件
     */
    @TableField("WJ")
    private Blob wj;

    /**
     * 排序号
     */
    @TableField("PXH")
    private Integer pxh;

    /**
     * 数据来源：0： 归档过来的 1：档案系统新增的
     */
    @TableField("SJLY")
    private Integer sjly;


}
