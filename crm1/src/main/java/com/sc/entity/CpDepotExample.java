package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CpDepotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CpDepotExample() {
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

        public Criteria andDepotIdIsNull() {
            addCriterion("DEPOT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepotIdIsNotNull() {
            addCriterion("DEPOT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepotIdEqualTo(BigDecimal value) {
            addCriterion("DEPOT_ID =", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdNotEqualTo(BigDecimal value) {
            addCriterion("DEPOT_ID <>", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdGreaterThan(BigDecimal value) {
            addCriterion("DEPOT_ID >", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOT_ID >=", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdLessThan(BigDecimal value) {
            addCriterion("DEPOT_ID <", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOT_ID <=", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdIn(List<BigDecimal> values) {
            addCriterion("DEPOT_ID in", values, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdNotIn(List<BigDecimal> values) {
            addCriterion("DEPOT_ID not in", values, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOT_ID between", value1, value2, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOT_ID not between", value1, value2, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotNameIsNull() {
            addCriterion("DEPOT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDepotNameIsNotNull() {
            addCriterion("DEPOT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDepotNameEqualTo(String value) {
            addCriterion("DEPOT_NAME =", value, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameNotEqualTo(String value) {
            addCriterion("DEPOT_NAME <>", value, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameGreaterThan(String value) {
            addCriterion("DEPOT_NAME >", value, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPOT_NAME >=", value, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameLessThan(String value) {
            addCriterion("DEPOT_NAME <", value, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameLessThanOrEqualTo(String value) {
            addCriterion("DEPOT_NAME <=", value, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameLike(String value) {
            addCriterion("DEPOT_NAME like", value, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameNotLike(String value) {
            addCriterion("DEPOT_NAME not like", value, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameIn(List<String> values) {
            addCriterion("DEPOT_NAME in", values, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameNotIn(List<String> values) {
            addCriterion("DEPOT_NAME not in", values, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameBetween(String value1, String value2) {
            addCriterion("DEPOT_NAME between", value1, value2, "depotName");
            return (Criteria) this;
        }

        public Criteria andDepotNameNotBetween(String value1, String value2) {
            addCriterion("DEPOT_NAME not between", value1, value2, "depotName");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageIsNull() {
            addCriterion("REMARK_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageIsNotNull() {
            addCriterion("REMARK_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageEqualTo(String value) {
            addCriterion("REMARK_MESSAGE =", value, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageNotEqualTo(String value) {
            addCriterion("REMARK_MESSAGE <>", value, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageGreaterThan(String value) {
            addCriterion("REMARK_MESSAGE >", value, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK_MESSAGE >=", value, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageLessThan(String value) {
            addCriterion("REMARK_MESSAGE <", value, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageLessThanOrEqualTo(String value) {
            addCriterion("REMARK_MESSAGE <=", value, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageLike(String value) {
            addCriterion("REMARK_MESSAGE like", value, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageNotLike(String value) {
            addCriterion("REMARK_MESSAGE not like", value, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageIn(List<String> values) {
            addCriterion("REMARK_MESSAGE in", values, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageNotIn(List<String> values) {
            addCriterion("REMARK_MESSAGE not in", values, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageBetween(String value1, String value2) {
            addCriterion("REMARK_MESSAGE between", value1, value2, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageNotBetween(String value1, String value2) {
            addCriterion("REMARK_MESSAGE not between", value1, value2, "remarkMessage");
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

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("COMPANY_ID like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("COMPANY_ID not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIsNull() {
            addCriterion("LAST_MODIFIED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIsNotNull() {
            addCriterion("LAST_MODIFIED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_TIME =", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_TIME <>", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeGreaterThan(Date value) {
            addCriterion("LAST_MODIFIED_TIME >", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_TIME >=", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeLessThan(Date value) {
            addCriterion("LAST_MODIFIED_TIME <", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_TIME <=", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIn(List<Date> values) {
            addCriterion("LAST_MODIFIED_TIME in", values, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotIn(List<Date> values) {
            addCriterion("LAST_MODIFIED_TIME not in", values, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED_TIME between", value1, value2, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED_TIME not between", value1, value2, "lastModifiedTime");
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