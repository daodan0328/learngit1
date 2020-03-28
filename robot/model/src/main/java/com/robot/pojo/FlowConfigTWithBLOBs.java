package com.robot.pojo;

public class FlowConfigTWithBLOBs extends FlowConfigT {
    private String viewContent;

    private String dataContent;

    public String getViewContent() {
        return viewContent;
    }

    public void setViewContent(String viewContent) {
        this.viewContent = viewContent == null ? null : viewContent.trim();
    }

    public String getDataContent() {
        return dataContent;
    }

    public void setDataContent(String dataContent) {
        this.dataContent = dataContent == null ? null : dataContent.trim();
    }
}