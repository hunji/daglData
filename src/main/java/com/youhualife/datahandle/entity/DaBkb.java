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
 * 备考表
 * </p>
 *
 * @author hunji
 * @since 2019-08-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("DA_BKB")
public class DaBkb implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 备考表ID
     */
    @TableId("BKB_ID")
    private String bkbId;

    /**
     * 正文
     */
    @TableField("ZW")
    private String zw;

    /**
     * 立卷人
     */
    @TableField("LJR")
    private String ljr;

    /**
     * 立卷时间
     */
    @TableField("LJSJ")
    private LocalDateTime ljsj;

    /**
     * 审核人
     */
    @TableField("SHR")
    private String shr;

    /**
     * 审核时间
     */
    @TableField("SHSJ")
    private LocalDateTime shsj;

    /**
     * 立卷单位
     */
    @TableField("LJDW")
    private String ljdw;

    @TableField("BZ")
    private String bz;


}
