package com.robot.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatchRuleTExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatchRuleTExample() {
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

        public Criteria andMatchRuleIsNull() {
            addCriterion("match_rule is null");
            return (Criteria) this;
        }

        public Criteria andMatchRuleIsNotNull() {
            addCriterion("match_rule is not null");
            return (Criteria) this;
        }

        public Criteria andMatchRuleEqualTo(String value) {
            addCriterion("match_rule =", value, "matchRule");
            return (Criteria) this;
        }

        public Criteria andMatchRuleNotEqualTo(String value) {
            addCriterion("match_rule <>", value, "matchRule");
            return (Criteria) this;
        }

        public Criteria andMatchRuleGreaterThan(String value) {
            addCriterion("match_rule >", value, "matchRule");
            return (Criteria) this;
        }

        public Criteria andMatchRuleGreaterThanOrEqualTo(String value) {
            addCriterion("match_rule >=", value, "matchRule");
            return (Criteria) this;
        }

        public Criteria andMatchRuleLessThan(String value) {
            addCriterion("match_rule <", value, "matchRule");
            return (Criteria) this;
        }

        public Criteria andMatchRuleLessThanOrEqualTo(String value) {
            addCriterion("match_rule <=", value, "matchRule");
            return (Criteria) this;
        }

        public Criteria andMatchRuleLike(String value) {
            addCriterion("match_rule like", value, "matchRule");
            return (Criteria) this;
        }

        public Criteria andMatchRuleNotLike(String value) {
            addCriterion("match_rule not like", value, "matchRule");
            return (Criteria) this;
        }

        public Criteria andMatchRuleIn(List<String> values) {
            addCriterion("match_rule in", values, "matchRule");
            return (Criteria) this;
        }

        public Criteria andMatchRuleNotIn(List<String> values) {
            addCriterion("match_rule not in", values, "matchRule");
            return (Criteria) this;
        }

        public Criteria andMatchRuleBetween(String value1, String value2) {
            addCriterion("match_rule between", value1, value2, "matchRule");
            return (Criteria) this;
        }

        public Criteria andMatchRuleNotBetween(String value1, String value2) {
            addCriterion("match_rule not between", value1, value2, "matchRule");
            return (Criteria) this;
        }

        public Criteria andMatchTypeIsNull() {
            addCriterion("match_type is null");
            return (Criteria) this;
        }

        public Criteria andMatchTypeIsNotNull() {
            addCriterion("match_type is not null");
            return (Criteria) this;
        }

        public Criteria andMatchTypeEqualTo(String value) {
            addCriterion("match_type =", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotEqualTo(String value) {
            addCriterion("match_type <>", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeGreaterThan(String value) {
            addCriterion("match_type >", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeGreaterThanOrEqualTo(String value) {
            addCriterion("match_type >=", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeLessThan(String value) {
            addCriterion("match_type <", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeLessThanOrEqualTo(String value) {
            addCriterion("match_type <=", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeLike(String value) {
            addCriterion("match_type like", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotLike(String value) {
            addCriterion("match_type not like", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeIn(List<String> values) {
            addCriterion("match_type in", values, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotIn(List<String> values) {
            addCriterion("match_type not in", values, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeBetween(String value1, String value2) {
            addCriterion("match_type between", value1, value2, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotBetween(String value1, String value2) {
            addCriterion("match_type not between", value1, value2, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchSourceIsNull() {
            addCriterion("match_source is null");
            return (Criteria) this;
        }

        public Criteria andMatchSourceIsNotNull() {
            addCriterion("match_source is not null");
            return (Criteria) this;
        }

        public Criteria andMatchSourceEqualTo(String value) {
            addCriterion("match_source =", value, "matchSource");
            return (Criteria) this;
        }

        public Criteria andMatchSourceNotEqualTo(String value) {
            addCriterion("match_source <>", value, "matchSource");
            return (Criteria) this;
        }

        public Criteria andMatchSourceGreaterThan(String value) {
            addCriterion("match_source >", value, "matchSource");
            return (Criteria) this;
        }

        public Criteria andMatchSourceGreaterThanOrEqualTo(String value) {
            addCriterion("match_source >=", value, "matchSource");
            return (Criteria) this;
        }

        public Criteria andMatchSourceLessThan(String value) {
            addCriterion("match_source <", value, "matchSource");
            return (Criteria) this;
        }

        public Criteria andMatchSourceLessThanOrEqualTo(String value) {
            addCriterion("match_source <=", value, "matchSource");
            return (Criteria) this;
        }

        public Criteria andMatchSourceLike(String value) {
            addCriterion("match_source like", value, "matchSource");
            return (Criteria) this;
        }

        public Criteria andMatchSourceNotLike(String value) {
            addCriterion("match_source not like", value, "matchSource");
            return (Criteria) this;
        }

        public Criteria andMatchSourceIn(List<String> values) {
            addCriterion("match_source in", values, "matchSource");
            return (Criteria) this;
        }

        public Criteria andMatchSourceNotIn(List<String> values) {
            addCriterion("match_source not in", values, "matchSource");
            return (Criteria) this;
        }

        public Criteria andMatchSourceBetween(String value1, String value2) {
            addCriterion("match_source between", value1, value2, "matchSource");
            return (Criteria) this;
        }

        public Criteria andMatchSourceNotBetween(String value1, String value2) {
            addCriterion("match_source not between", value1, value2, "matchSource");
            return (Criteria) this;
        }

        public Criteria andMatchQuestionIsNull() {
            addCriterion("match_question is null");
            return (Criteria) this;
        }

        public Criteria andMatchQuestionIsNotNull() {
            addCriterion("match_question is not null");
            return (Criteria) this;
        }

        public Criteria andMatchQuestionEqualTo(String value) {
            addCriterion("match_question =", value, "matchQuestion");
            return (Criteria) this;
        }

        public Criteria andMatchQuestionNotEqualTo(String value) {
            addCriterion("match_question <>", value, "matchQuestion");
            return (Criteria) this;
        }

        public Criteria andMatchQuestionGreaterThan(String value) {
            addCriterion("match_question >", value, "matchQuestion");
            return (Criteria) this;
        }

        public Criteria andMatchQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("match_question >=", value, "matchQuestion");
            return (Criteria) this;
        }

        public Criteria andMatchQuestionLessThan(String value) {
            addCriterion("match_question <", value, "matchQuestion");
            return (Criteria) this;
        }

        public Criteria andMatchQuestionLessThanOrEqualTo(String value) {
            addCriterion("match_question <=", value, "matchQuestion");
            return (Criteria) this;
        }

        public Criteria andMatchQuestionLike(String value) {
            addCriterion("match_question like", value, "matchQuestion");
            return (Criteria) this;
        }

        public Criteria andMatchQuestionNotLike(String value) {
            addCriterion("match_question not like", value, "matchQuestion");
            return (Criteria) this;
        }

        public Criteria andMatchQuestionIn(List<String> values) {
            addCriterion("match_question in", values, "matchQuestion");
            return (Criteria) this;
        }

        public Criteria andMatchQuestionNotIn(List<String> values) {
            addCriterion("match_question not in", values, "matchQuestion");
            return (Criteria) this;
        }

        public Criteria andMatchQuestionBetween(String value1, String value2) {
            addCriterion("match_question between", value1, value2, "matchQuestion");
            return (Criteria) this;
        }

        public Criteria andMatchQuestionNotBetween(String value1, String value2) {
            addCriterion("match_question not between", value1, value2, "matchQuestion");
            return (Criteria) this;
        }

        public Criteria andReturnValuesIsNull() {
            addCriterion("return_values is null");
            return (Criteria) this;
        }

        public Criteria andReturnValuesIsNotNull() {
            addCriterion("return_values is not null");
            return (Criteria) this;
        }

        public Criteria andReturnValuesEqualTo(String value) {
            addCriterion("return_values =", value, "returnValues");
            return (Criteria) this;
        }

        public Criteria andReturnValuesNotEqualTo(String value) {
            addCriterion("return_values <>", value, "returnValues");
            return (Criteria) this;
        }

        public Criteria andReturnValuesGreaterThan(String value) {
            addCriterion("return_values >", value, "returnValues");
            return (Criteria) this;
        }

        public Criteria andReturnValuesGreaterThanOrEqualTo(String value) {
            addCriterion("return_values >=", value, "returnValues");
            return (Criteria) this;
        }

        public Criteria andReturnValuesLessThan(String value) {
            addCriterion("return_values <", value, "returnValues");
            return (Criteria) this;
        }

        public Criteria andReturnValuesLessThanOrEqualTo(String value) {
            addCriterion("return_values <=", value, "returnValues");
            return (Criteria) this;
        }

        public Criteria andReturnValuesLike(String value) {
            addCriterion("return_values like", value, "returnValues");
            return (Criteria) this;
        }

        public Criteria andReturnValuesNotLike(String value) {
            addCriterion("return_values not like", value, "returnValues");
            return (Criteria) this;
        }

        public Criteria andReturnValuesIn(List<String> values) {
            addCriterion("return_values in", values, "returnValues");
            return (Criteria) this;
        }

        public Criteria andReturnValuesNotIn(List<String> values) {
            addCriterion("return_values not in", values, "returnValues");
            return (Criteria) this;
        }

        public Criteria andReturnValuesBetween(String value1, String value2) {
            addCriterion("return_values between", value1, value2, "returnValues");
            return (Criteria) this;
        }

        public Criteria andReturnValuesNotBetween(String value1, String value2) {
            addCriterion("return_values not between", value1, value2, "returnValues");
            return (Criteria) this;
        }

        public Criteria andOrderedStatusIsNull() {
            addCriterion("ordered_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderedStatusIsNotNull() {
            addCriterion("ordered_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderedStatusEqualTo(Boolean value) {
            addCriterion("ordered_status =", value, "orderedStatus");
            return (Criteria) this;
        }

        public Criteria andOrderedStatusNotEqualTo(Boolean value) {
            addCriterion("ordered_status <>", value, "orderedStatus");
            return (Criteria) this;
        }

        public Criteria andOrderedStatusGreaterThan(Boolean value) {
            addCriterion("ordered_status >", value, "orderedStatus");
            return (Criteria) this;
        }

        public Criteria andOrderedStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ordered_status >=", value, "orderedStatus");
            return (Criteria) this;
        }

        public Criteria andOrderedStatusLessThan(Boolean value) {
            addCriterion("ordered_status <", value, "orderedStatus");
            return (Criteria) this;
        }

        public Criteria andOrderedStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("ordered_status <=", value, "orderedStatus");
            return (Criteria) this;
        }

        public Criteria andOrderedStatusIn(List<Boolean> values) {
            addCriterion("ordered_status in", values, "orderedStatus");
            return (Criteria) this;
        }

        public Criteria andOrderedStatusNotIn(List<Boolean> values) {
            addCriterion("ordered_status not in", values, "orderedStatus");
            return (Criteria) this;
        }

        public Criteria andOrderedStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("ordered_status between", value1, value2, "orderedStatus");
            return (Criteria) this;
        }

        public Criteria andOrderedStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ordered_status not between", value1, value2, "orderedStatus");
            return (Criteria) this;
        }

        public Criteria andEnabledStatusIsNull() {
            addCriterion("enabled_status is null");
            return (Criteria) this;
        }

        public Criteria andEnabledStatusIsNotNull() {
            addCriterion("enabled_status is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledStatusEqualTo(Boolean value) {
            addCriterion("enabled_status =", value, "enabledStatus");
            return (Criteria) this;
        }

        public Criteria andEnabledStatusNotEqualTo(Boolean value) {
            addCriterion("enabled_status <>", value, "enabledStatus");
            return (Criteria) this;
        }

        public Criteria andEnabledStatusGreaterThan(Boolean value) {
            addCriterion("enabled_status >", value, "enabledStatus");
            return (Criteria) this;
        }

        public Criteria andEnabledStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enabled_status >=", value, "enabledStatus");
            return (Criteria) this;
        }

        public Criteria andEnabledStatusLessThan(Boolean value) {
            addCriterion("enabled_status <", value, "enabledStatus");
            return (Criteria) this;
        }

        public Criteria andEnabledStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("enabled_status <=", value, "enabledStatus");
            return (Criteria) this;
        }

        public Criteria andEnabledStatusIn(List<Boolean> values) {
            addCriterion("enabled_status in", values, "enabledStatus");
            return (Criteria) this;
        }

        public Criteria andEnabledStatusNotIn(List<Boolean> values) {
            addCriterion("enabled_status not in", values, "enabledStatus");
            return (Criteria) this;
        }

        public Criteria andEnabledStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled_status between", value1, value2, "enabledStatus");
            return (Criteria) this;
        }

        public Criteria andEnabledStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled_status not between", value1, value2, "enabledStatus");
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

        public Criteria andRootCategoryIsNull() {
            addCriterion("root_category is null");
            return (Criteria) this;
        }

        public Criteria andRootCategoryIsNotNull() {
            addCriterion("root_category is not null");
            return (Criteria) this;
        }

        public Criteria andRootCategoryEqualTo(String value) {
            addCriterion("root_category =", value, "rootCategory");
            return (Criteria) this;
        }

        public Criteria andRootCategoryNotEqualTo(String value) {
            addCriterion("root_category <>", value, "rootCategory");
            return (Criteria) this;
        }

        public Criteria andRootCategoryGreaterThan(String value) {
            addCriterion("root_category >", value, "rootCategory");
            return (Criteria) this;
        }

        public Criteria andRootCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("root_category >=", value, "rootCategory");
            return (Criteria) this;
        }

        public Criteria andRootCategoryLessThan(String value) {
            addCriterion("root_category <", value, "rootCategory");
            return (Criteria) this;
        }

        public Criteria andRootCategoryLessThanOrEqualTo(String value) {
            addCriterion("root_category <=", value, "rootCategory");
            return (Criteria) this;
        }

        public Criteria andRootCategoryLike(String value) {
            addCriterion("root_category like", value, "rootCategory");
            return (Criteria) this;
        }

        public Criteria andRootCategoryNotLike(String value) {
            addCriterion("root_category not like", value, "rootCategory");
            return (Criteria) this;
        }

        public Criteria andRootCategoryIn(List<String> values) {
            addCriterion("root_category in", values, "rootCategory");
            return (Criteria) this;
        }

        public Criteria andRootCategoryNotIn(List<String> values) {
            addCriterion("root_category not in", values, "rootCategory");
            return (Criteria) this;
        }

        public Criteria andRootCategoryBetween(String value1, String value2) {
            addCriterion("root_category between", value1, value2, "rootCategory");
            return (Criteria) this;
        }

        public Criteria andRootCategoryNotBetween(String value1, String value2) {
            addCriterion("root_category not between", value1, value2, "rootCategory");
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

        public Criteria andApplicationCodeIsNull() {
            addCriterion("application_code is null");
            return (Criteria) this;
        }

        public Criteria andApplicationCodeIsNotNull() {
            addCriterion("application_code is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationCodeEqualTo(String value) {
            addCriterion("application_code =", value, "applicationCode");
            return (Criteria) this;
        }

        public Criteria andApplicationCodeNotEqualTo(String value) {
            addCriterion("application_code <>", value, "applicationCode");
            return (Criteria) this;
        }

        public Criteria andApplicationCodeGreaterThan(String value) {
            addCriterion("application_code >", value, "applicationCode");
            return (Criteria) this;
        }

        public Criteria andApplicationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("application_code >=", value, "applicationCode");
            return (Criteria) this;
        }

        public Criteria andApplicationCodeLessThan(String value) {
            addCriterion("application_code <", value, "applicationCode");
            return (Criteria) this;
        }

        public Criteria andApplicationCodeLessThanOrEqualTo(String value) {
            addCriterion("application_code <=", value, "applicationCode");
            return (Criteria) this;
        }

        public Criteria andApplicationCodeLike(String value) {
            addCriterion("application_code like", value, "applicationCode");
            return (Criteria) this;
        }

        public Criteria andApplicationCodeNotLike(String value) {
            addCriterion("application_code not like", value, "applicationCode");
            return (Criteria) this;
        }

        public Criteria andApplicationCodeIn(List<String> values) {
            addCriterion("application_code in", values, "applicationCode");
            return (Criteria) this;
        }

        public Criteria andApplicationCodeNotIn(List<String> values) {
            addCriterion("application_code not in", values, "applicationCode");
            return (Criteria) this;
        }

        public Criteria andApplicationCodeBetween(String value1, String value2) {
            addCriterion("application_code between", value1, value2, "applicationCode");
            return (Criteria) this;
        }

        public Criteria andApplicationCodeNotBetween(String value1, String value2) {
            addCriterion("application_code not between", value1, value2, "applicationCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNull() {
            addCriterion("channel_code is null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNotNull() {
            addCriterion("channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeEqualTo(String value) {
            addCriterion("channel_code =", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotEqualTo(String value) {
            addCriterion("channel_code <>", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThan(String value) {
            addCriterion("channel_code >", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("channel_code >=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThan(String value) {
            addCriterion("channel_code <", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("channel_code <=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLike(String value) {
            addCriterion("channel_code like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotLike(String value) {
            addCriterion("channel_code not like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIn(List<String> values) {
            addCriterion("channel_code in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotIn(List<String> values) {
            addCriterion("channel_code not in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeBetween(String value1, String value2) {
            addCriterion("channel_code between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotBetween(String value1, String value2) {
            addCriterion("channel_code not between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
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