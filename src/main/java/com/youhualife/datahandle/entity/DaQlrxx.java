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
 * 权利人信息
 * </p>
 *
 * @author hunji
 * @since 2019-08-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("DA_QLRXX")
public class DaQlrxx implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 权利人ID
     */
    @TableId("QLR_ID")
    private String qlrId;

    /**
     * 档案ID
     */
    @TableField("DA_ID")
    private String daId;

    /**
     * 权利人名称
     */
    @TableField("QLRMC")
    private String qlrmc;

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
     * 权利人类型编码
     */
    @TableField("QLRLXBM")
    private String qlrlxbm;

    /**
     * 权利人类型
     */
    @TableField("QLRLXMC")
    private String qlrlxmc;

    /**
     * 不动产权证号
     */
    @TableField("BDCQZH")
    private String bdcqzh;


}
