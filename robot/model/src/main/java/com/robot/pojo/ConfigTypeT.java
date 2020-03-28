package com.robot.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ConfigTypeT {
    private BigDecimal id;

    private String configTypeName;

    private String configTypeCode;

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

    public String getConfigTypeName() {
        return configTypeName;
    }

    public void setConfigTypeName(String configTypeName) {
        this.configTypeName = configTypeName == null ? null : configTypeName.trim();
    }

    public String getConfigTypeCode() {
        return configTypeCode;
    }

    public void setConfigTypeCode(String configTypeCode) {
        this.configTypeCode = configTypeCode == null ? null : configTypeCode.trim();
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