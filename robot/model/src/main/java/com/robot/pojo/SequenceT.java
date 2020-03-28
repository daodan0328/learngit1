package com.robot.pojo;

import java.math.BigDecimal;

public class SequenceT {
    private String sequenceName;

    private BigDecimal currentValue;

    private Boolean increment;

    public String getSequenceName() {
        return sequenceName;
    }

    public void setSequenceName(String sequenceName) {
        this.sequenceName = sequenceName == null ? null : sequenceName.trim();
    }

    public BigDecimal getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(BigDecimal currentValue) {
        this.currentValue = currentValue;
    }

    public Boolean getIncrement() {
        return increment;
    }

    public void setIncrement(Boolean increment) {
        this.increment = increment;
    }
}