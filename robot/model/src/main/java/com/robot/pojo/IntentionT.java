package com.robot.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class IntentionT {
    private BigDecimal id;

    private String intentionName;

    private String intentionType;

    private BigDecimal wordCategoryId;

    private BigDecimal centralQuestionId;

    private BigDecimal applicationId;

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

    public String getIntentionName() {
        return intentionName;
    }

    public void setIntentionName(String intentionName) {
        this.intentionName = intentionName == null ? null : intentionName.trim();
    }

    public String getIntentionType() {
        return intentionType;
    }

    public void setIntentionType(String intentionType) {
        this.intentionType = intentionType == null ? null : intentionType.trim();
    }

    public BigDecimal getWordCategoryId() {
        return wordCategoryId;
    }

    public void setWordCategoryId(BigDecimal wordCategoryId) {
        this.wordCategoryId = wordCategoryId;
    }

    public BigDecimal getCentralQuestionId() {
        return centralQuestionId;
    }

    public void setCentralQuestionId(BigDecimal centralQuestionId) {
        this.centralQuestionId = centralQuestionId;
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
}