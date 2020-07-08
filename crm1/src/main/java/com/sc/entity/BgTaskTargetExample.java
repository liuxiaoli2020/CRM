package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BgTaskTargetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BgTaskTargetExample() {
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

        public Criteria andTargetIdIsNull() {
            addCriterion("TARGET_ID is null");
            return (Criteria) this;
        }

        public Criteria andTargetIdIsNotNull() {
            addCriterion("TARGET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTargetIdEqualTo(Long value) {
            addCriterion("TARGET_ID =", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotEqualTo(Long value) {
            addCriterion("TARGET_ID <>", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdGreaterThan(Long value) {
            addCriterion("TARGET_ID >", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TARGET_ID >=", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdLessThan(Long value) {
            addCriterion("TARGET_ID <", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdLessThanOrEqualTo(Long value) {
            addCriterion("TARGET_ID <=", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdIn(List<Long> values) {
            addCriterion("TARGET_ID in", values, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotIn(List<Long> values) {
            addCriterion("TARGET_ID not in", values, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdBetween(Long value1, Long value2) {
            addCriterion("TARGET_ID between", value1, value2, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotBetween(Long value1, Long value2) {
            addCriterion("TARGET_ID not between", value1, value2, "targetId");
            return (Criteria) this;
        }

        public Criteria andTaskTargetIsNull() {
            addCriterion("TASK_TARGET is null");
            return (Criteria) this;
        }

        public Criteria andTaskTargetIsNotNull() {
            addCriterion("TASK_TARGET is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTargetEqualTo(String value) {
            addCriterion("TASK_TARGET =", value, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetNotEqualTo(String value) {
            addCriterion("TASK_TARGET <>", value, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetGreaterThan(String value) {
            addCriterion("TASK_TARGET >", value, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TARGET >=", value, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetLessThan(String value) {
            addCriterion("TASK_TARGET <", value, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetLessThanOrEqualTo(String value) {
            addCriterion("TASK_TARGET <=", value, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetLike(String value) {
            addCriterion("TASK_TARGET like", value, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetNotLike(String value) {
            addCriterion("TASK_TARGET not like", value, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetIn(List<String> values) {
            addCriterion("TASK_TARGET in", values, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetNotIn(List<String> values) {
            addCriterion("TASK_TARGET not in", values, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetBetween(String value1, String value2) {
            addCriterion("TASK_TARGET between", value1, value2, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTaskTargetNotBetween(String value1, String value2) {
            addCriterion("TASK_TARGET not between", value1, value2, "taskTarget");
            return (Criteria) this;
        }

        public Criteria andTargetRemarkIsNull() {
            addCriterion("TARGET_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andTargetRemarkIsNotNull() {
            addCriterion("TARGET_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andTargetRemarkEqualTo(String value) {
            addCriterion("TARGET_REMARK =", value, "targetRemark");
            return (Criteria) this;
        }

        public Criteria andTargetRemarkNotEqualTo(String value) {
            addCriterion("TARGET_REMARK <>", value, "targetRemark");
            return (Criteria) this;
        }

        public Criteria andTargetRemarkGreaterThan(String value) {
            addCriterion("TARGET_REMARK >", value, "targetRemark");
            return (Criteria) this;
        }

        public Criteria andTargetRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("TARGET_REMARK >=", value, "targetRemark");
            return (Criteria) this;
        }

        public Criteria andTargetRemarkLessThan(String value) {
            addCriterion("TARGET_REMARK <", value, "targetRemark");
            return (Criteria) this;
        }

        public Criteria andTargetRemarkLessThanOrEqualTo(String value) {
            addCriterion("TARGET_REMARK <=", value, "targetRemark");
            return (Criteria) this;
        }

        public Criteria andTargetRemarkLike(String value) {
            addCriterion("TARGET_REMARK like", value, "targetRemark");
            return (Criteria) this;
        }

        public Criteria andTargetRemarkNotLike(String value) {
            addCriterion("TARGET_REMARK not like", value, "targetRemark");
            return (Criteria) this;
        }

        public Criteria andTargetRemarkIn(List<String> values) {
            addCriterion("TARGET_REMARK in", values, "targetRemark");
            return (Criteria) this;
        }

        public Criteria andTargetRemarkNotIn(List<String> values) {
            addCriterion("TARGET_REMARK not in", values, "targetRemark");
            return (Criteria) this;
        }

        public Criteria andTargetRemarkBetween(String value1, String value2) {
            addCriterion("TARGET_REMARK between", value1, value2, "targetRemark");
            return (Criteria) this;
        }

        public Criteria andTargetRemarkNotBetween(String value1, String value2) {
            addCriterion("TARGET_REMARK not between", value1, value2, "targetRemark");
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