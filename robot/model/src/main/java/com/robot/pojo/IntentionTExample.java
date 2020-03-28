package com.robot.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IntentionTExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntentionTExample() {
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

        public Criteria andIntentionNameIsNull() {
            addCriterion("intention_name is null");
            return (Criteria) this;
        }

        public Criteria andIntentionNameIsNotNull() {
            addCriterion("intention_name is not null");
            return (Criteria) this;
        }

        public Criteria andIntentionNameEqualTo(String value) {
            addCriterion("intention_name =", value, "intentionName");
            return (Criteria) this;
        }

        public Criteria andIntentionNameNotEqualTo(String value) {
            addCriterion("intention_name <>", value, "intentionName");
            return (Criteria) this;
        }

        public Criteria andIntentionNameGreaterThan(String value) {
            addCriterion("intention_name >", value, "intentionName");
            return (Criteria) this;
        }

        public Criteria andIntentionNameGreaterThanOrEqualTo(String value) {
            addCriterion("intention_name >=", value, "intentionName");
            return (Criteria) this;
        }

        public Criteria andIntentionNameLessThan(String value) {
            addCriterion("intention_name <", value, "intentionName");
            return (Criteria) this;
        }

        public Criteria andIntentionNameLessThanOrEqualTo(String value) {
            addCriterion("intention_name <=", value, "intentionName");
            return (Criteria) this;
        }

        public Criteria andIntentionNameLike(String value) {
            addCriterion("intention_name like", value, "intentionName");
            return (Criteria) this;
        }

        public Criteria andIntentionNameNotLike(String value) {
            addCriterion("intention_name not like", value, "intentionName");
            return (Criteria) this;
        }

        public Criteria andIntentionNameIn(List<String> values) {
            addCriterion("intention_name in", values, "intentionName");
            return (Criteria) this;
        }

        public Criteria andIntentionNameNotIn(List<String> values) {
            addCriterion("intention_name not in", values, "intentionName");
            return (Criteria) this;
        }

        public Criteria andIntentionNameBetween(String value1, String value2) {
            addCriterion("intention_name between", value1, value2, "intentionName");
            return (Criteria) this;
        }

        public Criteria andIntentionNameNotBetween(String value1, String value2) {
            addCriterion("intention_name not between", value1, value2, "intentionName");
            return (Criteria) this;
        }

        public Criteria andIntentionTypeIsNull() {
            addCriterion("intention_type is null");
            return (Criteria) this;
        }

        public Criteria andIntentionTypeIsNotNull() {
            addCriterion("intention_type is not null");
            return (Criteria) this;
        }

        public Criteria andIntentionTypeEqualTo(String value) {
            addCriterion("intention_type =", value, "intentionType");
            return (Criteria) this;
        }

        public Criteria andIntentionTypeNotEqualTo(String value) {
            addCriterion("intention_type <>", value, "intentionType");
            return (Criteria) this;
        }

        public Criteria andIntentionTypeGreaterThan(String value) {
            addCriterion("intention_type >", value, "intentionType");
            return (Criteria) this;
        }

        public Criteria andIntentionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("intention_type >=", value, "intentionType");
            return (Criteria) this;
        }

        public Criteria andIntentionTypeLessThan(String value) {
            addCriterion("intention_type <", value, "intentionType");
            return (Criteria) this;
        }

        public Criteria andIntentionTypeLessThanOrEqualTo(String value) {
            addCriterion("intention_type <=", value, "intentionType");
            return (Criteria) this;
        }

        public Criteria andIntentionTypeLike(String value) {
            addCriterion("intention_type like", value, "intentionType");
            return (Criteria) this;
        }

        public Criteria andIntentionTypeNotLike(String value) {
            addCriterion("intention_type not like", value, "intentionType");
            return (Criteria) this;
        }

        public Criteria andIntentionTypeIn(List<String> values) {
            addCriterion("intention_type in", values, "intentionType");
            return (Criteria) this;
        }

        public Criteria andIntentionTypeNotIn(List<String> values) {
            addCriterion("intention_type not in", values, "intentionType");
            return (Criteria) this;
        }

        public Criteria andIntentionTypeBetween(String value1, String value2) {
            addCriterion("intention_type between", value1, value2, "intentionType");
            return (Criteria) this;
        }

        public Criteria andIntentionTypeNotBetween(String value1, String value2) {
            addCriterion("intention_type not between", value1, value2, "intentionType");
            return (Criteria) this;
        }

        public Criteria andWordCategoryIdIsNull() {
            addCriterion("word_category_id is null");
            return (Criteria) this;
        }

        public Criteria andWordCategoryIdIsNotNull() {
            addCriterion("word_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andWordCategoryIdEqualTo(BigDecimal value) {
            addCriterion("word_category_id =", value, "wordCategoryId");
            return (Criteria) this;
        }

        public Criteria andWordCategoryIdNotEqualTo(BigDecimal value) {
            addCriterion("word_category_id <>", value, "wordCategoryId");
            return (Criteria) this;
        }

        public Criteria andWordCategoryIdGreaterThan(BigDecimal value) {
            addCriterion("word_category_id >", value, "wordCategoryId");
            return (Criteria) this;
        }

        public Criteria andWordCategoryIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("word_category_id >=", value, "wordCategoryId");
            return (Criteria) this;
        }

        public Criteria andWordCategoryIdLessThan(BigDecimal value) {
            addCriterion("word_category_id <", value, "wordCategoryId");
            return (Criteria) this;
        }

        public Criteria andWordCategoryIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("word_category_id <=", value, "wordCategoryId");
            return (Criteria) this;
        }

        public Criteria andWordCategoryIdIn(List<BigDecimal> values) {
            addCriterion("word_category_id in", values, "wordCategoryId");
            return (Criteria) this;
        }

        public Criteria andWordCategoryIdNotIn(List<BigDecimal> values) {
            addCriterion("word_category_id not in", values, "wordCategoryId");
            return (Criteria) this;
        }

        public Criteria andWordCategoryIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("word_category_id between", value1, value2, "wordCategoryId");
            return (Criteria) this;
        }

        public Criteria andWordCategoryIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("word_category_id not between", value1, value2, "wordCategoryId");
            return (Criteria) this;
        }

        public Criteria andCentralQuestionIdIsNull() {
            addCriterion("central_question_id is null");
            return (Criteria) this;
        }

        public Criteria andCentralQuestionIdIsNotNull() {
            addCriterion("central_question_id is not null");
            return (Criteria) this;
        }

        public Criteria andCentralQuestionIdEqualTo(BigDecimal value) {
            addCriterion("central_question_id =", value, "centralQuestionId");
            return (Criteria) this;
        }

        public Criteria andCentralQuestionIdNotEqualTo(BigDecimal value) {
            addCriterion("central_question_id <>", value, "centralQuestionId");
            return (Criteria) this;
        }

        public Criteria andCentralQuestionIdGreaterThan(BigDecimal value) {
            addCriterion("central_question_id >", value, "centralQuestionId");
            return (Criteria) this;
        }

        public Criteria andCentralQuestionIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("central_question_id >=", value, "centralQuestionId");
            return (Criteria) this;
        }

        public Criteria andCentralQuestionIdLessThan(BigDecimal value) {
            addCriterion("central_question_id <", value, "centralQuestionId");
            return (Criteria) this;
        }

        public Criteria andCentralQuestionIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("central_question_id <=", value, "centralQuestionId");
            return (Criteria) this;
        }

        public Criteria andCentralQuestionIdIn(List<BigDecimal> values) {
            addCriterion("central_question_id in", values, "centralQuestionId");
            return (Criteria) this;
        }

        public Criteria andCentralQuestionIdNotIn(List<BigDecimal> values) {
            addCriterion("central_question_id not in", values, "centralQuestionId");
            return (Criteria) this;
        }

        public Criteria andCentralQuestionIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("central_question_id between", value1, value2, "centralQuestionId");
            return (Criteria) this;
        }

        public Criteria andCentralQuestionIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("central_question_id not between", value1, value2, "centralQuestionId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNull() {
            addCriterion("application_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNotNull() {
            addCriterion("application_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdEqualTo(BigDecimal value) {
            addCriterion("application_id =", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotEqualTo(BigDecimal value) {
            addCriterion("application_id <>", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThan(BigDecimal value) {
            addCriterion("application_id >", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("application_id >=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThan(BigDecimal value) {
            addCriterion("application_id <", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("application_id <=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIn(List<BigDecimal> values) {
            addCriterion("application_id in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotIn(List<BigDecimal> values) {
            addCriterion("application_id not in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("application_id between", value1, value2, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("application_id not between", value1, value2, "applicationId");
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