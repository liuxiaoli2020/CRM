package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CgOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CgOrderDetailExample() {
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

        public Criteria andOrderDetailIdIsNull() {
            addCriterion("ORDER_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdIsNotNull() {
            addCriterion("ORDER_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdEqualTo(Long value) {
            addCriterion("ORDER_DETAIL_ID =", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotEqualTo(Long value) {
            addCriterion("ORDER_DETAIL_ID <>", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdGreaterThan(Long value) {
            addCriterion("ORDER_DETAIL_ID >", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_DETAIL_ID >=", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdLessThan(Long value) {
            addCriterion("ORDER_DETAIL_ID <", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_DETAIL_ID <=", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdIn(List<Long> values) {
            addCriterion("ORDER_DETAIL_ID in", values, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotIn(List<Long> values) {
            addCriterion("ORDER_DETAIL_ID not in", values, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdBetween(Long value1, Long value2) {
            addCriterion("ORDER_DETAIL_ID between", value1, value2, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_DETAIL_ID not between", value1, value2, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
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

        public Criteria andProductPriceIsNull() {
            addCriterion("PRODUCT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("PRODUCT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_PRICE =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_PRICE <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_PRICE >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_PRICE >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(BigDecimal value) {
            addCriterion("PRODUCT_PRICE <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_PRICE <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_PRICE in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_PRICE not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_PRICE between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_PRICE not between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNull() {
            addCriterion("PRODUCT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNotNull() {
            addCriterion("PRODUCT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumEqualTo(Long value) {
            addCriterion("PRODUCT_NUM =", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotEqualTo(Long value) {
            addCriterion("PRODUCT_NUM <>", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThan(Long value) {
            addCriterion("PRODUCT_NUM >", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThanOrEqualTo(Long value) {
            addCriterion("PRODUCT_NUM >=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThan(Long value) {
            addCriterion("PRODUCT_NUM <", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThanOrEqualTo(Long value) {
            addCriterion("PRODUCT_NUM <=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumIn(List<Long> values) {
            addCriterion("PRODUCT_NUM in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotIn(List<Long> values) {
            addCriterion("PRODUCT_NUM not in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumBetween(Long value1, Long value2) {
            addCriterion("PRODUCT_NUM between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotBetween(Long value1, Long value2) {
            addCriterion("PRODUCT_NUM not between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductWarehousingIsNull() {
            addCriterion("PRODUCT_WAREHOUSING is null");
            return (Criteria) this;
        }

        public Criteria andProductWarehousingIsNotNull() {
            addCriterion("PRODUCT_WAREHOUSING is not null");
            return (Criteria) this;
        }

        public Criteria andProductWarehousingEqualTo(String value) {
            addCriterion("PRODUCT_WAREHOUSING =", value, "productWarehousing");
            return (Criteria) this;
        }

        public Criteria andProductWarehousingNotEqualTo(String value) {
            addCriterion("PRODUCT_WAREHOUSING <>", value, "productWarehousing");
            return (Criteria) this;
        }

        public Criteria andProductWarehousingGreaterThan(String value) {
            addCriterion("PRODUCT_WAREHOUSING >", value, "productWarehousing");
            return (Criteria) this;
        }

        public Criteria andProductWarehousingGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_WAREHOUSING >=", value, "productWarehousing");
            return (Criteria) this;
        }

        public Criteria andProductWarehousingLessThan(String value) {
            addCriterion("PRODUCT_WAREHOUSING <", value, "productWarehousing");
            return (Criteria) this;
        }

        public Criteria andProductWarehousingLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_WAREHOUSING <=", value, "productWarehousing");
            return (Criteria) this;
        }

        public Criteria andProductWarehousingLike(String value) {
            addCriterion("PRODUCT_WAREHOUSING like", value, "productWarehousing");
            return (Criteria) this;
        }

        public Criteria andProductWarehousingNotLike(String value) {
            addCriterion("PRODUCT_WAREHOUSING not like", value, "productWarehousing");
            return (Criteria) this;
        }

        public Criteria andProductWarehousingIn(List<String> values) {
            addCriterion("PRODUCT_WAREHOUSING in", values, "productWarehousing");
            return (Criteria) this;
        }

        public Criteria andProductWarehousingNotIn(List<String> values) {
            addCriterion("PRODUCT_WAREHOUSING not in", values, "productWarehousing");
            return (Criteria) this;
        }

        public Criteria andProductWarehousingBetween(String value1, String value2) {
            addCriterion("PRODUCT_WAREHOUSING between", value1, value2, "productWarehousing");
            return (Criteria) this;
        }

        public Criteria andProductWarehousingNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_WAREHOUSING not between", value1, value2, "productWarehousing");
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

        public Criteria andOrderaterRemarkIsNull() {
            addCriterion("ORDERATER_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andOrderaterRemarkIsNotNull() {
            addCriterion("ORDERATER_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andOrderaterRemarkEqualTo(String value) {
            addCriterion("ORDERATER_REMARK =", value, "orderaterRemark");
            return (Criteria) this;
        }

        public Criteria andOrderaterRemarkNotEqualTo(String value) {
            addCriterion("ORDERATER_REMARK <>", value, "orderaterRemark");
            return (Criteria) this;
        }

        public Criteria andOrderaterRemarkGreaterThan(String value) {
            addCriterion("ORDERATER_REMARK >", value, "orderaterRemark");
            return (Criteria) this;
        }

        public Criteria andOrderaterRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERATER_REMARK >=", value, "orderaterRemark");
            return (Criteria) this;
        }

        public Criteria andOrderaterRemarkLessThan(String value) {
            addCriterion("ORDERATER_REMARK <", value, "orderaterRemark");
            return (Criteria) this;
        }

        public Criteria andOrderaterRemarkLessThanOrEqualTo(String value) {
            addCriterion("ORDERATER_REMARK <=", value, "orderaterRemark");
            return (Criteria) this;
        }

        public Criteria andOrderaterRemarkLike(String value) {
            addCriterion("ORDERATER_REMARK like", value, "orderaterRemark");
            return (Criteria) this;
        }

        public Criteria andOrderaterRemarkNotLike(String value) {
            addCriterion("ORDERATER_REMARK not like", value, "orderaterRemark");
            return (Criteria) this;
        }

        public Criteria andOrderaterRemarkIn(List<String> values) {
            addCriterion("ORDERATER_REMARK in", values, "orderaterRemark");
            return (Criteria) this;
        }

        public Criteria andOrderaterRemarkNotIn(List<String> values) {
            addCriterion("ORDERATER_REMARK not in", values, "orderaterRemark");
            return (Criteria) this;
        }

        public Criteria andOrderaterRemarkBetween(String value1, String value2) {
            addCriterion("ORDERATER_REMARK between", value1, value2, "orderaterRemark");
            return (Criteria) this;
        }

        public Criteria andOrderaterRemarkNotBetween(String value1, String value2) {
            addCriterion("ORDERATER_REMARK not between", value1, value2, "orderaterRemark");
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