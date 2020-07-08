package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XtPowerSubfieldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XtPowerSubfieldExample() {
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

        public Criteria andSubfieldIdIsNull() {
            addCriterion("SUBFIELD_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubfieldIdIsNotNull() {
            addCriterion("SUBFIELD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubfieldIdEqualTo(Long value) {
            addCriterion("SUBFIELD_ID =", value, "subfieldId");
            return (Criteria) this;
        }

        public Criteria andSubfieldIdNotEqualTo(Long value) {
            addCriterion("SUBFIELD_ID <>", value, "subfieldId");
            return (Criteria) this;
        }

        public Criteria andSubfieldIdGreaterThan(Long value) {
            addCriterion("SUBFIELD_ID >", value, "subfieldId");
            return (Criteria) this;
        }

        public Criteria andSubfieldIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SUBFIELD_ID >=", value, "subfieldId");
            return (Criteria) this;
        }

        public Criteria andSubfieldIdLessThan(Long value) {
            addCriterion("SUBFIELD_ID <", value, "subfieldId");
            return (Criteria) this;
        }

        public Criteria andSubfieldIdLessThanOrEqualTo(Long value) {
            addCriterion("SUBFIELD_ID <=", value, "subfieldId");
            return (Criteria) this;
        }

        public Criteria andSubfieldIdIn(List<Long> values) {
            addCriterion("SUBFIELD_ID in", values, "subfieldId");
            return (Criteria) this;
        }

        public Criteria andSubfieldIdNotIn(List<Long> values) {
            addCriterion("SUBFIELD_ID not in", values, "subfieldId");
            return (Criteria) this;
        }

        public Criteria andSubfieldIdBetween(Long value1, Long value2) {
            addCriterion("SUBFIELD_ID between", value1, value2, "subfieldId");
            return (Criteria) this;
        }

        public Criteria andSubfieldIdNotBetween(Long value1, Long value2) {
            addCriterion("SUBFIELD_ID not between", value1, value2, "subfieldId");
            return (Criteria) this;
        }

        public Criteria andSubfieldNameIsNull() {
            addCriterion("SUBFIELD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSubfieldNameIsNotNull() {
            addCriterion("SUBFIELD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSubfieldNameEqualTo(String value) {
            addCriterion("SUBFIELD_NAME =", value, "subfieldName");
            return (Criteria) this;
        }

        public Criteria andSubfieldNameNotEqualTo(String value) {
            addCriterion("SUBFIELD_NAME <>", value, "subfieldName");
            return (Criteria) this;
        }

        public Criteria andSubfieldNameGreaterThan(String value) {
            addCriterion("SUBFIELD_NAME >", value, "subfieldName");
            return (Criteria) this;
        }

        public Criteria andSubfieldNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUBFIELD_NAME >=", value, "subfieldName");
            return (Criteria) this;
        }

        public Criteria andSubfieldNameLessThan(String value) {
            addCriterion("SUBFIELD_NAME <", value, "subfieldName");
            return (Criteria) this;
        }

        public Criteria andSubfieldNameLessThanOrEqualTo(String value) {
            addCriterion("SUBFIELD_NAME <=", value, "subfieldName");
            return (Criteria) this;
        }

        public Criteria andSubfieldNameLike(String value) {
            addCriterion("SUBFIELD_NAME like", value, "subfieldName");
            return (Criteria) this;
        }

        public Criteria andSubfieldNameNotLike(String value) {
            addCriterion("SUBFIELD_NAME not like", value, "subfieldName");
            return (Criteria) this;
        }

        public Criteria andSubfieldNameIn(List<String> values) {
            addCriterion("SUBFIELD_NAME in", values, "subfieldName");
            return (Criteria) this;
        }

        public Criteria andSubfieldNameNotIn(List<String> values) {
            addCriterion("SUBFIELD_NAME not in", values, "subfieldName");
            return (Criteria) this;
        }

        public Criteria andSubfieldNameBetween(String value1, String value2) {
            addCriterion("SUBFIELD_NAME between", value1, value2, "subfieldName");
            return (Criteria) this;
        }

        public Criteria andSubfieldNameNotBetween(String value1, String value2) {
            addCriterion("SUBFIELD_NAME not between", value1, value2, "subfieldName");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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