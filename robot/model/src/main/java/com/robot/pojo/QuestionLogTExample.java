package com.robot.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionLogTExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionLogTExample() {
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

        public Criteria andLogTypeIsNull() {
            addCriterion("log_type is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNotNull() {
            addCriterion("log_type is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeEqualTo(String value) {
            addCriterion("log_type =", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotEqualTo(String value) {
            addCriterion("log_type <>", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThan(String value) {
            addCriterion("log_type >", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThanOrEqualTo(String value) {
            addCriterion("log_type >=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThan(String value) {
            addCriterion("log_type <", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThanOrEqualTo(String value) {
            addCriterion("log_type <=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLike(String value) {
            addCriterion("log_type like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotLike(String value) {
            addCriterion("log_type not like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeIn(List<String> values) {
            addCriterion("log_type in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotIn(List<String> values) {
            addCriterion("log_type not in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeBetween(String value1, String value2) {
            addCriterion("log_type between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotBetween(String value1, String value2) {
            addCriterion("log_type not between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andUserQuestionIsNull() {
            addCriterion("user_question is null");
            return (Criteria) this;
        }

        public Criteria andUserQuestionIsNotNull() {
            addCriterion("user_question is not null");
            return (Criteria) this;
        }

        public Criteria andUserQuestionEqualTo(String value) {
            addCriterion("user_question =", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionNotEqualTo(String value) {
            addCriterion("user_question <>", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionGreaterThan(String value) {
            addCriterion("user_question >", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("user_question >=", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionLessThan(String value) {
            addCriterion("user_question <", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionLessThanOrEqualTo(String value) {
            addCriterion("user_question <=", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionLike(String value) {
            addCriterion("user_question like", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionNotLike(String value) {
            addCriterion("user_question not like", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionIn(List<String> values) {
            addCriterion("user_question in", values, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionNotIn(List<String> values) {
            addCriterion("user_question not in", values, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionBetween(String value1, String value2) {
            addCriterion("user_question between", value1, value2, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionNotBetween(String value1, String value2) {
            addCriterion("user_question not between", value1, value2, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andAnswerSourceIsNull() {
            addCriterion("answer_source is null");
            return (Criteria) this;
        }

        public Criteria andAnswerSourceIsNotNull() {
            addCriterion("answer_source is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerSourceEqualTo(String value) {
            addCriterion("answer_source =", value, "answerSource");
            return (Criteria) this;
        }

        public Criteria andAnswerSourceNotEqualTo(String value) {
            addCriterion("answer_source <>", value, "answerSource");
            return (Criteria) this;
        }

        public Criteria andAnswerSourceGreaterThan(String value) {
            addCriterion("answer_source >", value, "answerSource");
            return (Criteria) this;
        }

        public Criteria andAnswerSourceGreaterThanOrEqualTo(String value) {
            addCriterion("answer_source >=", value, "answerSource");
            return (Criteria) this;
        }

        public Criteria andAnswerSourceLessThan(String value) {
            addCriterion("answer_source <", value, "answerSource");
            return (Criteria) this;
        }

        public Criteria andAnswerSourceLessThanOrEqualTo(String value) {
            addCriterion("answer_source <=", value, "answerSource");
            return (Criteria) this;
        }

        public Criteria andAnswerSourceLike(String value) {
            addCriterion("answer_source like", value, "answerSource");
            return (Criteria) this;
        }

        public Criteria andAnswerSourceNotLike(String value) {
            addCriterion("answer_source not like", value, "answerSource");
            return (Criteria) this;
        }

        public Criteria andAnswerSourceIn(List<String> values) {
            addCriterion("answer_source in", values, "answerSource");
            return (Criteria) this;
        }

        public Criteria andAnswerSourceNotIn(List<String> values) {
            addCriterion("answer_source not in", values, "answerSource");
            return (Criteria) this;
        }

        public Criteria andAnswerSourceBetween(String value1, String value2) {
            addCriterion("answer_source between", value1, value2, "answerSource");
            return (Criteria) this;
        }

        public Criteria andAnswerSourceNotBetween(String value1, String value2) {
            addCriterion("answer_source not between", value1, value2, "answerSource");
            return (Criteria) this;
        }

        public Criteria andAnswerChannelIsNull() {
            addCriterion("answer_channel is null");
            return (Criteria) this;
        }

        public Criteria andAnswerChannelIsNotNull() {
            addCriterion("answer_channel is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerChannelEqualTo(String value) {
            addCriterion("answer_channel =", value, "answerChannel");
            return (Criteria) this;
        }

        public Criteria andAnswerChannelNotEqualTo(String value) {
            addCriterion("answer_channel <>", value, "answerChannel");
            return (Criteria) this;
        }

        public Criteria andAnswerChannelGreaterThan(String value) {
            addCriterion("answer_channel >", value, "answerChannel");
            return (Criteria) this;
        }

        public Criteria andAnswerChannelGreaterThanOrEqualTo(String value) {
            addCriterion("answer_channel >=", value, "answerChannel");
            return (Criteria) this;
        }

        public Criteria andAnswerChannelLessThan(String value) {
            addCriterion("answer_channel <", value, "answerChannel");
            return (Criteria) this;
        }

        public Criteria andAnswerChannelLessThanOrEqualTo(String value) {
            addCriterion("answer_channel <=", value, "answerChannel");
            return (Criteria) this;
        }

        public Criteria andAnswerChannelLike(String value) {
            addCriterion("answer_channel like", value, "answerChannel");
            return (Criteria) this;
        }

        public Criteria andAnswerChannelNotLike(String value) {
            addCriterion("answer_channel not like", value, "answerChannel");
            return (Criteria) this;
        }

        public Criteria andAnswerChannelIn(List<String> values) {
            addCriterion("answer_channel in", values, "answerChannel");
            return (Criteria) this;
        }

        public Criteria andAnswerChannelNotIn(List<String> values) {
            addCriterion("answer_channel not in", values, "answerChannel");
            return (Criteria) this;
        }

        public Criteria andAnswerChannelBetween(String value1, String value2) {
            addCriterion("answer_channel between", value1, value2, "answerChannel");
            return (Criteria) this;
        }

        public Criteria andAnswerChannelNotBetween(String value1, String value2) {
            addCriterion("answer_channel not between", value1, value2, "answerChannel");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleIsNull() {
            addCriterion("constraint_rule is null");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleIsNotNull() {
            addCriterion("constraint_rule is not null");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleEqualTo(String value) {
            addCriterion("constraint_rule =", value, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleNotEqualTo(String value) {
            addCriterion("constraint_rule <>", value, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleGreaterThan(String value) {
            addCriterion("constraint_rule >", value, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleGreaterThanOrEqualTo(String value) {
            addCriterion("constraint_rule >=", value, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleLessThan(String value) {
            addCriterion("constraint_rule <", value, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleLessThanOrEqualTo(String value) {
            addCriterion("constraint_rule <=", value, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleLike(String value) {
            addCriterion("constraint_rule like", value, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleNotLike(String value) {
            addCriterion("constraint_rule not like", value, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleIn(List<String> values) {
            addCriterion("constraint_rule in", values, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleNotIn(List<String> values) {
            addCriterion("constraint_rule not in", values, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleBetween(String value1, String value2) {
            addCriterion("constraint_rule between", value1, value2, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleNotBetween(String value1, String value2) {
            addCriterion("constraint_rule not between", value1, value2, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andNlpServerIsNull() {
            addCriterion("nlp_server is null");
            return (Criteria) this;
        }

        public Criteria andNlpServerIsNotNull() {
            addCriterion("nlp_server is not null");
            return (Criteria) this;
        }

        public Criteria andNlpServerEqualTo(String value) {
            addCriterion("nlp_server =", value, "nlpServer");
            return (Criteria) this;
        }

        public Criteria andNlpServerNotEqualTo(String value) {
            addCriterion("nlp_server <>", value, "nlpServer");
            return (Criteria) this;
        }

        public Criteria andNlpServerGreaterThan(String value) {
            addCriterion("nlp_server >", value, "nlpServer");
            return (Criteria) this;
        }

        public Criteria andNlpServerGreaterThanOrEqualTo(String value) {
            addCriterion("nlp_server >=", value, "nlpServer");
            return (Criteria) this;
        }

        public Criteria andNlpServerLessThan(String value) {
            addCriterion("nlp_server <", value, "nlpServer");
            return (Criteria) this;
        }

        public Criteria andNlpServerLessThanOrEqualTo(String value) {
            addCriterion("nlp_server <=", value, "nlpServer");
            return (Criteria) this;
        }

        public Criteria andNlpServerLike(String value) {
            addCriterion("nlp_server like", value, "nlpServer");
            return (Criteria) this;
        }

        public Criteria andNlpServerNotLike(String value) {
            addCriterion("nlp_server not like", value, "nlpServer");
            return (Criteria) this;
        }

        public Criteria andNlpServerIn(List<String> values) {
            addCriterion("nlp_server in", values, "nlpServer");
            return (Criteria) this;
        }

        public Criteria andNlpServerNotIn(List<String> values) {
            addCriterion("nlp_server not in", values, "nlpServer");
            return (Criteria) this;
        }

        public Criteria andNlpServerBetween(String value1, String value2) {
            addCriterion("nlp_server between", value1, value2, "nlpServer");
            return (Criteria) this;
        }

        public Criteria andNlpServerNotBetween(String value1, String value2) {
            addCriterion("nlp_server not between", value1, value2, "nlpServer");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNull() {
            addCriterion("reply_time is null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNotNull() {
            addCriterion("reply_time is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeEqualTo(Date value) {
            addCriterion("reply_time =", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotEqualTo(Date value) {
            addCriterion("reply_time <>", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThan(Date value) {
            addCriterion("reply_time >", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_time >=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThan(Date value) {
            addCriterion("reply_time <", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("reply_time <=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIn(List<Date> values) {
            addCriterion("reply_time in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotIn(List<Date> values) {
            addCriterion("reply_time not in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeBetween(Date value1, Date value2) {
            addCriterion("reply_time between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("reply_time not between", value1, value2, "replyTime");
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