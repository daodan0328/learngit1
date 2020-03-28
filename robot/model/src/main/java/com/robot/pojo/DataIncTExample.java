package com.robot.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataIncTExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataIncTExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("table_name is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("table_name =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("table_name <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("table_name >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_name >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("table_name <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("table_name <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("table_name like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("table_name not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("table_name in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("table_name not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("table_name between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("table_name not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNull() {
            addCriterion("data_id is null");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNotNull() {
            addCriterion("data_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataIdEqualTo(BigDecimal value) {
            addCriterion("data_id =", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotEqualTo(BigDecimal value) {
            addCriterion("data_id <>", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThan(BigDecimal value) {
            addCriterion("data_id >", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("data_id >=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThan(BigDecimal value) {
            addCriterion("data_id <", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("data_id <=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdIn(List<BigDecimal> values) {
            addCriterion("data_id in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotIn(List<BigDecimal> values) {
            addCriterion("data_id not in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("data_id between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("data_id not between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataFlagIsNull() {
            addCriterion("data_flag is null");
            return (Criteria) this;
        }

        public Criteria andDataFlagIsNotNull() {
            addCriterion("data_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDataFlagEqualTo(String value) {
            addCriterion("data_flag =", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotEqualTo(String value) {
            addCriterion("data_flag <>", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagGreaterThan(String value) {
            addCriterion("data_flag >", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagGreaterThanOrEqualTo(String value) {
            addCriterion("data_flag >=", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagLessThan(String value) {
            addCriterion("data_flag <", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagLessThanOrEqualTo(String value) {
            addCriterion("data_flag <=", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagLike(String value) {
            addCriterion("data_flag like", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotLike(String value) {
            addCriterion("data_flag not like", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagIn(List<String> values) {
            addCriterion("data_flag in", values, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotIn(List<String> values) {
            addCriterion("data_flag not in", values, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagBetween(String value1, String value2) {
            addCriterion("data_flag between", value1, value2, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotBetween(String value1, String value2) {
            addCriterion("data_flag not between", value1, value2, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andSynFlagIsNull() {
            addCriterion("syn_flag is null");
            return (Criteria) this;
        }

        public Criteria andSynFlagIsNotNull() {
            addCriterion("syn_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSynFlagEqualTo(Boolean value) {
            addCriterion("syn_flag =", value, "synFlag");
            return (Criteria) this;
        }

        public Criteria andSynFlagNotEqualTo(Boolean value) {
            addCriterion("syn_flag <>", value, "synFlag");
            return (Criteria) this;
        }

        public Criteria andSynFlagGreaterThan(Boolean value) {
            addCriterion("syn_flag >", value, "synFlag");
            return (Criteria) this;
        }

        public Criteria andSynFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("syn_flag >=", value, "synFlag");
            return (Criteria) this;
        }

        public Criteria andSynFlagLessThan(Boolean value) {
            addCriterion("syn_flag <", value, "synFlag");
            return (Criteria) this;
        }

        public Criteria andSynFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("syn_flag <=", value, "synFlag");
            return (Criteria) this;
        }

        public Criteria andSynFlagIn(List<Boolean> values) {
            addCriterion("syn_flag in", values, "synFlag");
            return (Criteria) this;
        }

        public Criteria andSynFlagNotIn(List<Boolean> values) {
            addCriterion("syn_flag not in", values, "synFlag");
            return (Criteria) this;
        }

        public Criteria andSynFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("syn_flag between", value1, value2, "synFlag");
            return (Criteria) this;
        }

        public Criteria andSynFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("syn_flag not between", value1, value2, "synFlag");
            return (Criteria) this;
        }

        public Criteria andServerAddrIsNull() {
            addCriterion("server_addr is null");
            return (Criteria) this;
        }

        public Criteria andServerAddrIsNotNull() {
            addCriterion("server_addr is not null");
            return (Criteria) this;
        }

        public Criteria andServerAddrEqualTo(String value) {
            addCriterion("server_addr =", value, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrNotEqualTo(String value) {
            addCriterion("server_addr <>", value, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrGreaterThan(String value) {
            addCriterion("server_addr >", value, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrGreaterThanOrEqualTo(String value) {
            addCriterion("server_addr >=", value, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrLessThan(String value) {
            addCriterion("server_addr <", value, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrLessThanOrEqualTo(String value) {
            addCriterion("server_addr <=", value, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrLike(String value) {
            addCriterion("server_addr like", value, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrNotLike(String value) {
            addCriterion("server_addr not like", value, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrIn(List<String> values) {
            addCriterion("server_addr in", values, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrNotIn(List<String> values) {
            addCriterion("server_addr not in", values, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrBetween(String value1, String value2) {
            addCriterion("server_addr between", value1, value2, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrNotBetween(String value1, String value2) {
            addCriterion("server_addr not between", value1, value2, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(BigDecimal value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(BigDecimal value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(BigDecimal value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(BigDecimal value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(BigDecimal value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<BigDecimal> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<BigDecimal> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(BigDecimal value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(BigDecimal value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(BigDecimal value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(BigDecimal value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(BigDecimal value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<BigDecimal> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<BigDecimal> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andLastSynTimeIsNull() {
            addCriterion("last_syn_time is null");
            return (Criteria) this;
        }

        public Criteria andLastSynTimeIsNotNull() {
            addCriterion("last_syn_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastSynTimeEqualTo(Date value) {
            addCriterion("last_syn_time =", value, "lastSynTime");
            return (Criteria) this;
        }

        public Criteria andLastSynTimeNotEqualTo(Date value) {
            addCriterion("last_syn_time <>", value, "lastSynTime");
            return (Criteria) this;
        }

        public Criteria andLastSynTimeGreaterThan(Date value) {
            addCriterion("last_syn_time >", value, "lastSynTime");
            return (Criteria) this;
        }

        public Criteria andLastSynTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_syn_time >=", value, "lastSynTime");
            return (Criteria) this;
        }

        public Criteria andLastSynTimeLessThan(Date value) {
            addCriterion("last_syn_time <", value, "lastSynTime");
            return (Criteria) this;
        }

        public Criteria andLastSynTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_syn_time <=", value, "lastSynTime");
            return (Criteria) this;
        }

        public Criteria andLastSynTimeIn(List<Date> values) {
            addCriterion("last_syn_time in", values, "lastSynTime");
            return (Criteria) this;
        }

        public Criteria andLastSynTimeNotIn(List<Date> values) {
            addCriterion("last_syn_time not in", values, "lastSynTime");
            return (Criteria) this;
        }

        public Criteria andLastSynTimeBetween(Date value1, Date value2) {
            addCriterion("last_syn_time between", value1, value2, "lastSynTime");
            return (Criteria) this;
        }

        public Criteria andLastSynTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_syn_time not between", value1, value2, "lastSynTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andSynResultIsNull() {
            addCriterion("syn_result is null");
            return (Criteria) this;
        }

        public Criteria andSynResultIsNotNull() {
            addCriterion("syn_result is not null");
            return (Criteria) this;
        }

        public Criteria andSynResultEqualTo(String value) {
            addCriterion("syn_result =", value, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynResultNotEqualTo(String value) {
            addCriterion("syn_result <>", value, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynResultGreaterThan(String value) {
            addCriterion("syn_result >", value, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynResultGreaterThanOrEqualTo(String value) {
            addCriterion("syn_result >=", value, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynResultLessThan(String value) {
            addCriterion("syn_result <", value, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynResultLessThanOrEqualTo(String value) {
            addCriterion("syn_result <=", value, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynResultLike(String value) {
            addCriterion("syn_result like", value, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynResultNotLike(String value) {
            addCriterion("syn_result not like", value, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynResultIn(List<String> values) {
            addCriterion("syn_result in", values, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynResultNotIn(List<String> values) {
            addCriterion("syn_result not in", values, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynResultBetween(String value1, String value2) {
            addCriterion("syn_result between", value1, value2, "synResult");
            return (Criteria) this;
        }

        public Criteria andSynResultNotBetween(String value1, String value2) {
            addCriterion("syn_result not between", value1, value2, "synResult");
            return (Criteria) this;
        }

        public Criteria andRemoveIsNull() {
            addCriterion("remove is null");
            return (Criteria) this;
        }

        public Criteria andRemoveIsNotNull() {
            addCriterion("remove is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveEqualTo(Boolean value) {
            addCriterion("remove =", value, "remove");
            return (Criteria) this;
        }

        public Criteria andRemoveNotEqualTo(Boolean value) {
            addCriterion("remove <>", value, "remove");
            return (Criteria) this;
        }

        public Criteria andRemoveGreaterThan(Boolean value) {
            addCriterion("remove >", value, "remove");
            return (Criteria) this;
        }

        public Criteria andRemoveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("remove >=", value, "remove");
            return (Criteria) this;
        }

        public Criteria andRemoveLessThan(Boolean value) {
            addCriterion("remove <", value, "remove");
            return (Criteria) this;
        }

        public Criteria andRemoveLessThanOrEqualTo(Boolean value) {
            addCriterion("remove <=", value, "remove");
            return (Criteria) this;
        }

        public Criteria andRemoveIn(List<Boolean> values) {
            addCriterion("remove in", values, "remove");
            return (Criteria) this;
        }

        public Criteria andRemoveNotIn(List<Boolean> values) {
            addCriterion("remove not in", values, "remove");
            return (Criteria) this;
        }

        public Criteria andRemoveBetween(Boolean value1, Boolean value2) {
            addCriterion("remove between", value1, value2, "remove");
            return (Criteria) this;
        }

        public Criteria andRemoveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("remove not between", value1, value2, "remove");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}