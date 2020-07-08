package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XsUserLossExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XsUserLossExample() {
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

        public Criteria andCustomerLossIdIsNull() {
            addCriterion("CUSTOMER_LOSS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLossIdIsNotNull() {
            addCriterion("CUSTOMER_LOSS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLossIdEqualTo(Long value) {
            addCriterion("CUSTOMER_LOSS_ID =", value, "customerLossId");
            return (Criteria) this;
        }

        public Criteria andCustomerLossIdNotEqualTo(Long value) {
            addCriterion("CUSTOMER_LOSS_ID <>", value, "customerLossId");
            return (Criteria) this;
        }

        public Criteria andCustomerLossIdGreaterThan(Long value) {
            addCriterion("CUSTOMER_LOSS_ID >", value, "customerLossId");
            return (Criteria) this;
        }

        public Criteria andCustomerLossIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CUSTOMER_LOSS_ID >=", value, "customerLossId");
            return (Criteria) this;
        }

        public Criteria andCustomerLossIdLessThan(Long value) {
            addCriterion("CUSTOMER_LOSS_ID <", value, "customerLossId");
            return (Criteria) this;
        }

        public Criteria andCustomerLossIdLessThanOrEqualTo(Long value) {
            addCriterion("CUSTOMER_LOSS_ID <=", value, "customerLossId");
            return (Criteria) this;
        }

        public Criteria andCustomerLossIdIn(List<Long> values) {
            addCriterion("CUSTOMER_LOSS_ID in", values, "customerLossId");
            return (Criteria) this;
        }

        public Criteria andCustomerLossIdNotIn(List<Long> values) {
            addCriterion("CUSTOMER_LOSS_ID not in", values, "customerLossId");
            return (Criteria) this;
        }

        public Criteria andCustomerLossIdBetween(Long value1, Long value2) {
            addCriterion("CUSTOMER_LOSS_ID between", value1, value2, "customerLossId");
            return (Criteria) this;
        }

        public Criteria andCustomerLossIdNotBetween(Long value1, Long value2) {
            addCriterion("CUSTOMER_LOSS_ID not between", value1, value2, "customerLossId");
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

        public Criteria andOperatorIdIsNull() {
            addCriterion("OPERATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("OPERATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(Long value) {
            addCriterion("OPERATOR_ID =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(Long value) {
            addCriterion("OPERATOR_ID <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(Long value) {
            addCriterion("OPERATOR_ID >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OPERATOR_ID >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(Long value) {
            addCriterion("OPERATOR_ID <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(Long value) {
            addCriterion("OPERATOR_ID <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<Long> values) {
            addCriterion("OPERATOR_ID in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<Long> values) {
            addCriterion("OPERATOR_ID not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(Long value1, Long value2) {
            addCriterion("OPERATOR_ID between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(Long value1, Long value2) {
            addCriterion("OPERATOR_ID not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andTreatmentModeIsNull() {
            addCriterion("TREATMENT_MODE is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentModeIsNotNull() {
            addCriterion("TREATMENT_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentModeEqualTo(String value) {
            addCriterion("TREATMENT_MODE =", value, "treatmentMode");
            return (Criteria) this;
        }

        public Criteria andTreatmentModeNotEqualTo(String value) {
            addCriterion("TREATMENT_MODE <>", value, "treatmentMode");
            return (Criteria) this;
        }

        public Criteria andTreatmentModeGreaterThan(String value) {
            addCriterion("TREATMENT_MODE >", value, "treatmentMode");
            return (Criteria) this;
        }

        public Criteria andTreatmentModeGreaterThanOrEqualTo(String value) {
            addCriterion("TREATMENT_MODE >=", value, "treatmentMode");
            return (Criteria) this;
        }

        public Criteria andTreatmentModeLessThan(String value) {
            addCriterion("TREATMENT_MODE <", value, "treatmentMode");
            return (Criteria) this;
        }

        public Criteria andTreatmentModeLessThanOrEqualTo(String value) {
            addCriterion("TREATMENT_MODE <=", value, "treatmentMode");
            return (Criteria) this;
        }

        public Criteria andTreatmentModeLike(String value) {
            addCriterion("TREATMENT_MODE like", value, "treatmentMode");
            return (Criteria) this;
        }

        public Criteria andTreatmentModeNotLike(String value) {
            addCriterion("TREATMENT_MODE not like", value, "treatmentMode");
            return (Criteria) this;
        }

        public Criteria andTreatmentModeIn(List<String> values) {
            addCriterion("TREATMENT_MODE in", values, "treatmentMode");
            return (Criteria) this;
        }

        public Criteria andTreatmentModeNotIn(List<String> values) {
            addCriterion("TREATMENT_MODE not in", values, "treatmentMode");
            return (Criteria) this;
        }

        public Criteria andTreatmentModeBetween(String value1, String value2) {
            addCriterion("TREATMENT_MODE between", value1, value2, "treatmentMode");
            return (Criteria) this;
        }

        public Criteria andTreatmentModeNotBetween(String value1, String value2) {
            addCriterion("TREATMENT_MODE not between", value1, value2, "treatmentMode");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresIsNull() {
            addCriterion("TREATMENT_MEASURES is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresIsNotNull() {
            addCriterion("TREATMENT_MEASURES is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresEqualTo(String value) {
            addCriterion("TREATMENT_MEASURES =", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresNotEqualTo(String value) {
            addCriterion("TREATMENT_MEASURES <>", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresGreaterThan(String value) {
            addCriterion("TREATMENT_MEASURES >", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresGreaterThanOrEqualTo(String value) {
            addCriterion("TREATMENT_MEASURES >=", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresLessThan(String value) {
            addCriterion("TREATMENT_MEASURES <", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresLessThanOrEqualTo(String value) {
            addCriterion("TREATMENT_MEASURES <=", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresLike(String value) {
            addCriterion("TREATMENT_MEASURES like", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresNotLike(String value) {
            addCriterion("TREATMENT_MEASURES not like", value, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresIn(List<String> values) {
            addCriterion("TREATMENT_MEASURES in", values, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresNotIn(List<String> values) {
            addCriterion("TREATMENT_MEASURES not in", values, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresBetween(String value1, String value2) {
            addCriterion("TREATMENT_MEASURES between", value1, value2, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andTreatmentMeasuresNotBetween(String value1, String value2) {
            addCriterion("TREATMENT_MEASURES not between", value1, value2, "treatmentMeasures");
            return (Criteria) this;
        }

        public Criteria andIsLossIsNull() {
            addCriterion("IS_LOSS is null");
            return (Criteria) this;
        }

        public Criteria andIsLossIsNotNull() {
            addCriterion("IS_LOSS is not null");
            return (Criteria) this;
        }

        public Criteria andIsLossEqualTo(String value) {
            addCriterion("IS_LOSS =", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossNotEqualTo(String value) {
            addCriterion("IS_LOSS <>", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossGreaterThan(String value) {
            addCriterion("IS_LOSS >", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossGreaterThanOrEqualTo(String value) {
            addCriterion("IS_LOSS >=", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossLessThan(String value) {
            addCriterion("IS_LOSS <", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossLessThanOrEqualTo(String value) {
            addCriterion("IS_LOSS <=", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossLike(String value) {
            addCriterion("IS_LOSS like", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossNotLike(String value) {
            addCriterion("IS_LOSS not like", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossIn(List<String> values) {
            addCriterion("IS_LOSS in", values, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossNotIn(List<String> values) {
            addCriterion("IS_LOSS not in", values, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossBetween(String value1, String value2) {
            addCriterion("IS_LOSS between", value1, value2, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossNotBetween(String value1, String value2) {
            addCriterion("IS_LOSS not between", value1, value2, "isLoss");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(Long value) {
            addCriterion("COMPANY =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(Long value) {
            addCriterion("COMPANY <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(Long value) {
            addCriterion("COMPANY >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPANY >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(Long value) {
            addCriterion("COMPANY <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(Long value) {
            addCriterion("COMPANY <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<Long> values) {
            addCriterion("COMPANY in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<Long> values) {
            addCriterion("COMPANY not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(Long value1, Long value2) {
            addCriterion("COMPANY between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(Long value1, Long value2) {
            addCriterion("COMPANY not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andLastModifyDataIsNull() {
            addCriterion("LAST_MODIFY_DATA is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDataIsNotNull() {
            addCriterion("LAST_MODIFY_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDataEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATA =", value, "lastModifyData");
            return (Criteria) this;
        }

        public Criteria andLastModifyDataNotEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATA <>", value, "lastModifyData");
            return (Criteria) this;
        }

        public Criteria andLastModifyDataGreaterThan(Date value) {
            addCriterion("LAST_MODIFY_DATA >", value, "lastModifyData");
            return (Criteria) this;
        }

        public Criteria andLastModifyDataGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATA >=", value, "lastModifyData");
            return (Criteria) this;
        }

        public Criteria andLastModifyDataLessThan(Date value) {
            addCriterion("LAST_MODIFY_DATA <", value, "lastModifyData");
            return (Criteria) this;
        }

        public Criteria andLastModifyDataLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATA <=", value, "lastModifyData");
            return (Criteria) this;
        }

        public Criteria andLastModifyDataIn(List<Date> values) {
            addCriterion("LAST_MODIFY_DATA in", values, "lastModifyData");
            return (Criteria) this;
        }

        public Criteria andLastModifyDataNotIn(List<Date> values) {
            addCriterion("LAST_MODIFY_DATA not in", values, "lastModifyData");
            return (Criteria) this;
        }

        public Criteria andLastModifyDataBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_DATA between", value1, value2, "lastModifyData");
            return (Criteria) this;
        }

        public Criteria andLastModifyDataNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_DATA not between", value1, value2, "lastModifyData");
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