package com.robot.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class FlowParamT {
    private BigDecimal id;

    private String paramName;

    private String paramType;

    private Boolean sharedStatus;

    private String paramSource;

    private BigDecimal intentionId;

    private BigDecimal flowId;

    private BigDecimal interfaceId;

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

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }

    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType == null ? null : paramType.trim();
    }

    public Boolean getSharedStatus() {
        return sharedStatus;
    }

    public void setSharedStatus(Boolean sharedStatus) {
        this.sharedStatus = sharedStatus;
    }

    public String getParamSource() {
        return paramSource;
    }

    public void setParamSource(String paramSource) {
        this.paramSource = paramSource == null ? null : paramSource.trim();
    }

    public BigDecimal getIntentionId() {
        return intentionId;
    }

    public void setIntentionId(BigDecimal intentionId) {
        this.intentionId = intentionId;
    }

    public BigDecimal getFlowId() {
        return flowId;
    }

    public void setFlowId(BigDecimal flowId) {
        this.flowId = flowId;
    }

    public BigDecimal getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(BigDecimal interfaceId) {
        this.interfaceId = interfaceId;
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