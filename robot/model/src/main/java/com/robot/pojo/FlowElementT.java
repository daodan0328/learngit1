package com.robot.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class FlowElementT {
    private BigDecimal id;

    private String flowElementName;

    private Boolean sharedStatus;

    private Integer weight;

    private BigDecimal subflowId;

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

    public String getFlowElementName() {
        return flowElementName;
    }

    public void setFlowElementName(String flowElementName) {
        this.flowElementName = flowElementName == null ? null : flowElementName.trim();
    }

    public Boolean getSharedStatus() {
        return sharedStatus;
    }

    public void setSharedStatus(Boolean sharedStatus) {
        this.sharedStatus = sharedStatus;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public BigDecimal getSubflowId() {
        return subflowId;
    }

    public void setSubflowId(BigDecimal subflowId) {
        this.subflowId = subflowId;
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