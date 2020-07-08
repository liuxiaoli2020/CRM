package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BgCheckTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BgCheckTaskExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Long value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Long value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Long value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Long value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Long> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Long> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Long value1, Long value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskTitleIsNull() {
            addCriterion("TASK_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTaskTitleIsNotNull() {
            addCriterion("TASK_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTitleEqualTo(Long value) {
            addCriterion("TASK_TITLE =", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotEqualTo(Long value) {
            addCriterion("TASK_TITLE <>", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleGreaterThan(Long value) {
            addCriterion("TASK_TITLE >", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleGreaterThanOrEqualTo(Long value) {
            addCriterion("TASK_TITLE >=", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleLessThan(Long value) {
            addCriterion("TASK_TITLE <", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleLessThanOrEqualTo(Long value) {
            addCriterion("TASK_TITLE <=", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleIn(List<Long> values) {
            addCriterion("TASK_TITLE in", values, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotIn(List<Long> values) {
            addCriterion("TASK_TITLE not in", values, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleBetween(Long value1, Long value2) {
            addCriterion("TASK_TITLE between", value1, value2, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotBetween(Long value1, Long value2) {
            addCriterion("TASK_TITLE not between", value1, value2, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIsNull() {
            addCriterion("TASK_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIsNotNull() {
            addCriterion("TASK_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDetailEqualTo(String value) {
            addCriterion("TASK_DETAIL =", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailNotEqualTo(String value) {
            addCriterion("TASK_DETAIL <>", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailGreaterThan(String value) {
            addCriterion("TASK_DETAIL >", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_DETAIL >=", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailLessThan(String value) {
            addCriterion("TASK_DETAIL <", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailLessThanOrEqualTo(String value) {
            addCriterion("TASK_DETAIL <=", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailLike(String value) {
            addCriterion("TASK_DETAIL like", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailNotLike(String value) {
            addCriterion("TASK_DETAIL not like", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIn(List<String> values) {
            addCriterion("TASK_DETAIL in", values, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailNotIn(List<String> values) {
            addCriterion("TASK_DETAIL not in", values, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailBetween(String value1, String value2) {
            addCriterion("TASK_DETAIL between", value1, value2, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailNotBetween(String value1, String value2) {
            addCriterion("TASK_DETAIL not between", value1, value2, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherIsNull() {
            addCriterion("TASK_PUBLISHER is null");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherIsNotNull() {
            addCriterion("TASK_PUBLISHER is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherEqualTo(String value) {
            addCriterion("TASK_PUBLISHER =", value, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherNotEqualTo(String value) {
            addCriterion("TASK_PUBLISHER <>", value, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherGreaterThan(String value) {
            addCriterion("TASK_PUBLISHER >", value, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_PUBLISHER >=", value, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherLessThan(String value) {
            addCriterion("TASK_PUBLISHER <", value, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherLessThanOrEqualTo(String value) {
            addCriterion("TASK_PUBLISHER <=", value, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherLike(String value) {
            addCriterion("TASK_PUBLISHER like", value, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherNotLike(String value) {
            addCriterion("TASK_PUBLISHER not like", value, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherIn(List<String> values) {
            addCriterion("TASK_PUBLISHER in", values, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherNotIn(List<String> values) {
            addCriterion("TASK_PUBLISHER not in", values, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherBetween(String value1, String value2) {
            addCriterion("TASK_PUBLISHER between", value1, value2, "taskPublisher");
            return (Criteria) this;
        }

        public Criteria andTaskPublisherNotBetween(String value1, String value2) {
            addCriterion("TASK_PUBLISHER not between", value1, value2, "taskPublisher");
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

        public Criteria andTaskStatrIsNull() {
            addCriterion("TASK_STATR is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatrIsNotNull() {
            addCriterion("TASK_STATR is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatrEqualTo(String value) {
            addCriterion("TASK_STATR =", value, "taskStatr");
            return (Criteria) this;
        }

        public Criteria andTaskStatrNotEqualTo(String value) {
            addCriterion("TASK_STATR <>", value, "taskStatr");
            return (Criteria) this;
        }

        public Criteria andTaskStatrGreaterThan(String value) {
            addCriterion("TASK_STATR >", value, "taskStatr");
            return (Criteria) this;
        }

        public Criteria andTaskStatrGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_STATR >=", value, "taskStatr");
            return (Criteria) this;
        }

        public Criteria andTaskStatrLessThan(String value) {
            addCriterion("TASK_STATR <", value, "taskStatr");
            return (Criteria) this;
        }

        public Criteria andTaskStatrLessThanOrEqualTo(String value) {
            addCriterion("TASK_STATR <=", value, "taskStatr");
            return (Criteria) this;
        }

        public Criteria andTaskStatrLike(String value) {
            addCriterion("TASK_STATR like", value, "taskStatr");
            return (Criteria) this;
        }

        public Criteria andTaskStatrNotLike(String value) {
            addCriterion("TASK_STATR not like", value, "taskStatr");
            return (Criteria) this;
        }

        public Criteria andTaskStatrIn(List<String> values) {
            addCriterion("TASK_STATR in", values, "taskStatr");
            return (Criteria) this;
        }

        public Criteria andTaskStatrNotIn(List<String> values) {
            addCriterion("TASK_STATR not in", values, "taskStatr");
            return (Criteria) this;
        }

        public Criteria andTaskStatrBetween(String value1, String value2) {
            addCriterion("TASK_STATR between", value1, value2, "taskStatr");
            return (Criteria) this;
        }

        public Criteria andTaskStatrNotBetween(String value1, String value2) {
            addCriterion("TASK_STATR not between", value1, value2, "taskStatr");
            return (Criteria) this;
        }

        public Criteria andTaskFinishIsNull() {
            addCriterion("TASK_FINISH is null");
            return (Criteria) this;
        }

        public Criteria andTaskFinishIsNotNull() {
            addCriterion("TASK_FINISH is not null");
            return (Criteria) this;
        }

        public Criteria andTaskFinishEqualTo(String value) {
            addCriterion("TASK_FINISH =", value, "taskFinish");
            return (Criteria) this;
        }

        public Criteria andTaskFinishNotEqualTo(String value) {
            addCriterion("TASK_FINISH <>", value, "taskFinish");
            return (Criteria) this;
        }

        public Criteria andTaskFinishGreaterThan(String value) {
            addCriterion("TASK_FINISH >", value, "taskFinish");
            return (Criteria) this;
        }

        public Criteria andTaskFinishGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_FINISH >=", value, "taskFinish");
            return (Criteria) this;
        }

        public Criteria andTaskFinishLessThan(String value) {
            addCriterion("TASK_FINISH <", value, "taskFinish");
            return (Criteria) this;
        }

        public Criteria andTaskFinishLessThanOrEqualTo(String value) {
            addCriterion("TASK_FINISH <=", value, "taskFinish");
            return (Criteria) this;
        }

        public Criteria andTaskFinishLike(String value) {
            addCriterion("TASK_FINISH like", value, "taskFinish");
            return (Criteria) this;
        }

        public Criteria andTaskFinishNotLike(String value) {
            addCriterion("TASK_FINISH not like", value, "taskFinish");
            return (Criteria) this;
        }

        public Criteria andTaskFinishIn(List<String> values) {
            addCriterion("TASK_FINISH in", values, "taskFinish");
            return (Criteria) this;
        }

        public Criteria andTaskFinishNotIn(List<String> values) {
            addCriterion("TASK_FINISH not in", values, "taskFinish");
            return (Criteria) this;
        }

        public Criteria andTaskFinishBetween(String value1, String value2) {
            addCriterion("TASK_FINISH between", value1, value2, "taskFinish");
            return (Criteria) this;
        }

        public Criteria andTaskFinishNotBetween(String value1, String value2) {
            addCriterion("TASK_FINISH not between", value1, value2, "taskFinish");
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