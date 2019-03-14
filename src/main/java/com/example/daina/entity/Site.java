package com.example.daina.entity;

/**
 * @author: Daina
 * @description:
 * @date: Created in 14:18 2019/3/13
 */
public class Site {
    private String siteId;
    private String siteName;
    private String siteUrl;
    private String siteIndex;
    private String icon;
    private Integer orderLevel;
    private Integer delFlag;

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public String getSiteIndex() {
        return siteIndex;
    }

    public void setSiteIndex(String siteIndex) {
        this.siteIndex = siteIndex;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getOrderLevel() {
        return orderLevel;
    }

    public void setOrderLevel(Integer orderLevel) {
        this.orderLevel = orderLevel;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
}
