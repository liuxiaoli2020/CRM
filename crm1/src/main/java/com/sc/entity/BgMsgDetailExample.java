package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BgMsgDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BgMsgDetailExample() {
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

        public Criteria andMsgDetailIdIsNull() {
            addCriterion("MSG_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andMsgDetailIdIsNotNull() {
            addCriterion("MSG_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMsgDetailIdEqualTo(Long value) {
            addCriterion("MSG_DETAIL_ID =", value, "msgDetailId");
            return (Criteria) this;
        }

        public Criteria andMsgDetailIdNotEqualTo(Long value) {
            addCriterion("MSG_DETAIL_ID <>", value, "msgDetailId");
            return (Criteria) this;
        }

        public Criteria andMsgDetailIdGreaterThan(Long value) {
            addCriterion("MSG_DETAIL_ID >", value, "msgDetailId");
            return (Criteria) this;
        }

        public Criteria andMsgDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MSG_DETAIL_ID >=", value, "msgDetailId");
            return (Criteria) this;
        }

        public Criteria andMsgDetailIdLessThan(Long value) {
            addCriterion("MSG_DETAIL_ID <", value, "msgDetailId");
            return (Criteria) this;
        }

        public Criteria andMsgDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("MSG_DETAIL_ID <=", value, "msgDetailId");
            return (Criteria) this;
        }

        public Criteria andMsgDetailIdIn(List<Long> values) {
            addCriterion("MSG_DETAIL_ID in", values, "msgDetailId");
            return (Criteria) this;
        }

        public Criteria andMsgDetailIdNotIn(List<Long> values) {
            addCriterion("MSG_DETAIL_ID not in", values, "msgDetailId");
            return (Criteria) this;
        }

        public Criteria andMsgDetailIdBetween(Long value1, Long value2) {
            addCriterion("MSG_DETAIL_ID between", value1, value2, "msgDetailId");
            return (Criteria) this;
        }

        public Criteria andMsgDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("MSG_DETAIL_ID not between", value1, value2, "msgDetailId");
            return (Criteria) this;
        }

        public Criteria andMsgIdIsNull() {
            addCriterion("MSG_ID is null");
            return (Criteria) this;
        }

        public Criteria andMsgIdIsNotNull() {
            addCriterion("MSG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMsgIdEqualTo(Long value) {
            addCriterion("MSG_ID =", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotEqualTo(Long value) {
            addCriterion("MSG_ID <>", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThan(Long value) {
            addCriterion("MSG_ID >", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MSG_ID >=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThan(Long value) {
            addCriterion("MSG_ID <", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThanOrEqualTo(Long value) {
            addCriterion("MSG_ID <=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdIn(List<Long> values) {
            addCriterion("MSG_ID in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotIn(List<Long> values) {
            addCriterion("MSG_ID not in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdBetween(Long value1, Long value2) {
            addCriterion("MSG_ID between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotBetween(Long value1, Long value2) {
            addCriterion("MSG_ID not between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andAcceptIdIsNull() {
            addCriterion("ACCEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAcceptIdIsNotNull() {
            addCriterion("ACCEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptIdEqualTo(Long value) {
            addCriterion("ACCEPT_ID =", value, "acceptId");
            return (Criteria) this;
        }

        public Criteria andAcceptIdNotEqualTo(Long value) {
            addCriterion("ACCEPT_ID <>", value, "acceptId");
            return (Criteria) this;
        }

        public Criteria andAcceptIdGreaterThan(Long value) {
            addCriterion("ACCEPT_ID >", value, "acceptId");
            return (Criteria) this;
        }

        public Criteria andAcceptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCEPT_ID >=", value, "acceptId");
            return (Criteria) this;
        }

        public Criteria andAcceptIdLessThan(Long value) {
            addCriterion("ACCEPT_ID <", value, "acceptId");
            return (Criteria) this;
        }

        public Criteria andAcceptIdLessThanOrEqualTo(Long value) {
            addCriterion("ACCEPT_ID <=", value, "acceptId");
            return (Criteria) this;
        }

        public Criteria andAcceptIdIn(List<Long> values) {
            addCriterion("ACCEPT_ID in", values, "acceptId");
            return (Criteria) this;
        }

        public Criteria andAcceptIdNotIn(List<Long> values) {
            addCriterion("ACCEPT_ID not in", values, "acceptId");
            return (Criteria) this;
        }

        public Criteria andAcceptIdBetween(Long value1, Long value2) {
            addCriterion("ACCEPT_ID between", value1, value2, "acceptId");
            return (Criteria) this;
        }

        public Criteria andAcceptIdNotBetween(Long value1, Long value2) {
            addCriterion("ACCEPT_ID not between", value1, value2, "acceptId");
            return (Criteria) this;
        }

        public Criteria andMsgStateIsNull() {
            addCriterion("MSG_STATE is null");
            return (Criteria) this;
        }

        public Criteria andMsgStateIsNotNull() {
            addCriterion("MSG_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andMsgStateEqualTo(String value) {
            addCriterion("MSG_STATE =", value, "msgState");
            return (Criteria) this;
        }

        public Criteria andMsgStateNotEqualTo(String value) {
            addCriterion("MSG_STATE <>", value, "msgState");
            return (Criteria) this;
        }

        public Criteria andMsgStateGreaterThan(String value) {
            addCriterion("MSG_STATE >", value, "msgState");
            return (Criteria) this;
        }

        public Criteria andMsgStateGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_STATE >=", value, "msgState");
            return (Criteria) this;
        }

        public Criteria andMsgStateLessThan(String value) {
            addCriterion("MSG_STATE <", value, "msgState");
            return (Criteria) this;
        }

        public Criteria andMsgStateLessThanOrEqualTo(String value) {
            addCriterion("MSG_STATE <=", value, "msgState");
            return (Criteria) this;
        }

        public Criteria andMsgStateLike(String value) {
            addCriterion("MSG_STATE like", value, "msgState");
            return (Criteria) this;
        }

        public Criteria andMsgStateNotLike(String value) {
            addCriterion("MSG_STATE not like", value, "msgState");
            return (Criteria) this;
        }

        public Criteria andMsgStateIn(List<String> values) {
            addCriterion("MSG_STATE in", values, "msgState");
            return (Criteria) this;
        }

        public Criteria andMsgStateNotIn(List<String> values) {
            addCriterion("MSG_STATE not in", values, "msgState");
            return (Criteria) this;
        }

        public Criteria andMsgStateBetween(String value1, String value2) {
            addCriterion("MSG_STATE between", value1, value2, "msgState");
            return (Criteria) this;
        }

        public Criteria andMsgStateNotBetween(String value1, String value2) {
            addCriterion("MSG_STATE not between", value1, value2, "msgState");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Long value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Long value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Long value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Long value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Long> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Long> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Long value1, Long value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIsNull() {
            addCriterion("LAST_MODIFY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIsNotNull() {
            addCriterion("LAST_MODIFY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE =", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE <>", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateGreaterThan(Date value) {
            addCriterion("LAST_MODIFY_DATE >", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE >=", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLessThan(Date value) {
            addCriterion("LAST_MODIFY_DATE <", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE <=", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIn(List<Date> values) {
            addCriterion("LAST_MODIFY_DATE in", values, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotIn(List<Date> values) {
            addCriterion("LAST_MODIFY_DATE not in", values, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_DATE between", value1, value2, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_DATE not between", value1, value2, "lastModifyDate");
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