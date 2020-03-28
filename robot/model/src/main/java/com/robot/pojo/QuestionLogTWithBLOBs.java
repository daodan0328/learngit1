package com.robot.pojo;

public class QuestionLogTWithBLOBs extends QuestionLogT {
    private String standardInputJson;

    private String standardOutputJson;

    private String replyContent;

    public String getStandardInputJson() {
        return standardInputJson;
    }

    public void setStandardInputJson(String standardInputJson) {
        this.standardInputJson = standardInputJson == null ? null : standardInputJson.trim();
    }

    public String getStandardOutputJson() {
        return standardOutputJson;
    }

    public void setStandardOutputJson(String standardOutputJson) {
        this.standardOutputJson = standardOutputJson == null ? null : standardOutputJson.trim();
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }
}