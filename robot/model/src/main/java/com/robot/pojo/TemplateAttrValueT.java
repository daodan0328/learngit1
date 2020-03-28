package com.robot.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class TemplateAttrValueT {
    private BigDecimal id;

    private String templateAttrName;

    private String templateAttrValue;

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

    public String getTemplateAttrName() {
        return templateAttrName;
    }

    public void setTemplateAttrName(String templateAttrName) {
        this.templateAttrName = templateAttrName == null ? null : templateAttrName.trim();
    }

    public String getTemplateAttrValue() {
        return templateAttrValue;
    }

    public void setTemplateAttrValue(String templateAttrValue) {
        this.templateAttrValue = templateAttrValue == null ? null : templateAttrValue.trim();
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