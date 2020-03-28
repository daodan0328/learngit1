package com.robot.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class QuestionLogT {
    private BigDecimal id;

    private String logType;

    private String userQuestion;

    private String answerSource;

    private String answerChannel;

    private String constraintRule;

    private Date startTime;

    private Date endTime;

    private String nlpServer;

    private Date replyTime;

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

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType == null ? null : logType.trim();
    }

    public String getUserQuestion() {
        return userQuestion;
    }

    public void setUserQuestion(String userQuestion) {
        this.userQuestion = userQuestion == null ? null : userQuestion.trim();
    }

    public String getAnswerSource() {
        return answerSource;
    }

    public void setAnswerSource(String answerSource) {
        this.answerSource = answerSource == null ? null : answerSource.trim();
    }

    public String getAnswerChannel() {
        return answerChannel;
    }

    public void setAnswerChannel(String answerChannel) {
        this.answerChannel = answerChannel == null ? null : answerChannel.trim();
    }

    public String getConstraintRule() {
        return constraintRule;
    }

    public void setConstraintRule(String constraintRule) {
        this.constraintRule = constraintRule == null ? null : constraintRule.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getNlpServer() {
        return nlpServer;
    }

    public void setNlpServer(String nlpServer) {
        this.nlpServer = nlpServer == null ? null : nlpServer.trim();
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
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