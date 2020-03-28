package com.robot.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class QuestionExtendT {
    private BigDecimal id;

    private String extendQuestionName;

    private BigDecimal centralQuestionId;

    private Boolean exclusiveStatus;

    private Boolean questionType;

    private Boolean trainStatus;

    private Boolean understandStatus;

    private String rootCategory;

    private BigDecimal applicationId;

    private String applicationCode;

    private String channelCode;

    private String cityCode;

    private BigDecimal createBy;

    private Date createTime;

    private BigDecimal updateBy;

    private Date updateTime;

    private Boolean remove;

    private String understandResult;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getExtendQuestionName() {
        return extendQuestionName;
    }

    public void setExtendQuestionName(String extendQuestionName) {
        this.extendQuestionName = extendQuestionName == null ? null : extendQuestionName.trim();
    }

    public BigDecimal getCentralQuestionId() {
        return centralQuestionId;
    }

    public void setCentralQuestionId(BigDecimal centralQuestionId) {
        this.centralQuestionId = centralQuestionId;
    }

    public Boolean getExclusiveStatus() {
        return exclusiveStatus;
    }

    public void setExclusiveStatus(Boolean exclusiveStatus) {
        this.exclusiveStatus = exclusiveStatus;
    }

    public Boolean getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Boolean questionType) {
        this.questionType = questionType;
    }

    public Boolean getTrainStatus() {
        return trainStatus;
    }

    public void setTrainStatus(Boolean trainStatus) {
        this.trainStatus = trainStatus;
    }

    public Boolean getUnderstandStatus() {
        return understandStatus;
    }

    public void setUnderstandStatus(Boolean understandStatus) {
        this.understandStatus = understandStatus;
    }

    public String getRootCategory() {
        return rootCategory;
    }

    public void setRootCategory(String rootCategory) {
        this.rootCategory = rootCategory == null ? null : rootCategory.trim();
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

    public String getUnderstandResult() {
        return understandResult;
    }

    public void setUnderstandResult(String understandResult) {
        this.understandResult = understandResult == null ? null : understandResult.trim();
    }
}