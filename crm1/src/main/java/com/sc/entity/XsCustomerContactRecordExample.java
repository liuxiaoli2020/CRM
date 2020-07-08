package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XsCustomerContactRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XsCustomerContactRecordExample() {
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

        public Criteria andContactRecordIdIsNull() {
            addCriterion("CONTACT_RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdIsNotNull() {
            addCriterion("CONTACT_RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdEqualTo(Long value) {
            addCriterion("CONTACT_RECORD_ID =", value, "contactRecordId");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdNotEqualTo(Long value) {
            addCriterion("CONTACT_RECORD_ID <>", value, "contactRecordId");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdGreaterThan(Long value) {
            addCriterion("CONTACT_RECORD_ID >", value, "contactRecordId");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CONTACT_RECORD_ID >=", value, "contactRecordId");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdLessThan(Long value) {
            addCriterion("CONTACT_RECORD_ID <", value, "contactRecordId");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("CONTACT_RECORD_ID <=", value, "contactRecordId");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdIn(List<Long> values) {
            addCriterion("CONTACT_RECORD_ID in", values, "contactRecordId");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdNotIn(List<Long> values) {
            addCriterion("CONTACT_RECORD_ID not in", values, "contactRecordId");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdBetween(Long value1, Long value2) {
            addCriterion("CONTACT_RECORD_ID between", value1, value2, "contactRecordId");
            return (Criteria) this;
        }

        public Criteria andContactRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("CONTACT_RECORD_ID not between", value1, value2, "contactRecordId");
            return (Criteria) this;
        }

        public Criteria andContactHeadingIsNull() {
            addCriterion("CONTACT_HEADING is null");
            return (Criteria) this;
        }

        public Criteria andContactHeadingIsNotNull() {
            addCriterion("CONTACT_HEADING is not null");
            return (Criteria) this;
        }

        public Criteria andContactHeadingEqualTo(String value) {
            addCriterion("CONTACT_HEADING =", value, "contactHeading");
            return (Criteria) this;
        }

        public Criteria andContactHeadingNotEqualTo(String value) {
            addCriterion("CONTACT_HEADING <>", value, "contactHeading");
            return (Criteria) this;
        }

        public Criteria andContactHeadingGreaterThan(String value) {
            addCriterion("CONTACT_HEADING >", value, "contactHeading");
            return (Criteria) this;
        }

        public Criteria andContactHeadingGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_HEADING >=", value, "contactHeading");
            return (Criteria) this;
        }

        public Criteria andContactHeadingLessThan(String value) {
            addCriterion("CONTACT_HEADING <", value, "contactHeading");
            return (Criteria) this;
        }

        public Criteria andContactHeadingLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_HEADING <=", value, "contactHeading");
            return (Criteria) this;
        }

        public Criteria andContactHeadingLike(String value) {
            addCriterion("CONTACT_HEADING like", value, "contactHeading");
            return (Criteria) this;
        }

        public Criteria andContactHeadingNotLike(String value) {
            addCriterion("CONTACT_HEADING not like", value, "contactHeading");
            return (Criteria) this;
        }

        public Criteria andContactHeadingIn(List<String> values) {
            addCriterion("CONTACT_HEADING in", values, "contactHeading");
            return (Criteria) this;
        }

        public Criteria andContactHeadingNotIn(List<String> values) {
            addCriterion("CONTACT_HEADING not in", values, "contactHeading");
            return (Criteria) this;
        }

        public Criteria andContactHeadingBetween(String value1, String value2) {
            addCriterion("CONTACT_HEADING between", value1, value2, "contactHeading");
            return (Criteria) this;
        }

        public Criteria andContactHeadingNotBetween(String value1, String value2) {
            addCriterion("CONTACT_HEADING not between", value1, value2, "contactHeading");
            return (Criteria) this;
        }

        public Criteria andContactDateIsNull() {
            addCriterion("CONTACT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andContactDateIsNotNull() {
            addCriterion("CONTACT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andContactDateEqualTo(Date value) {
            addCriterion("CONTACT_DATE =", value, "contactDate");
            return (Criteria) this;
        }

        public Criteria andContactDateNotEqualTo(Date value) {
            addCriterion("CONTACT_DATE <>", value, "contactDate");
            return (Criteria) this;
        }

        public Criteria andContactDateGreaterThan(Date value) {
            addCriterion("CONTACT_DATE >", value, "contactDate");
            return (Criteria) this;
        }

        public Criteria andContactDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CONTACT_DATE >=", value, "contactDate");
            return (Criteria) this;
        }

        public Criteria andContactDateLessThan(Date value) {
            addCriterion("CONTACT_DATE <", value, "contactDate");
            return (Criteria) this;
        }

        public Criteria andContactDateLessThanOrEqualTo(Date value) {
            addCriterion("CONTACT_DATE <=", value, "contactDate");
            return (Criteria) this;
        }

        public Criteria andContactDateIn(List<Date> values) {
            addCriterion("CONTACT_DATE in", values, "contactDate");
            return (Criteria) this;
        }

        public Criteria andContactDateNotIn(List<Date> values) {
            addCriterion("CONTACT_DATE not in", values, "contactDate");
            return (Criteria) this;
        }

        public Criteria andContactDateBetween(Date value1, Date value2) {
            addCriterion("CONTACT_DATE between", value1, value2, "contactDate");
            return (Criteria) this;
        }

        public Criteria andContactDateNotBetween(Date value1, Date value2) {
            addCriterion("CONTACT_DATE not between", value1, value2, "contactDate");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Long value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Long value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Long value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Long value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Long> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Long> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Long value1, Long value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andContactContentIsNull() {
            addCriterion("CONTACT_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContactContentIsNotNull() {
            addCriterion("CONTACT_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContactContentEqualTo(String value) {
            addCriterion("CONTACT_CONTENT =", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentNotEqualTo(String value) {
            addCriterion("CONTACT_CONTENT <>", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentGreaterThan(String value) {
            addCriterion("CONTACT_CONTENT >", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_CONTENT >=", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentLessThan(String value) {
            addCriterion("CONTACT_CONTENT <", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_CONTENT <=", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentLike(String value) {
            addCriterion("CONTACT_CONTENT like", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentNotLike(String value) {
            addCriterion("CONTACT_CONTENT not like", value, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentIn(List<String> values) {
            addCriterion("CONTACT_CONTENT in", values, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentNotIn(List<String> values) {
            addCriterion("CONTACT_CONTENT not in", values, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentBetween(String value1, String value2) {
            addCriterion("CONTACT_CONTENT between", value1, value2, "contactContent");
            return (Criteria) this;
        }

        public Criteria andContactContentNotBetween(String value1, String value2) {
            addCriterion("CONTACT_CONTENT not between", value1, value2, "contactContent");
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