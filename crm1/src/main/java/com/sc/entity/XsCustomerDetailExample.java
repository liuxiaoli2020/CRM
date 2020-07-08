package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XsCustomerDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XsCustomerDetailExample() {
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

        public Criteria andCustomerNameIsNull() {
            addCriterion("CUSTOMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("CUSTOMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("CUSTOMER_NAME =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("CUSTOMER_NAME >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("CUSTOMER_NAME <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("CUSTOMER_NAME like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("CUSTOMER_NAME not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("CUSTOMER_NAME in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("CUSTOMER_NAME not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerAttrIsNull() {
            addCriterion("CUSTOMER_ATTR is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAttrIsNotNull() {
            addCriterion("CUSTOMER_ATTR is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAttrEqualTo(String value) {
            addCriterion("CUSTOMER_ATTR =", value, "customerAttr");
            return (Criteria) this;
        }

        public Criteria andCustomerAttrNotEqualTo(String value) {
            addCriterion("CUSTOMER_ATTR <>", value, "customerAttr");
            return (Criteria) this;
        }

        public Criteria andCustomerAttrGreaterThan(String value) {
            addCriterion("CUSTOMER_ATTR >", value, "customerAttr");
            return (Criteria) this;
        }

        public Criteria andCustomerAttrGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ATTR >=", value, "customerAttr");
            return (Criteria) this;
        }

        public Criteria andCustomerAttrLessThan(String value) {
            addCriterion("CUSTOMER_ATTR <", value, "customerAttr");
            return (Criteria) this;
        }

        public Criteria andCustomerAttrLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ATTR <=", value, "customerAttr");
            return (Criteria) this;
        }

        public Criteria andCustomerAttrLike(String value) {
            addCriterion("CUSTOMER_ATTR like", value, "customerAttr");
            return (Criteria) this;
        }

        public Criteria andCustomerAttrNotLike(String value) {
            addCriterion("CUSTOMER_ATTR not like", value, "customerAttr");
            return (Criteria) this;
        }

        public Criteria andCustomerAttrIn(List<String> values) {
            addCriterion("CUSTOMER_ATTR in", values, "customerAttr");
            return (Criteria) this;
        }

        public Criteria andCustomerAttrNotIn(List<String> values) {
            addCriterion("CUSTOMER_ATTR not in", values, "customerAttr");
            return (Criteria) this;
        }

        public Criteria andCustomerAttrBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ATTR between", value1, value2, "customerAttr");
            return (Criteria) this;
        }

        public Criteria andCustomerAttrNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ATTR not between", value1, value2, "customerAttr");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNull() {
            addCriterion("WEBSITE is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("WEBSITE is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("WEBSITE =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("WEBSITE <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("WEBSITE >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("WEBSITE >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("WEBSITE <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("WEBSITE <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("WEBSITE like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("WEBSITE not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("WEBSITE in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("WEBSITE not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("WEBSITE between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("WEBSITE not between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNull() {
            addCriterion("STOCK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("STOCK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(String value) {
            addCriterion("STOCK_CODE =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(String value) {
            addCriterion("STOCK_CODE <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(String value) {
            addCriterion("STOCK_CODE >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("STOCK_CODE >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(String value) {
            addCriterion("STOCK_CODE <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(String value) {
            addCriterion("STOCK_CODE <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLike(String value) {
            addCriterion("STOCK_CODE like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotLike(String value) {
            addCriterion("STOCK_CODE not like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<String> values) {
            addCriterion("STOCK_CODE in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<String> values) {
            addCriterion("STOCK_CODE not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(String value1, String value2) {
            addCriterion("STOCK_CODE between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(String value1, String value2) {
            addCriterion("STOCK_CODE not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andUnitHigherIsNull() {
            addCriterion("UNIT_HIGHER is null");
            return (Criteria) this;
        }

        public Criteria andUnitHigherIsNotNull() {
            addCriterion("UNIT_HIGHER is not null");
            return (Criteria) this;
        }

        public Criteria andUnitHigherEqualTo(String value) {
            addCriterion("UNIT_HIGHER =", value, "unitHigher");
            return (Criteria) this;
        }

        public Criteria andUnitHigherNotEqualTo(String value) {
            addCriterion("UNIT_HIGHER <>", value, "unitHigher");
            return (Criteria) this;
        }

        public Criteria andUnitHigherGreaterThan(String value) {
            addCriterion("UNIT_HIGHER >", value, "unitHigher");
            return (Criteria) this;
        }

        public Criteria andUnitHigherGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_HIGHER >=", value, "unitHigher");
            return (Criteria) this;
        }

        public Criteria andUnitHigherLessThan(String value) {
            addCriterion("UNIT_HIGHER <", value, "unitHigher");
            return (Criteria) this;
        }

        public Criteria andUnitHigherLessThanOrEqualTo(String value) {
            addCriterion("UNIT_HIGHER <=", value, "unitHigher");
            return (Criteria) this;
        }

        public Criteria andUnitHigherLike(String value) {
            addCriterion("UNIT_HIGHER like", value, "unitHigher");
            return (Criteria) this;
        }

        public Criteria andUnitHigherNotLike(String value) {
            addCriterion("UNIT_HIGHER not like", value, "unitHigher");
            return (Criteria) this;
        }

        public Criteria andUnitHigherIn(List<String> values) {
            addCriterion("UNIT_HIGHER in", values, "unitHigher");
            return (Criteria) this;
        }

        public Criteria andUnitHigherNotIn(List<String> values) {
            addCriterion("UNIT_HIGHER not in", values, "unitHigher");
            return (Criteria) this;
        }

        public Criteria andUnitHigherBetween(String value1, String value2) {
            addCriterion("UNIT_HIGHER between", value1, value2, "unitHigher");
            return (Criteria) this;
        }

        public Criteria andUnitHigherNotBetween(String value1, String value2) {
            addCriterion("UNIT_HIGHER not between", value1, value2, "unitHigher");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("OWNER is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("OWNER =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("OWNER <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("OWNER >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("OWNER <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("OWNER <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("OWNER like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("OWNER not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("OWNER in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("OWNER not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("OWNER between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("OWNER not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andNumberEmployeeIsNull() {
            addCriterion("NUMBER_EMPLOYEE is null");
            return (Criteria) this;
        }

        public Criteria andNumberEmployeeIsNotNull() {
            addCriterion("NUMBER_EMPLOYEE is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEmployeeEqualTo(Long value) {
            addCriterion("NUMBER_EMPLOYEE =", value, "numberEmployee");
            return (Criteria) this;
        }

        public Criteria andNumberEmployeeNotEqualTo(Long value) {
            addCriterion("NUMBER_EMPLOYEE <>", value, "numberEmployee");
            return (Criteria) this;
        }

        public Criteria andNumberEmployeeGreaterThan(Long value) {
            addCriterion("NUMBER_EMPLOYEE >", value, "numberEmployee");
            return (Criteria) this;
        }

        public Criteria andNumberEmployeeGreaterThanOrEqualTo(Long value) {
            addCriterion("NUMBER_EMPLOYEE >=", value, "numberEmployee");
            return (Criteria) this;
        }

        public Criteria andNumberEmployeeLessThan(Long value) {
            addCriterion("NUMBER_EMPLOYEE <", value, "numberEmployee");
            return (Criteria) this;
        }

        public Criteria andNumberEmployeeLessThanOrEqualTo(Long value) {
            addCriterion("NUMBER_EMPLOYEE <=", value, "numberEmployee");
            return (Criteria) this;
        }

        public Criteria andNumberEmployeeIn(List<Long> values) {
            addCriterion("NUMBER_EMPLOYEE in", values, "numberEmployee");
            return (Criteria) this;
        }

        public Criteria andNumberEmployeeNotIn(List<Long> values) {
            addCriterion("NUMBER_EMPLOYEE not in", values, "numberEmployee");
            return (Criteria) this;
        }

        public Criteria andNumberEmployeeBetween(Long value1, Long value2) {
            addCriterion("NUMBER_EMPLOYEE between", value1, value2, "numberEmployee");
            return (Criteria) this;
        }

        public Criteria andNumberEmployeeNotBetween(Long value1, Long value2) {
            addCriterion("NUMBER_EMPLOYEE not between", value1, value2, "numberEmployee");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNull() {
            addCriterion("INDUSTRY_ID is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNotNull() {
            addCriterion("INDUSTRY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdEqualTo(Long value) {
            addCriterion("INDUSTRY_ID =", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotEqualTo(Long value) {
            addCriterion("INDUSTRY_ID <>", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThan(Long value) {
            addCriterion("INDUSTRY_ID >", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("INDUSTRY_ID >=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThan(Long value) {
            addCriterion("INDUSTRY_ID <", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThanOrEqualTo(Long value) {
            addCriterion("INDUSTRY_ID <=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIn(List<Long> values) {
            addCriterion("INDUSTRY_ID in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotIn(List<Long> values) {
            addCriterion("INDUSTRY_ID not in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdBetween(Long value1, Long value2) {
            addCriterion("INDUSTRY_ID between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotBetween(Long value1, Long value2) {
            addCriterion("INDUSTRY_ID not between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNull() {
            addCriterion("CUSTOMER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("CUSTOMER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(String value) {
            addCriterion("CUSTOMER_TYPE >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(String value) {
            addCriterion("CUSTOMER_TYPE <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLike(String value) {
            addCriterion("CUSTOMER_TYPE like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotLike(String value) {
            addCriterion("CUSTOMER_TYPE not like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<String> values) {
            addCriterion("CUSTOMER_TYPE in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<String> values) {
            addCriterion("CUSTOMER_TYPE not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(String value1, String value2) {
            addCriterion("CUSTOMER_TYPE between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_TYPE not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerStateIsNull() {
            addCriterion("CUSTOMER_STATE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStateIsNotNull() {
            addCriterion("CUSTOMER_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStateEqualTo(String value) {
            addCriterion("CUSTOMER_STATE =", value, "customerState");
            return (Criteria) this;
        }

        public Criteria andCustomerStateNotEqualTo(String value) {
            addCriterion("CUSTOMER_STATE <>", value, "customerState");
            return (Criteria) this;
        }

        public Criteria andCustomerStateGreaterThan(String value) {
            addCriterion("CUSTOMER_STATE >", value, "customerState");
            return (Criteria) this;
        }

        public Criteria andCustomerStateGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_STATE >=", value, "customerState");
            return (Criteria) this;
        }

        public Criteria andCustomerStateLessThan(String value) {
            addCriterion("CUSTOMER_STATE <", value, "customerState");
            return (Criteria) this;
        }

        public Criteria andCustomerStateLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_STATE <=", value, "customerState");
            return (Criteria) this;
        }

        public Criteria andCustomerStateLike(String value) {
            addCriterion("CUSTOMER_STATE like", value, "customerState");
            return (Criteria) this;
        }

        public Criteria andCustomerStateNotLike(String value) {
            addCriterion("CUSTOMER_STATE not like", value, "customerState");
            return (Criteria) this;
        }

        public Criteria andCustomerStateIn(List<String> values) {
            addCriterion("CUSTOMER_STATE in", values, "customerState");
            return (Criteria) this;
        }

        public Criteria andCustomerStateNotIn(List<String> values) {
            addCriterion("CUSTOMER_STATE not in", values, "customerState");
            return (Criteria) this;
        }

        public Criteria andCustomerStateBetween(String value1, String value2) {
            addCriterion("CUSTOMER_STATE between", value1, value2, "customerState");
            return (Criteria) this;
        }

        public Criteria andCustomerStateNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_STATE not between", value1, value2, "customerState");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceIsNull() {
            addCriterion("CUSTOMER_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceIsNotNull() {
            addCriterion("CUSTOMER_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceEqualTo(String value) {
            addCriterion("CUSTOMER_SOURCE =", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceNotEqualTo(String value) {
            addCriterion("CUSTOMER_SOURCE <>", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceGreaterThan(String value) {
            addCriterion("CUSTOMER_SOURCE >", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_SOURCE >=", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceLessThan(String value) {
            addCriterion("CUSTOMER_SOURCE <", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_SOURCE <=", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceLike(String value) {
            addCriterion("CUSTOMER_SOURCE like", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceNotLike(String value) {
            addCriterion("CUSTOMER_SOURCE not like", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceIn(List<String> values) {
            addCriterion("CUSTOMER_SOURCE in", values, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceNotIn(List<String> values) {
            addCriterion("CUSTOMER_SOURCE not in", values, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceBetween(String value1, String value2) {
            addCriterion("CUSTOMER_SOURCE between", value1, value2, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_SOURCE not between", value1, value2, "customerSource");
            return (Criteria) this;
        }

        public Criteria andHeadIdIsNull() {
            addCriterion("HEAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andHeadIdIsNotNull() {
            addCriterion("HEAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHeadIdEqualTo(Long value) {
            addCriterion("HEAD_ID =", value, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdNotEqualTo(Long value) {
            addCriterion("HEAD_ID <>", value, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdGreaterThan(Long value) {
            addCriterion("HEAD_ID >", value, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("HEAD_ID >=", value, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdLessThan(Long value) {
            addCriterion("HEAD_ID <", value, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdLessThanOrEqualTo(Long value) {
            addCriterion("HEAD_ID <=", value, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdIn(List<Long> values) {
            addCriterion("HEAD_ID in", values, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdNotIn(List<Long> values) {
            addCriterion("HEAD_ID not in", values, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdBetween(Long value1, Long value2) {
            addCriterion("HEAD_ID between", value1, value2, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdNotBetween(Long value1, Long value2) {
            addCriterion("HEAD_ID not between", value1, value2, "headId");
            return (Criteria) this;
        }

        public Criteria andPhoneFixedIsNull() {
            addCriterion("PHONE_FIXED is null");
            return (Criteria) this;
        }

        public Criteria andPhoneFixedIsNotNull() {
            addCriterion("PHONE_FIXED is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneFixedEqualTo(String value) {
            addCriterion("PHONE_FIXED =", value, "phoneFixed");
            return (Criteria) this;
        }

        public Criteria andPhoneFixedNotEqualTo(String value) {
            addCriterion("PHONE_FIXED <>", value, "phoneFixed");
            return (Criteria) this;
        }

        public Criteria andPhoneFixedGreaterThan(String value) {
            addCriterion("PHONE_FIXED >", value, "phoneFixed");
            return (Criteria) this;
        }

        public Criteria andPhoneFixedGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_FIXED >=", value, "phoneFixed");
            return (Criteria) this;
        }

        public Criteria andPhoneFixedLessThan(String value) {
            addCriterion("PHONE_FIXED <", value, "phoneFixed");
            return (Criteria) this;
        }

        public Criteria andPhoneFixedLessThanOrEqualTo(String value) {
            addCriterion("PHONE_FIXED <=", value, "phoneFixed");
            return (Criteria) this;
        }

        public Criteria andPhoneFixedLike(String value) {
            addCriterion("PHONE_FIXED like", value, "phoneFixed");
            return (Criteria) this;
        }

        public Criteria andPhoneFixedNotLike(String value) {
            addCriterion("PHONE_FIXED not like", value, "phoneFixed");
            return (Criteria) this;
        }

        public Criteria andPhoneFixedIn(List<String> values) {
            addCriterion("PHONE_FIXED in", values, "phoneFixed");
            return (Criteria) this;
        }

        public Criteria andPhoneFixedNotIn(List<String> values) {
            addCriterion("PHONE_FIXED not in", values, "phoneFixed");
            return (Criteria) this;
        }

        public Criteria andPhoneFixedBetween(String value1, String value2) {
            addCriterion("PHONE_FIXED between", value1, value2, "phoneFixed");
            return (Criteria) this;
        }

        public Criteria andPhoneFixedNotBetween(String value1, String value2) {
            addCriterion("PHONE_FIXED not between", value1, value2, "phoneFixed");
            return (Criteria) this;
        }

        public Criteria andPhoneMoveIsNull() {
            addCriterion("PHONE_MOVE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneMoveIsNotNull() {
            addCriterion("PHONE_MOVE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneMoveEqualTo(String value) {
            addCriterion("PHONE_MOVE =", value, "phoneMove");
            return (Criteria) this;
        }

        public Criteria andPhoneMoveNotEqualTo(String value) {
            addCriterion("PHONE_MOVE <>", value, "phoneMove");
            return (Criteria) this;
        }

        public Criteria andPhoneMoveGreaterThan(String value) {
            addCriterion("PHONE_MOVE >", value, "phoneMove");
            return (Criteria) this;
        }

        public Criteria andPhoneMoveGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_MOVE >=", value, "phoneMove");
            return (Criteria) this;
        }

        public Criteria andPhoneMoveLessThan(String value) {
            addCriterion("PHONE_MOVE <", value, "phoneMove");
            return (Criteria) this;
        }

        public Criteria andPhoneMoveLessThanOrEqualTo(String value) {
            addCriterion("PHONE_MOVE <=", value, "phoneMove");
            return (Criteria) this;
        }

        public Criteria andPhoneMoveLike(String value) {
            addCriterion("PHONE_MOVE like", value, "phoneMove");
            return (Criteria) this;
        }

        public Criteria andPhoneMoveNotLike(String value) {
            addCriterion("PHONE_MOVE not like", value, "phoneMove");
            return (Criteria) this;
        }

        public Criteria andPhoneMoveIn(List<String> values) {
            addCriterion("PHONE_MOVE in", values, "phoneMove");
            return (Criteria) this;
        }

        public Criteria andPhoneMoveNotIn(List<String> values) {
            addCriterion("PHONE_MOVE not in", values, "phoneMove");
            return (Criteria) this;
        }

        public Criteria andPhoneMoveBetween(String value1, String value2) {
            addCriterion("PHONE_MOVE between", value1, value2, "phoneMove");
            return (Criteria) this;
        }

        public Criteria andPhoneMoveNotBetween(String value1, String value2) {
            addCriterion("PHONE_MOVE not between", value1, value2, "phoneMove");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxsIsNull() {
            addCriterion("CUSTOMER_FAXs is null");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxsIsNotNull() {
            addCriterion("CUSTOMER_FAXs is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxsEqualTo(String value) {
            addCriterion("CUSTOMER_FAXs =", value, "customerFaxs");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxsNotEqualTo(String value) {
            addCriterion("CUSTOMER_FAXs <>", value, "customerFaxs");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxsGreaterThan(String value) {
            addCriterion("CUSTOMER_FAXs >", value, "customerFaxs");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxsGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_FAXs >=", value, "customerFaxs");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxsLessThan(String value) {
            addCriterion("CUSTOMER_FAXs <", value, "customerFaxs");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxsLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_FAXs <=", value, "customerFaxs");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxsLike(String value) {
            addCriterion("CUSTOMER_FAXs like", value, "customerFaxs");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxsNotLike(String value) {
            addCriterion("CUSTOMER_FAXs not like", value, "customerFaxs");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxsIn(List<String> values) {
            addCriterion("CUSTOMER_FAXs in", values, "customerFaxs");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxsNotIn(List<String> values) {
            addCriterion("CUSTOMER_FAXs not in", values, "customerFaxs");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxsBetween(String value1, String value2) {
            addCriterion("CUSTOMER_FAXs between", value1, value2, "customerFaxs");
            return (Criteria) this;
        }

        public Criteria andCustomerFaxsNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_FAXs not between", value1, value2, "customerFaxs");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("BANK is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("BANK is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("BANK =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("BANK <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("BANK >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("BANK >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("BANK <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("BANK <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("BANK like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("BANK not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("BANK in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("BANK not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("BANK between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("BANK not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("BANK_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("BANK_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("BANK_ACCOUNT =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("BANK_ACCOUNT >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("BANK_ACCOUNT <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("BANK_ACCOUNT like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("BANK_ACCOUNT not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("BANK_ACCOUNT in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("BANK_ACCOUNT not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andNextContactDateIsNull() {
            addCriterion("NEXT_CONTACT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andNextContactDateIsNotNull() {
            addCriterion("NEXT_CONTACT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andNextContactDateEqualTo(Date value) {
            addCriterion("NEXT_CONTACT_DATE =", value, "nextContactDate");
            return (Criteria) this;
        }

        public Criteria andNextContactDateNotEqualTo(Date value) {
            addCriterion("NEXT_CONTACT_DATE <>", value, "nextContactDate");
            return (Criteria) this;
        }

        public Criteria andNextContactDateGreaterThan(Date value) {
            addCriterion("NEXT_CONTACT_DATE >", value, "nextContactDate");
            return (Criteria) this;
        }

        public Criteria andNextContactDateGreaterThanOrEqualTo(Date value) {
            addCriterion("NEXT_CONTACT_DATE >=", value, "nextContactDate");
            return (Criteria) this;
        }

        public Criteria andNextContactDateLessThan(Date value) {
            addCriterion("NEXT_CONTACT_DATE <", value, "nextContactDate");
            return (Criteria) this;
        }

        public Criteria andNextContactDateLessThanOrEqualTo(Date value) {
            addCriterion("NEXT_CONTACT_DATE <=", value, "nextContactDate");
            return (Criteria) this;
        }

        public Criteria andNextContactDateIn(List<Date> values) {
            addCriterion("NEXT_CONTACT_DATE in", values, "nextContactDate");
            return (Criteria) this;
        }

        public Criteria andNextContactDateNotIn(List<Date> values) {
            addCriterion("NEXT_CONTACT_DATE not in", values, "nextContactDate");
            return (Criteria) this;
        }

        public Criteria andNextContactDateBetween(Date value1, Date value2) {
            addCriterion("NEXT_CONTACT_DATE between", value1, value2, "nextContactDate");
            return (Criteria) this;
        }

        public Criteria andNextContactDateNotBetween(Date value1, Date value2) {
            addCriterion("NEXT_CONTACT_DATE not between", value1, value2, "nextContactDate");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andSicCodeIsNull() {
            addCriterion("SIC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSicCodeIsNotNull() {
            addCriterion("SIC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSicCodeEqualTo(String value) {
            addCriterion("SIC_CODE =", value, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeNotEqualTo(String value) {
            addCriterion("SIC_CODE <>", value, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeGreaterThan(String value) {
            addCriterion("SIC_CODE >", value, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SIC_CODE >=", value, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeLessThan(String value) {
            addCriterion("SIC_CODE <", value, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeLessThanOrEqualTo(String value) {
            addCriterion("SIC_CODE <=", value, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeLike(String value) {
            addCriterion("SIC_CODE like", value, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeNotLike(String value) {
            addCriterion("SIC_CODE not like", value, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeIn(List<String> values) {
            addCriterion("SIC_CODE in", values, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeNotIn(List<String> values) {
            addCriterion("SIC_CODE not in", values, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeBetween(String value1, String value2) {
            addCriterion("SIC_CODE between", value1, value2, "sicCode");
            return (Criteria) this;
        }

        public Criteria andSicCodeNotBetween(String value1, String value2) {
            addCriterion("SIC_CODE not between", value1, value2, "sicCode");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("PAY_WAY is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("PAY_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(String value) {
            addCriterion("PAY_WAY =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(String value) {
            addCriterion("PAY_WAY <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(String value) {
            addCriterion("PAY_WAY >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_WAY >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(String value) {
            addCriterion("PAY_WAY <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(String value) {
            addCriterion("PAY_WAY <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLike(String value) {
            addCriterion("PAY_WAY like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotLike(String value) {
            addCriterion("PAY_WAY not like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<String> values) {
            addCriterion("PAY_WAY in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<String> values) {
            addCriterion("PAY_WAY not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(String value1, String value2) {
            addCriterion("PAY_WAY between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(String value1, String value2) {
            addCriterion("PAY_WAY not between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIsNull() {
            addCriterion("IS_EFFECTIVE is null");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIsNotNull() {
            addCriterion("IS_EFFECTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveEqualTo(String value) {
            addCriterion("IS_EFFECTIVE =", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotEqualTo(String value) {
            addCriterion("IS_EFFECTIVE <>", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveGreaterThan(String value) {
            addCriterion("IS_EFFECTIVE >", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveGreaterThanOrEqualTo(String value) {
            addCriterion("IS_EFFECTIVE >=", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLessThan(String value) {
            addCriterion("IS_EFFECTIVE <", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLessThanOrEqualTo(String value) {
            addCriterion("IS_EFFECTIVE <=", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLike(String value) {
            addCriterion("IS_EFFECTIVE like", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotLike(String value) {
            addCriterion("IS_EFFECTIVE not like", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIn(List<String> values) {
            addCriterion("IS_EFFECTIVE in", values, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotIn(List<String> values) {
            addCriterion("IS_EFFECTIVE not in", values, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveBetween(String value1, String value2) {
            addCriterion("IS_EFFECTIVE between", value1, value2, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotBetween(String value1, String value2) {
            addCriterion("IS_EFFECTIVE not between", value1, value2, "isEffective");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIsNull() {
            addCriterion("ADDRESS_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIsNotNull() {
            addCriterion("ADDRESS_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailEqualTo(String value) {
            addCriterion("ADDRESS_DETAIL =", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotEqualTo(String value) {
            addCriterion("ADDRESS_DETAIL <>", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailGreaterThan(String value) {
            addCriterion("ADDRESS_DETAIL >", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_DETAIL >=", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLessThan(String value) {
            addCriterion("ADDRESS_DETAIL <", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_DETAIL <=", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLike(String value) {
            addCriterion("ADDRESS_DETAIL like", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotLike(String value) {
            addCriterion("ADDRESS_DETAIL not like", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIn(List<String> values) {
            addCriterion("ADDRESS_DETAIL in", values, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotIn(List<String> values) {
            addCriterion("ADDRESS_DETAIL not in", values, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailBetween(String value1, String value2) {
            addCriterion("ADDRESS_DETAIL between", value1, value2, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_DETAIL not between", value1, value2, "addressDetail");
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