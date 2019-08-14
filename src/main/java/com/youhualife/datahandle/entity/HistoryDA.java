package com.youhualife.datahandle.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 历史数据模板
 */
@Data
public class HistoryDA implements Serializable {

    private static final long serialVersionUID = 1L;
    private String 档案号;
    private String 档案类型编码;
    private String 案卷号;
    private String 权利类型;
    private String 登记类型;
    private String 权利人名称;
    private String 身份证件号码;
    private String 不动产单元号;
    private String 权属证书号;
    private String 业务号;
    private String 案卷题名;
    private String 坐落;
    private String 页数;
    private String 密级;
    private String 保管期限;
    private String 年度;
    private String 归档日期;
    private String 盒号;
    private String 存储位置;
    private String 查封机关;
    private String 查封文号;
    private String 义务人名称;
    private String 义务人证件号码;
}
