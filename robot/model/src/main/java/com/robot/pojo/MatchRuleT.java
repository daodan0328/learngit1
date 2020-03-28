package com.robot.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class MatchRuleT {
    private BigDecimal id;

    private String matchRule;

    private String matchType;

    private String matchSource;

    private String matchQuestion;

    private String returnValues;

    private Boolean orderedStatus;

    private Boolean enabledStatus;

    private BigDecimal centralQuestionId;

    private String rootCategory;

    private BigDecimal applicationId;

    private BigDecimal createBy;

    private Date createTime;

    private BigDecimal updateBy;

    private Date updateTime;

    private Boolean remove;

    private String applicationCode;

    private String channelCode;

    private String cityCode;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getMatchRule() {
        return matchRule;
    }

    public void setMatchRule(String matchRule) {
        this.matchRule = matchRule == null ? null : matchRule.trim();
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType == null ? null : matchType.trim();
    }

    public String getMatchSource() {
        return matchSource;
    }

    public void setMatchSource(String matchSource) {
        this.matchSource = matchSource == null ? null : matchSource.trim();
    }

    public String getMatchQuestion() {
        return matchQuestion;
    }

    public void setMatchQuestion(String matchQuestion) {
        this.matchQuestion = matchQuestion == null ? null : matchQuestion.trim();
    }

    public String getReturnValues() {
        return returnValues;
    }

    public void setReturnValues(String returnValues) {
        this.returnValues = returnValues == null ? null : returnValues.trim();
    }

    public Boolean getOrderedStatus() {
        return orderedStatus;
    }

    public void setOrderedStatus(Boolean orderedStatus) {
        this.orderedStatus = orderedStatus;
    }

    public Boolean getEnabledStatus() {
        return enabledStatus;
    }

    public void setEnabledStatus(Boolean enabledStatus) {
        this.enabledStatus = enabledStatus;
    }

    public BigDecimal getCentralQuestionId() {
        return centralQuestionId;
    }

    public void setCentralQuestionId(BigDecimal centralQuestionId) {
        this.centralQuestionId = centralQuestionId;
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
}