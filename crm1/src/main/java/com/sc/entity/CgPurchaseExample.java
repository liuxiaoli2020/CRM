package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CgPurchaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CgPurchaseExample() {
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

        public Criteria andPurchaseIdIsNull() {
            addCriterion("PURCHASE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdIsNotNull() {
            addCriterion("PURCHASE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdEqualTo(Long value) {
            addCriterion("PURCHASE_ID =", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotEqualTo(Long value) {
            addCriterion("PURCHASE_ID <>", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdGreaterThan(Long value) {
            addCriterion("PURCHASE_ID >", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PURCHASE_ID >=", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdLessThan(Long value) {
            addCriterion("PURCHASE_ID <", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdLessThanOrEqualTo(Long value) {
            addCriterion("PURCHASE_ID <=", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdIn(List<Long> values) {
            addCriterion("PURCHASE_ID in", values, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotIn(List<Long> values) {
            addCriterion("PURCHASE_ID not in", values, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdBetween(Long value1, Long value2) {
            addCriterion("PURCHASE_ID between", value1, value2, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotBetween(Long value1, Long value2) {
            addCriterion("PURCHASE_ID not between", value1, value2, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateIsNull() {
            addCriterion("ORDER_DELIVERY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateIsNotNull() {
            addCriterion("ORDER_DELIVERY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateEqualTo(Date value) {
            addCriterion("ORDER_DELIVERY_DATE =", value, "orderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateNotEqualTo(Date value) {
            addCriterion("ORDER_DELIVERY_DATE <>", value, "orderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateGreaterThan(Date value) {
            addCriterion("ORDER_DELIVERY_DATE >", value, "orderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_DELIVERY_DATE >=", value, "orderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateLessThan(Date value) {
            addCriterion("ORDER_DELIVERY_DATE <", value, "orderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_DELIVERY_DATE <=", value, "orderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateIn(List<Date> values) {
            addCriterion("ORDER_DELIVERY_DATE in", values, "orderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateNotIn(List<Date> values) {
            addCriterion("ORDER_DELIVERY_DATE not in", values, "orderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateBetween(Date value1, Date value2) {
            addCriterion("ORDER_DELIVERY_DATE between", value1, value2, "orderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_DELIVERY_DATE not between", value1, value2, "orderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateIsNull() {
            addCriterion("PURCHASE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateIsNotNull() {
            addCriterion("PURCHASE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateEqualTo(String value) {
            addCriterion("PURCHASE_STATE =", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateNotEqualTo(String value) {
            addCriterion("PURCHASE_STATE <>", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateGreaterThan(String value) {
            addCriterion("PURCHASE_STATE >", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_STATE >=", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateLessThan(String value) {
            addCriterion("PURCHASE_STATE <", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_STATE <=", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateLike(String value) {
            addCriterion("PURCHASE_STATE like", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateNotLike(String value) {
            addCriterion("PURCHASE_STATE not like", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateIn(List<String> values) {
            addCriterion("PURCHASE_STATE in", values, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateNotIn(List<String> values) {
            addCriterion("PURCHASE_STATE not in", values, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateBetween(String value1, String value2) {
            addCriterion("PURCHASE_STATE between", value1, value2, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_STATE not between", value1, value2, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("STAFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("STAFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Long value) {
            addCriterion("STAFF_ID =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Long value) {
            addCriterion("STAFF_ID <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Long value) {
            addCriterion("STAFF_ID >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Long value) {
            addCriterion("STAFF_ID >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Long value) {
            addCriterion("STAFF_ID <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Long value) {
            addCriterion("STAFF_ID <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Long> values) {
            addCriterion("STAFF_ID in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Long> values) {
            addCriterion("STAFF_ID not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Long value1, Long value2) {
            addCriterion("STAFF_ID between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Long value1, Long value2) {
            addCriterion("STAFF_ID not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarkIsNull() {
            addCriterion("PURCHASE_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarkIsNotNull() {
            addCriterion("PURCHASE_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarkEqualTo(String value) {
            addCriterion("PURCHASE_REMARK =", value, "purchaseRemark");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarkNotEqualTo(String value) {
            addCriterion("PURCHASE_REMARK <>", value, "purchaseRemark");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarkGreaterThan(String value) {
            addCriterion("PURCHASE_REMARK >", value, "purchaseRemark");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_REMARK >=", value, "purchaseRemark");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarkLessThan(String value) {
            addCriterion("PURCHASE_REMARK <", value, "purchaseRemark");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarkLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_REMARK <=", value, "purchaseRemark");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarkLike(String value) {
            addCriterion("PURCHASE_REMARK like", value, "purchaseRemark");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarkNotLike(String value) {
            addCriterion("PURCHASE_REMARK not like", value, "purchaseRemark");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarkIn(List<String> values) {
            addCriterion("PURCHASE_REMARK in", values, "purchaseRemark");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarkNotIn(List<String> values) {
            addCriterion("PURCHASE_REMARK not in", values, "purchaseRemark");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarkBetween(String value1, String value2) {
            addCriterion("PURCHASE_REMARK between", value1, value2, "purchaseRemark");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarkNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_REMARK not between", value1, value2, "purchaseRemark");
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