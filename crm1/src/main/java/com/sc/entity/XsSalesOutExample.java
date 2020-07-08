package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XsSalesOutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XsSalesOutExample() {
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

        public Criteria andSalesOrderIdIsNull() {
            addCriterion("SALES_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdIsNotNull() {
            addCriterion("SALES_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdEqualTo(Long value) {
            addCriterion("SALES_ORDER_ID =", value, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdNotEqualTo(Long value) {
            addCriterion("SALES_ORDER_ID <>", value, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdGreaterThan(Long value) {
            addCriterion("SALES_ORDER_ID >", value, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SALES_ORDER_ID >=", value, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdLessThan(Long value) {
            addCriterion("SALES_ORDER_ID <", value, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("SALES_ORDER_ID <=", value, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdIn(List<Long> values) {
            addCriterion("SALES_ORDER_ID in", values, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdNotIn(List<Long> values) {
            addCriterion("SALES_ORDER_ID not in", values, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdBetween(Long value1, Long value2) {
            addCriterion("SALES_ORDER_ID between", value1, value2, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andSalesOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("SALES_ORDER_ID not between", value1, value2, "salesOrderId");
            return (Criteria) this;
        }

        public Criteria andCreatListDateIsNull() {
            addCriterion("CREAT_LIST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatListDateIsNotNull() {
            addCriterion("CREAT_LIST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatListDateEqualTo(Date value) {
            addCriterion("CREAT_LIST_DATE =", value, "creatListDate");
            return (Criteria) this;
        }

        public Criteria andCreatListDateNotEqualTo(Date value) {
            addCriterion("CREAT_LIST_DATE <>", value, "creatListDate");
            return (Criteria) this;
        }

        public Criteria andCreatListDateGreaterThan(Date value) {
            addCriterion("CREAT_LIST_DATE >", value, "creatListDate");
            return (Criteria) this;
        }

        public Criteria andCreatListDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREAT_LIST_DATE >=", value, "creatListDate");
            return (Criteria) this;
        }

        public Criteria andCreatListDateLessThan(Date value) {
            addCriterion("CREAT_LIST_DATE <", value, "creatListDate");
            return (Criteria) this;
        }

        public Criteria andCreatListDateLessThanOrEqualTo(Date value) {
            addCriterion("CREAT_LIST_DATE <=", value, "creatListDate");
            return (Criteria) this;
        }

        public Criteria andCreatListDateIn(List<Date> values) {
            addCriterion("CREAT_LIST_DATE in", values, "creatListDate");
            return (Criteria) this;
        }

        public Criteria andCreatListDateNotIn(List<Date> values) {
            addCriterion("CREAT_LIST_DATE not in", values, "creatListDate");
            return (Criteria) this;
        }

        public Criteria andCreatListDateBetween(Date value1, Date value2) {
            addCriterion("CREAT_LIST_DATE between", value1, value2, "creatListDate");
            return (Criteria) this;
        }

        public Criteria andCreatListDateNotBetween(Date value1, Date value2) {
            addCriterion("CREAT_LIST_DATE not between", value1, value2, "creatListDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIsNull() {
            addCriterion("INVOICE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIsNotNull() {
            addCriterion("INVOICE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberEqualTo(String value) {
            addCriterion("INVOICE_NUMBER =", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotEqualTo(String value) {
            addCriterion("INVOICE_NUMBER <>", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberGreaterThan(String value) {
            addCriterion("INVOICE_NUMBER >", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_NUMBER >=", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLessThan(String value) {
            addCriterion("INVOICE_NUMBER <", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_NUMBER <=", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLike(String value) {
            addCriterion("INVOICE_NUMBER like", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotLike(String value) {
            addCriterion("INVOICE_NUMBER not like", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIn(List<String> values) {
            addCriterion("INVOICE_NUMBER in", values, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotIn(List<String> values) {
            addCriterion("INVOICE_NUMBER not in", values, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberBetween(String value1, String value2) {
            addCriterion("INVOICE_NUMBER between", value1, value2, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotBetween(String value1, String value2) {
            addCriterion("INVOICE_NUMBER not between", value1, value2, "invoiceNumber");
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

        public Criteria andSaleAmountIsNull() {
            addCriterion("SALE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIsNotNull() {
            addCriterion("SALE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSaleAmountEqualTo(BigDecimal value) {
            addCriterion("SALE_AMOUNT =", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotEqualTo(BigDecimal value) {
            addCriterion("SALE_AMOUNT <>", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountGreaterThan(BigDecimal value) {
            addCriterion("SALE_AMOUNT >", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SALE_AMOUNT >=", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountLessThan(BigDecimal value) {
            addCriterion("SALE_AMOUNT <", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SALE_AMOUNT <=", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIn(List<BigDecimal> values) {
            addCriterion("SALE_AMOUNT in", values, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotIn(List<BigDecimal> values) {
            addCriterion("SALE_AMOUNT not in", values, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALE_AMOUNT between", value1, value2, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALE_AMOUNT not between", value1, value2, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDeliveryStatusIsNull() {
            addCriterion("SALE_DELIVERY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSaleDeliveryStatusIsNotNull() {
            addCriterion("SALE_DELIVERY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDeliveryStatusEqualTo(String value) {
            addCriterion("SALE_DELIVERY_STATUS =", value, "saleDeliveryStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDeliveryStatusNotEqualTo(String value) {
            addCriterion("SALE_DELIVERY_STATUS <>", value, "saleDeliveryStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDeliveryStatusGreaterThan(String value) {
            addCriterion("SALE_DELIVERY_STATUS >", value, "saleDeliveryStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDeliveryStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_DELIVERY_STATUS >=", value, "saleDeliveryStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDeliveryStatusLessThan(String value) {
            addCriterion("SALE_DELIVERY_STATUS <", value, "saleDeliveryStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDeliveryStatusLessThanOrEqualTo(String value) {
            addCriterion("SALE_DELIVERY_STATUS <=", value, "saleDeliveryStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDeliveryStatusLike(String value) {
            addCriterion("SALE_DELIVERY_STATUS like", value, "saleDeliveryStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDeliveryStatusNotLike(String value) {
            addCriterion("SALE_DELIVERY_STATUS not like", value, "saleDeliveryStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDeliveryStatusIn(List<String> values) {
            addCriterion("SALE_DELIVERY_STATUS in", values, "saleDeliveryStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDeliveryStatusNotIn(List<String> values) {
            addCriterion("SALE_DELIVERY_STATUS not in", values, "saleDeliveryStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDeliveryStatusBetween(String value1, String value2) {
            addCriterion("SALE_DELIVERY_STATUS between", value1, value2, "saleDeliveryStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDeliveryStatusNotBetween(String value1, String value2) {
            addCriterion("SALE_DELIVERY_STATUS not between", value1, value2, "saleDeliveryStatus");
            return (Criteria) this;
        }

        public Criteria andIsRebateIsNull() {
            addCriterion("IS_REBATE is null");
            return (Criteria) this;
        }

        public Criteria andIsRebateIsNotNull() {
            addCriterion("IS_REBATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsRebateEqualTo(String value) {
            addCriterion("IS_REBATE =", value, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateNotEqualTo(String value) {
            addCriterion("IS_REBATE <>", value, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateGreaterThan(String value) {
            addCriterion("IS_REBATE >", value, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateGreaterThanOrEqualTo(String value) {
            addCriterion("IS_REBATE >=", value, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateLessThan(String value) {
            addCriterion("IS_REBATE <", value, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateLessThanOrEqualTo(String value) {
            addCriterion("IS_REBATE <=", value, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateLike(String value) {
            addCriterion("IS_REBATE like", value, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateNotLike(String value) {
            addCriterion("IS_REBATE not like", value, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateIn(List<String> values) {
            addCriterion("IS_REBATE in", values, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateNotIn(List<String> values) {
            addCriterion("IS_REBATE not in", values, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateBetween(String value1, String value2) {
            addCriterion("IS_REBATE between", value1, value2, "isRebate");
            return (Criteria) this;
        }

        public Criteria andIsRebateNotBetween(String value1, String value2) {
            addCriterion("IS_REBATE not between", value1, value2, "isRebate");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("ORDER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("ORDER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("ORDER_STATUS =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("ORDER_STATUS <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("ORDER_STATUS >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("ORDER_STATUS <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("ORDER_STATUS like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("ORDER_STATUS not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("ORDER_STATUS in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("ORDER_STATUS not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andNoteInformationIsNull() {
            addCriterion("NOTE_INFORMATION is null");
            return (Criteria) this;
        }

        public Criteria andNoteInformationIsNotNull() {
            addCriterion("NOTE_INFORMATION is not null");
            return (Criteria) this;
        }

        public Criteria andNoteInformationEqualTo(String value) {
            addCriterion("NOTE_INFORMATION =", value, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationNotEqualTo(String value) {
            addCriterion("NOTE_INFORMATION <>", value, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationGreaterThan(String value) {
            addCriterion("NOTE_INFORMATION >", value, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE_INFORMATION >=", value, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationLessThan(String value) {
            addCriterion("NOTE_INFORMATION <", value, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationLessThanOrEqualTo(String value) {
            addCriterion("NOTE_INFORMATION <=", value, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationLike(String value) {
            addCriterion("NOTE_INFORMATION like", value, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationNotLike(String value) {
            addCriterion("NOTE_INFORMATION not like", value, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationIn(List<String> values) {
            addCriterion("NOTE_INFORMATION in", values, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationNotIn(List<String> values) {
            addCriterion("NOTE_INFORMATION not in", values, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationBetween(String value1, String value2) {
            addCriterion("NOTE_INFORMATION between", value1, value2, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationNotBetween(String value1, String value2) {
            addCriterion("NOTE_INFORMATION not between", value1, value2, "noteInformation");
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

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
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