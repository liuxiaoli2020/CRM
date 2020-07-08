package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XtPowerDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XtPowerDetailExample() {
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

        public Criteria andPowerIdIsNull() {
            addCriterion("POWER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPowerIdIsNotNull() {
            addCriterion("POWER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPowerIdEqualTo(Long value) {
            addCriterion("POWER_ID =", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotEqualTo(Long value) {
            addCriterion("POWER_ID <>", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdGreaterThan(Long value) {
            addCriterion("POWER_ID >", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("POWER_ID >=", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLessThan(Long value) {
            addCriterion("POWER_ID <", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLessThanOrEqualTo(Long value) {
            addCriterion("POWER_ID <=", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdIn(List<Long> values) {
            addCriterion("POWER_ID in", values, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotIn(List<Long> values) {
            addCriterion("POWER_ID not in", values, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdBetween(Long value1, Long value2) {
            addCriterion("POWER_ID between", value1, value2, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotBetween(Long value1, Long value2) {
            addCriterion("POWER_ID not between", value1, value2, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerNameIsNull() {
            addCriterion("POWER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPowerNameIsNotNull() {
            addCriterion("POWER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPowerNameEqualTo(String value) {
            addCriterion("POWER_NAME =", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotEqualTo(String value) {
            addCriterion("POWER_NAME <>", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameGreaterThan(String value) {
            addCriterion("POWER_NAME >", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameGreaterThanOrEqualTo(String value) {
            addCriterion("POWER_NAME >=", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameLessThan(String value) {
            addCriterion("POWER_NAME <", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameLessThanOrEqualTo(String value) {
            addCriterion("POWER_NAME <=", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameLike(String value) {
            addCriterion("POWER_NAME like", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotLike(String value) {
            addCriterion("POWER_NAME not like", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameIn(List<String> values) {
            addCriterion("POWER_NAME in", values, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotIn(List<String> values) {
            addCriterion("POWER_NAME not in", values, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameBetween(String value1, String value2) {
            addCriterion("POWER_NAME between", value1, value2, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotBetween(String value1, String value2) {
            addCriterion("POWER_NAME not between", value1, value2, "powerName");
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