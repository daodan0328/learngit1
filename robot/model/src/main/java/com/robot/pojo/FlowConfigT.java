package com.robot.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class FlowConfigT {
    private BigDecimal id;

    private BigDecimal flowId;

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

    public BigDecimal getFlowId() {
        return flowId;
    }

    public void setFlowId(BigDecimal flowId) {
        this.flowId = flowId;
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