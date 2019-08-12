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
 * 档案盒
 * </p>
 *
 * @author hunji
 * @since 2019-08-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("DA_DAH")
public class DaDah implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 档案盒ID
     */
    @TableId("DAH_ID")
    private String dahId;

    /**
     * 档案格ID
     */
    @TableField("DAGE_ID")
    private String dageId;

    /**
     * 盒号
     */
    @TableField("HA")
    private String ha;

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
     * 备注
     */
    @TableField("BZ")
    private String bz;

    /**
     * 档案盒状态：0正常，1装满
     */
    @TableField("ZT")
    private Double zt;

    @TableField("ADDUSER")
    private String adduser;

    @TableField("ADDTIME")
    private LocalDateTime addtime;


}
