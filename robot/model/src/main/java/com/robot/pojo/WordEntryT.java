package com.robot.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class WordEntryT {
    private BigDecimal id;

    private String wordEntryName;

    private BigDecimal wordCategoryId;

    private String wordEntryType;

    private BigDecimal applicationId;

    private String applicationCode;

    private String channelCode;

    private String cityCode;

    private BigDecimal createBy;

    private Date createTime;

    private BigDecimal updateBy;

    private Date updateTime;

    private Boolean remove;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getWordEntryName() {
        return wordEntryName;
    }

    public void setWordEntryName(String wordEntryName) {
        this.wordEntryName = wordEntryName == null ? null : wordEntryName.trim();
    }

    public BigDecimal getWordCategoryId() {
        return wordCategoryId;
    }

    public void setWordCategoryId(BigDecimal wordCategoryId) {
        this.wordCategoryId = wordCategoryId;
    }

    public String getWordEntryType() {
        return wordEntryType;
    }

    public void setWordEntryType(String wordEntryType) {
        this.wordEntryType = wordEntryType == null ? null : wordEntryType.trim();
    }

    public BigDecimal getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(BigDecimal applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationCode() {
        return applicationCode;
    }

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode == null ? null : applicationCode.trim();
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public BigDecimal getCreateBy() {
        return createBy;
    }

    public void setCreateBy(BigDecimal createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(BigDecimal updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getRemove() {
        return remove;
    }

    public void setRemove(Boolean remove) {
        this.remove = remove;
    }
}