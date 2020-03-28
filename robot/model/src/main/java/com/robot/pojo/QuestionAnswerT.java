package com.robot.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class QuestionAnswerT {
    private BigDecimal id;

    private BigDecimal centralQuestionId;

    private String answerType;

    private BigDecimal answerTemplateId;

    private BigDecimal flowId;

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

    private String answerContent;

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

    public String getAnswerType() {
        return answerType;
    }

    public void setAnswerType(String answerType) {
        this.answerType = answerType == null ? null : answerType.trim();
    }

    public BigDecimal getAnswerTemplateId() {
        return answerTemplateId;
    }

    public void setAnswerTemplateId(BigDecimal answerTemplateId) {
        this.answerTemplateId = answerTemplateId;
    }

    public BigDecimal getFlowId() {
        return flowId;
    }

    public void setFlowId(BigDecimal flowId) {
        this.flowId = flowId;
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

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent == null ? null : answerContent.trim();
    }
}