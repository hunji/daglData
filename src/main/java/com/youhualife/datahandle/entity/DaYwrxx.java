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
 * 义务人信息
 * </p>
 *
 * @author hunji
 * @since 2019-08-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("DA_YWRXX")
public class DaYwrxx implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 义务人ID
     */
    @TableId("YWR_ID")
    private String ywrId;

    /**
     * 义务人名称
     */
    @TableField("YWRMC")
    private String ywrmc;

    /**
     * 证件种类编码
     */
    @TableField("ZJZLBM")
    private String zjzlbm;

    /**
     * 证件种类
     */
    @TableField("ZJZLMC")
    private String zjzlmc;

    /**
     * 证件号
     */
    @TableField("ZJH")
    private String zjh;

    /**
     * 义务人类型编码
     */
    @TableField("YWRLXBM")
    private String ywrlxbm;

    /**
     * 义务人类型
     */
    @TableField("YWRLXMC")
    private String ywrlxmc;

    /**
     * 档案ID
     */
    @TableField("DA_ID")
    private String daId;


}
