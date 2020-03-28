package com.robot.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class QuestionCentralT {
    private BigDecimal id;

    private BigDecimal questionCategoryId;

    private String centralQuestionName;

    private String centralQuestionAbstract;

    private Boolean enabledStatus;

    private Boolean validStatus;

    private Date validFromDate;

    private Date validToDate;

    private String rootCategory;

    private Integer applicationId;

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

    public BigDecimal getQuestionCategoryId() {
        return questionCategoryId;
    }

    public void setQuestionCategoryId(BigDecimal questionCategoryId) {
        this.questionCategoryId = questionCategoryId;
    }

    public String getCentralQuestionName() {
        return centralQuestionName;
    }

    public void setCentralQuestionName(String centralQuestionName) {
        this.centralQuestionName = centralQuestionName == null ? null : centralQuestionName.trim();
    }

    public String getCentralQuestionAbstract() {
        return centralQuestionAbstract;
    }

    public void setCentralQuestionAbstract(String centralQuestionAbstract) {
        this.centralQuestionAbstract = centralQuestionAbstract == null ? null : centralQuestionAbstract.trim();
    }

    public Boolean getEnabledStatus() {
        return enabledStatus;
    }

    public void setEnabledStatus(Boolean enabledStatus) {
        this.enabledStatus = enabledStatus;
    }

    public Boolean getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(Boolean validStatus) {
        this.validStatus = validStatus;
    }

    public Date getValidFromDate() {
        return validFromDate;
    }

    public void setValidFromDate(Date validFromDate) {
        this.validFromDate = validFromDate;
    }

    public Date getValidToDate() {
        return validToDate;
    }

    public void setValidToDate(Date validToDate) {
        this.validToDate = validToDate;
    }

    public String getRootCategory() {
        return rootCategory;
    }

    public void setRootCategory(String rootCategory) {
        this.rootCategory = rootCategory == null ? null : rootCategory.trim();
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
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