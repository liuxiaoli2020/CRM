package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XsSalesDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XsSalesDetailExample() {
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

        public Criteria andSalesDetailIdIsNull() {
            addCriterion("SALES_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSalesDetailIdIsNotNull() {
            addCriterion("SALES_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSalesDetailIdEqualTo(Long value) {
            addCriterion("SALES_DETAIL_ID =", value, "salesDetailId");
            return (Criteria) this;
        }

        public Criteria andSalesDetailIdNotEqualTo(Long value) {
            addCriterion("SALES_DETAIL_ID <>", value, "salesDetailId");
            return (Criteria) this;
        }

        public Criteria andSalesDetailIdGreaterThan(Long value) {
            addCriterion("SALES_DETAIL_ID >", value, "salesDetailId");
            return (Criteria) this;
        }

        public Criteria andSalesDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SALES_DETAIL_ID >=", value, "salesDetailId");
            return (Criteria) this;
        }

        public Criteria andSalesDetailIdLessThan(Long value) {
            addCriterion("SALES_DETAIL_ID <", value, "salesDetailId");
            return (Criteria) this;
        }

        public Criteria andSalesDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("SALES_DETAIL_ID <=", value, "salesDetailId");
            return (Criteria) this;
        }

        public Criteria andSalesDetailIdIn(List<Long> values) {
            addCriterion("SALES_DETAIL_ID in", values, "salesDetailId");
            return (Criteria) this;
        }

        public Criteria andSalesDetailIdNotIn(List<Long> values) {
            addCriterion("SALES_DETAIL_ID not in", values, "salesDetailId");
            return (Criteria) this;
        }

        public Criteria andSalesDetailIdBetween(Long value1, Long value2) {
            addCriterion("SALES_DETAIL_ID between", value1, value2, "salesDetailId");
            return (Criteria) this;
        }

        public Criteria andSalesDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("SALES_DETAIL_ID not between", value1, value2, "salesDetailId");
            return (Criteria) this;
        }

        public Criteria andSalesIdIsNull() {
            addCriterion("SALES_ID is null");
            return (Criteria) this;
        }

        public Criteria andSalesIdIsNotNull() {
            addCriterion("SALES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSalesIdEqualTo(Long value) {
            addCriterion("SALES_ID =", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdNotEqualTo(Long value) {
            addCriterion("SALES_ID <>", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdGreaterThan(Long value) {
            addCriterion("SALES_ID >", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SALES_ID >=", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdLessThan(Long value) {
            addCriterion("SALES_ID <", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdLessThanOrEqualTo(Long value) {
            addCriterion("SALES_ID <=", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdIn(List<Long> values) {
            addCriterion("SALES_ID in", values, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdNotIn(List<Long> values) {
            addCriterion("SALES_ID not in", values, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdBetween(Long value1, Long value2) {
            addCriterion("SALES_ID between", value1, value2, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdNotBetween(Long value1, Long value2) {
            addCriterion("SALES_ID not between", value1, value2, "salesId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("GOODS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("GOODS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("GOODS_ID =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("GOODS_ID <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("GOODS_ID >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("GOODS_ID >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("GOODS_ID <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("GOODS_ID <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("GOODS_ID in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("GOODS_ID not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("GOODS_ID between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("GOODS_ID not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNull() {
            addCriterion("GOODS_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNotNull() {
            addCriterion("GOODS_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberEqualTo(Long value) {
            addCriterion("GOODS_NUMBER =", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotEqualTo(Long value) {
            addCriterion("GOODS_NUMBER <>", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThan(Long value) {
            addCriterion("GOODS_NUMBER >", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("GOODS_NUMBER >=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThan(Long value) {
            addCriterion("GOODS_NUMBER <", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThanOrEqualTo(Long value) {
            addCriterion("GOODS_NUMBER <=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIn(List<Long> values) {
            addCriterion("GOODS_NUMBER in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotIn(List<Long> values) {
            addCriterion("GOODS_NUMBER not in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberBetween(Long value1, Long value2) {
            addCriterion("GOODS_NUMBER between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotBetween(Long value1, Long value2) {
            addCriterion("GOODS_NUMBER not between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("GOODS_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("GOODS_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("GOODS_PRICE =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("GOODS_PRICE <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("GOODS_PRICE >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_PRICE >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("GOODS_PRICE <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_PRICE <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("GOODS_PRICE in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("GOODS_PRICE not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_PRICE between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_PRICE not between", value1, value2, "goodsPrice");
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