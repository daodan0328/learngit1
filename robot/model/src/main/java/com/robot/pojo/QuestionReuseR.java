package com.robot.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class QuestionReuseR {
    private BigDecimal id;

    private BigDecimal centralQuestionId;

    private String centralQuestionName;

    private BigDecimal reuseCentralQuestionId;

    private String reuseCentralQuestionName;

    private BigDecimal businessWordId;

    private Long relevancy;

    private Boolean enabledStatus;

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

    public BigDecimal getCentralQuestionId() {
        return centralQuestionId;
    }

    public void setCentralQuestionId(BigDecimal centralQuestionId) {
        this.centralQuestionId = centralQuestionId;
    }

    public String getCentralQuestionName() {
        return centralQuestionName;
    }

    public void setCentralQuestionName(String centralQuestionName) {
        this.centralQuestionName = centralQuestionName == null ? null : centralQuestionName.trim();
    }

    public BigDecimal getReuseCentralQuestionId() {
        return reuseCentralQuestionId;
    }

    public void setReuseCentralQuestionId(BigDecimal reuseCentralQuestionId) {
        this.reuseCentralQuestionId = reuseCentralQuestionId;
    }

    public String getReuseCentralQuestionName() {
        return reuseCentralQuestionName;
    }

    public void setReuseCentralQuestionName(String reuseCentralQuestionName) {
        this.reuseCentralQuestionName = reuseCentralQuestionName == null ? null : reuseCentralQuestionName.trim();
    }

    public BigDecimal getBusinessWordId() {
        return businessWordId;
    }

    public void setBusinessWordId(BigDecimal businessWordId) {
        this.businessWordId = businessWordId;
    }

    public Long getRelevancy() {
        return relevancy;
    }

    public void setRelevancy(Long relevancy) {
        this.relevancy = relevancy;
    }

    public Boolean getEnabledStatus() {
        return enabledStatus;
    }

    public void setEnabledStatus(Boolean enabledStatus) {
        this.enabledStatus = enabledStatus;
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