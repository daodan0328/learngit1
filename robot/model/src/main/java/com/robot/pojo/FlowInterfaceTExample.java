package com.robot.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlowInterfaceTExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlowInterfaceTExample() {
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

        public Criteria andInterfaceNameIsNull() {
            addCriterion("interface_name is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameIsNotNull() {
            addCriterion("interface_name is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameEqualTo(String value) {
            addCriterion("interface_name =", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameNotEqualTo(String value) {
            addCriterion("interface_name <>", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameGreaterThan(String value) {
            addCriterion("interface_name >", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameGreaterThanOrEqualTo(String value) {
            addCriterion("interface_name >=", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameLessThan(String value) {
            addCriterion("interface_name <", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameLessThanOrEqualTo(String value) {
            addCriterion("interface_name <=", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameLike(String value) {
            addCriterion("interface_name like", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameNotLike(String value) {
            addCriterion("interface_name not like", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameIn(List<String> values) {
            addCriterion("interface_name in", values, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameNotIn(List<String> values) {
            addCriterion("interface_name not in", values, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameBetween(String value1, String value2) {
            addCriterion("interface_name between", value1, value2, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameNotBetween(String value1, String value2) {
            addCriterion("interface_name not between", value1, value2, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlIsNull() {
            addCriterion("interface_url is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlIsNotNull() {
            addCriterion("interface_url is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlEqualTo(String value) {
            addCriterion("interface_url =", value, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlNotEqualTo(String value) {
            addCriterion("interface_url <>", value, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlGreaterThan(String value) {
            addCriterion("interface_url >", value, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("interface_url >=", value, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlLessThan(String value) {
            addCriterion("interface_url <", value, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlLessThanOrEqualTo(String value) {
            addCriterion("interface_url <=", value, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlLike(String value) {
            addCriterion("interface_url like", value, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlNotLike(String value) {
            addCriterion("interface_url not like", value, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlIn(List<String> values) {
            addCriterion("interface_url in", values, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlNotIn(List<String> values) {
            addCriterion("interface_url not in", values, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlBetween(String value1, String value2) {
            addCriterion("interface_url between", value1, value2, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlNotBetween(String value1, String value2) {
            addCriterion("interface_url not between", value1, value2, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInvocationWayIsNull() {
            addCriterion("invocation_way is null");
            return (Criteria) this;
        }

        public Criteria andInvocationWayIsNotNull() {
            addCriterion("invocation_way is not null");
            return (Criteria) this;
        }

        public Criteria andInvocationWayEqualTo(String value) {
            addCriterion("invocation_way =", value, "invocationWay");
            return (Criteria) this;
        }

        public Criteria andInvocationWayNotEqualTo(String value) {
            addCriterion("invocation_way <>", value, "invocationWay");
            return (Criteria) this;
        }

        public Criteria andInvocationWayGreaterThan(String value) {
            addCriterion("invocation_way >", value, "invocationWay");
            return (Criteria) this;
        }

        public Criteria andInvocationWayGreaterThanOrEqualTo(String value) {
            addCriterion("invocation_way >=", value, "invocationWay");
            return (Criteria) this;
        }

        public Criteria andInvocationWayLessThan(String value) {
            addCriterion("invocation_way <", value, "invocationWay");
            return (Criteria) this;
        }

        public Criteria andInvocationWayLessThanOrEqualTo(String value) {
            addCriterion("invocation_way <=", value, "invocationWay");
            return (Criteria) this;
        }

        public Criteria andInvocationWayLike(String value) {
            addCriterion("invocation_way like", value, "invocationWay");
            return (Criteria) this;
        }

        public Criteria andInvocationWayNotLike(String value) {
            addCriterion("invocation_way not like", value, "invocationWay");
            return (Criteria) this;
        }

        public Criteria andInvocationWayIn(List<String> values) {
            addCriterion("invocation_way in", values, "invocationWay");
            return (Criteria) this;
        }

        public Criteria andInvocationWayNotIn(List<String> values) {
            addCriterion("invocation_way not in", values, "invocationWay");
            return (Criteria) this;
        }

        public Criteria andInvocationWayBetween(String value1, String value2) {
            addCriterion("invocation_way between", value1, value2, "invocationWay");
            return (Criteria) this;
        }

        public Criteria andInvocationWayNotBetween(String value1, String value2) {
            addCriterion("invocation_way not between", value1, value2, "invocationWay");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNull() {
            addCriterion("function_name is null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNotNull() {
            addCriterion("function_name is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameEqualTo(String value) {
            addCriterion("function_name =", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotEqualTo(String value) {
            addCriterion("function_name <>", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThan(String value) {
            addCriterion("function_name >", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("function_name >=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThan(String value) {
            addCriterion("function_name <", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThanOrEqualTo(String value) {
            addCriterion("function_name <=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLike(String value) {
            addCriterion("function_name like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotLike(String value) {
            addCriterion("function_name not like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIn(List<String> values) {
            addCriterion("function_name in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotIn(List<String> values) {
            addCriterion("function_name not in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameBetween(String value1, String value2) {
            addCriterion("function_name between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotBetween(String value1, String value2) {
            addCriterion("function_name not between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andNamespaceIsNull() {
            addCriterion("namespace is null");
            return (Criteria) this;
        }

        public Criteria andNamespaceIsNotNull() {
            addCriterion("namespace is not null");
            return (Criteria) this;
        }

        public Criteria andNamespaceEqualTo(String value) {
            addCriterion("namespace =", value, "namespace");
            return (Criteria) this;
        }

        public Criteria andNamespaceNotEqualTo(String value) {
            addCriterion("namespace <>", value, "namespace");
            return (Criteria) this;
        }

        public Criteria andNamespaceGreaterThan(String value) {
            addCriterion("namespace >", value, "namespace");
            return (Criteria) this;
        }

        public Criteria andNamespaceGreaterThanOrEqualTo(String value) {
            addCriterion("namespace >=", value, "namespace");
            return (Criteria) this;
        }

        public Criteria andNamespaceLessThan(String value) {
            addCriterion("namespace <", value, "namespace");
            return (Criteria) this;
        }

        public Criteria andNamespaceLessThanOrEqualTo(String value) {
            addCriterion("namespace <=", value, "namespace");
            return (Criteria) this;
        }

        public Criteria andNamespaceLike(String value) {
            addCriterion("namespace like", value, "namespace");
            return (Criteria) this;
        }

        public Criteria andNamespaceNotLike(String value) {
            addCriterion("namespace not like", value, "namespace");
            return (Criteria) this;
        }

        public Criteria andNamespaceIn(List<String> values) {
            addCriterion("namespace in", values, "namespace");
            return (Criteria) this;
        }

        public Criteria andNamespaceNotIn(List<String> values) {
            addCriterion("namespace not in", values, "namespace");
            return (Criteria) this;
        }

        public Criteria andNamespaceBetween(String value1, String value2) {
            addCriterion("namespace between", value1, value2, "namespace");
            return (Criteria) this;
        }

        public Criteria andNamespaceNotBetween(String value1, String value2) {
            addCriterion("namespace not between", value1, value2, "namespace");
            return (Criteria) this;
        }

        public Criteria andReqParamIsNull() {
            addCriterion("req_param is null");
            return (Criteria) this;
        }

        public Criteria andReqParamIsNotNull() {
            addCriterion("req_param is not null");
            return (Criteria) this;
        }

        public Criteria andReqParamEqualTo(String value) {
            addCriterion("req_param =", value, "reqParam");
            return (Criteria) this;
        }

        public Criteria andReqParamNotEqualTo(String value) {
            addCriterion("req_param <>", value, "reqParam");
            return (Criteria) this;
        }

        public Criteria andReqParamGreaterThan(String value) {
            addCriterion("req_param >", value, "reqParam");
            return (Criteria) this;
        }

        public Criteria andReqParamGreaterThanOrEqualTo(String value) {
            addCriterion("req_param >=", value, "reqParam");
            return (Criteria) this;
        }

        public Criteria andReqParamLessThan(String value) {
            addCriterion("req_param <", value, "reqParam");
            return (Criteria) this;
        }

        public Criteria andReqParamLessThanOrEqualTo(String value) {
            addCriterion("req_param <=", value, "reqParam");
            return (Criteria) this;
        }

        public Criteria andReqParamLike(String value) {
            addCriterion("req_param like", value, "reqParam");
            return (Criteria) this;
        }

        public Criteria andReqParamNotLike(String value) {
            addCriterion("req_param not like", value, "reqParam");
            return (Criteria) this;
        }

        public Criteria andReqParamIn(List<String> values) {
            addCriterion("req_param in", values, "reqParam");
            return (Criteria) this;
        }

        public Criteria andReqParamNotIn(List<String> values) {
            addCriterion("req_param not in", values, "reqParam");
            return (Criteria) this;
        }

        public Criteria andReqParamBetween(String value1, String value2) {
            addCriterion("req_param between", value1, value2, "reqParam");
            return (Criteria) this;
        }

        public Criteria andReqParamNotBetween(String value1, String value2) {
            addCriterion("req_param not between", value1, value2, "reqParam");
            return (Criteria) this;
        }

        public Criteria andRespParamIsNull() {
            addCriterion("resp_param is null");
            return (Criteria) this;
        }

        public Criteria andRespParamIsNotNull() {
            addCriterion("resp_param is not null");
            return (Criteria) this;
        }

        public Criteria andRespParamEqualTo(String value) {
            addCriterion("resp_param =", value, "respParam");
            return (Criteria) this;
        }

        public Criteria andRespParamNotEqualTo(String value) {
            addCriterion("resp_param <>", value, "respParam");
            return (Criteria) this;
        }

        public Criteria andRespParamGreaterThan(String value) {
            addCriterion("resp_param >", value, "respParam");
            return (Criteria) this;
        }

        public Criteria andRespParamGreaterThanOrEqualTo(String value) {
            addCriterion("resp_param >=", value, "respParam");
            return (Criteria) this;
        }

        public Criteria andRespParamLessThan(String value) {
            addCriterion("resp_param <", value, "respParam");
            return (Criteria) this;
        }

        public Criteria andRespParamLessThanOrEqualTo(String value) {
            addCriterion("resp_param <=", value, "respParam");
            return (Criteria) this;
        }

        public Criteria andRespParamLike(String value) {
            addCriterion("resp_param like", value, "respParam");
            return (Criteria) this;
        }

        public Criteria andRespParamNotLike(String value) {
            addCriterion("resp_param not like", value, "respParam");
            return (Criteria) this;
        }

        public Criteria andRespParamIn(List<String> values) {
            addCriterion("resp_param in", values, "respParam");
            return (Criteria) this;
        }

        public Criteria andRespParamNotIn(List<String> values) {
            addCriterion("resp_param not in", values, "respParam");
            return (Criteria) this;
        }

        public Criteria andRespParamBetween(String value1, String value2) {
            addCriterion("resp_param between", value1, value2, "respParam");
            return (Criteria) this;
        }

        public Criteria andRespParamNotBetween(String value1, String value2) {
            addCriterion("resp_param not between", value1, value2, "respParam");
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