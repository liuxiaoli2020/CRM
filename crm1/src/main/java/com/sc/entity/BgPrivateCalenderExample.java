package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BgPrivateCalenderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BgPrivateCalenderExample() {
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

        public Criteria andCalendarIdIsNull() {
            addCriterion("CALENDAR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCalendarIdIsNotNull() {
            addCriterion("CALENDAR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCalendarIdEqualTo(Long value) {
            addCriterion("CALENDAR_ID =", value, "calendarId");
            return (Criteria) this;
        }

        public Criteria andCalendarIdNotEqualTo(Long value) {
            addCriterion("CALENDAR_ID <>", value, "calendarId");
            return (Criteria) this;
        }

        public Criteria andCalendarIdGreaterThan(Long value) {
            addCriterion("CALENDAR_ID >", value, "calendarId");
            return (Criteria) this;
        }

        public Criteria andCalendarIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CALENDAR_ID >=", value, "calendarId");
            return (Criteria) this;
        }

        public Criteria andCalendarIdLessThan(Long value) {
            addCriterion("CALENDAR_ID <", value, "calendarId");
            return (Criteria) this;
        }

        public Criteria andCalendarIdLessThanOrEqualTo(Long value) {
            addCriterion("CALENDAR_ID <=", value, "calendarId");
            return (Criteria) this;
        }

        public Criteria andCalendarIdIn(List<Long> values) {
            addCriterion("CALENDAR_ID in", values, "calendarId");
            return (Criteria) this;
        }

        public Criteria andCalendarIdNotIn(List<Long> values) {
            addCriterion("CALENDAR_ID not in", values, "calendarId");
            return (Criteria) this;
        }

        public Criteria andCalendarIdBetween(Long value1, Long value2) {
            addCriterion("CALENDAR_ID between", value1, value2, "calendarId");
            return (Criteria) this;
        }

        public Criteria andCalendarIdNotBetween(Long value1, Long value2) {
            addCriterion("CALENDAR_ID not between", value1, value2, "calendarId");
            return (Criteria) this;
        }

        public Criteria andCalendarCategoryIsNull() {
            addCriterion("CALENDAR_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andCalendarCategoryIsNotNull() {
            addCriterion("CALENDAR_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andCalendarCategoryEqualTo(String value) {
            addCriterion("CALENDAR_CATEGORY =", value, "calendarCategory");
            return (Criteria) this;
        }

        public Criteria andCalendarCategoryNotEqualTo(String value) {
            addCriterion("CALENDAR_CATEGORY <>", value, "calendarCategory");
            return (Criteria) this;
        }

        public Criteria andCalendarCategoryGreaterThan(String value) {
            addCriterion("CALENDAR_CATEGORY >", value, "calendarCategory");
            return (Criteria) this;
        }

        public Criteria andCalendarCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("CALENDAR_CATEGORY >=", value, "calendarCategory");
            return (Criteria) this;
        }

        public Criteria andCalendarCategoryLessThan(String value) {
            addCriterion("CALENDAR_CATEGORY <", value, "calendarCategory");
            return (Criteria) this;
        }

        public Criteria andCalendarCategoryLessThanOrEqualTo(String value) {
            addCriterion("CALENDAR_CATEGORY <=", value, "calendarCategory");
            return (Criteria) this;
        }

        public Criteria andCalendarCategoryLike(String value) {
            addCriterion("CALENDAR_CATEGORY like", value, "calendarCategory");
            return (Criteria) this;
        }

        public Criteria andCalendarCategoryNotLike(String value) {
            addCriterion("CALENDAR_CATEGORY not like", value, "calendarCategory");
            return (Criteria) this;
        }

        public Criteria andCalendarCategoryIn(List<String> values) {
            addCriterion("CALENDAR_CATEGORY in", values, "calendarCategory");
            return (Criteria) this;
        }

        public Criteria andCalendarCategoryNotIn(List<String> values) {
            addCriterion("CALENDAR_CATEGORY not in", values, "calendarCategory");
            return (Criteria) this;
        }

        public Criteria andCalendarCategoryBetween(String value1, String value2) {
            addCriterion("CALENDAR_CATEGORY between", value1, value2, "calendarCategory");
            return (Criteria) this;
        }

        public Criteria andCalendarCategoryNotBetween(String value1, String value2) {
            addCriterion("CALENDAR_CATEGORY not between", value1, value2, "calendarCategory");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleIsNull() {
            addCriterion("CALENDAR_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleIsNotNull() {
            addCriterion("CALENDAR_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleEqualTo(String value) {
            addCriterion("CALENDAR_TITLE =", value, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleNotEqualTo(String value) {
            addCriterion("CALENDAR_TITLE <>", value, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleGreaterThan(String value) {
            addCriterion("CALENDAR_TITLE >", value, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleGreaterThanOrEqualTo(String value) {
            addCriterion("CALENDAR_TITLE >=", value, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleLessThan(String value) {
            addCriterion("CALENDAR_TITLE <", value, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleLessThanOrEqualTo(String value) {
            addCriterion("CALENDAR_TITLE <=", value, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleLike(String value) {
            addCriterion("CALENDAR_TITLE like", value, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleNotLike(String value) {
            addCriterion("CALENDAR_TITLE not like", value, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleIn(List<String> values) {
            addCriterion("CALENDAR_TITLE in", values, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleNotIn(List<String> values) {
            addCriterion("CALENDAR_TITLE not in", values, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleBetween(String value1, String value2) {
            addCriterion("CALENDAR_TITLE between", value1, value2, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleNotBetween(String value1, String value2) {
            addCriterion("CALENDAR_TITLE not between", value1, value2, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarStartIsNull() {
            addCriterion("CALENDAR_START is null");
            return (Criteria) this;
        }

        public Criteria andCalendarStartIsNotNull() {
            addCriterion("CALENDAR_START is not null");
            return (Criteria) this;
        }

        public Criteria andCalendarStartEqualTo(Date value) {
            addCriterion("CALENDAR_START =", value, "calendarStart");
            return (Criteria) this;
        }

        public Criteria andCalendarStartNotEqualTo(Date value) {
            addCriterion("CALENDAR_START <>", value, "calendarStart");
            return (Criteria) this;
        }

        public Criteria andCalendarStartGreaterThan(Date value) {
            addCriterion("CALENDAR_START >", value, "calendarStart");
            return (Criteria) this;
        }

        public Criteria andCalendarStartGreaterThanOrEqualTo(Date value) {
            addCriterion("CALENDAR_START >=", value, "calendarStart");
            return (Criteria) this;
        }

        public Criteria andCalendarStartLessThan(Date value) {
            addCriterion("CALENDAR_START <", value, "calendarStart");
            return (Criteria) this;
        }

        public Criteria andCalendarStartLessThanOrEqualTo(Date value) {
            addCriterion("CALENDAR_START <=", value, "calendarStart");
            return (Criteria) this;
        }

        public Criteria andCalendarStartIn(List<Date> values) {
            addCriterion("CALENDAR_START in", values, "calendarStart");
            return (Criteria) this;
        }

        public Criteria andCalendarStartNotIn(List<Date> values) {
            addCriterion("CALENDAR_START not in", values, "calendarStart");
            return (Criteria) this;
        }

        public Criteria andCalendarStartBetween(Date value1, Date value2) {
            addCriterion("CALENDAR_START between", value1, value2, "calendarStart");
            return (Criteria) this;
        }

        public Criteria andCalendarStartNotBetween(Date value1, Date value2) {
            addCriterion("CALENDAR_START not between", value1, value2, "calendarStart");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeIsNull() {
            addCriterion("CALENDAR_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeIsNotNull() {
            addCriterion("CALENDAR_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeEqualTo(Date value) {
            addCriterion("CALENDAR_TIME =", value, "calendarTime");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeNotEqualTo(Date value) {
            addCriterion("CALENDAR_TIME <>", value, "calendarTime");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeGreaterThan(Date value) {
            addCriterion("CALENDAR_TIME >", value, "calendarTime");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CALENDAR_TIME >=", value, "calendarTime");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeLessThan(Date value) {
            addCriterion("CALENDAR_TIME <", value, "calendarTime");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeLessThanOrEqualTo(Date value) {
            addCriterion("CALENDAR_TIME <=", value, "calendarTime");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeIn(List<Date> values) {
            addCriterion("CALENDAR_TIME in", values, "calendarTime");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeNotIn(List<Date> values) {
            addCriterion("CALENDAR_TIME not in", values, "calendarTime");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeBetween(Date value1, Date value2) {
            addCriterion("CALENDAR_TIME between", value1, value2, "calendarTime");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeNotBetween(Date value1, Date value2) {
            addCriterion("CALENDAR_TIME not between", value1, value2, "calendarTime");
            return (Criteria) this;
        }

        public Criteria andPersonNumberIsNull() {
            addCriterion("PERSON_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPersonNumberIsNotNull() {
            addCriterion("PERSON_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNumberEqualTo(String value) {
            addCriterion("PERSON_NUMBER =", value, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberNotEqualTo(String value) {
            addCriterion("PERSON_NUMBER <>", value, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberGreaterThan(String value) {
            addCriterion("PERSON_NUMBER >", value, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PERSON_NUMBER >=", value, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberLessThan(String value) {
            addCriterion("PERSON_NUMBER <", value, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberLessThanOrEqualTo(String value) {
            addCriterion("PERSON_NUMBER <=", value, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberLike(String value) {
            addCriterion("PERSON_NUMBER like", value, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberNotLike(String value) {
            addCriterion("PERSON_NUMBER not like", value, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberIn(List<String> values) {
            addCriterion("PERSON_NUMBER in", values, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberNotIn(List<String> values) {
            addCriterion("PERSON_NUMBER not in", values, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberBetween(String value1, String value2) {
            addCriterion("PERSON_NUMBER between", value1, value2, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberNotBetween(String value1, String value2) {
            addCriterion("PERSON_NUMBER not between", value1, value2, "personNumber");
            return (Criteria) this;
        }

        public Criteria andCalendarDetailIsNull() {
            addCriterion("CALENDAR_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andCalendarDetailIsNotNull() {
            addCriterion("CALENDAR_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCalendarDetailEqualTo(String value) {
            addCriterion("CALENDAR_DETAIL =", value, "calendarDetail");
            return (Criteria) this;
        }

        public Criteria andCalendarDetailNotEqualTo(String value) {
            addCriterion("CALENDAR_DETAIL <>", value, "calendarDetail");
            return (Criteria) this;
        }

        public Criteria andCalendarDetailGreaterThan(String value) {
            addCriterion("CALENDAR_DETAIL >", value, "calendarDetail");
            return (Criteria) this;
        }

        public Criteria andCalendarDetailGreaterThanOrEqualTo(String value) {
            addCriterion("CALENDAR_DETAIL >=", value, "calendarDetail");
            return (Criteria) this;
        }

        public Criteria andCalendarDetailLessThan(String value) {
            addCriterion("CALENDAR_DETAIL <", value, "calendarDetail");
            return (Criteria) this;
        }

        public Criteria andCalendarDetailLessThanOrEqualTo(String value) {
            addCriterion("CALENDAR_DETAIL <=", value, "calendarDetail");
            return (Criteria) this;
        }

        public Criteria andCalendarDetailLike(String value) {
            addCriterion("CALENDAR_DETAIL like", value, "calendarDetail");
            return (Criteria) this;
        }

        public Criteria andCalendarDetailNotLike(String value) {
            addCriterion("CALENDAR_DETAIL not like", value, "calendarDetail");
            return (Criteria) this;
        }

        public Criteria andCalendarDetailIn(List<String> values) {
            addCriterion("CALENDAR_DETAIL in", values, "calendarDetail");
            return (Criteria) this;
        }

        public Criteria andCalendarDetailNotIn(List<String> values) {
            addCriterion("CALENDAR_DETAIL not in", values, "calendarDetail");
            return (Criteria) this;
        }

        public Criteria andCalendarDetailBetween(String value1, String value2) {
            addCriterion("CALENDAR_DETAIL between", value1, value2, "calendarDetail");
            return (Criteria) this;
        }

        public Criteria andCalendarDetailNotBetween(String value1, String value2) {
            addCriterion("CALENDAR_DETAIL not between", value1, value2, "calendarDetail");
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