package com.robot.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class DataIncT {
    private BigDecimal id;

    private String tableName;

    private BigDecimal dataId;

    private String dataFlag;

    private Boolean synFlag;

    private String serverAddr;

    private BigDecimal createBy;

    private BigDecimal updateBy;

    private Date lastSynTime;

    private Date createTime;

    private Date updateTime;

    private String synResult;

    private Boolean remove;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public BigDecimal getDataId() {
        return dataId;
    }

    public void setDataId(BigDecimal dataId) {
        this.dataId = dataId;
    }

    public String getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(String dataFlag) {
        this.dataFlag = dataFlag == null ? null : dataFlag.trim();
    }

    public Boolean getSynFlag() {
        return synFlag;
    }

    public void setSynFlag(Boolean synFlag) {
        this.synFlag = synFlag;
    }

    public String getServerAddr() {
        return serverAddr;
    }

    public void setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr == null ? null : serverAddr.trim();
    }

    public BigDecimal getCreateBy() {
        return createBy;
    }

    public void setCreateBy(BigDecimal createBy) {
        this.createBy = createBy;
    }

    public BigDecimal getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(BigDecimal updateBy) {
        this.updateBy = updateBy;
    }

    public Date getLastSynTime() {
        return lastSynTime;
    }

    public void setLastSynTime(Date lastSynTime) {
        this.lastSynTime = lastSynTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getSynResult() {
        return synResult;
    }

    public void setSynResult(String synResult) {
        this.synResult = synResult == null ? null : synResult.trim();
    }

    public Boolean getRemove() {
        return remove;
    }

    public void setRemove(Boolean remove) {
        this.remove = remove;
    }
}