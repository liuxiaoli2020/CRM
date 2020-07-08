package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XsCustomerFeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XsCustomerFeedbackExample() {
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

        public Criteria andFeedbackRecordIdIsNull() {
            addCriterion("FEEDBACK_RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecordIdIsNotNull() {
            addCriterion("FEEDBACK_RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecordIdEqualTo(Long value) {
            addCriterion("FEEDBACK_RECORD_ID =", value, "feedbackRecordId");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecordIdNotEqualTo(Long value) {
            addCriterion("FEEDBACK_RECORD_ID <>", value, "feedbackRecordId");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecordIdGreaterThan(Long value) {
            addCriterion("FEEDBACK_RECORD_ID >", value, "feedbackRecordId");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FEEDBACK_RECORD_ID >=", value, "feedbackRecordId");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecordIdLessThan(Long value) {
            addCriterion("FEEDBACK_RECORD_ID <", value, "feedbackRecordId");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("FEEDBACK_RECORD_ID <=", value, "feedbackRecordId");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecordIdIn(List<Long> values) {
            addCriterion("FEEDBACK_RECORD_ID in", values, "feedbackRecordId");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecordIdNotIn(List<Long> values) {
            addCriterion("FEEDBACK_RECORD_ID not in", values, "feedbackRecordId");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecordIdBetween(Long value1, Long value2) {
            addCriterion("FEEDBACK_RECORD_ID between", value1, value2, "feedbackRecordId");
            return (Criteria) this;
        }

        public Criteria andFeedbackRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("FEEDBACK_RECORD_ID not between", value1, value2, "feedbackRecordId");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityIsNull() {
            addCriterion("RECORD_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityIsNotNull() {
            addCriterion("RECORD_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityEqualTo(String value) {
            addCriterion("RECORD_PRIORITY =", value, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityNotEqualTo(String value) {
            addCriterion("RECORD_PRIORITY <>", value, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityGreaterThan(String value) {
            addCriterion("RECORD_PRIORITY >", value, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_PRIORITY >=", value, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityLessThan(String value) {
            addCriterion("RECORD_PRIORITY <", value, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityLessThanOrEqualTo(String value) {
            addCriterion("RECORD_PRIORITY <=", value, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityLike(String value) {
            addCriterion("RECORD_PRIORITY like", value, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityNotLike(String value) {
            addCriterion("RECORD_PRIORITY not like", value, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityIn(List<String> values) {
            addCriterion("RECORD_PRIORITY in", values, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityNotIn(List<String> values) {
            addCriterion("RECORD_PRIORITY not in", values, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityBetween(String value1, String value2) {
            addCriterion("RECORD_PRIORITY between", value1, value2, "recordPriority");
            return (Criteria) this;
        }

        public Criteria andRecordPriorityNotBetween(String value1, String value2) {
            addCriterion("RECORD_PRIORITY not between", value1, value2, "recordPriority");
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

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeIsNull() {
            addCriterion("FEEDBACK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeIsNotNull() {
            addCriterion("FEEDBACK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeEqualTo(String value) {
            addCriterion("FEEDBACK_TYPE =", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeNotEqualTo(String value) {
            addCriterion("FEEDBACK_TYPE <>", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeGreaterThan(String value) {
            addCriterion("FEEDBACK_TYPE >", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_TYPE >=", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeLessThan(String value) {
            addCriterion("FEEDBACK_TYPE <", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_TYPE <=", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeLike(String value) {
            addCriterion("FEEDBACK_TYPE like", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeNotLike(String value) {
            addCriterion("FEEDBACK_TYPE not like", value, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeIn(List<String> values) {
            addCriterion("FEEDBACK_TYPE in", values, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeNotIn(List<String> values) {
            addCriterion("FEEDBACK_TYPE not in", values, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeBetween(String value1, String value2) {
            addCriterion("FEEDBACK_TYPE between", value1, value2, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackTypeNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_TYPE not between", value1, value2, "feedbackType");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateIsNull() {
            addCriterion("FEEDBACK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateIsNotNull() {
            addCriterion("FEEDBACK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateEqualTo(Date value) {
            addCriterion("FEEDBACK_DATE =", value, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateNotEqualTo(Date value) {
            addCriterion("FEEDBACK_DATE <>", value, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateGreaterThan(Date value) {
            addCriterion("FEEDBACK_DATE >", value, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateGreaterThanOrEqualTo(Date value) {
            addCriterion("FEEDBACK_DATE >=", value, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateLessThan(Date value) {
            addCriterion("FEEDBACK_DATE <", value, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateLessThanOrEqualTo(Date value) {
            addCriterion("FEEDBACK_DATE <=", value, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateIn(List<Date> values) {
            addCriterion("FEEDBACK_DATE in", values, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateNotIn(List<Date> values) {
            addCriterion("FEEDBACK_DATE not in", values, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateBetween(Date value1, Date value2) {
            addCriterion("FEEDBACK_DATE between", value1, value2, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackDateNotBetween(Date value1, Date value2) {
            addCriterion("FEEDBACK_DATE not between", value1, value2, "feedbackDate");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonIsNull() {
            addCriterion("FEEDBACK_REASON is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonIsNotNull() {
            addCriterion("FEEDBACK_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonEqualTo(String value) {
            addCriterion("FEEDBACK_REASON =", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonNotEqualTo(String value) {
            addCriterion("FEEDBACK_REASON <>", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonGreaterThan(String value) {
            addCriterion("FEEDBACK_REASON >", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_REASON >=", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonLessThan(String value) {
            addCriterion("FEEDBACK_REASON <", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_REASON <=", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonLike(String value) {
            addCriterion("FEEDBACK_REASON like", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonNotLike(String value) {
            addCriterion("FEEDBACK_REASON not like", value, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonIn(List<String> values) {
            addCriterion("FEEDBACK_REASON in", values, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonNotIn(List<String> values) {
            addCriterion("FEEDBACK_REASON not in", values, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonBetween(String value1, String value2) {
            addCriterion("FEEDBACK_REASON between", value1, value2, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andFeedbackReasonNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_REASON not between", value1, value2, "feedbackReason");
            return (Criteria) this;
        }

        public Criteria andHeadIsNull() {
            addCriterion("HEAD is null");
            return (Criteria) this;
        }

        public Criteria andHeadIsNotNull() {
            addCriterion("HEAD is not null");
            return (Criteria) this;
        }

        public Criteria andHeadEqualTo(String value) {
            addCriterion("HEAD =", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotEqualTo(String value) {
            addCriterion("HEAD <>", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadGreaterThan(String value) {
            addCriterion("HEAD >", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadGreaterThanOrEqualTo(String value) {
            addCriterion("HEAD >=", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLessThan(String value) {
            addCriterion("HEAD <", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLessThanOrEqualTo(String value) {
            addCriterion("HEAD <=", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLike(String value) {
            addCriterion("HEAD like", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotLike(String value) {
            addCriterion("HEAD not like", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadIn(List<String> values) {
            addCriterion("HEAD in", values, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotIn(List<String> values) {
            addCriterion("HEAD not in", values, "head");
            return (Criteria) this;
        }

        public Criteria andHeadBetween(String value1, String value2) {
            addCriterion("HEAD between", value1, value2, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotBetween(String value1, String value2) {
            addCriterion("HEAD not between", value1, value2, "head");
            return (Criteria) this;
        }

        public Criteria andFeedbackResourceIsNull() {
            addCriterion("FEEDBACK_RESOURCE is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackResourceIsNotNull() {
            addCriterion("FEEDBACK_RESOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackResourceEqualTo(String value) {
            addCriterion("FEEDBACK_RESOURCE =", value, "feedbackResource");
            return (Criteria) this;
        }

        public Criteria andFeedbackResourceNotEqualTo(String value) {
            addCriterion("FEEDBACK_RESOURCE <>", value, "feedbackResource");
            return (Criteria) this;
        }

        public Criteria andFeedbackResourceGreaterThan(String value) {
            addCriterion("FEEDBACK_RESOURCE >", value, "feedbackResource");
            return (Criteria) this;
        }

        public Criteria andFeedbackResourceGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_RESOURCE >=", value, "feedbackResource");
            return (Criteria) this;
        }

        public Criteria andFeedbackResourceLessThan(String value) {
            addCriterion("FEEDBACK_RESOURCE <", value, "feedbackResource");
            return (Criteria) this;
        }

        public Criteria andFeedbackResourceLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_RESOURCE <=", value, "feedbackResource");
            return (Criteria) this;
        }

        public Criteria andFeedbackResourceLike(String value) {
            addCriterion("FEEDBACK_RESOURCE like", value, "feedbackResource");
            return (Criteria) this;
        }

        public Criteria andFeedbackResourceNotLike(String value) {
            addCriterion("FEEDBACK_RESOURCE not like", value, "feedbackResource");
            return (Criteria) this;
        }

        public Criteria andFeedbackResourceIn(List<String> values) {
            addCriterion("FEEDBACK_RESOURCE in", values, "feedbackResource");
            return (Criteria) this;
        }

        public Criteria andFeedbackResourceNotIn(List<String> values) {
            addCriterion("FEEDBACK_RESOURCE not in", values, "feedbackResource");
            return (Criteria) this;
        }

        public Criteria andFeedbackResourceBetween(String value1, String value2) {
            addCriterion("FEEDBACK_RESOURCE between", value1, value2, "feedbackResource");
            return (Criteria) this;
        }

        public Criteria andFeedbackResourceNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_RESOURCE not between", value1, value2, "feedbackResource");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeIsNull() {
            addCriterion("FEEDBACK_THEME is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeIsNotNull() {
            addCriterion("FEEDBACK_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeEqualTo(String value) {
            addCriterion("FEEDBACK_THEME =", value, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeNotEqualTo(String value) {
            addCriterion("FEEDBACK_THEME <>", value, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeGreaterThan(String value) {
            addCriterion("FEEDBACK_THEME >", value, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_THEME >=", value, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeLessThan(String value) {
            addCriterion("FEEDBACK_THEME <", value, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_THEME <=", value, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeLike(String value) {
            addCriterion("FEEDBACK_THEME like", value, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeNotLike(String value) {
            addCriterion("FEEDBACK_THEME not like", value, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeIn(List<String> values) {
            addCriterion("FEEDBACK_THEME in", values, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeNotIn(List<String> values) {
            addCriterion("FEEDBACK_THEME not in", values, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeBetween(String value1, String value2) {
            addCriterion("FEEDBACK_THEME between", value1, value2, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackThemeNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_THEME not between", value1, value2, "feedbackTheme");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescribeIsNull() {
            addCriterion("FEEDBACK_DESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescribeIsNotNull() {
            addCriterion("FEEDBACK_DESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescribeEqualTo(String value) {
            addCriterion("FEEDBACK_DESCRIBE =", value, "feedbackDescribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescribeNotEqualTo(String value) {
            addCriterion("FEEDBACK_DESCRIBE <>", value, "feedbackDescribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescribeGreaterThan(String value) {
            addCriterion("FEEDBACK_DESCRIBE >", value, "feedbackDescribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_DESCRIBE >=", value, "feedbackDescribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescribeLessThan(String value) {
            addCriterion("FEEDBACK_DESCRIBE <", value, "feedbackDescribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescribeLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_DESCRIBE <=", value, "feedbackDescribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescribeLike(String value) {
            addCriterion("FEEDBACK_DESCRIBE like", value, "feedbackDescribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescribeNotLike(String value) {
            addCriterion("FEEDBACK_DESCRIBE not like", value, "feedbackDescribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescribeIn(List<String> values) {
            addCriterion("FEEDBACK_DESCRIBE in", values, "feedbackDescribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescribeNotIn(List<String> values) {
            addCriterion("FEEDBACK_DESCRIBE not in", values, "feedbackDescribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescribeBetween(String value1, String value2) {
            addCriterion("FEEDBACK_DESCRIBE between", value1, value2, "feedbackDescribe");
            return (Criteria) this;
        }

        public Criteria andFeedbackDescribeNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_DESCRIBE not between", value1, value2, "feedbackDescribe");
            return (Criteria) this;
        }

        public Criteria andAnalysisIsNull() {
            addCriterion("ANALYSIS is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisIsNotNull() {
            addCriterion("ANALYSIS is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisEqualTo(String value) {
            addCriterion("ANALYSIS =", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotEqualTo(String value) {
            addCriterion("ANALYSIS <>", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisGreaterThan(String value) {
            addCriterion("ANALYSIS >", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisGreaterThanOrEqualTo(String value) {
            addCriterion("ANALYSIS >=", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLessThan(String value) {
            addCriterion("ANALYSIS <", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLessThanOrEqualTo(String value) {
            addCriterion("ANALYSIS <=", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLike(String value) {
            addCriterion("ANALYSIS like", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotLike(String value) {
            addCriterion("ANALYSIS not like", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisIn(List<String> values) {
            addCriterion("ANALYSIS in", values, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotIn(List<String> values) {
            addCriterion("ANALYSIS not in", values, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisBetween(String value1, String value2) {
            addCriterion("ANALYSIS between", value1, value2, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotBetween(String value1, String value2) {
            addCriterion("ANALYSIS not between", value1, value2, "analysis");
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