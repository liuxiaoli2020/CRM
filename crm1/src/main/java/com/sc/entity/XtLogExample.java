package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XtLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XtLogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Long value) {
            addCriterion("LOG_ID =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Long value) {
            addCriterion("LOG_ID <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Long value) {
            addCriterion("LOG_ID >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LOG_ID >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Long value) {
            addCriterion("LOG_ID <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Long value) {
            addCriterion("LOG_ID <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Long> values) {
            addCriterion("LOG_ID in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Long> values) {
            addCriterion("LOG_ID not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Long value1, Long value2) {
            addCriterion("LOG_ID between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Long value1, Long value2) {
            addCriterion("LOG_ID not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAccessIpIsNull() {
            addCriterion("ACCESS_IP is null");
            return (Criteria) this;
        }

        public Criteria andAccessIpIsNotNull() {
            addCriterion("ACCESS_IP is not null");
            return (Criteria) this;
        }

        public Criteria andAccessIpEqualTo(String value) {
            addCriterion("ACCESS_IP =", value, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpNotEqualTo(String value) {
            addCriterion("ACCESS_IP <>", value, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpGreaterThan(String value) {
            addCriterion("ACCESS_IP >", value, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_IP >=", value, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpLessThan(String value) {
            addCriterion("ACCESS_IP <", value, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_IP <=", value, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpLike(String value) {
            addCriterion("ACCESS_IP like", value, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpNotLike(String value) {
            addCriterion("ACCESS_IP not like", value, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpIn(List<String> values) {
            addCriterion("ACCESS_IP in", values, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpNotIn(List<String> values) {
            addCriterion("ACCESS_IP not in", values, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpBetween(String value1, String value2) {
            addCriterion("ACCESS_IP between", value1, value2, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpNotBetween(String value1, String value2) {
            addCriterion("ACCESS_IP not between", value1, value2, "accessIp");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("POWER is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("POWER is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(String value) {
            addCriterion("POWER =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(String value) {
            addCriterion("POWER <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(String value) {
            addCriterion("POWER >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(String value) {
            addCriterion("POWER >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(String value) {
            addCriterion("POWER <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(String value) {
            addCriterion("POWER <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLike(String value) {
            addCriterion("POWER like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotLike(String value) {
            addCriterion("POWER not like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<String> values) {
            addCriterion("POWER in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<String> values) {
            addCriterion("POWER not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(String value1, String value2) {
            addCriterion("POWER between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(String value1, String value2) {
            addCriterion("POWER not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andAccessDateIsNull() {
            addCriterion("ACCESS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAccessDateIsNotNull() {
            addCriterion("ACCESS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccessDateEqualTo(Date value) {
            addCriterion("ACCESS_DATE =", value, "accessDate");
            return (Criteria) this;
        }

        public Criteria andAccessDateNotEqualTo(Date value) {
            addCriterion("ACCESS_DATE <>", value, "accessDate");
            return (Criteria) this;
        }

        public Criteria andAccessDateGreaterThan(Date value) {
            addCriterion("ACCESS_DATE >", value, "accessDate");
            return (Criteria) this;
        }

        public Criteria andAccessDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ACCESS_DATE >=", value, "accessDate");
            return (Criteria) this;
        }

        public Criteria andAccessDateLessThan(Date value) {
            addCriterion("ACCESS_DATE <", value, "accessDate");
            return (Criteria) this;
        }

        public Criteria andAccessDateLessThanOrEqualTo(Date value) {
            addCriterion("ACCESS_DATE <=", value, "accessDate");
            return (Criteria) this;
        }

        public Criteria andAccessDateIn(List<Date> values) {
            addCriterion("ACCESS_DATE in", values, "accessDate");
            return (Criteria) this;
        }

        public Criteria andAccessDateNotIn(List<Date> values) {
            addCriterion("ACCESS_DATE not in", values, "accessDate");
            return (Criteria) this;
        }

        public Criteria andAccessDateBetween(Date value1, Date value2) {
            addCriterion("ACCESS_DATE between", value1, value2, "accessDate");
            return (Criteria) this;
        }

        public Criteria andAccessDateNotBetween(Date value1, Date value2) {
            addCriterion("ACCESS_DATE not between", value1, value2, "accessDate");
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