package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CgOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CgOrderExample() {
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

        public Criteria andOrderThemeIsNull() {
            addCriterion("ORDER_THEME is null");
            return (Criteria) this;
        }

        public Criteria andOrderThemeIsNotNull() {
            addCriterion("ORDER_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderThemeEqualTo(String value) {
            addCriterion("ORDER_THEME =", value, "orderTheme");
            return (Criteria) this;
        }

        public Criteria andOrderThemeNotEqualTo(String value) {
            addCriterion("ORDER_THEME <>", value, "orderTheme");
            return (Criteria) this;
        }

        public Criteria andOrderThemeGreaterThan(String value) {
            addCriterion("ORDER_THEME >", value, "orderTheme");
            return (Criteria) this;
        }

        public Criteria andOrderThemeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_THEME >=", value, "orderTheme");
            return (Criteria) this;
        }

        public Criteria andOrderThemeLessThan(String value) {
            addCriterion("ORDER_THEME <", value, "orderTheme");
            return (Criteria) this;
        }

        public Criteria andOrderThemeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_THEME <=", value, "orderTheme");
            return (Criteria) this;
        }

        public Criteria andOrderThemeLike(String value) {
            addCriterion("ORDER_THEME like", value, "orderTheme");
            return (Criteria) this;
        }

        public Criteria andOrderThemeNotLike(String value) {
            addCriterion("ORDER_THEME not like", value, "orderTheme");
            return (Criteria) this;
        }

        public Criteria andOrderThemeIn(List<String> values) {
            addCriterion("ORDER_THEME in", values, "orderTheme");
            return (Criteria) this;
        }

        public Criteria andOrderThemeNotIn(List<String> values) {
            addCriterion("ORDER_THEME not in", values, "orderTheme");
            return (Criteria) this;
        }

        public Criteria andOrderThemeBetween(String value1, String value2) {
            addCriterion("ORDER_THEME between", value1, value2, "orderTheme");
            return (Criteria) this;
        }

        public Criteria andOrderThemeNotBetween(String value1, String value2) {
            addCriterion("ORDER_THEME not between", value1, value2, "orderTheme");
            return (Criteria) this;
        }

        public Criteria andOrderBydateIsNull() {
            addCriterion("ORDER_BYDATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderBydateIsNotNull() {
            addCriterion("ORDER_BYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBydateEqualTo(Date value) {
            addCriterion("ORDER_BYDATE =", value, "orderBydate");
            return (Criteria) this;
        }

        public Criteria andOrderBydateNotEqualTo(Date value) {
            addCriterion("ORDER_BYDATE <>", value, "orderBydate");
            return (Criteria) this;
        }

        public Criteria andOrderBydateGreaterThan(Date value) {
            addCriterion("ORDER_BYDATE >", value, "orderBydate");
            return (Criteria) this;
        }

        public Criteria andOrderBydateGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_BYDATE >=", value, "orderBydate");
            return (Criteria) this;
        }

        public Criteria andOrderBydateLessThan(Date value) {
            addCriterion("ORDER_BYDATE <", value, "orderBydate");
            return (Criteria) this;
        }

        public Criteria andOrderBydateLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_BYDATE <=", value, "orderBydate");
            return (Criteria) this;
        }

        public Criteria andOrderBydateIn(List<Date> values) {
            addCriterion("ORDER_BYDATE in", values, "orderBydate");
            return (Criteria) this;
        }

        public Criteria andOrderBydateNotIn(List<Date> values) {
            addCriterion("ORDER_BYDATE not in", values, "orderBydate");
            return (Criteria) this;
        }

        public Criteria andOrderBydateBetween(Date value1, Date value2) {
            addCriterion("ORDER_BYDATE between", value1, value2, "orderBydate");
            return (Criteria) this;
        }

        public Criteria andOrderBydateNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_BYDATE not between", value1, value2, "orderBydate");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("SUPPLIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("SUPPLIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(String value) {
            addCriterion("SUPPLIER_ID =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(String value) {
            addCriterion("SUPPLIER_ID <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(String value) {
            addCriterion("SUPPLIER_ID >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ID >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(String value) {
            addCriterion("SUPPLIER_ID <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ID <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLike(String value) {
            addCriterion("SUPPLIER_ID like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotLike(String value) {
            addCriterion("SUPPLIER_ID not like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<String> values) {
            addCriterion("SUPPLIER_ID in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<String> values) {
            addCriterion("SUPPLIER_ID not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ID between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ID not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andOrderLoanIsNull() {
            addCriterion("ORDER_LOAN is null");
            return (Criteria) this;
        }

        public Criteria andOrderLoanIsNotNull() {
            addCriterion("ORDER_LOAN is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLoanEqualTo(Long value) {
            addCriterion("ORDER_LOAN =", value, "orderLoan");
            return (Criteria) this;
        }

        public Criteria andOrderLoanNotEqualTo(Long value) {
            addCriterion("ORDER_LOAN <>", value, "orderLoan");
            return (Criteria) this;
        }

        public Criteria andOrderLoanGreaterThan(Long value) {
            addCriterion("ORDER_LOAN >", value, "orderLoan");
            return (Criteria) this;
        }

        public Criteria andOrderLoanGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_LOAN >=", value, "orderLoan");
            return (Criteria) this;
        }

        public Criteria andOrderLoanLessThan(Long value) {
            addCriterion("ORDER_LOAN <", value, "orderLoan");
            return (Criteria) this;
        }

        public Criteria andOrderLoanLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_LOAN <=", value, "orderLoan");
            return (Criteria) this;
        }

        public Criteria andOrderLoanIn(List<Long> values) {
            addCriterion("ORDER_LOAN in", values, "orderLoan");
            return (Criteria) this;
        }

        public Criteria andOrderLoanNotIn(List<Long> values) {
            addCriterion("ORDER_LOAN not in", values, "orderLoan");
            return (Criteria) this;
        }

        public Criteria andOrderLoanBetween(Long value1, Long value2) {
            addCriterion("ORDER_LOAN between", value1, value2, "orderLoan");
            return (Criteria) this;
        }

        public Criteria andOrderLoanNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_LOAN not between", value1, value2, "orderLoan");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIsNull() {
            addCriterion("INVOICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIsNotNull() {
            addCriterion("INVOICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdEqualTo(BigDecimal value) {
            addCriterion("INVOICE_ID =", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotEqualTo(BigDecimal value) {
            addCriterion("INVOICE_ID <>", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdGreaterThan(BigDecimal value) {
            addCriterion("INVOICE_ID >", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICE_ID >=", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLessThan(BigDecimal value) {
            addCriterion("INVOICE_ID <", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICE_ID <=", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIn(List<BigDecimal> values) {
            addCriterion("INVOICE_ID in", values, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotIn(List<BigDecimal> values) {
            addCriterion("INVOICE_ID not in", values, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICE_ID between", value1, value2, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICE_ID not between", value1, value2, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andOrderIspyaIsNull() {
            addCriterion("ORDER_ISPYA is null");
            return (Criteria) this;
        }

        public Criteria andOrderIspyaIsNotNull() {
            addCriterion("ORDER_ISPYA is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIspyaEqualTo(String value) {
            addCriterion("ORDER_ISPYA =", value, "orderIspya");
            return (Criteria) this;
        }

        public Criteria andOrderIspyaNotEqualTo(String value) {
            addCriterion("ORDER_ISPYA <>", value, "orderIspya");
            return (Criteria) this;
        }

        public Criteria andOrderIspyaGreaterThan(String value) {
            addCriterion("ORDER_ISPYA >", value, "orderIspya");
            return (Criteria) this;
        }

        public Criteria andOrderIspyaGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ISPYA >=", value, "orderIspya");
            return (Criteria) this;
        }

        public Criteria andOrderIspyaLessThan(String value) {
            addCriterion("ORDER_ISPYA <", value, "orderIspya");
            return (Criteria) this;
        }

        public Criteria andOrderIspyaLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ISPYA <=", value, "orderIspya");
            return (Criteria) this;
        }

        public Criteria andOrderIspyaLike(String value) {
            addCriterion("ORDER_ISPYA like", value, "orderIspya");
            return (Criteria) this;
        }

        public Criteria andOrderIspyaNotLike(String value) {
            addCriterion("ORDER_ISPYA not like", value, "orderIspya");
            return (Criteria) this;
        }

        public Criteria andOrderIspyaIn(List<String> values) {
            addCriterion("ORDER_ISPYA in", values, "orderIspya");
            return (Criteria) this;
        }

        public Criteria andOrderIspyaNotIn(List<String> values) {
            addCriterion("ORDER_ISPYA not in", values, "orderIspya");
            return (Criteria) this;
        }

        public Criteria andOrderIspyaBetween(String value1, String value2) {
            addCriterion("ORDER_ISPYA between", value1, value2, "orderIspya");
            return (Criteria) this;
        }

        public Criteria andOrderIspyaNotBetween(String value1, String value2) {
            addCriterion("ORDER_ISPYA not between", value1, value2, "orderIspya");
            return (Criteria) this;
        }

        public Criteria andOrderProgressIsNull() {
            addCriterion("ORDER_PROGRESS is null");
            return (Criteria) this;
        }

        public Criteria andOrderProgressIsNotNull() {
            addCriterion("ORDER_PROGRESS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderProgressEqualTo(String value) {
            addCriterion("ORDER_PROGRESS =", value, "orderProgress");
            return (Criteria) this;
        }

        public Criteria andOrderProgressNotEqualTo(String value) {
            addCriterion("ORDER_PROGRESS <>", value, "orderProgress");
            return (Criteria) this;
        }

        public Criteria andOrderProgressGreaterThan(String value) {
            addCriterion("ORDER_PROGRESS >", value, "orderProgress");
            return (Criteria) this;
        }

        public Criteria andOrderProgressGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_PROGRESS >=", value, "orderProgress");
            return (Criteria) this;
        }

        public Criteria andOrderProgressLessThan(String value) {
            addCriterion("ORDER_PROGRESS <", value, "orderProgress");
            return (Criteria) this;
        }

        public Criteria andOrderProgressLessThanOrEqualTo(String value) {
            addCriterion("ORDER_PROGRESS <=", value, "orderProgress");
            return (Criteria) this;
        }

        public Criteria andOrderProgressLike(String value) {
            addCriterion("ORDER_PROGRESS like", value, "orderProgress");
            return (Criteria) this;
        }

        public Criteria andOrderProgressNotLike(String value) {
            addCriterion("ORDER_PROGRESS not like", value, "orderProgress");
            return (Criteria) this;
        }

        public Criteria andOrderProgressIn(List<String> values) {
            addCriterion("ORDER_PROGRESS in", values, "orderProgress");
            return (Criteria) this;
        }

        public Criteria andOrderProgressNotIn(List<String> values) {
            addCriterion("ORDER_PROGRESS not in", values, "orderProgress");
            return (Criteria) this;
        }

        public Criteria andOrderProgressBetween(String value1, String value2) {
            addCriterion("ORDER_PROGRESS between", value1, value2, "orderProgress");
            return (Criteria) this;
        }

        public Criteria andOrderProgressNotBetween(String value1, String value2) {
            addCriterion("ORDER_PROGRESS not between", value1, value2, "orderProgress");
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

        public Criteria andOrderDeliveryPalceIsNull() {
            addCriterion("ORDER_DELIVERY_PALCE is null");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPalceIsNotNull() {
            addCriterion("ORDER_DELIVERY_PALCE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPalceEqualTo(String value) {
            addCriterion("ORDER_DELIVERY_PALCE =", value, "orderDeliveryPalce");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPalceNotEqualTo(String value) {
            addCriterion("ORDER_DELIVERY_PALCE <>", value, "orderDeliveryPalce");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPalceGreaterThan(String value) {
            addCriterion("ORDER_DELIVERY_PALCE >", value, "orderDeliveryPalce");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPalceGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_DELIVERY_PALCE >=", value, "orderDeliveryPalce");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPalceLessThan(String value) {
            addCriterion("ORDER_DELIVERY_PALCE <", value, "orderDeliveryPalce");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPalceLessThanOrEqualTo(String value) {
            addCriterion("ORDER_DELIVERY_PALCE <=", value, "orderDeliveryPalce");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPalceLike(String value) {
            addCriterion("ORDER_DELIVERY_PALCE like", value, "orderDeliveryPalce");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPalceNotLike(String value) {
            addCriterion("ORDER_DELIVERY_PALCE not like", value, "orderDeliveryPalce");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPalceIn(List<String> values) {
            addCriterion("ORDER_DELIVERY_PALCE in", values, "orderDeliveryPalce");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPalceNotIn(List<String> values) {
            addCriterion("ORDER_DELIVERY_PALCE not in", values, "orderDeliveryPalce");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPalceBetween(String value1, String value2) {
            addCriterion("ORDER_DELIVERY_PALCE between", value1, value2, "orderDeliveryPalce");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPalceNotBetween(String value1, String value2) {
            addCriterion("ORDER_DELIVERY_PALCE not between", value1, value2, "orderDeliveryPalce");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryModeIsNull() {
            addCriterion("ORDER_DELIVERY_MODE is null");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryModeIsNotNull() {
            addCriterion("ORDER_DELIVERY_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryModeEqualTo(String value) {
            addCriterion("ORDER_DELIVERY_MODE =", value, "orderDeliveryMode");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryModeNotEqualTo(String value) {
            addCriterion("ORDER_DELIVERY_MODE <>", value, "orderDeliveryMode");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryModeGreaterThan(String value) {
            addCriterion("ORDER_DELIVERY_MODE >", value, "orderDeliveryMode");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryModeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_DELIVERY_MODE >=", value, "orderDeliveryMode");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryModeLessThan(String value) {
            addCriterion("ORDER_DELIVERY_MODE <", value, "orderDeliveryMode");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryModeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_DELIVERY_MODE <=", value, "orderDeliveryMode");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryModeLike(String value) {
            addCriterion("ORDER_DELIVERY_MODE like", value, "orderDeliveryMode");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryModeNotLike(String value) {
            addCriterion("ORDER_DELIVERY_MODE not like", value, "orderDeliveryMode");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryModeIn(List<String> values) {
            addCriterion("ORDER_DELIVERY_MODE in", values, "orderDeliveryMode");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryModeNotIn(List<String> values) {
            addCriterion("ORDER_DELIVERY_MODE not in", values, "orderDeliveryMode");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryModeBetween(String value1, String value2) {
            addCriterion("ORDER_DELIVERY_MODE between", value1, value2, "orderDeliveryMode");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryModeNotBetween(String value1, String value2) {
            addCriterion("ORDER_DELIVERY_MODE not between", value1, value2, "orderDeliveryMode");
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

        public Criteria andOrderRemarkIsNull() {
            addCriterion("ORDER_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkIsNotNull() {
            addCriterion("ORDER_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkEqualTo(String value) {
            addCriterion("ORDER_REMARK =", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotEqualTo(String value) {
            addCriterion("ORDER_REMARK <>", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkGreaterThan(String value) {
            addCriterion("ORDER_REMARK >", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_REMARK >=", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkLessThan(String value) {
            addCriterion("ORDER_REMARK <", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkLessThanOrEqualTo(String value) {
            addCriterion("ORDER_REMARK <=", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkLike(String value) {
            addCriterion("ORDER_REMARK like", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotLike(String value) {
            addCriterion("ORDER_REMARK not like", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkIn(List<String> values) {
            addCriterion("ORDER_REMARK in", values, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotIn(List<String> values) {
            addCriterion("ORDER_REMARK not in", values, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkBetween(String value1, String value2) {
            addCriterion("ORDER_REMARK between", value1, value2, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotBetween(String value1, String value2) {
            addCriterion("ORDER_REMARK not between", value1, value2, "orderRemark");
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