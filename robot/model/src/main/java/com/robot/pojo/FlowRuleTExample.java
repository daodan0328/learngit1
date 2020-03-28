package com.robot.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlowRuleTExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlowRuleTExample() {
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

        public Criteria andSubflowIdIsNull() {
            addCriterion("subflow_id is null");
            return (Criteria) this;
        }

        public Criteria andSubflowIdIsNotNull() {
            addCriterion("subflow_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubflowIdEqualTo(BigDecimal value) {
            addCriterion("subflow_id =", value, "subflowId");
            return (Criteria) this;
        }

        public Criteria andSubflowIdNotEqualTo(BigDecimal value) {
            addCriterion("subflow_id <>", value, "subflowId");
            return (Criteria) this;
        }

        public Criteria andSubflowIdGreaterThan(BigDecimal value) {
            addCriterion("subflow_id >", value, "subflowId");
            return (Criteria) this;
        }

        public Criteria andSubflowIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("subflow_id >=", value, "subflowId");
            return (Criteria) this;
        }

        public Criteria andSubflowIdLessThan(BigDecimal value) {
            addCriterion("subflow_id <", value, "subflowId");
            return (Criteria) this;
        }

        public Criteria andSubflowIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("subflow_id <=", value, "subflowId");
            return (Criteria) this;
        }

        public Criteria andSubflowIdIn(List<BigDecimal> values) {
            addCriterion("subflow_id in", values, "subflowId");
            return (Criteria) this;
        }

        public Criteria andSubflowIdNotIn(List<BigDecimal> values) {
            addCriterion("subflow_id not in", values, "subflowId");
            return (Criteria) this;
        }

        public Criteria andSubflowIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subflow_id between", value1, value2, "subflowId");
            return (Criteria) this;
        }

        public Criteria andSubflowIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subflow_id not between", value1, value2, "subflowId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNull() {
            addCriterion("node_id is null");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNotNull() {
            addCriterion("node_id is not null");
            return (Criteria) this;
        }

        public Criteria andNodeIdEqualTo(String value) {
            addCriterion("node_id =", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotEqualTo(String value) {
            addCriterion("node_id <>", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThan(String value) {
            addCriterion("node_id >", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("node_id >=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThan(String value) {
            addCriterion("node_id <", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThanOrEqualTo(String value) {
            addCriterion("node_id <=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLike(String value) {
            addCriterion("node_id like", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotLike(String value) {
            addCriterion("node_id not like", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIn(List<String> values) {
            addCriterion("node_id in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotIn(List<String> values) {
            addCriterion("node_id not in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdBetween(String value1, String value2) {
            addCriterion("node_id between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotBetween(String value1, String value2) {
            addCriterion("node_id not between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeNameIsNull() {
            addCriterion("node_name is null");
            return (Criteria) this;
        }

        public Criteria andNodeNameIsNotNull() {
            addCriterion("node_name is not null");
            return (Criteria) this;
        }

        public Criteria andNodeNameEqualTo(String value) {
            addCriterion("node_name =", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotEqualTo(String value) {
            addCriterion("node_name <>", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameGreaterThan(String value) {
            addCriterion("node_name >", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("node_name >=", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLessThan(String value) {
            addCriterion("node_name <", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLessThanOrEqualTo(String value) {
            addCriterion("node_name <=", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLike(String value) {
            addCriterion("node_name like", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotLike(String value) {
            addCriterion("node_name not like", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameIn(List<String> values) {
            addCriterion("node_name in", values, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotIn(List<String> values) {
            addCriterion("node_name not in", values, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameBetween(String value1, String value2) {
            addCriterion("node_name between", value1, value2, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotBetween(String value1, String value2) {
            addCriterion("node_name not between", value1, value2, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIsNull() {
            addCriterion("node_type is null");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIsNotNull() {
            addCriterion("node_type is not null");
            return (Criteria) this;
        }

        public Criteria andNodeTypeEqualTo(String value) {
            addCriterion("node_type =", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotEqualTo(String value) {
            addCriterion("node_type <>", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeGreaterThan(String value) {
            addCriterion("node_type >", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("node_type >=", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeLessThan(String value) {
            addCriterion("node_type <", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeLessThanOrEqualTo(String value) {
            addCriterion("node_type <=", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeLike(String value) {
            addCriterion("node_type like", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotLike(String value) {
            addCriterion("node_type not like", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIn(List<String> values) {
            addCriterion("node_type in", values, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotIn(List<String> values) {
            addCriterion("node_type not in", values, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeBetween(String value1, String value2) {
            addCriterion("node_type between", value1, value2, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotBetween(String value1, String value2) {
            addCriterion("node_type not between", value1, value2, "nodeType");
            return (Criteria) this;
        }

        public Criteria andAboveNodeIdIsNull() {
            addCriterion("above_node_id is null");
            return (Criteria) this;
        }

        public Criteria andAboveNodeIdIsNotNull() {
            addCriterion("above_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andAboveNodeIdEqualTo(String value) {
            addCriterion("above_node_id =", value, "aboveNodeId");
            return (Criteria) this;
        }

        public Criteria andAboveNodeIdNotEqualTo(String value) {
            addCriterion("above_node_id <>", value, "aboveNodeId");
            return (Criteria) this;
        }

        public Criteria andAboveNodeIdGreaterThan(String value) {
            addCriterion("above_node_id >", value, "aboveNodeId");
            return (Criteria) this;
        }

        public Criteria andAboveNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("above_node_id >=", value, "aboveNodeId");
            return (Criteria) this;
        }

        public Criteria andAboveNodeIdLessThan(String value) {
            addCriterion("above_node_id <", value, "aboveNodeId");
            return (Criteria) this;
        }

        public Criteria andAboveNodeIdLessThanOrEqualTo(String value) {
            addCriterion("above_node_id <=", value, "aboveNodeId");
            return (Criteria) this;
        }

        public Criteria andAboveNodeIdLike(String value) {
            addCriterion("above_node_id like", value, "aboveNodeId");
            return (Criteria) this;
        }

        public Criteria andAboveNodeIdNotLike(String value) {
            addCriterion("above_node_id not like", value, "aboveNodeId");
            return (Criteria) this;
        }

        public Criteria andAboveNodeIdIn(List<String> values) {
            addCriterion("above_node_id in", values, "aboveNodeId");
            return (Criteria) this;
        }

        public Criteria andAboveNodeIdNotIn(List<String> values) {
            addCriterion("above_node_id not in", values, "aboveNodeId");
            return (Criteria) this;
        }

        public Criteria andAboveNodeIdBetween(String value1, String value2) {
            addCriterion("above_node_id between", value1, value2, "aboveNodeId");
            return (Criteria) this;
        }

        public Criteria andAboveNodeIdNotBetween(String value1, String value2) {
            addCriterion("above_node_id not between", value1, value2, "aboveNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowCondition1IsNull() {
            addCriterion("flow_condition_1 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition1IsNotNull() {
            addCriterion("flow_condition_1 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition1EqualTo(String value) {
            addCriterion("flow_condition_1 =", value, "flowCondition1");
            return (Criteria) this;
        }

        public Criteria andFlowCondition1NotEqualTo(String value) {
            addCriterion("flow_condition_1 <>", value, "flowCondition1");
            return (Criteria) this;
        }

        public Criteria andFlowCondition1GreaterThan(String value) {
            addCriterion("flow_condition_1 >", value, "flowCondition1");
            return (Criteria) this;
        }

        public Criteria andFlowCondition1GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_1 >=", value, "flowCondition1");
            return (Criteria) this;
        }

        public Criteria andFlowCondition1LessThan(String value) {
            addCriterion("flow_condition_1 <", value, "flowCondition1");
            return (Criteria) this;
        }

        public Criteria andFlowCondition1LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_1 <=", value, "flowCondition1");
            return (Criteria) this;
        }

        public Criteria andFlowCondition1Like(String value) {
            addCriterion("flow_condition_1 like", value, "flowCondition1");
            return (Criteria) this;
        }

        public Criteria andFlowCondition1NotLike(String value) {
            addCriterion("flow_condition_1 not like", value, "flowCondition1");
            return (Criteria) this;
        }

        public Criteria andFlowCondition1In(List<String> values) {
            addCriterion("flow_condition_1 in", values, "flowCondition1");
            return (Criteria) this;
        }

        public Criteria andFlowCondition1NotIn(List<String> values) {
            addCriterion("flow_condition_1 not in", values, "flowCondition1");
            return (Criteria) this;
        }

        public Criteria andFlowCondition1Between(String value1, String value2) {
            addCriterion("flow_condition_1 between", value1, value2, "flowCondition1");
            return (Criteria) this;
        }

        public Criteria andFlowCondition1NotBetween(String value1, String value2) {
            addCriterion("flow_condition_1 not between", value1, value2, "flowCondition1");
            return (Criteria) this;
        }

        public Criteria andFlowCondition2IsNull() {
            addCriterion("flow_condition_2 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition2IsNotNull() {
            addCriterion("flow_condition_2 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition2EqualTo(String value) {
            addCriterion("flow_condition_2 =", value, "flowCondition2");
            return (Criteria) this;
        }

        public Criteria andFlowCondition2NotEqualTo(String value) {
            addCriterion("flow_condition_2 <>", value, "flowCondition2");
            return (Criteria) this;
        }

        public Criteria andFlowCondition2GreaterThan(String value) {
            addCriterion("flow_condition_2 >", value, "flowCondition2");
            return (Criteria) this;
        }

        public Criteria andFlowCondition2GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_2 >=", value, "flowCondition2");
            return (Criteria) this;
        }

        public Criteria andFlowCondition2LessThan(String value) {
            addCriterion("flow_condition_2 <", value, "flowCondition2");
            return (Criteria) this;
        }

        public Criteria andFlowCondition2LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_2 <=", value, "flowCondition2");
            return (Criteria) this;
        }

        public Criteria andFlowCondition2Like(String value) {
            addCriterion("flow_condition_2 like", value, "flowCondition2");
            return (Criteria) this;
        }

        public Criteria andFlowCondition2NotLike(String value) {
            addCriterion("flow_condition_2 not like", value, "flowCondition2");
            return (Criteria) this;
        }

        public Criteria andFlowCondition2In(List<String> values) {
            addCriterion("flow_condition_2 in", values, "flowCondition2");
            return (Criteria) this;
        }

        public Criteria andFlowCondition2NotIn(List<String> values) {
            addCriterion("flow_condition_2 not in", values, "flowCondition2");
            return (Criteria) this;
        }

        public Criteria andFlowCondition2Between(String value1, String value2) {
            addCriterion("flow_condition_2 between", value1, value2, "flowCondition2");
            return (Criteria) this;
        }

        public Criteria andFlowCondition2NotBetween(String value1, String value2) {
            addCriterion("flow_condition_2 not between", value1, value2, "flowCondition2");
            return (Criteria) this;
        }

        public Criteria andFlowCondition3IsNull() {
            addCriterion("flow_condition_3 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition3IsNotNull() {
            addCriterion("flow_condition_3 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition3EqualTo(String value) {
            addCriterion("flow_condition_3 =", value, "flowCondition3");
            return (Criteria) this;
        }

        public Criteria andFlowCondition3NotEqualTo(String value) {
            addCriterion("flow_condition_3 <>", value, "flowCondition3");
            return (Criteria) this;
        }

        public Criteria andFlowCondition3GreaterThan(String value) {
            addCriterion("flow_condition_3 >", value, "flowCondition3");
            return (Criteria) this;
        }

        public Criteria andFlowCondition3GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_3 >=", value, "flowCondition3");
            return (Criteria) this;
        }

        public Criteria andFlowCondition3LessThan(String value) {
            addCriterion("flow_condition_3 <", value, "flowCondition3");
            return (Criteria) this;
        }

        public Criteria andFlowCondition3LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_3 <=", value, "flowCondition3");
            return (Criteria) this;
        }

        public Criteria andFlowCondition3Like(String value) {
            addCriterion("flow_condition_3 like", value, "flowCondition3");
            return (Criteria) this;
        }

        public Criteria andFlowCondition3NotLike(String value) {
            addCriterion("flow_condition_3 not like", value, "flowCondition3");
            return (Criteria) this;
        }

        public Criteria andFlowCondition3In(List<String> values) {
            addCriterion("flow_condition_3 in", values, "flowCondition3");
            return (Criteria) this;
        }

        public Criteria andFlowCondition3NotIn(List<String> values) {
            addCriterion("flow_condition_3 not in", values, "flowCondition3");
            return (Criteria) this;
        }

        public Criteria andFlowCondition3Between(String value1, String value2) {
            addCriterion("flow_condition_3 between", value1, value2, "flowCondition3");
            return (Criteria) this;
        }

        public Criteria andFlowCondition3NotBetween(String value1, String value2) {
            addCriterion("flow_condition_3 not between", value1, value2, "flowCondition3");
            return (Criteria) this;
        }

        public Criteria andFlowCondition4IsNull() {
            addCriterion("flow_condition_4 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition4IsNotNull() {
            addCriterion("flow_condition_4 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition4EqualTo(String value) {
            addCriterion("flow_condition_4 =", value, "flowCondition4");
            return (Criteria) this;
        }

        public Criteria andFlowCondition4NotEqualTo(String value) {
            addCriterion("flow_condition_4 <>", value, "flowCondition4");
            return (Criteria) this;
        }

        public Criteria andFlowCondition4GreaterThan(String value) {
            addCriterion("flow_condition_4 >", value, "flowCondition4");
            return (Criteria) this;
        }

        public Criteria andFlowCondition4GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_4 >=", value, "flowCondition4");
            return (Criteria) this;
        }

        public Criteria andFlowCondition4LessThan(String value) {
            addCriterion("flow_condition_4 <", value, "flowCondition4");
            return (Criteria) this;
        }

        public Criteria andFlowCondition4LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_4 <=", value, "flowCondition4");
            return (Criteria) this;
        }

        public Criteria andFlowCondition4Like(String value) {
            addCriterion("flow_condition_4 like", value, "flowCondition4");
            return (Criteria) this;
        }

        public Criteria andFlowCondition4NotLike(String value) {
            addCriterion("flow_condition_4 not like", value, "flowCondition4");
            return (Criteria) this;
        }

        public Criteria andFlowCondition4In(List<String> values) {
            addCriterion("flow_condition_4 in", values, "flowCondition4");
            return (Criteria) this;
        }

        public Criteria andFlowCondition4NotIn(List<String> values) {
            addCriterion("flow_condition_4 not in", values, "flowCondition4");
            return (Criteria) this;
        }

        public Criteria andFlowCondition4Between(String value1, String value2) {
            addCriterion("flow_condition_4 between", value1, value2, "flowCondition4");
            return (Criteria) this;
        }

        public Criteria andFlowCondition4NotBetween(String value1, String value2) {
            addCriterion("flow_condition_4 not between", value1, value2, "flowCondition4");
            return (Criteria) this;
        }

        public Criteria andFlowCondition5IsNull() {
            addCriterion("flow_condition_5 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition5IsNotNull() {
            addCriterion("flow_condition_5 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition5EqualTo(String value) {
            addCriterion("flow_condition_5 =", value, "flowCondition5");
            return (Criteria) this;
        }

        public Criteria andFlowCondition5NotEqualTo(String value) {
            addCriterion("flow_condition_5 <>", value, "flowCondition5");
            return (Criteria) this;
        }

        public Criteria andFlowCondition5GreaterThan(String value) {
            addCriterion("flow_condition_5 >", value, "flowCondition5");
            return (Criteria) this;
        }

        public Criteria andFlowCondition5GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_5 >=", value, "flowCondition5");
            return (Criteria) this;
        }

        public Criteria andFlowCondition5LessThan(String value) {
            addCriterion("flow_condition_5 <", value, "flowCondition5");
            return (Criteria) this;
        }

        public Criteria andFlowCondition5LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_5 <=", value, "flowCondition5");
            return (Criteria) this;
        }

        public Criteria andFlowCondition5Like(String value) {
            addCriterion("flow_condition_5 like", value, "flowCondition5");
            return (Criteria) this;
        }

        public Criteria andFlowCondition5NotLike(String value) {
            addCriterion("flow_condition_5 not like", value, "flowCondition5");
            return (Criteria) this;
        }

        public Criteria andFlowCondition5In(List<String> values) {
            addCriterion("flow_condition_5 in", values, "flowCondition5");
            return (Criteria) this;
        }

        public Criteria andFlowCondition5NotIn(List<String> values) {
            addCriterion("flow_condition_5 not in", values, "flowCondition5");
            return (Criteria) this;
        }

        public Criteria andFlowCondition5Between(String value1, String value2) {
            addCriterion("flow_condition_5 between", value1, value2, "flowCondition5");
            return (Criteria) this;
        }

        public Criteria andFlowCondition5NotBetween(String value1, String value2) {
            addCriterion("flow_condition_5 not between", value1, value2, "flowCondition5");
            return (Criteria) this;
        }

        public Criteria andFlowCondition6IsNull() {
            addCriterion("flow_condition_6 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition6IsNotNull() {
            addCriterion("flow_condition_6 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition6EqualTo(String value) {
            addCriterion("flow_condition_6 =", value, "flowCondition6");
            return (Criteria) this;
        }

        public Criteria andFlowCondition6NotEqualTo(String value) {
            addCriterion("flow_condition_6 <>", value, "flowCondition6");
            return (Criteria) this;
        }

        public Criteria andFlowCondition6GreaterThan(String value) {
            addCriterion("flow_condition_6 >", value, "flowCondition6");
            return (Criteria) this;
        }

        public Criteria andFlowCondition6GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_6 >=", value, "flowCondition6");
            return (Criteria) this;
        }

        public Criteria andFlowCondition6LessThan(String value) {
            addCriterion("flow_condition_6 <", value, "flowCondition6");
            return (Criteria) this;
        }

        public Criteria andFlowCondition6LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_6 <=", value, "flowCondition6");
            return (Criteria) this;
        }

        public Criteria andFlowCondition6Like(String value) {
            addCriterion("flow_condition_6 like", value, "flowCondition6");
            return (Criteria) this;
        }

        public Criteria andFlowCondition6NotLike(String value) {
            addCriterion("flow_condition_6 not like", value, "flowCondition6");
            return (Criteria) this;
        }

        public Criteria andFlowCondition6In(List<String> values) {
            addCriterion("flow_condition_6 in", values, "flowCondition6");
            return (Criteria) this;
        }

        public Criteria andFlowCondition6NotIn(List<String> values) {
            addCriterion("flow_condition_6 not in", values, "flowCondition6");
            return (Criteria) this;
        }

        public Criteria andFlowCondition6Between(String value1, String value2) {
            addCriterion("flow_condition_6 between", value1, value2, "flowCondition6");
            return (Criteria) this;
        }

        public Criteria andFlowCondition6NotBetween(String value1, String value2) {
            addCriterion("flow_condition_6 not between", value1, value2, "flowCondition6");
            return (Criteria) this;
        }

        public Criteria andFlowCondition7IsNull() {
            addCriterion("flow_condition_7 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition7IsNotNull() {
            addCriterion("flow_condition_7 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition7EqualTo(String value) {
            addCriterion("flow_condition_7 =", value, "flowCondition7");
            return (Criteria) this;
        }

        public Criteria andFlowCondition7NotEqualTo(String value) {
            addCriterion("flow_condition_7 <>", value, "flowCondition7");
            return (Criteria) this;
        }

        public Criteria andFlowCondition7GreaterThan(String value) {
            addCriterion("flow_condition_7 >", value, "flowCondition7");
            return (Criteria) this;
        }

        public Criteria andFlowCondition7GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_7 >=", value, "flowCondition7");
            return (Criteria) this;
        }

        public Criteria andFlowCondition7LessThan(String value) {
            addCriterion("flow_condition_7 <", value, "flowCondition7");
            return (Criteria) this;
        }

        public Criteria andFlowCondition7LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_7 <=", value, "flowCondition7");
            return (Criteria) this;
        }

        public Criteria andFlowCondition7Like(String value) {
            addCriterion("flow_condition_7 like", value, "flowCondition7");
            return (Criteria) this;
        }

        public Criteria andFlowCondition7NotLike(String value) {
            addCriterion("flow_condition_7 not like", value, "flowCondition7");
            return (Criteria) this;
        }

        public Criteria andFlowCondition7In(List<String> values) {
            addCriterion("flow_condition_7 in", values, "flowCondition7");
            return (Criteria) this;
        }

        public Criteria andFlowCondition7NotIn(List<String> values) {
            addCriterion("flow_condition_7 not in", values, "flowCondition7");
            return (Criteria) this;
        }

        public Criteria andFlowCondition7Between(String value1, String value2) {
            addCriterion("flow_condition_7 between", value1, value2, "flowCondition7");
            return (Criteria) this;
        }

        public Criteria andFlowCondition7NotBetween(String value1, String value2) {
            addCriterion("flow_condition_7 not between", value1, value2, "flowCondition7");
            return (Criteria) this;
        }

        public Criteria andFlowCondition8IsNull() {
            addCriterion("flow_condition_8 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition8IsNotNull() {
            addCriterion("flow_condition_8 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition8EqualTo(String value) {
            addCriterion("flow_condition_8 =", value, "flowCondition8");
            return (Criteria) this;
        }

        public Criteria andFlowCondition8NotEqualTo(String value) {
            addCriterion("flow_condition_8 <>", value, "flowCondition8");
            return (Criteria) this;
        }

        public Criteria andFlowCondition8GreaterThan(String value) {
            addCriterion("flow_condition_8 >", value, "flowCondition8");
            return (Criteria) this;
        }

        public Criteria andFlowCondition8GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_8 >=", value, "flowCondition8");
            return (Criteria) this;
        }

        public Criteria andFlowCondition8LessThan(String value) {
            addCriterion("flow_condition_8 <", value, "flowCondition8");
            return (Criteria) this;
        }

        public Criteria andFlowCondition8LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_8 <=", value, "flowCondition8");
            return (Criteria) this;
        }

        public Criteria andFlowCondition8Like(String value) {
            addCriterion("flow_condition_8 like", value, "flowCondition8");
            return (Criteria) this;
        }

        public Criteria andFlowCondition8NotLike(String value) {
            addCriterion("flow_condition_8 not like", value, "flowCondition8");
            return (Criteria) this;
        }

        public Criteria andFlowCondition8In(List<String> values) {
            addCriterion("flow_condition_8 in", values, "flowCondition8");
            return (Criteria) this;
        }

        public Criteria andFlowCondition8NotIn(List<String> values) {
            addCriterion("flow_condition_8 not in", values, "flowCondition8");
            return (Criteria) this;
        }

        public Criteria andFlowCondition8Between(String value1, String value2) {
            addCriterion("flow_condition_8 between", value1, value2, "flowCondition8");
            return (Criteria) this;
        }

        public Criteria andFlowCondition8NotBetween(String value1, String value2) {
            addCriterion("flow_condition_8 not between", value1, value2, "flowCondition8");
            return (Criteria) this;
        }

        public Criteria andFlowCondition9IsNull() {
            addCriterion("flow_condition_9 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition9IsNotNull() {
            addCriterion("flow_condition_9 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition9EqualTo(String value) {
            addCriterion("flow_condition_9 =", value, "flowCondition9");
            return (Criteria) this;
        }

        public Criteria andFlowCondition9NotEqualTo(String value) {
            addCriterion("flow_condition_9 <>", value, "flowCondition9");
            return (Criteria) this;
        }

        public Criteria andFlowCondition9GreaterThan(String value) {
            addCriterion("flow_condition_9 >", value, "flowCondition9");
            return (Criteria) this;
        }

        public Criteria andFlowCondition9GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_9 >=", value, "flowCondition9");
            return (Criteria) this;
        }

        public Criteria andFlowCondition9LessThan(String value) {
            addCriterion("flow_condition_9 <", value, "flowCondition9");
            return (Criteria) this;
        }

        public Criteria andFlowCondition9LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_9 <=", value, "flowCondition9");
            return (Criteria) this;
        }

        public Criteria andFlowCondition9Like(String value) {
            addCriterion("flow_condition_9 like", value, "flowCondition9");
            return (Criteria) this;
        }

        public Criteria andFlowCondition9NotLike(String value) {
            addCriterion("flow_condition_9 not like", value, "flowCondition9");
            return (Criteria) this;
        }

        public Criteria andFlowCondition9In(List<String> values) {
            addCriterion("flow_condition_9 in", values, "flowCondition9");
            return (Criteria) this;
        }

        public Criteria andFlowCondition9NotIn(List<String> values) {
            addCriterion("flow_condition_9 not in", values, "flowCondition9");
            return (Criteria) this;
        }

        public Criteria andFlowCondition9Between(String value1, String value2) {
            addCriterion("flow_condition_9 between", value1, value2, "flowCondition9");
            return (Criteria) this;
        }

        public Criteria andFlowCondition9NotBetween(String value1, String value2) {
            addCriterion("flow_condition_9 not between", value1, value2, "flowCondition9");
            return (Criteria) this;
        }

        public Criteria andFlowCondition10IsNull() {
            addCriterion("flow_condition_10 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition10IsNotNull() {
            addCriterion("flow_condition_10 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition10EqualTo(String value) {
            addCriterion("flow_condition_10 =", value, "flowCondition10");
            return (Criteria) this;
        }

        public Criteria andFlowCondition10NotEqualTo(String value) {
            addCriterion("flow_condition_10 <>", value, "flowCondition10");
            return (Criteria) this;
        }

        public Criteria andFlowCondition10GreaterThan(String value) {
            addCriterion("flow_condition_10 >", value, "flowCondition10");
            return (Criteria) this;
        }

        public Criteria andFlowCondition10GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_10 >=", value, "flowCondition10");
            return (Criteria) this;
        }

        public Criteria andFlowCondition10LessThan(String value) {
            addCriterion("flow_condition_10 <", value, "flowCondition10");
            return (Criteria) this;
        }

        public Criteria andFlowCondition10LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_10 <=", value, "flowCondition10");
            return (Criteria) this;
        }

        public Criteria andFlowCondition10Like(String value) {
            addCriterion("flow_condition_10 like", value, "flowCondition10");
            return (Criteria) this;
        }

        public Criteria andFlowCondition10NotLike(String value) {
            addCriterion("flow_condition_10 not like", value, "flowCondition10");
            return (Criteria) this;
        }

        public Criteria andFlowCondition10In(List<String> values) {
            addCriterion("flow_condition_10 in", values, "flowCondition10");
            return (Criteria) this;
        }

        public Criteria andFlowCondition10NotIn(List<String> values) {
            addCriterion("flow_condition_10 not in", values, "flowCondition10");
            return (Criteria) this;
        }

        public Criteria andFlowCondition10Between(String value1, String value2) {
            addCriterion("flow_condition_10 between", value1, value2, "flowCondition10");
            return (Criteria) this;
        }

        public Criteria andFlowCondition10NotBetween(String value1, String value2) {
            addCriterion("flow_condition_10 not between", value1, value2, "flowCondition10");
            return (Criteria) this;
        }

        public Criteria andFlowCondition11IsNull() {
            addCriterion("flow_condition_11 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition11IsNotNull() {
            addCriterion("flow_condition_11 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition11EqualTo(String value) {
            addCriterion("flow_condition_11 =", value, "flowCondition11");
            return (Criteria) this;
        }

        public Criteria andFlowCondition11NotEqualTo(String value) {
            addCriterion("flow_condition_11 <>", value, "flowCondition11");
            return (Criteria) this;
        }

        public Criteria andFlowCondition11GreaterThan(String value) {
            addCriterion("flow_condition_11 >", value, "flowCondition11");
            return (Criteria) this;
        }

        public Criteria andFlowCondition11GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_11 >=", value, "flowCondition11");
            return (Criteria) this;
        }

        public Criteria andFlowCondition11LessThan(String value) {
            addCriterion("flow_condition_11 <", value, "flowCondition11");
            return (Criteria) this;
        }

        public Criteria andFlowCondition11LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_11 <=", value, "flowCondition11");
            return (Criteria) this;
        }

        public Criteria andFlowCondition11Like(String value) {
            addCriterion("flow_condition_11 like", value, "flowCondition11");
            return (Criteria) this;
        }

        public Criteria andFlowCondition11NotLike(String value) {
            addCriterion("flow_condition_11 not like", value, "flowCondition11");
            return (Criteria) this;
        }

        public Criteria andFlowCondition11In(List<String> values) {
            addCriterion("flow_condition_11 in", values, "flowCondition11");
            return (Criteria) this;
        }

        public Criteria andFlowCondition11NotIn(List<String> values) {
            addCriterion("flow_condition_11 not in", values, "flowCondition11");
            return (Criteria) this;
        }

        public Criteria andFlowCondition11Between(String value1, String value2) {
            addCriterion("flow_condition_11 between", value1, value2, "flowCondition11");
            return (Criteria) this;
        }

        public Criteria andFlowCondition11NotBetween(String value1, String value2) {
            addCriterion("flow_condition_11 not between", value1, value2, "flowCondition11");
            return (Criteria) this;
        }

        public Criteria andFlowCondition12IsNull() {
            addCriterion("flow_condition_12 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition12IsNotNull() {
            addCriterion("flow_condition_12 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition12EqualTo(String value) {
            addCriterion("flow_condition_12 =", value, "flowCondition12");
            return (Criteria) this;
        }

        public Criteria andFlowCondition12NotEqualTo(String value) {
            addCriterion("flow_condition_12 <>", value, "flowCondition12");
            return (Criteria) this;
        }

        public Criteria andFlowCondition12GreaterThan(String value) {
            addCriterion("flow_condition_12 >", value, "flowCondition12");
            return (Criteria) this;
        }

        public Criteria andFlowCondition12GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_12 >=", value, "flowCondition12");
            return (Criteria) this;
        }

        public Criteria andFlowCondition12LessThan(String value) {
            addCriterion("flow_condition_12 <", value, "flowCondition12");
            return (Criteria) this;
        }

        public Criteria andFlowCondition12LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_12 <=", value, "flowCondition12");
            return (Criteria) this;
        }

        public Criteria andFlowCondition12Like(String value) {
            addCriterion("flow_condition_12 like", value, "flowCondition12");
            return (Criteria) this;
        }

        public Criteria andFlowCondition12NotLike(String value) {
            addCriterion("flow_condition_12 not like", value, "flowCondition12");
            return (Criteria) this;
        }

        public Criteria andFlowCondition12In(List<String> values) {
            addCriterion("flow_condition_12 in", values, "flowCondition12");
            return (Criteria) this;
        }

        public Criteria andFlowCondition12NotIn(List<String> values) {
            addCriterion("flow_condition_12 not in", values, "flowCondition12");
            return (Criteria) this;
        }

        public Criteria andFlowCondition12Between(String value1, String value2) {
            addCriterion("flow_condition_12 between", value1, value2, "flowCondition12");
            return (Criteria) this;
        }

        public Criteria andFlowCondition12NotBetween(String value1, String value2) {
            addCriterion("flow_condition_12 not between", value1, value2, "flowCondition12");
            return (Criteria) this;
        }

        public Criteria andFlowCondition13IsNull() {
            addCriterion("flow_condition_13 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition13IsNotNull() {
            addCriterion("flow_condition_13 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition13EqualTo(String value) {
            addCriterion("flow_condition_13 =", value, "flowCondition13");
            return (Criteria) this;
        }

        public Criteria andFlowCondition13NotEqualTo(String value) {
            addCriterion("flow_condition_13 <>", value, "flowCondition13");
            return (Criteria) this;
        }

        public Criteria andFlowCondition13GreaterThan(String value) {
            addCriterion("flow_condition_13 >", value, "flowCondition13");
            return (Criteria) this;
        }

        public Criteria andFlowCondition13GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_13 >=", value, "flowCondition13");
            return (Criteria) this;
        }

        public Criteria andFlowCondition13LessThan(String value) {
            addCriterion("flow_condition_13 <", value, "flowCondition13");
            return (Criteria) this;
        }

        public Criteria andFlowCondition13LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_13 <=", value, "flowCondition13");
            return (Criteria) this;
        }

        public Criteria andFlowCondition13Like(String value) {
            addCriterion("flow_condition_13 like", value, "flowCondition13");
            return (Criteria) this;
        }

        public Criteria andFlowCondition13NotLike(String value) {
            addCriterion("flow_condition_13 not like", value, "flowCondition13");
            return (Criteria) this;
        }

        public Criteria andFlowCondition13In(List<String> values) {
            addCriterion("flow_condition_13 in", values, "flowCondition13");
            return (Criteria) this;
        }

        public Criteria andFlowCondition13NotIn(List<String> values) {
            addCriterion("flow_condition_13 not in", values, "flowCondition13");
            return (Criteria) this;
        }

        public Criteria andFlowCondition13Between(String value1, String value2) {
            addCriterion("flow_condition_13 between", value1, value2, "flowCondition13");
            return (Criteria) this;
        }

        public Criteria andFlowCondition13NotBetween(String value1, String value2) {
            addCriterion("flow_condition_13 not between", value1, value2, "flowCondition13");
            return (Criteria) this;
        }

        public Criteria andFlowCondition14IsNull() {
            addCriterion("flow_condition_14 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition14IsNotNull() {
            addCriterion("flow_condition_14 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition14EqualTo(String value) {
            addCriterion("flow_condition_14 =", value, "flowCondition14");
            return (Criteria) this;
        }

        public Criteria andFlowCondition14NotEqualTo(String value) {
            addCriterion("flow_condition_14 <>", value, "flowCondition14");
            return (Criteria) this;
        }

        public Criteria andFlowCondition14GreaterThan(String value) {
            addCriterion("flow_condition_14 >", value, "flowCondition14");
            return (Criteria) this;
        }

        public Criteria andFlowCondition14GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_14 >=", value, "flowCondition14");
            return (Criteria) this;
        }

        public Criteria andFlowCondition14LessThan(String value) {
            addCriterion("flow_condition_14 <", value, "flowCondition14");
            return (Criteria) this;
        }

        public Criteria andFlowCondition14LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_14 <=", value, "flowCondition14");
            return (Criteria) this;
        }

        public Criteria andFlowCondition14Like(String value) {
            addCriterion("flow_condition_14 like", value, "flowCondition14");
            return (Criteria) this;
        }

        public Criteria andFlowCondition14NotLike(String value) {
            addCriterion("flow_condition_14 not like", value, "flowCondition14");
            return (Criteria) this;
        }

        public Criteria andFlowCondition14In(List<String> values) {
            addCriterion("flow_condition_14 in", values, "flowCondition14");
            return (Criteria) this;
        }

        public Criteria andFlowCondition14NotIn(List<String> values) {
            addCriterion("flow_condition_14 not in", values, "flowCondition14");
            return (Criteria) this;
        }

        public Criteria andFlowCondition14Between(String value1, String value2) {
            addCriterion("flow_condition_14 between", value1, value2, "flowCondition14");
            return (Criteria) this;
        }

        public Criteria andFlowCondition14NotBetween(String value1, String value2) {
            addCriterion("flow_condition_14 not between", value1, value2, "flowCondition14");
            return (Criteria) this;
        }

        public Criteria andFlowCondition15IsNull() {
            addCriterion("flow_condition_15 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition15IsNotNull() {
            addCriterion("flow_condition_15 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition15EqualTo(String value) {
            addCriterion("flow_condition_15 =", value, "flowCondition15");
            return (Criteria) this;
        }

        public Criteria andFlowCondition15NotEqualTo(String value) {
            addCriterion("flow_condition_15 <>", value, "flowCondition15");
            return (Criteria) this;
        }

        public Criteria andFlowCondition15GreaterThan(String value) {
            addCriterion("flow_condition_15 >", value, "flowCondition15");
            return (Criteria) this;
        }

        public Criteria andFlowCondition15GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_15 >=", value, "flowCondition15");
            return (Criteria) this;
        }

        public Criteria andFlowCondition15LessThan(String value) {
            addCriterion("flow_condition_15 <", value, "flowCondition15");
            return (Criteria) this;
        }

        public Criteria andFlowCondition15LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_15 <=", value, "flowCondition15");
            return (Criteria) this;
        }

        public Criteria andFlowCondition15Like(String value) {
            addCriterion("flow_condition_15 like", value, "flowCondition15");
            return (Criteria) this;
        }

        public Criteria andFlowCondition15NotLike(String value) {
            addCriterion("flow_condition_15 not like", value, "flowCondition15");
            return (Criteria) this;
        }

        public Criteria andFlowCondition15In(List<String> values) {
            addCriterion("flow_condition_15 in", values, "flowCondition15");
            return (Criteria) this;
        }

        public Criteria andFlowCondition15NotIn(List<String> values) {
            addCriterion("flow_condition_15 not in", values, "flowCondition15");
            return (Criteria) this;
        }

        public Criteria andFlowCondition15Between(String value1, String value2) {
            addCriterion("flow_condition_15 between", value1, value2, "flowCondition15");
            return (Criteria) this;
        }

        public Criteria andFlowCondition15NotBetween(String value1, String value2) {
            addCriterion("flow_condition_15 not between", value1, value2, "flowCondition15");
            return (Criteria) this;
        }

        public Criteria andFlowCondition16IsNull() {
            addCriterion("flow_condition_16 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition16IsNotNull() {
            addCriterion("flow_condition_16 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition16EqualTo(String value) {
            addCriterion("flow_condition_16 =", value, "flowCondition16");
            return (Criteria) this;
        }

        public Criteria andFlowCondition16NotEqualTo(String value) {
            addCriterion("flow_condition_16 <>", value, "flowCondition16");
            return (Criteria) this;
        }

        public Criteria andFlowCondition16GreaterThan(String value) {
            addCriterion("flow_condition_16 >", value, "flowCondition16");
            return (Criteria) this;
        }

        public Criteria andFlowCondition16GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_16 >=", value, "flowCondition16");
            return (Criteria) this;
        }

        public Criteria andFlowCondition16LessThan(String value) {
            addCriterion("flow_condition_16 <", value, "flowCondition16");
            return (Criteria) this;
        }

        public Criteria andFlowCondition16LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_16 <=", value, "flowCondition16");
            return (Criteria) this;
        }

        public Criteria andFlowCondition16Like(String value) {
            addCriterion("flow_condition_16 like", value, "flowCondition16");
            return (Criteria) this;
        }

        public Criteria andFlowCondition16NotLike(String value) {
            addCriterion("flow_condition_16 not like", value, "flowCondition16");
            return (Criteria) this;
        }

        public Criteria andFlowCondition16In(List<String> values) {
            addCriterion("flow_condition_16 in", values, "flowCondition16");
            return (Criteria) this;
        }

        public Criteria andFlowCondition16NotIn(List<String> values) {
            addCriterion("flow_condition_16 not in", values, "flowCondition16");
            return (Criteria) this;
        }

        public Criteria andFlowCondition16Between(String value1, String value2) {
            addCriterion("flow_condition_16 between", value1, value2, "flowCondition16");
            return (Criteria) this;
        }

        public Criteria andFlowCondition16NotBetween(String value1, String value2) {
            addCriterion("flow_condition_16 not between", value1, value2, "flowCondition16");
            return (Criteria) this;
        }

        public Criteria andFlowCondition17IsNull() {
            addCriterion("flow_condition_17 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition17IsNotNull() {
            addCriterion("flow_condition_17 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition17EqualTo(String value) {
            addCriterion("flow_condition_17 =", value, "flowCondition17");
            return (Criteria) this;
        }

        public Criteria andFlowCondition17NotEqualTo(String value) {
            addCriterion("flow_condition_17 <>", value, "flowCondition17");
            return (Criteria) this;
        }

        public Criteria andFlowCondition17GreaterThan(String value) {
            addCriterion("flow_condition_17 >", value, "flowCondition17");
            return (Criteria) this;
        }

        public Criteria andFlowCondition17GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_17 >=", value, "flowCondition17");
            return (Criteria) this;
        }

        public Criteria andFlowCondition17LessThan(String value) {
            addCriterion("flow_condition_17 <", value, "flowCondition17");
            return (Criteria) this;
        }

        public Criteria andFlowCondition17LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_17 <=", value, "flowCondition17");
            return (Criteria) this;
        }

        public Criteria andFlowCondition17Like(String value) {
            addCriterion("flow_condition_17 like", value, "flowCondition17");
            return (Criteria) this;
        }

        public Criteria andFlowCondition17NotLike(String value) {
            addCriterion("flow_condition_17 not like", value, "flowCondition17");
            return (Criteria) this;
        }

        public Criteria andFlowCondition17In(List<String> values) {
            addCriterion("flow_condition_17 in", values, "flowCondition17");
            return (Criteria) this;
        }

        public Criteria andFlowCondition17NotIn(List<String> values) {
            addCriterion("flow_condition_17 not in", values, "flowCondition17");
            return (Criteria) this;
        }

        public Criteria andFlowCondition17Between(String value1, String value2) {
            addCriterion("flow_condition_17 between", value1, value2, "flowCondition17");
            return (Criteria) this;
        }

        public Criteria andFlowCondition17NotBetween(String value1, String value2) {
            addCriterion("flow_condition_17 not between", value1, value2, "flowCondition17");
            return (Criteria) this;
        }

        public Criteria andFlowCondition18IsNull() {
            addCriterion("flow_condition_18 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition18IsNotNull() {
            addCriterion("flow_condition_18 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition18EqualTo(String value) {
            addCriterion("flow_condition_18 =", value, "flowCondition18");
            return (Criteria) this;
        }

        public Criteria andFlowCondition18NotEqualTo(String value) {
            addCriterion("flow_condition_18 <>", value, "flowCondition18");
            return (Criteria) this;
        }

        public Criteria andFlowCondition18GreaterThan(String value) {
            addCriterion("flow_condition_18 >", value, "flowCondition18");
            return (Criteria) this;
        }

        public Criteria andFlowCondition18GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_18 >=", value, "flowCondition18");
            return (Criteria) this;
        }

        public Criteria andFlowCondition18LessThan(String value) {
            addCriterion("flow_condition_18 <", value, "flowCondition18");
            return (Criteria) this;
        }

        public Criteria andFlowCondition18LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_18 <=", value, "flowCondition18");
            return (Criteria) this;
        }

        public Criteria andFlowCondition18Like(String value) {
            addCriterion("flow_condition_18 like", value, "flowCondition18");
            return (Criteria) this;
        }

        public Criteria andFlowCondition18NotLike(String value) {
            addCriterion("flow_condition_18 not like", value, "flowCondition18");
            return (Criteria) this;
        }

        public Criteria andFlowCondition18In(List<String> values) {
            addCriterion("flow_condition_18 in", values, "flowCondition18");
            return (Criteria) this;
        }

        public Criteria andFlowCondition18NotIn(List<String> values) {
            addCriterion("flow_condition_18 not in", values, "flowCondition18");
            return (Criteria) this;
        }

        public Criteria andFlowCondition18Between(String value1, String value2) {
            addCriterion("flow_condition_18 between", value1, value2, "flowCondition18");
            return (Criteria) this;
        }

        public Criteria andFlowCondition18NotBetween(String value1, String value2) {
            addCriterion("flow_condition_18 not between", value1, value2, "flowCondition18");
            return (Criteria) this;
        }

        public Criteria andFlowCondition19IsNull() {
            addCriterion("flow_condition_19 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition19IsNotNull() {
            addCriterion("flow_condition_19 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition19EqualTo(String value) {
            addCriterion("flow_condition_19 =", value, "flowCondition19");
            return (Criteria) this;
        }

        public Criteria andFlowCondition19NotEqualTo(String value) {
            addCriterion("flow_condition_19 <>", value, "flowCondition19");
            return (Criteria) this;
        }

        public Criteria andFlowCondition19GreaterThan(String value) {
            addCriterion("flow_condition_19 >", value, "flowCondition19");
            return (Criteria) this;
        }

        public Criteria andFlowCondition19GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_19 >=", value, "flowCondition19");
            return (Criteria) this;
        }

        public Criteria andFlowCondition19LessThan(String value) {
            addCriterion("flow_condition_19 <", value, "flowCondition19");
            return (Criteria) this;
        }

        public Criteria andFlowCondition19LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_19 <=", value, "flowCondition19");
            return (Criteria) this;
        }

        public Criteria andFlowCondition19Like(String value) {
            addCriterion("flow_condition_19 like", value, "flowCondition19");
            return (Criteria) this;
        }

        public Criteria andFlowCondition19NotLike(String value) {
            addCriterion("flow_condition_19 not like", value, "flowCondition19");
            return (Criteria) this;
        }

        public Criteria andFlowCondition19In(List<String> values) {
            addCriterion("flow_condition_19 in", values, "flowCondition19");
            return (Criteria) this;
        }

        public Criteria andFlowCondition19NotIn(List<String> values) {
            addCriterion("flow_condition_19 not in", values, "flowCondition19");
            return (Criteria) this;
        }

        public Criteria andFlowCondition19Between(String value1, String value2) {
            addCriterion("flow_condition_19 between", value1, value2, "flowCondition19");
            return (Criteria) this;
        }

        public Criteria andFlowCondition19NotBetween(String value1, String value2) {
            addCriterion("flow_condition_19 not between", value1, value2, "flowCondition19");
            return (Criteria) this;
        }

        public Criteria andFlowCondition20IsNull() {
            addCriterion("flow_condition_20 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition20IsNotNull() {
            addCriterion("flow_condition_20 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition20EqualTo(String value) {
            addCriterion("flow_condition_20 =", value, "flowCondition20");
            return (Criteria) this;
        }

        public Criteria andFlowCondition20NotEqualTo(String value) {
            addCriterion("flow_condition_20 <>", value, "flowCondition20");
            return (Criteria) this;
        }

        public Criteria andFlowCondition20GreaterThan(String value) {
            addCriterion("flow_condition_20 >", value, "flowCondition20");
            return (Criteria) this;
        }

        public Criteria andFlowCondition20GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_20 >=", value, "flowCondition20");
            return (Criteria) this;
        }

        public Criteria andFlowCondition20LessThan(String value) {
            addCriterion("flow_condition_20 <", value, "flowCondition20");
            return (Criteria) this;
        }

        public Criteria andFlowCondition20LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_20 <=", value, "flowCondition20");
            return (Criteria) this;
        }

        public Criteria andFlowCondition20Like(String value) {
            addCriterion("flow_condition_20 like", value, "flowCondition20");
            return (Criteria) this;
        }

        public Criteria andFlowCondition20NotLike(String value) {
            addCriterion("flow_condition_20 not like", value, "flowCondition20");
            return (Criteria) this;
        }

        public Criteria andFlowCondition20In(List<String> values) {
            addCriterion("flow_condition_20 in", values, "flowCondition20");
            return (Criteria) this;
        }

        public Criteria andFlowCondition20NotIn(List<String> values) {
            addCriterion("flow_condition_20 not in", values, "flowCondition20");
            return (Criteria) this;
        }

        public Criteria andFlowCondition20Between(String value1, String value2) {
            addCriterion("flow_condition_20 between", value1, value2, "flowCondition20");
            return (Criteria) this;
        }

        public Criteria andFlowCondition20NotBetween(String value1, String value2) {
            addCriterion("flow_condition_20 not between", value1, value2, "flowCondition20");
            return (Criteria) this;
        }

        public Criteria andFlowCondition21IsNull() {
            addCriterion("flow_condition_21 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition21IsNotNull() {
            addCriterion("flow_condition_21 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition21EqualTo(String value) {
            addCriterion("flow_condition_21 =", value, "flowCondition21");
            return (Criteria) this;
        }

        public Criteria andFlowCondition21NotEqualTo(String value) {
            addCriterion("flow_condition_21 <>", value, "flowCondition21");
            return (Criteria) this;
        }

        public Criteria andFlowCondition21GreaterThan(String value) {
            addCriterion("flow_condition_21 >", value, "flowCondition21");
            return (Criteria) this;
        }

        public Criteria andFlowCondition21GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_21 >=", value, "flowCondition21");
            return (Criteria) this;
        }

        public Criteria andFlowCondition21LessThan(String value) {
            addCriterion("flow_condition_21 <", value, "flowCondition21");
            return (Criteria) this;
        }

        public Criteria andFlowCondition21LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_21 <=", value, "flowCondition21");
            return (Criteria) this;
        }

        public Criteria andFlowCondition21Like(String value) {
            addCriterion("flow_condition_21 like", value, "flowCondition21");
            return (Criteria) this;
        }

        public Criteria andFlowCondition21NotLike(String value) {
            addCriterion("flow_condition_21 not like", value, "flowCondition21");
            return (Criteria) this;
        }

        public Criteria andFlowCondition21In(List<String> values) {
            addCriterion("flow_condition_21 in", values, "flowCondition21");
            return (Criteria) this;
        }

        public Criteria andFlowCondition21NotIn(List<String> values) {
            addCriterion("flow_condition_21 not in", values, "flowCondition21");
            return (Criteria) this;
        }

        public Criteria andFlowCondition21Between(String value1, String value2) {
            addCriterion("flow_condition_21 between", value1, value2, "flowCondition21");
            return (Criteria) this;
        }

        public Criteria andFlowCondition21NotBetween(String value1, String value2) {
            addCriterion("flow_condition_21 not between", value1, value2, "flowCondition21");
            return (Criteria) this;
        }

        public Criteria andFlowCondition22IsNull() {
            addCriterion("flow_condition_22 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition22IsNotNull() {
            addCriterion("flow_condition_22 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition22EqualTo(String value) {
            addCriterion("flow_condition_22 =", value, "flowCondition22");
            return (Criteria) this;
        }

        public Criteria andFlowCondition22NotEqualTo(String value) {
            addCriterion("flow_condition_22 <>", value, "flowCondition22");
            return (Criteria) this;
        }

        public Criteria andFlowCondition22GreaterThan(String value) {
            addCriterion("flow_condition_22 >", value, "flowCondition22");
            return (Criteria) this;
        }

        public Criteria andFlowCondition22GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_22 >=", value, "flowCondition22");
            return (Criteria) this;
        }

        public Criteria andFlowCondition22LessThan(String value) {
            addCriterion("flow_condition_22 <", value, "flowCondition22");
            return (Criteria) this;
        }

        public Criteria andFlowCondition22LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_22 <=", value, "flowCondition22");
            return (Criteria) this;
        }

        public Criteria andFlowCondition22Like(String value) {
            addCriterion("flow_condition_22 like", value, "flowCondition22");
            return (Criteria) this;
        }

        public Criteria andFlowCondition22NotLike(String value) {
            addCriterion("flow_condition_22 not like", value, "flowCondition22");
            return (Criteria) this;
        }

        public Criteria andFlowCondition22In(List<String> values) {
            addCriterion("flow_condition_22 in", values, "flowCondition22");
            return (Criteria) this;
        }

        public Criteria andFlowCondition22NotIn(List<String> values) {
            addCriterion("flow_condition_22 not in", values, "flowCondition22");
            return (Criteria) this;
        }

        public Criteria andFlowCondition22Between(String value1, String value2) {
            addCriterion("flow_condition_22 between", value1, value2, "flowCondition22");
            return (Criteria) this;
        }

        public Criteria andFlowCondition22NotBetween(String value1, String value2) {
            addCriterion("flow_condition_22 not between", value1, value2, "flowCondition22");
            return (Criteria) this;
        }

        public Criteria andFlowCondition23IsNull() {
            addCriterion("flow_condition_23 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition23IsNotNull() {
            addCriterion("flow_condition_23 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition23EqualTo(String value) {
            addCriterion("flow_condition_23 =", value, "flowCondition23");
            return (Criteria) this;
        }

        public Criteria andFlowCondition23NotEqualTo(String value) {
            addCriterion("flow_condition_23 <>", value, "flowCondition23");
            return (Criteria) this;
        }

        public Criteria andFlowCondition23GreaterThan(String value) {
            addCriterion("flow_condition_23 >", value, "flowCondition23");
            return (Criteria) this;
        }

        public Criteria andFlowCondition23GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_23 >=", value, "flowCondition23");
            return (Criteria) this;
        }

        public Criteria andFlowCondition23LessThan(String value) {
            addCriterion("flow_condition_23 <", value, "flowCondition23");
            return (Criteria) this;
        }

        public Criteria andFlowCondition23LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_23 <=", value, "flowCondition23");
            return (Criteria) this;
        }

        public Criteria andFlowCondition23Like(String value) {
            addCriterion("flow_condition_23 like", value, "flowCondition23");
            return (Criteria) this;
        }

        public Criteria andFlowCondition23NotLike(String value) {
            addCriterion("flow_condition_23 not like", value, "flowCondition23");
            return (Criteria) this;
        }

        public Criteria andFlowCondition23In(List<String> values) {
            addCriterion("flow_condition_23 in", values, "flowCondition23");
            return (Criteria) this;
        }

        public Criteria andFlowCondition23NotIn(List<String> values) {
            addCriterion("flow_condition_23 not in", values, "flowCondition23");
            return (Criteria) this;
        }

        public Criteria andFlowCondition23Between(String value1, String value2) {
            addCriterion("flow_condition_23 between", value1, value2, "flowCondition23");
            return (Criteria) this;
        }

        public Criteria andFlowCondition23NotBetween(String value1, String value2) {
            addCriterion("flow_condition_23 not between", value1, value2, "flowCondition23");
            return (Criteria) this;
        }

        public Criteria andFlowCondition24IsNull() {
            addCriterion("flow_condition_24 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition24IsNotNull() {
            addCriterion("flow_condition_24 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition24EqualTo(String value) {
            addCriterion("flow_condition_24 =", value, "flowCondition24");
            return (Criteria) this;
        }

        public Criteria andFlowCondition24NotEqualTo(String value) {
            addCriterion("flow_condition_24 <>", value, "flowCondition24");
            return (Criteria) this;
        }

        public Criteria andFlowCondition24GreaterThan(String value) {
            addCriterion("flow_condition_24 >", value, "flowCondition24");
            return (Criteria) this;
        }

        public Criteria andFlowCondition24GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_24 >=", value, "flowCondition24");
            return (Criteria) this;
        }

        public Criteria andFlowCondition24LessThan(String value) {
            addCriterion("flow_condition_24 <", value, "flowCondition24");
            return (Criteria) this;
        }

        public Criteria andFlowCondition24LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_24 <=", value, "flowCondition24");
            return (Criteria) this;
        }

        public Criteria andFlowCondition24Like(String value) {
            addCriterion("flow_condition_24 like", value, "flowCondition24");
            return (Criteria) this;
        }

        public Criteria andFlowCondition24NotLike(String value) {
            addCriterion("flow_condition_24 not like", value, "flowCondition24");
            return (Criteria) this;
        }

        public Criteria andFlowCondition24In(List<String> values) {
            addCriterion("flow_condition_24 in", values, "flowCondition24");
            return (Criteria) this;
        }

        public Criteria andFlowCondition24NotIn(List<String> values) {
            addCriterion("flow_condition_24 not in", values, "flowCondition24");
            return (Criteria) this;
        }

        public Criteria andFlowCondition24Between(String value1, String value2) {
            addCriterion("flow_condition_24 between", value1, value2, "flowCondition24");
            return (Criteria) this;
        }

        public Criteria andFlowCondition24NotBetween(String value1, String value2) {
            addCriterion("flow_condition_24 not between", value1, value2, "flowCondition24");
            return (Criteria) this;
        }

        public Criteria andFlowCondition25IsNull() {
            addCriterion("flow_condition_25 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition25IsNotNull() {
            addCriterion("flow_condition_25 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition25EqualTo(String value) {
            addCriterion("flow_condition_25 =", value, "flowCondition25");
            return (Criteria) this;
        }

        public Criteria andFlowCondition25NotEqualTo(String value) {
            addCriterion("flow_condition_25 <>", value, "flowCondition25");
            return (Criteria) this;
        }

        public Criteria andFlowCondition25GreaterThan(String value) {
            addCriterion("flow_condition_25 >", value, "flowCondition25");
            return (Criteria) this;
        }

        public Criteria andFlowCondition25GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_25 >=", value, "flowCondition25");
            return (Criteria) this;
        }

        public Criteria andFlowCondition25LessThan(String value) {
            addCriterion("flow_condition_25 <", value, "flowCondition25");
            return (Criteria) this;
        }

        public Criteria andFlowCondition25LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_25 <=", value, "flowCondition25");
            return (Criteria) this;
        }

        public Criteria andFlowCondition25Like(String value) {
            addCriterion("flow_condition_25 like", value, "flowCondition25");
            return (Criteria) this;
        }

        public Criteria andFlowCondition25NotLike(String value) {
            addCriterion("flow_condition_25 not like", value, "flowCondition25");
            return (Criteria) this;
        }

        public Criteria andFlowCondition25In(List<String> values) {
            addCriterion("flow_condition_25 in", values, "flowCondition25");
            return (Criteria) this;
        }

        public Criteria andFlowCondition25NotIn(List<String> values) {
            addCriterion("flow_condition_25 not in", values, "flowCondition25");
            return (Criteria) this;
        }

        public Criteria andFlowCondition25Between(String value1, String value2) {
            addCriterion("flow_condition_25 between", value1, value2, "flowCondition25");
            return (Criteria) this;
        }

        public Criteria andFlowCondition25NotBetween(String value1, String value2) {
            addCriterion("flow_condition_25 not between", value1, value2, "flowCondition25");
            return (Criteria) this;
        }

        public Criteria andFlowCondition26IsNull() {
            addCriterion("flow_condition_26 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition26IsNotNull() {
            addCriterion("flow_condition_26 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition26EqualTo(String value) {
            addCriterion("flow_condition_26 =", value, "flowCondition26");
            return (Criteria) this;
        }

        public Criteria andFlowCondition26NotEqualTo(String value) {
            addCriterion("flow_condition_26 <>", value, "flowCondition26");
            return (Criteria) this;
        }

        public Criteria andFlowCondition26GreaterThan(String value) {
            addCriterion("flow_condition_26 >", value, "flowCondition26");
            return (Criteria) this;
        }

        public Criteria andFlowCondition26GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_26 >=", value, "flowCondition26");
            return (Criteria) this;
        }

        public Criteria andFlowCondition26LessThan(String value) {
            addCriterion("flow_condition_26 <", value, "flowCondition26");
            return (Criteria) this;
        }

        public Criteria andFlowCondition26LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_26 <=", value, "flowCondition26");
            return (Criteria) this;
        }

        public Criteria andFlowCondition26Like(String value) {
            addCriterion("flow_condition_26 like", value, "flowCondition26");
            return (Criteria) this;
        }

        public Criteria andFlowCondition26NotLike(String value) {
            addCriterion("flow_condition_26 not like", value, "flowCondition26");
            return (Criteria) this;
        }

        public Criteria andFlowCondition26In(List<String> values) {
            addCriterion("flow_condition_26 in", values, "flowCondition26");
            return (Criteria) this;
        }

        public Criteria andFlowCondition26NotIn(List<String> values) {
            addCriterion("flow_condition_26 not in", values, "flowCondition26");
            return (Criteria) this;
        }

        public Criteria andFlowCondition26Between(String value1, String value2) {
            addCriterion("flow_condition_26 between", value1, value2, "flowCondition26");
            return (Criteria) this;
        }

        public Criteria andFlowCondition26NotBetween(String value1, String value2) {
            addCriterion("flow_condition_26 not between", value1, value2, "flowCondition26");
            return (Criteria) this;
        }

        public Criteria andFlowCondition27IsNull() {
            addCriterion("flow_condition_27 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition27IsNotNull() {
            addCriterion("flow_condition_27 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition27EqualTo(String value) {
            addCriterion("flow_condition_27 =", value, "flowCondition27");
            return (Criteria) this;
        }

        public Criteria andFlowCondition27NotEqualTo(String value) {
            addCriterion("flow_condition_27 <>", value, "flowCondition27");
            return (Criteria) this;
        }

        public Criteria andFlowCondition27GreaterThan(String value) {
            addCriterion("flow_condition_27 >", value, "flowCondition27");
            return (Criteria) this;
        }

        public Criteria andFlowCondition27GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_27 >=", value, "flowCondition27");
            return (Criteria) this;
        }

        public Criteria andFlowCondition27LessThan(String value) {
            addCriterion("flow_condition_27 <", value, "flowCondition27");
            return (Criteria) this;
        }

        public Criteria andFlowCondition27LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_27 <=", value, "flowCondition27");
            return (Criteria) this;
        }

        public Criteria andFlowCondition27Like(String value) {
            addCriterion("flow_condition_27 like", value, "flowCondition27");
            return (Criteria) this;
        }

        public Criteria andFlowCondition27NotLike(String value) {
            addCriterion("flow_condition_27 not like", value, "flowCondition27");
            return (Criteria) this;
        }

        public Criteria andFlowCondition27In(List<String> values) {
            addCriterion("flow_condition_27 in", values, "flowCondition27");
            return (Criteria) this;
        }

        public Criteria andFlowCondition27NotIn(List<String> values) {
            addCriterion("flow_condition_27 not in", values, "flowCondition27");
            return (Criteria) this;
        }

        public Criteria andFlowCondition27Between(String value1, String value2) {
            addCriterion("flow_condition_27 between", value1, value2, "flowCondition27");
            return (Criteria) this;
        }

        public Criteria andFlowCondition27NotBetween(String value1, String value2) {
            addCriterion("flow_condition_27 not between", value1, value2, "flowCondition27");
            return (Criteria) this;
        }

        public Criteria andFlowCondition28IsNull() {
            addCriterion("flow_condition_28 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition28IsNotNull() {
            addCriterion("flow_condition_28 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition28EqualTo(String value) {
            addCriterion("flow_condition_28 =", value, "flowCondition28");
            return (Criteria) this;
        }

        public Criteria andFlowCondition28NotEqualTo(String value) {
            addCriterion("flow_condition_28 <>", value, "flowCondition28");
            return (Criteria) this;
        }

        public Criteria andFlowCondition28GreaterThan(String value) {
            addCriterion("flow_condition_28 >", value, "flowCondition28");
            return (Criteria) this;
        }

        public Criteria andFlowCondition28GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_28 >=", value, "flowCondition28");
            return (Criteria) this;
        }

        public Criteria andFlowCondition28LessThan(String value) {
            addCriterion("flow_condition_28 <", value, "flowCondition28");
            return (Criteria) this;
        }

        public Criteria andFlowCondition28LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_28 <=", value, "flowCondition28");
            return (Criteria) this;
        }

        public Criteria andFlowCondition28Like(String value) {
            addCriterion("flow_condition_28 like", value, "flowCondition28");
            return (Criteria) this;
        }

        public Criteria andFlowCondition28NotLike(String value) {
            addCriterion("flow_condition_28 not like", value, "flowCondition28");
            return (Criteria) this;
        }

        public Criteria andFlowCondition28In(List<String> values) {
            addCriterion("flow_condition_28 in", values, "flowCondition28");
            return (Criteria) this;
        }

        public Criteria andFlowCondition28NotIn(List<String> values) {
            addCriterion("flow_condition_28 not in", values, "flowCondition28");
            return (Criteria) this;
        }

        public Criteria andFlowCondition28Between(String value1, String value2) {
            addCriterion("flow_condition_28 between", value1, value2, "flowCondition28");
            return (Criteria) this;
        }

        public Criteria andFlowCondition28NotBetween(String value1, String value2) {
            addCriterion("flow_condition_28 not between", value1, value2, "flowCondition28");
            return (Criteria) this;
        }

        public Criteria andFlowCondition29IsNull() {
            addCriterion("flow_condition_29 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition29IsNotNull() {
            addCriterion("flow_condition_29 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition29EqualTo(String value) {
            addCriterion("flow_condition_29 =", value, "flowCondition29");
            return (Criteria) this;
        }

        public Criteria andFlowCondition29NotEqualTo(String value) {
            addCriterion("flow_condition_29 <>", value, "flowCondition29");
            return (Criteria) this;
        }

        public Criteria andFlowCondition29GreaterThan(String value) {
            addCriterion("flow_condition_29 >", value, "flowCondition29");
            return (Criteria) this;
        }

        public Criteria andFlowCondition29GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_29 >=", value, "flowCondition29");
            return (Criteria) this;
        }

        public Criteria andFlowCondition29LessThan(String value) {
            addCriterion("flow_condition_29 <", value, "flowCondition29");
            return (Criteria) this;
        }

        public Criteria andFlowCondition29LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_29 <=", value, "flowCondition29");
            return (Criteria) this;
        }

        public Criteria andFlowCondition29Like(String value) {
            addCriterion("flow_condition_29 like", value, "flowCondition29");
            return (Criteria) this;
        }

        public Criteria andFlowCondition29NotLike(String value) {
            addCriterion("flow_condition_29 not like", value, "flowCondition29");
            return (Criteria) this;
        }

        public Criteria andFlowCondition29In(List<String> values) {
            addCriterion("flow_condition_29 in", values, "flowCondition29");
            return (Criteria) this;
        }

        public Criteria andFlowCondition29NotIn(List<String> values) {
            addCriterion("flow_condition_29 not in", values, "flowCondition29");
            return (Criteria) this;
        }

        public Criteria andFlowCondition29Between(String value1, String value2) {
            addCriterion("flow_condition_29 between", value1, value2, "flowCondition29");
            return (Criteria) this;
        }

        public Criteria andFlowCondition29NotBetween(String value1, String value2) {
            addCriterion("flow_condition_29 not between", value1, value2, "flowCondition29");
            return (Criteria) this;
        }

        public Criteria andFlowCondition30IsNull() {
            addCriterion("flow_condition_30 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition30IsNotNull() {
            addCriterion("flow_condition_30 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition30EqualTo(String value) {
            addCriterion("flow_condition_30 =", value, "flowCondition30");
            return (Criteria) this;
        }

        public Criteria andFlowCondition30NotEqualTo(String value) {
            addCriterion("flow_condition_30 <>", value, "flowCondition30");
            return (Criteria) this;
        }

        public Criteria andFlowCondition30GreaterThan(String value) {
            addCriterion("flow_condition_30 >", value, "flowCondition30");
            return (Criteria) this;
        }

        public Criteria andFlowCondition30GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_30 >=", value, "flowCondition30");
            return (Criteria) this;
        }

        public Criteria andFlowCondition30LessThan(String value) {
            addCriterion("flow_condition_30 <", value, "flowCondition30");
            return (Criteria) this;
        }

        public Criteria andFlowCondition30LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_30 <=", value, "flowCondition30");
            return (Criteria) this;
        }

        public Criteria andFlowCondition30Like(String value) {
            addCriterion("flow_condition_30 like", value, "flowCondition30");
            return (Criteria) this;
        }

        public Criteria andFlowCondition30NotLike(String value) {
            addCriterion("flow_condition_30 not like", value, "flowCondition30");
            return (Criteria) this;
        }

        public Criteria andFlowCondition30In(List<String> values) {
            addCriterion("flow_condition_30 in", values, "flowCondition30");
            return (Criteria) this;
        }

        public Criteria andFlowCondition30NotIn(List<String> values) {
            addCriterion("flow_condition_30 not in", values, "flowCondition30");
            return (Criteria) this;
        }

        public Criteria andFlowCondition30Between(String value1, String value2) {
            addCriterion("flow_condition_30 between", value1, value2, "flowCondition30");
            return (Criteria) this;
        }

        public Criteria andFlowCondition30NotBetween(String value1, String value2) {
            addCriterion("flow_condition_30 not between", value1, value2, "flowCondition30");
            return (Criteria) this;
        }

        public Criteria andFlowCondition31IsNull() {
            addCriterion("flow_condition_31 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition31IsNotNull() {
            addCriterion("flow_condition_31 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition31EqualTo(String value) {
            addCriterion("flow_condition_31 =", value, "flowCondition31");
            return (Criteria) this;
        }

        public Criteria andFlowCondition31NotEqualTo(String value) {
            addCriterion("flow_condition_31 <>", value, "flowCondition31");
            return (Criteria) this;
        }

        public Criteria andFlowCondition31GreaterThan(String value) {
            addCriterion("flow_condition_31 >", value, "flowCondition31");
            return (Criteria) this;
        }

        public Criteria andFlowCondition31GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_31 >=", value, "flowCondition31");
            return (Criteria) this;
        }

        public Criteria andFlowCondition31LessThan(String value) {
            addCriterion("flow_condition_31 <", value, "flowCondition31");
            return (Criteria) this;
        }

        public Criteria andFlowCondition31LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_31 <=", value, "flowCondition31");
            return (Criteria) this;
        }

        public Criteria andFlowCondition31Like(String value) {
            addCriterion("flow_condition_31 like", value, "flowCondition31");
            return (Criteria) this;
        }

        public Criteria andFlowCondition31NotLike(String value) {
            addCriterion("flow_condition_31 not like", value, "flowCondition31");
            return (Criteria) this;
        }

        public Criteria andFlowCondition31In(List<String> values) {
            addCriterion("flow_condition_31 in", values, "flowCondition31");
            return (Criteria) this;
        }

        public Criteria andFlowCondition31NotIn(List<String> values) {
            addCriterion("flow_condition_31 not in", values, "flowCondition31");
            return (Criteria) this;
        }

        public Criteria andFlowCondition31Between(String value1, String value2) {
            addCriterion("flow_condition_31 between", value1, value2, "flowCondition31");
            return (Criteria) this;
        }

        public Criteria andFlowCondition31NotBetween(String value1, String value2) {
            addCriterion("flow_condition_31 not between", value1, value2, "flowCondition31");
            return (Criteria) this;
        }

        public Criteria andFlowCondition32IsNull() {
            addCriterion("flow_condition_32 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition32IsNotNull() {
            addCriterion("flow_condition_32 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition32EqualTo(String value) {
            addCriterion("flow_condition_32 =", value, "flowCondition32");
            return (Criteria) this;
        }

        public Criteria andFlowCondition32NotEqualTo(String value) {
            addCriterion("flow_condition_32 <>", value, "flowCondition32");
            return (Criteria) this;
        }

        public Criteria andFlowCondition32GreaterThan(String value) {
            addCriterion("flow_condition_32 >", value, "flowCondition32");
            return (Criteria) this;
        }

        public Criteria andFlowCondition32GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_32 >=", value, "flowCondition32");
            return (Criteria) this;
        }

        public Criteria andFlowCondition32LessThan(String value) {
            addCriterion("flow_condition_32 <", value, "flowCondition32");
            return (Criteria) this;
        }

        public Criteria andFlowCondition32LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_32 <=", value, "flowCondition32");
            return (Criteria) this;
        }

        public Criteria andFlowCondition32Like(String value) {
            addCriterion("flow_condition_32 like", value, "flowCondition32");
            return (Criteria) this;
        }

        public Criteria andFlowCondition32NotLike(String value) {
            addCriterion("flow_condition_32 not like", value, "flowCondition32");
            return (Criteria) this;
        }

        public Criteria andFlowCondition32In(List<String> values) {
            addCriterion("flow_condition_32 in", values, "flowCondition32");
            return (Criteria) this;
        }

        public Criteria andFlowCondition32NotIn(List<String> values) {
            addCriterion("flow_condition_32 not in", values, "flowCondition32");
            return (Criteria) this;
        }

        public Criteria andFlowCondition32Between(String value1, String value2) {
            addCriterion("flow_condition_32 between", value1, value2, "flowCondition32");
            return (Criteria) this;
        }

        public Criteria andFlowCondition32NotBetween(String value1, String value2) {
            addCriterion("flow_condition_32 not between", value1, value2, "flowCondition32");
            return (Criteria) this;
        }

        public Criteria andFlowCondition33IsNull() {
            addCriterion("flow_condition_33 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition33IsNotNull() {
            addCriterion("flow_condition_33 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition33EqualTo(String value) {
            addCriterion("flow_condition_33 =", value, "flowCondition33");
            return (Criteria) this;
        }

        public Criteria andFlowCondition33NotEqualTo(String value) {
            addCriterion("flow_condition_33 <>", value, "flowCondition33");
            return (Criteria) this;
        }

        public Criteria andFlowCondition33GreaterThan(String value) {
            addCriterion("flow_condition_33 >", value, "flowCondition33");
            return (Criteria) this;
        }

        public Criteria andFlowCondition33GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_33 >=", value, "flowCondition33");
            return (Criteria) this;
        }

        public Criteria andFlowCondition33LessThan(String value) {
            addCriterion("flow_condition_33 <", value, "flowCondition33");
            return (Criteria) this;
        }

        public Criteria andFlowCondition33LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_33 <=", value, "flowCondition33");
            return (Criteria) this;
        }

        public Criteria andFlowCondition33Like(String value) {
            addCriterion("flow_condition_33 like", value, "flowCondition33");
            return (Criteria) this;
        }

        public Criteria andFlowCondition33NotLike(String value) {
            addCriterion("flow_condition_33 not like", value, "flowCondition33");
            return (Criteria) this;
        }

        public Criteria andFlowCondition33In(List<String> values) {
            addCriterion("flow_condition_33 in", values, "flowCondition33");
            return (Criteria) this;
        }

        public Criteria andFlowCondition33NotIn(List<String> values) {
            addCriterion("flow_condition_33 not in", values, "flowCondition33");
            return (Criteria) this;
        }

        public Criteria andFlowCondition33Between(String value1, String value2) {
            addCriterion("flow_condition_33 between", value1, value2, "flowCondition33");
            return (Criteria) this;
        }

        public Criteria andFlowCondition33NotBetween(String value1, String value2) {
            addCriterion("flow_condition_33 not between", value1, value2, "flowCondition33");
            return (Criteria) this;
        }

        public Criteria andFlowCondition34IsNull() {
            addCriterion("flow_condition_34 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition34IsNotNull() {
            addCriterion("flow_condition_34 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition34EqualTo(String value) {
            addCriterion("flow_condition_34 =", value, "flowCondition34");
            return (Criteria) this;
        }

        public Criteria andFlowCondition34NotEqualTo(String value) {
            addCriterion("flow_condition_34 <>", value, "flowCondition34");
            return (Criteria) this;
        }

        public Criteria andFlowCondition34GreaterThan(String value) {
            addCriterion("flow_condition_34 >", value, "flowCondition34");
            return (Criteria) this;
        }

        public Criteria andFlowCondition34GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_34 >=", value, "flowCondition34");
            return (Criteria) this;
        }

        public Criteria andFlowCondition34LessThan(String value) {
            addCriterion("flow_condition_34 <", value, "flowCondition34");
            return (Criteria) this;
        }

        public Criteria andFlowCondition34LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_34 <=", value, "flowCondition34");
            return (Criteria) this;
        }

        public Criteria andFlowCondition34Like(String value) {
            addCriterion("flow_condition_34 like", value, "flowCondition34");
            return (Criteria) this;
        }

        public Criteria andFlowCondition34NotLike(String value) {
            addCriterion("flow_condition_34 not like", value, "flowCondition34");
            return (Criteria) this;
        }

        public Criteria andFlowCondition34In(List<String> values) {
            addCriterion("flow_condition_34 in", values, "flowCondition34");
            return (Criteria) this;
        }

        public Criteria andFlowCondition34NotIn(List<String> values) {
            addCriterion("flow_condition_34 not in", values, "flowCondition34");
            return (Criteria) this;
        }

        public Criteria andFlowCondition34Between(String value1, String value2) {
            addCriterion("flow_condition_34 between", value1, value2, "flowCondition34");
            return (Criteria) this;
        }

        public Criteria andFlowCondition34NotBetween(String value1, String value2) {
            addCriterion("flow_condition_34 not between", value1, value2, "flowCondition34");
            return (Criteria) this;
        }

        public Criteria andFlowCondition35IsNull() {
            addCriterion("flow_condition_35 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition35IsNotNull() {
            addCriterion("flow_condition_35 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition35EqualTo(String value) {
            addCriterion("flow_condition_35 =", value, "flowCondition35");
            return (Criteria) this;
        }

        public Criteria andFlowCondition35NotEqualTo(String value) {
            addCriterion("flow_condition_35 <>", value, "flowCondition35");
            return (Criteria) this;
        }

        public Criteria andFlowCondition35GreaterThan(String value) {
            addCriterion("flow_condition_35 >", value, "flowCondition35");
            return (Criteria) this;
        }

        public Criteria andFlowCondition35GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_35 >=", value, "flowCondition35");
            return (Criteria) this;
        }

        public Criteria andFlowCondition35LessThan(String value) {
            addCriterion("flow_condition_35 <", value, "flowCondition35");
            return (Criteria) this;
        }

        public Criteria andFlowCondition35LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_35 <=", value, "flowCondition35");
            return (Criteria) this;
        }

        public Criteria andFlowCondition35Like(String value) {
            addCriterion("flow_condition_35 like", value, "flowCondition35");
            return (Criteria) this;
        }

        public Criteria andFlowCondition35NotLike(String value) {
            addCriterion("flow_condition_35 not like", value, "flowCondition35");
            return (Criteria) this;
        }

        public Criteria andFlowCondition35In(List<String> values) {
            addCriterion("flow_condition_35 in", values, "flowCondition35");
            return (Criteria) this;
        }

        public Criteria andFlowCondition35NotIn(List<String> values) {
            addCriterion("flow_condition_35 not in", values, "flowCondition35");
            return (Criteria) this;
        }

        public Criteria andFlowCondition35Between(String value1, String value2) {
            addCriterion("flow_condition_35 between", value1, value2, "flowCondition35");
            return (Criteria) this;
        }

        public Criteria andFlowCondition35NotBetween(String value1, String value2) {
            addCriterion("flow_condition_35 not between", value1, value2, "flowCondition35");
            return (Criteria) this;
        }

        public Criteria andFlowCondition36IsNull() {
            addCriterion("flow_condition_36 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition36IsNotNull() {
            addCriterion("flow_condition_36 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition36EqualTo(String value) {
            addCriterion("flow_condition_36 =", value, "flowCondition36");
            return (Criteria) this;
        }

        public Criteria andFlowCondition36NotEqualTo(String value) {
            addCriterion("flow_condition_36 <>", value, "flowCondition36");
            return (Criteria) this;
        }

        public Criteria andFlowCondition36GreaterThan(String value) {
            addCriterion("flow_condition_36 >", value, "flowCondition36");
            return (Criteria) this;
        }

        public Criteria andFlowCondition36GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_36 >=", value, "flowCondition36");
            return (Criteria) this;
        }

        public Criteria andFlowCondition36LessThan(String value) {
            addCriterion("flow_condition_36 <", value, "flowCondition36");
            return (Criteria) this;
        }

        public Criteria andFlowCondition36LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_36 <=", value, "flowCondition36");
            return (Criteria) this;
        }

        public Criteria andFlowCondition36Like(String value) {
            addCriterion("flow_condition_36 like", value, "flowCondition36");
            return (Criteria) this;
        }

        public Criteria andFlowCondition36NotLike(String value) {
            addCriterion("flow_condition_36 not like", value, "flowCondition36");
            return (Criteria) this;
        }

        public Criteria andFlowCondition36In(List<String> values) {
            addCriterion("flow_condition_36 in", values, "flowCondition36");
            return (Criteria) this;
        }

        public Criteria andFlowCondition36NotIn(List<String> values) {
            addCriterion("flow_condition_36 not in", values, "flowCondition36");
            return (Criteria) this;
        }

        public Criteria andFlowCondition36Between(String value1, String value2) {
            addCriterion("flow_condition_36 between", value1, value2, "flowCondition36");
            return (Criteria) this;
        }

        public Criteria andFlowCondition36NotBetween(String value1, String value2) {
            addCriterion("flow_condition_36 not between", value1, value2, "flowCondition36");
            return (Criteria) this;
        }

        public Criteria andFlowCondition37IsNull() {
            addCriterion("flow_condition_37 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition37IsNotNull() {
            addCriterion("flow_condition_37 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition37EqualTo(String value) {
            addCriterion("flow_condition_37 =", value, "flowCondition37");
            return (Criteria) this;
        }

        public Criteria andFlowCondition37NotEqualTo(String value) {
            addCriterion("flow_condition_37 <>", value, "flowCondition37");
            return (Criteria) this;
        }

        public Criteria andFlowCondition37GreaterThan(String value) {
            addCriterion("flow_condition_37 >", value, "flowCondition37");
            return (Criteria) this;
        }

        public Criteria andFlowCondition37GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_37 >=", value, "flowCondition37");
            return (Criteria) this;
        }

        public Criteria andFlowCondition37LessThan(String value) {
            addCriterion("flow_condition_37 <", value, "flowCondition37");
            return (Criteria) this;
        }

        public Criteria andFlowCondition37LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_37 <=", value, "flowCondition37");
            return (Criteria) this;
        }

        public Criteria andFlowCondition37Like(String value) {
            addCriterion("flow_condition_37 like", value, "flowCondition37");
            return (Criteria) this;
        }

        public Criteria andFlowCondition37NotLike(String value) {
            addCriterion("flow_condition_37 not like", value, "flowCondition37");
            return (Criteria) this;
        }

        public Criteria andFlowCondition37In(List<String> values) {
            addCriterion("flow_condition_37 in", values, "flowCondition37");
            return (Criteria) this;
        }

        public Criteria andFlowCondition37NotIn(List<String> values) {
            addCriterion("flow_condition_37 not in", values, "flowCondition37");
            return (Criteria) this;
        }

        public Criteria andFlowCondition37Between(String value1, String value2) {
            addCriterion("flow_condition_37 between", value1, value2, "flowCondition37");
            return (Criteria) this;
        }

        public Criteria andFlowCondition37NotBetween(String value1, String value2) {
            addCriterion("flow_condition_37 not between", value1, value2, "flowCondition37");
            return (Criteria) this;
        }

        public Criteria andFlowCondition38IsNull() {
            addCriterion("flow_condition_38 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition38IsNotNull() {
            addCriterion("flow_condition_38 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition38EqualTo(String value) {
            addCriterion("flow_condition_38 =", value, "flowCondition38");
            return (Criteria) this;
        }

        public Criteria andFlowCondition38NotEqualTo(String value) {
            addCriterion("flow_condition_38 <>", value, "flowCondition38");
            return (Criteria) this;
        }

        public Criteria andFlowCondition38GreaterThan(String value) {
            addCriterion("flow_condition_38 >", value, "flowCondition38");
            return (Criteria) this;
        }

        public Criteria andFlowCondition38GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_38 >=", value, "flowCondition38");
            return (Criteria) this;
        }

        public Criteria andFlowCondition38LessThan(String value) {
            addCriterion("flow_condition_38 <", value, "flowCondition38");
            return (Criteria) this;
        }

        public Criteria andFlowCondition38LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_38 <=", value, "flowCondition38");
            return (Criteria) this;
        }

        public Criteria andFlowCondition38Like(String value) {
            addCriterion("flow_condition_38 like", value, "flowCondition38");
            return (Criteria) this;
        }

        public Criteria andFlowCondition38NotLike(String value) {
            addCriterion("flow_condition_38 not like", value, "flowCondition38");
            return (Criteria) this;
        }

        public Criteria andFlowCondition38In(List<String> values) {
            addCriterion("flow_condition_38 in", values, "flowCondition38");
            return (Criteria) this;
        }

        public Criteria andFlowCondition38NotIn(List<String> values) {
            addCriterion("flow_condition_38 not in", values, "flowCondition38");
            return (Criteria) this;
        }

        public Criteria andFlowCondition38Between(String value1, String value2) {
            addCriterion("flow_condition_38 between", value1, value2, "flowCondition38");
            return (Criteria) this;
        }

        public Criteria andFlowCondition38NotBetween(String value1, String value2) {
            addCriterion("flow_condition_38 not between", value1, value2, "flowCondition38");
            return (Criteria) this;
        }

        public Criteria andFlowCondition39IsNull() {
            addCriterion("flow_condition_39 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition39IsNotNull() {
            addCriterion("flow_condition_39 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition39EqualTo(String value) {
            addCriterion("flow_condition_39 =", value, "flowCondition39");
            return (Criteria) this;
        }

        public Criteria andFlowCondition39NotEqualTo(String value) {
            addCriterion("flow_condition_39 <>", value, "flowCondition39");
            return (Criteria) this;
        }

        public Criteria andFlowCondition39GreaterThan(String value) {
            addCriterion("flow_condition_39 >", value, "flowCondition39");
            return (Criteria) this;
        }

        public Criteria andFlowCondition39GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_39 >=", value, "flowCondition39");
            return (Criteria) this;
        }

        public Criteria andFlowCondition39LessThan(String value) {
            addCriterion("flow_condition_39 <", value, "flowCondition39");
            return (Criteria) this;
        }

        public Criteria andFlowCondition39LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_39 <=", value, "flowCondition39");
            return (Criteria) this;
        }

        public Criteria andFlowCondition39Like(String value) {
            addCriterion("flow_condition_39 like", value, "flowCondition39");
            return (Criteria) this;
        }

        public Criteria andFlowCondition39NotLike(String value) {
            addCriterion("flow_condition_39 not like", value, "flowCondition39");
            return (Criteria) this;
        }

        public Criteria andFlowCondition39In(List<String> values) {
            addCriterion("flow_condition_39 in", values, "flowCondition39");
            return (Criteria) this;
        }

        public Criteria andFlowCondition39NotIn(List<String> values) {
            addCriterion("flow_condition_39 not in", values, "flowCondition39");
            return (Criteria) this;
        }

        public Criteria andFlowCondition39Between(String value1, String value2) {
            addCriterion("flow_condition_39 between", value1, value2, "flowCondition39");
            return (Criteria) this;
        }

        public Criteria andFlowCondition39NotBetween(String value1, String value2) {
            addCriterion("flow_condition_39 not between", value1, value2, "flowCondition39");
            return (Criteria) this;
        }

        public Criteria andFlowCondition40IsNull() {
            addCriterion("flow_condition_40 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition40IsNotNull() {
            addCriterion("flow_condition_40 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition40EqualTo(String value) {
            addCriterion("flow_condition_40 =", value, "flowCondition40");
            return (Criteria) this;
        }

        public Criteria andFlowCondition40NotEqualTo(String value) {
            addCriterion("flow_condition_40 <>", value, "flowCondition40");
            return (Criteria) this;
        }

        public Criteria andFlowCondition40GreaterThan(String value) {
            addCriterion("flow_condition_40 >", value, "flowCondition40");
            return (Criteria) this;
        }

        public Criteria andFlowCondition40GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_40 >=", value, "flowCondition40");
            return (Criteria) this;
        }

        public Criteria andFlowCondition40LessThan(String value) {
            addCriterion("flow_condition_40 <", value, "flowCondition40");
            return (Criteria) this;
        }

        public Criteria andFlowCondition40LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_40 <=", value, "flowCondition40");
            return (Criteria) this;
        }

        public Criteria andFlowCondition40Like(String value) {
            addCriterion("flow_condition_40 like", value, "flowCondition40");
            return (Criteria) this;
        }

        public Criteria andFlowCondition40NotLike(String value) {
            addCriterion("flow_condition_40 not like", value, "flowCondition40");
            return (Criteria) this;
        }

        public Criteria andFlowCondition40In(List<String> values) {
            addCriterion("flow_condition_40 in", values, "flowCondition40");
            return (Criteria) this;
        }

        public Criteria andFlowCondition40NotIn(List<String> values) {
            addCriterion("flow_condition_40 not in", values, "flowCondition40");
            return (Criteria) this;
        }

        public Criteria andFlowCondition40Between(String value1, String value2) {
            addCriterion("flow_condition_40 between", value1, value2, "flowCondition40");
            return (Criteria) this;
        }

        public Criteria andFlowCondition40NotBetween(String value1, String value2) {
            addCriterion("flow_condition_40 not between", value1, value2, "flowCondition40");
            return (Criteria) this;
        }

        public Criteria andFlowCondition41IsNull() {
            addCriterion("flow_condition_41 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition41IsNotNull() {
            addCriterion("flow_condition_41 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition41EqualTo(String value) {
            addCriterion("flow_condition_41 =", value, "flowCondition41");
            return (Criteria) this;
        }

        public Criteria andFlowCondition41NotEqualTo(String value) {
            addCriterion("flow_condition_41 <>", value, "flowCondition41");
            return (Criteria) this;
        }

        public Criteria andFlowCondition41GreaterThan(String value) {
            addCriterion("flow_condition_41 >", value, "flowCondition41");
            return (Criteria) this;
        }

        public Criteria andFlowCondition41GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_41 >=", value, "flowCondition41");
            return (Criteria) this;
        }

        public Criteria andFlowCondition41LessThan(String value) {
            addCriterion("flow_condition_41 <", value, "flowCondition41");
            return (Criteria) this;
        }

        public Criteria andFlowCondition41LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_41 <=", value, "flowCondition41");
            return (Criteria) this;
        }

        public Criteria andFlowCondition41Like(String value) {
            addCriterion("flow_condition_41 like", value, "flowCondition41");
            return (Criteria) this;
        }

        public Criteria andFlowCondition41NotLike(String value) {
            addCriterion("flow_condition_41 not like", value, "flowCondition41");
            return (Criteria) this;
        }

        public Criteria andFlowCondition41In(List<String> values) {
            addCriterion("flow_condition_41 in", values, "flowCondition41");
            return (Criteria) this;
        }

        public Criteria andFlowCondition41NotIn(List<String> values) {
            addCriterion("flow_condition_41 not in", values, "flowCondition41");
            return (Criteria) this;
        }

        public Criteria andFlowCondition41Between(String value1, String value2) {
            addCriterion("flow_condition_41 between", value1, value2, "flowCondition41");
            return (Criteria) this;
        }

        public Criteria andFlowCondition41NotBetween(String value1, String value2) {
            addCriterion("flow_condition_41 not between", value1, value2, "flowCondition41");
            return (Criteria) this;
        }

        public Criteria andFlowCondition42IsNull() {
            addCriterion("flow_condition_42 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition42IsNotNull() {
            addCriterion("flow_condition_42 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition42EqualTo(String value) {
            addCriterion("flow_condition_42 =", value, "flowCondition42");
            return (Criteria) this;
        }

        public Criteria andFlowCondition42NotEqualTo(String value) {
            addCriterion("flow_condition_42 <>", value, "flowCondition42");
            return (Criteria) this;
        }

        public Criteria andFlowCondition42GreaterThan(String value) {
            addCriterion("flow_condition_42 >", value, "flowCondition42");
            return (Criteria) this;
        }

        public Criteria andFlowCondition42GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_42 >=", value, "flowCondition42");
            return (Criteria) this;
        }

        public Criteria andFlowCondition42LessThan(String value) {
            addCriterion("flow_condition_42 <", value, "flowCondition42");
            return (Criteria) this;
        }

        public Criteria andFlowCondition42LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_42 <=", value, "flowCondition42");
            return (Criteria) this;
        }

        public Criteria andFlowCondition42Like(String value) {
            addCriterion("flow_condition_42 like", value, "flowCondition42");
            return (Criteria) this;
        }

        public Criteria andFlowCondition42NotLike(String value) {
            addCriterion("flow_condition_42 not like", value, "flowCondition42");
            return (Criteria) this;
        }

        public Criteria andFlowCondition42In(List<String> values) {
            addCriterion("flow_condition_42 in", values, "flowCondition42");
            return (Criteria) this;
        }

        public Criteria andFlowCondition42NotIn(List<String> values) {
            addCriterion("flow_condition_42 not in", values, "flowCondition42");
            return (Criteria) this;
        }

        public Criteria andFlowCondition42Between(String value1, String value2) {
            addCriterion("flow_condition_42 between", value1, value2, "flowCondition42");
            return (Criteria) this;
        }

        public Criteria andFlowCondition42NotBetween(String value1, String value2) {
            addCriterion("flow_condition_42 not between", value1, value2, "flowCondition42");
            return (Criteria) this;
        }

        public Criteria andFlowCondition43IsNull() {
            addCriterion("flow_condition_43 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition43IsNotNull() {
            addCriterion("flow_condition_43 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition43EqualTo(String value) {
            addCriterion("flow_condition_43 =", value, "flowCondition43");
            return (Criteria) this;
        }

        public Criteria andFlowCondition43NotEqualTo(String value) {
            addCriterion("flow_condition_43 <>", value, "flowCondition43");
            return (Criteria) this;
        }

        public Criteria andFlowCondition43GreaterThan(String value) {
            addCriterion("flow_condition_43 >", value, "flowCondition43");
            return (Criteria) this;
        }

        public Criteria andFlowCondition43GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_43 >=", value, "flowCondition43");
            return (Criteria) this;
        }

        public Criteria andFlowCondition43LessThan(String value) {
            addCriterion("flow_condition_43 <", value, "flowCondition43");
            return (Criteria) this;
        }

        public Criteria andFlowCondition43LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_43 <=", value, "flowCondition43");
            return (Criteria) this;
        }

        public Criteria andFlowCondition43Like(String value) {
            addCriterion("flow_condition_43 like", value, "flowCondition43");
            return (Criteria) this;
        }

        public Criteria andFlowCondition43NotLike(String value) {
            addCriterion("flow_condition_43 not like", value, "flowCondition43");
            return (Criteria) this;
        }

        public Criteria andFlowCondition43In(List<String> values) {
            addCriterion("flow_condition_43 in", values, "flowCondition43");
            return (Criteria) this;
        }

        public Criteria andFlowCondition43NotIn(List<String> values) {
            addCriterion("flow_condition_43 not in", values, "flowCondition43");
            return (Criteria) this;
        }

        public Criteria andFlowCondition43Between(String value1, String value2) {
            addCriterion("flow_condition_43 between", value1, value2, "flowCondition43");
            return (Criteria) this;
        }

        public Criteria andFlowCondition43NotBetween(String value1, String value2) {
            addCriterion("flow_condition_43 not between", value1, value2, "flowCondition43");
            return (Criteria) this;
        }

        public Criteria andFlowCondition44IsNull() {
            addCriterion("flow_condition_44 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition44IsNotNull() {
            addCriterion("flow_condition_44 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition44EqualTo(String value) {
            addCriterion("flow_condition_44 =", value, "flowCondition44");
            return (Criteria) this;
        }

        public Criteria andFlowCondition44NotEqualTo(String value) {
            addCriterion("flow_condition_44 <>", value, "flowCondition44");
            return (Criteria) this;
        }

        public Criteria andFlowCondition44GreaterThan(String value) {
            addCriterion("flow_condition_44 >", value, "flowCondition44");
            return (Criteria) this;
        }

        public Criteria andFlowCondition44GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_44 >=", value, "flowCondition44");
            return (Criteria) this;
        }

        public Criteria andFlowCondition44LessThan(String value) {
            addCriterion("flow_condition_44 <", value, "flowCondition44");
            return (Criteria) this;
        }

        public Criteria andFlowCondition44LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_44 <=", value, "flowCondition44");
            return (Criteria) this;
        }

        public Criteria andFlowCondition44Like(String value) {
            addCriterion("flow_condition_44 like", value, "flowCondition44");
            return (Criteria) this;
        }

        public Criteria andFlowCondition44NotLike(String value) {
            addCriterion("flow_condition_44 not like", value, "flowCondition44");
            return (Criteria) this;
        }

        public Criteria andFlowCondition44In(List<String> values) {
            addCriterion("flow_condition_44 in", values, "flowCondition44");
            return (Criteria) this;
        }

        public Criteria andFlowCondition44NotIn(List<String> values) {
            addCriterion("flow_condition_44 not in", values, "flowCondition44");
            return (Criteria) this;
        }

        public Criteria andFlowCondition44Between(String value1, String value2) {
            addCriterion("flow_condition_44 between", value1, value2, "flowCondition44");
            return (Criteria) this;
        }

        public Criteria andFlowCondition44NotBetween(String value1, String value2) {
            addCriterion("flow_condition_44 not between", value1, value2, "flowCondition44");
            return (Criteria) this;
        }

        public Criteria andFlowCondition45IsNull() {
            addCriterion("flow_condition_45 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition45IsNotNull() {
            addCriterion("flow_condition_45 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition45EqualTo(String value) {
            addCriterion("flow_condition_45 =", value, "flowCondition45");
            return (Criteria) this;
        }

        public Criteria andFlowCondition45NotEqualTo(String value) {
            addCriterion("flow_condition_45 <>", value, "flowCondition45");
            return (Criteria) this;
        }

        public Criteria andFlowCondition45GreaterThan(String value) {
            addCriterion("flow_condition_45 >", value, "flowCondition45");
            return (Criteria) this;
        }

        public Criteria andFlowCondition45GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_45 >=", value, "flowCondition45");
            return (Criteria) this;
        }

        public Criteria andFlowCondition45LessThan(String value) {
            addCriterion("flow_condition_45 <", value, "flowCondition45");
            return (Criteria) this;
        }

        public Criteria andFlowCondition45LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_45 <=", value, "flowCondition45");
            return (Criteria) this;
        }

        public Criteria andFlowCondition45Like(String value) {
            addCriterion("flow_condition_45 like", value, "flowCondition45");
            return (Criteria) this;
        }

        public Criteria andFlowCondition45NotLike(String value) {
            addCriterion("flow_condition_45 not like", value, "flowCondition45");
            return (Criteria) this;
        }

        public Criteria andFlowCondition45In(List<String> values) {
            addCriterion("flow_condition_45 in", values, "flowCondition45");
            return (Criteria) this;
        }

        public Criteria andFlowCondition45NotIn(List<String> values) {
            addCriterion("flow_condition_45 not in", values, "flowCondition45");
            return (Criteria) this;
        }

        public Criteria andFlowCondition45Between(String value1, String value2) {
            addCriterion("flow_condition_45 between", value1, value2, "flowCondition45");
            return (Criteria) this;
        }

        public Criteria andFlowCondition45NotBetween(String value1, String value2) {
            addCriterion("flow_condition_45 not between", value1, value2, "flowCondition45");
            return (Criteria) this;
        }

        public Criteria andFlowCondition46IsNull() {
            addCriterion("flow_condition_46 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition46IsNotNull() {
            addCriterion("flow_condition_46 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition46EqualTo(String value) {
            addCriterion("flow_condition_46 =", value, "flowCondition46");
            return (Criteria) this;
        }

        public Criteria andFlowCondition46NotEqualTo(String value) {
            addCriterion("flow_condition_46 <>", value, "flowCondition46");
            return (Criteria) this;
        }

        public Criteria andFlowCondition46GreaterThan(String value) {
            addCriterion("flow_condition_46 >", value, "flowCondition46");
            return (Criteria) this;
        }

        public Criteria andFlowCondition46GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_46 >=", value, "flowCondition46");
            return (Criteria) this;
        }

        public Criteria andFlowCondition46LessThan(String value) {
            addCriterion("flow_condition_46 <", value, "flowCondition46");
            return (Criteria) this;
        }

        public Criteria andFlowCondition46LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_46 <=", value, "flowCondition46");
            return (Criteria) this;
        }

        public Criteria andFlowCondition46Like(String value) {
            addCriterion("flow_condition_46 like", value, "flowCondition46");
            return (Criteria) this;
        }

        public Criteria andFlowCondition46NotLike(String value) {
            addCriterion("flow_condition_46 not like", value, "flowCondition46");
            return (Criteria) this;
        }

        public Criteria andFlowCondition46In(List<String> values) {
            addCriterion("flow_condition_46 in", values, "flowCondition46");
            return (Criteria) this;
        }

        public Criteria andFlowCondition46NotIn(List<String> values) {
            addCriterion("flow_condition_46 not in", values, "flowCondition46");
            return (Criteria) this;
        }

        public Criteria andFlowCondition46Between(String value1, String value2) {
            addCriterion("flow_condition_46 between", value1, value2, "flowCondition46");
            return (Criteria) this;
        }

        public Criteria andFlowCondition46NotBetween(String value1, String value2) {
            addCriterion("flow_condition_46 not between", value1, value2, "flowCondition46");
            return (Criteria) this;
        }

        public Criteria andFlowCondition47IsNull() {
            addCriterion("flow_condition_47 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition47IsNotNull() {
            addCriterion("flow_condition_47 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition47EqualTo(String value) {
            addCriterion("flow_condition_47 =", value, "flowCondition47");
            return (Criteria) this;
        }

        public Criteria andFlowCondition47NotEqualTo(String value) {
            addCriterion("flow_condition_47 <>", value, "flowCondition47");
            return (Criteria) this;
        }

        public Criteria andFlowCondition47GreaterThan(String value) {
            addCriterion("flow_condition_47 >", value, "flowCondition47");
            return (Criteria) this;
        }

        public Criteria andFlowCondition47GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_47 >=", value, "flowCondition47");
            return (Criteria) this;
        }

        public Criteria andFlowCondition47LessThan(String value) {
            addCriterion("flow_condition_47 <", value, "flowCondition47");
            return (Criteria) this;
        }

        public Criteria andFlowCondition47LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_47 <=", value, "flowCondition47");
            return (Criteria) this;
        }

        public Criteria andFlowCondition47Like(String value) {
            addCriterion("flow_condition_47 like", value, "flowCondition47");
            return (Criteria) this;
        }

        public Criteria andFlowCondition47NotLike(String value) {
            addCriterion("flow_condition_47 not like", value, "flowCondition47");
            return (Criteria) this;
        }

        public Criteria andFlowCondition47In(List<String> values) {
            addCriterion("flow_condition_47 in", values, "flowCondition47");
            return (Criteria) this;
        }

        public Criteria andFlowCondition47NotIn(List<String> values) {
            addCriterion("flow_condition_47 not in", values, "flowCondition47");
            return (Criteria) this;
        }

        public Criteria andFlowCondition47Between(String value1, String value2) {
            addCriterion("flow_condition_47 between", value1, value2, "flowCondition47");
            return (Criteria) this;
        }

        public Criteria andFlowCondition47NotBetween(String value1, String value2) {
            addCriterion("flow_condition_47 not between", value1, value2, "flowCondition47");
            return (Criteria) this;
        }

        public Criteria andFlowCondition48IsNull() {
            addCriterion("flow_condition_48 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition48IsNotNull() {
            addCriterion("flow_condition_48 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition48EqualTo(String value) {
            addCriterion("flow_condition_48 =", value, "flowCondition48");
            return (Criteria) this;
        }

        public Criteria andFlowCondition48NotEqualTo(String value) {
            addCriterion("flow_condition_48 <>", value, "flowCondition48");
            return (Criteria) this;
        }

        public Criteria andFlowCondition48GreaterThan(String value) {
            addCriterion("flow_condition_48 >", value, "flowCondition48");
            return (Criteria) this;
        }

        public Criteria andFlowCondition48GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_48 >=", value, "flowCondition48");
            return (Criteria) this;
        }

        public Criteria andFlowCondition48LessThan(String value) {
            addCriterion("flow_condition_48 <", value, "flowCondition48");
            return (Criteria) this;
        }

        public Criteria andFlowCondition48LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_48 <=", value, "flowCondition48");
            return (Criteria) this;
        }

        public Criteria andFlowCondition48Like(String value) {
            addCriterion("flow_condition_48 like", value, "flowCondition48");
            return (Criteria) this;
        }

        public Criteria andFlowCondition48NotLike(String value) {
            addCriterion("flow_condition_48 not like", value, "flowCondition48");
            return (Criteria) this;
        }

        public Criteria andFlowCondition48In(List<String> values) {
            addCriterion("flow_condition_48 in", values, "flowCondition48");
            return (Criteria) this;
        }

        public Criteria andFlowCondition48NotIn(List<String> values) {
            addCriterion("flow_condition_48 not in", values, "flowCondition48");
            return (Criteria) this;
        }

        public Criteria andFlowCondition48Between(String value1, String value2) {
            addCriterion("flow_condition_48 between", value1, value2, "flowCondition48");
            return (Criteria) this;
        }

        public Criteria andFlowCondition48NotBetween(String value1, String value2) {
            addCriterion("flow_condition_48 not between", value1, value2, "flowCondition48");
            return (Criteria) this;
        }

        public Criteria andFlowCondition49IsNull() {
            addCriterion("flow_condition_49 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition49IsNotNull() {
            addCriterion("flow_condition_49 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition49EqualTo(String value) {
            addCriterion("flow_condition_49 =", value, "flowCondition49");
            return (Criteria) this;
        }

        public Criteria andFlowCondition49NotEqualTo(String value) {
            addCriterion("flow_condition_49 <>", value, "flowCondition49");
            return (Criteria) this;
        }

        public Criteria andFlowCondition49GreaterThan(String value) {
            addCriterion("flow_condition_49 >", value, "flowCondition49");
            return (Criteria) this;
        }

        public Criteria andFlowCondition49GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_49 >=", value, "flowCondition49");
            return (Criteria) this;
        }

        public Criteria andFlowCondition49LessThan(String value) {
            addCriterion("flow_condition_49 <", value, "flowCondition49");
            return (Criteria) this;
        }

        public Criteria andFlowCondition49LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_49 <=", value, "flowCondition49");
            return (Criteria) this;
        }

        public Criteria andFlowCondition49Like(String value) {
            addCriterion("flow_condition_49 like", value, "flowCondition49");
            return (Criteria) this;
        }

        public Criteria andFlowCondition49NotLike(String value) {
            addCriterion("flow_condition_49 not like", value, "flowCondition49");
            return (Criteria) this;
        }

        public Criteria andFlowCondition49In(List<String> values) {
            addCriterion("flow_condition_49 in", values, "flowCondition49");
            return (Criteria) this;
        }

        public Criteria andFlowCondition49NotIn(List<String> values) {
            addCriterion("flow_condition_49 not in", values, "flowCondition49");
            return (Criteria) this;
        }

        public Criteria andFlowCondition49Between(String value1, String value2) {
            addCriterion("flow_condition_49 between", value1, value2, "flowCondition49");
            return (Criteria) this;
        }

        public Criteria andFlowCondition49NotBetween(String value1, String value2) {
            addCriterion("flow_condition_49 not between", value1, value2, "flowCondition49");
            return (Criteria) this;
        }

        public Criteria andFlowCondition50IsNull() {
            addCriterion("flow_condition_50 is null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition50IsNotNull() {
            addCriterion("flow_condition_50 is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCondition50EqualTo(String value) {
            addCriterion("flow_condition_50 =", value, "flowCondition50");
            return (Criteria) this;
        }

        public Criteria andFlowCondition50NotEqualTo(String value) {
            addCriterion("flow_condition_50 <>", value, "flowCondition50");
            return (Criteria) this;
        }

        public Criteria andFlowCondition50GreaterThan(String value) {
            addCriterion("flow_condition_50 >", value, "flowCondition50");
            return (Criteria) this;
        }

        public Criteria andFlowCondition50GreaterThanOrEqualTo(String value) {
            addCriterion("flow_condition_50 >=", value, "flowCondition50");
            return (Criteria) this;
        }

        public Criteria andFlowCondition50LessThan(String value) {
            addCriterion("flow_condition_50 <", value, "flowCondition50");
            return (Criteria) this;
        }

        public Criteria andFlowCondition50LessThanOrEqualTo(String value) {
            addCriterion("flow_condition_50 <=", value, "flowCondition50");
            return (Criteria) this;
        }

        public Criteria andFlowCondition50Like(String value) {
            addCriterion("flow_condition_50 like", value, "flowCondition50");
            return (Criteria) this;
        }

        public Criteria andFlowCondition50NotLike(String value) {
            addCriterion("flow_condition_50 not like", value, "flowCondition50");
            return (Criteria) this;
        }

        public Criteria andFlowCondition50In(List<String> values) {
            addCriterion("flow_condition_50 in", values, "flowCondition50");
            return (Criteria) this;
        }

        public Criteria andFlowCondition50NotIn(List<String> values) {
            addCriterion("flow_condition_50 not in", values, "flowCondition50");
            return (Criteria) this;
        }

        public Criteria andFlowCondition50Between(String value1, String value2) {
            addCriterion("flow_condition_50 between", value1, value2, "flowCondition50");
            return (Criteria) this;
        }

        public Criteria andFlowCondition50NotBetween(String value1, String value2) {
            addCriterion("flow_condition_50 not between", value1, value2, "flowCondition50");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIsNull() {
            addCriterion("rule_type is null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIsNotNull() {
            addCriterion("rule_type is not null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeEqualTo(String value) {
            addCriterion("rule_type =", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotEqualTo(String value) {
            addCriterion("rule_type <>", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeGreaterThan(String value) {
            addCriterion("rule_type >", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("rule_type >=", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLessThan(String value) {
            addCriterion("rule_type <", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLessThanOrEqualTo(String value) {
            addCriterion("rule_type <=", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLike(String value) {
            addCriterion("rule_type like", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotLike(String value) {
            addCriterion("rule_type not like", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIn(List<String> values) {
            addCriterion("rule_type in", values, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotIn(List<String> values) {
            addCriterion("rule_type not in", values, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeBetween(String value1, String value2) {
            addCriterion("rule_type between", value1, value2, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotBetween(String value1, String value2) {
            addCriterion("rule_type not between", value1, value2, "ruleType");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIsNull() {
            addCriterion("question_category is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIsNotNull() {
            addCriterion("question_category is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryEqualTo(String value) {
            addCriterion("question_category =", value, "questionCategory");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryNotEqualTo(String value) {
            addCriterion("question_category <>", value, "questionCategory");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryGreaterThan(String value) {
            addCriterion("question_category >", value, "questionCategory");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("question_category >=", value, "questionCategory");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryLessThan(String value) {
            addCriterion("question_category <", value, "questionCategory");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryLessThanOrEqualTo(String value) {
            addCriterion("question_category <=", value, "questionCategory");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryLike(String value) {
            addCriterion("question_category like", value, "questionCategory");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryNotLike(String value) {
            addCriterion("question_category not like", value, "questionCategory");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIn(List<String> values) {
            addCriterion("question_category in", values, "questionCategory");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryNotIn(List<String> values) {
            addCriterion("question_category not in", values, "questionCategory");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryBetween(String value1, String value2) {
            addCriterion("question_category between", value1, value2, "questionCategory");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryNotBetween(String value1, String value2) {
            addCriterion("question_category not between", value1, value2, "questionCategory");
            return (Criteria) this;
        }

        public Criteria andNormalQuestionIsNull() {
            addCriterion("normal_question is null");
            return (Criteria) this;
        }

        public Criteria andNormalQuestionIsNotNull() {
            addCriterion("normal_question is not null");
            return (Criteria) this;
        }

        public Criteria andNormalQuestionEqualTo(String value) {
            addCriterion("normal_question =", value, "normalQuestion");
            return (Criteria) this;
        }

        public Criteria andNormalQuestionNotEqualTo(String value) {
            addCriterion("normal_question <>", value, "normalQuestion");
            return (Criteria) this;
        }

        public Criteria andNormalQuestionGreaterThan(String value) {
            addCriterion("normal_question >", value, "normalQuestion");
            return (Criteria) this;
        }

        public Criteria andNormalQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("normal_question >=", value, "normalQuestion");
            return (Criteria) this;
        }

        public Criteria andNormalQuestionLessThan(String value) {
            addCriterion("normal_question <", value, "normalQuestion");
            return (Criteria) this;
        }

        public Criteria andNormalQuestionLessThanOrEqualTo(String value) {
            addCriterion("normal_question <=", value, "normalQuestion");
            return (Criteria) this;
        }

        public Criteria andNormalQuestionLike(String value) {
            addCriterion("normal_question like", value, "normalQuestion");
            return (Criteria) this;
        }

        public Criteria andNormalQuestionNotLike(String value) {
            addCriterion("normal_question not like", value, "normalQuestion");
            return (Criteria) this;
        }

        public Criteria andNormalQuestionIn(List<String> values) {
            addCriterion("normal_question in", values, "normalQuestion");
            return (Criteria) this;
        }

        public Criteria andNormalQuestionNotIn(List<String> values) {
            addCriterion("normal_question not in", values, "normalQuestion");
            return (Criteria) this;
        }

        public Criteria andNormalQuestionBetween(String value1, String value2) {
            addCriterion("normal_question between", value1, value2, "normalQuestion");
            return (Criteria) this;
        }

        public Criteria andNormalQuestionNotBetween(String value1, String value2) {
            addCriterion("normal_question not between", value1, value2, "normalQuestion");
            return (Criteria) this;
        }

        public Criteria andNextSubflowIdIsNull() {
            addCriterion("next_subflow_id is null");
            return (Criteria) this;
        }

        public Criteria andNextSubflowIdIsNotNull() {
            addCriterion("next_subflow_id is not null");
            return (Criteria) this;
        }

        public Criteria andNextSubflowIdEqualTo(String value) {
            addCriterion("next_subflow_id =", value, "nextSubflowId");
            return (Criteria) this;
        }

        public Criteria andNextSubflowIdNotEqualTo(String value) {
            addCriterion("next_subflow_id <>", value, "nextSubflowId");
            return (Criteria) this;
        }

        public Criteria andNextSubflowIdGreaterThan(String value) {
            addCriterion("next_subflow_id >", value, "nextSubflowId");
            return (Criteria) this;
        }

        public Criteria andNextSubflowIdGreaterThanOrEqualTo(String value) {
            addCriterion("next_subflow_id >=", value, "nextSubflowId");
            return (Criteria) this;
        }

        public Criteria andNextSubflowIdLessThan(String value) {
            addCriterion("next_subflow_id <", value, "nextSubflowId");
            return (Criteria) this;
        }

        public Criteria andNextSubflowIdLessThanOrEqualTo(String value) {
            addCriterion("next_subflow_id <=", value, "nextSubflowId");
            return (Criteria) this;
        }

        public Criteria andNextSubflowIdLike(String value) {
            addCriterion("next_subflow_id like", value, "nextSubflowId");
            return (Criteria) this;
        }

        public Criteria andNextSubflowIdNotLike(String value) {
            addCriterion("next_subflow_id not like", value, "nextSubflowId");
            return (Criteria) this;
        }

        public Criteria andNextSubflowIdIn(List<String> values) {
            addCriterion("next_subflow_id in", values, "nextSubflowId");
            return (Criteria) this;
        }

        public Criteria andNextSubflowIdNotIn(List<String> values) {
            addCriterion("next_subflow_id not in", values, "nextSubflowId");
            return (Criteria) this;
        }

        public Criteria andNextSubflowIdBetween(String value1, String value2) {
            addCriterion("next_subflow_id between", value1, value2, "nextSubflowId");
            return (Criteria) this;
        }

        public Criteria andNextSubflowIdNotBetween(String value1, String value2) {
            addCriterion("next_subflow_id not between", value1, value2, "nextSubflowId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdIsNull() {
            addCriterion("next_node_id is null");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdIsNotNull() {
            addCriterion("next_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdEqualTo(String value) {
            addCriterion("next_node_id =", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdNotEqualTo(String value) {
            addCriterion("next_node_id <>", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdGreaterThan(String value) {
            addCriterion("next_node_id >", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("next_node_id >=", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdLessThan(String value) {
            addCriterion("next_node_id <", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdLessThanOrEqualTo(String value) {
            addCriterion("next_node_id <=", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdLike(String value) {
            addCriterion("next_node_id like", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdNotLike(String value) {
            addCriterion("next_node_id not like", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdIn(List<String> values) {
            addCriterion("next_node_id in", values, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdNotIn(List<String> values) {
            addCriterion("next_node_id not in", values, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdBetween(String value1, String value2) {
            addCriterion("next_node_id between", value1, value2, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdNotBetween(String value1, String value2) {
            addCriterion("next_node_id not between", value1, value2, "nextNodeId");
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