package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KcGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KcGoodsExample() {
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

        public Criteria andGoodsNameIsNull() {
            addCriterion("GOODS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("GOODS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("GOODS_NAME =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("GOODS_NAME <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("GOODS_NAME >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("GOODS_NAME <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("GOODS_NAME like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("GOODS_NAME not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("GOODS_NAME in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("GOODS_NAME not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("GOODS_NAME between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("GOODS_NAME not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsKindIsNull() {
            addCriterion("GOODS_KIND is null");
            return (Criteria) this;
        }

        public Criteria andGoodsKindIsNotNull() {
            addCriterion("GOODS_KIND is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsKindEqualTo(String value) {
            addCriterion("GOODS_KIND =", value, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsKindNotEqualTo(String value) {
            addCriterion("GOODS_KIND <>", value, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsKindGreaterThan(String value) {
            addCriterion("GOODS_KIND >", value, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsKindGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_KIND >=", value, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsKindLessThan(String value) {
            addCriterion("GOODS_KIND <", value, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsKindLessThanOrEqualTo(String value) {
            addCriterion("GOODS_KIND <=", value, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsKindLike(String value) {
            addCriterion("GOODS_KIND like", value, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsKindNotLike(String value) {
            addCriterion("GOODS_KIND not like", value, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsKindIn(List<String> values) {
            addCriterion("GOODS_KIND in", values, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsKindNotIn(List<String> values) {
            addCriterion("GOODS_KIND not in", values, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsKindBetween(String value1, String value2) {
            addCriterion("GOODS_KIND between", value1, value2, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsKindNotBetween(String value1, String value2) {
            addCriterion("GOODS_KIND not between", value1, value2, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsExplainIsNull() {
            addCriterion("GOODS_EXPLAIN is null");
            return (Criteria) this;
        }

        public Criteria andGoodsExplainIsNotNull() {
            addCriterion("GOODS_EXPLAIN is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsExplainEqualTo(String value) {
            addCriterion("GOODS_EXPLAIN =", value, "goodsExplain");
            return (Criteria) this;
        }

        public Criteria andGoodsExplainNotEqualTo(String value) {
            addCriterion("GOODS_EXPLAIN <>", value, "goodsExplain");
            return (Criteria) this;
        }

        public Criteria andGoodsExplainGreaterThan(String value) {
            addCriterion("GOODS_EXPLAIN >", value, "goodsExplain");
            return (Criteria) this;
        }

        public Criteria andGoodsExplainGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_EXPLAIN >=", value, "goodsExplain");
            return (Criteria) this;
        }

        public Criteria andGoodsExplainLessThan(String value) {
            addCriterion("GOODS_EXPLAIN <", value, "goodsExplain");
            return (Criteria) this;
        }

        public Criteria andGoodsExplainLessThanOrEqualTo(String value) {
            addCriterion("GOODS_EXPLAIN <=", value, "goodsExplain");
            return (Criteria) this;
        }

        public Criteria andGoodsExplainLike(String value) {
            addCriterion("GOODS_EXPLAIN like", value, "goodsExplain");
            return (Criteria) this;
        }

        public Criteria andGoodsExplainNotLike(String value) {
            addCriterion("GOODS_EXPLAIN not like", value, "goodsExplain");
            return (Criteria) this;
        }

        public Criteria andGoodsExplainIn(List<String> values) {
            addCriterion("GOODS_EXPLAIN in", values, "goodsExplain");
            return (Criteria) this;
        }

        public Criteria andGoodsExplainNotIn(List<String> values) {
            addCriterion("GOODS_EXPLAIN not in", values, "goodsExplain");
            return (Criteria) this;
        }

        public Criteria andGoodsExplainBetween(String value1, String value2) {
            addCriterion("GOODS_EXPLAIN between", value1, value2, "goodsExplain");
            return (Criteria) this;
        }

        public Criteria andGoodsExplainNotBetween(String value1, String value2) {
            addCriterion("GOODS_EXPLAIN not between", value1, value2, "goodsExplain");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNull() {
            addCriterion("GOODS_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNotNull() {
            addCriterion("GOODS_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitEqualTo(String value) {
            addCriterion("GOODS_UNIT =", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotEqualTo(String value) {
            addCriterion("GOODS_UNIT <>", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThan(String value) {
            addCriterion("GOODS_UNIT >", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_UNIT >=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThan(String value) {
            addCriterion("GOODS_UNIT <", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThanOrEqualTo(String value) {
            addCriterion("GOODS_UNIT <=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLike(String value) {
            addCriterion("GOODS_UNIT like", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotLike(String value) {
            addCriterion("GOODS_UNIT not like", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIn(List<String> values) {
            addCriterion("GOODS_UNIT in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotIn(List<String> values) {
            addCriterion("GOODS_UNIT not in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitBetween(String value1, String value2) {
            addCriterion("GOODS_UNIT between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotBetween(String value1, String value2) {
            addCriterion("GOODS_UNIT not between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andDepotIdIsNull() {
            addCriterion("DEPOT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepotIdIsNotNull() {
            addCriterion("DEPOT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepotIdEqualTo(String value) {
            addCriterion("DEPOT_ID =", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdNotEqualTo(String value) {
            addCriterion("DEPOT_ID <>", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdGreaterThan(String value) {
            addCriterion("DEPOT_ID >", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPOT_ID >=", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdLessThan(String value) {
            addCriterion("DEPOT_ID <", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdLessThanOrEqualTo(String value) {
            addCriterion("DEPOT_ID <=", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdLike(String value) {
            addCriterion("DEPOT_ID like", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdNotLike(String value) {
            addCriterion("DEPOT_ID not like", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdIn(List<String> values) {
            addCriterion("DEPOT_ID in", values, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdNotIn(List<String> values) {
            addCriterion("DEPOT_ID not in", values, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdBetween(String value1, String value2) {
            addCriterion("DEPOT_ID between", value1, value2, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdNotBetween(String value1, String value2) {
            addCriterion("DEPOT_ID not between", value1, value2, "depotId");
            return (Criteria) this;
        }

        public Criteria andStockNumberIsNull() {
            addCriterion("STOCK_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andStockNumberIsNotNull() {
            addCriterion("STOCK_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andStockNumberEqualTo(String value) {
            addCriterion("STOCK_NUMBER =", value, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberNotEqualTo(String value) {
            addCriterion("STOCK_NUMBER <>", value, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberGreaterThan(String value) {
            addCriterion("STOCK_NUMBER >", value, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberGreaterThanOrEqualTo(String value) {
            addCriterion("STOCK_NUMBER >=", value, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberLessThan(String value) {
            addCriterion("STOCK_NUMBER <", value, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberLessThanOrEqualTo(String value) {
            addCriterion("STOCK_NUMBER <=", value, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberLike(String value) {
            addCriterion("STOCK_NUMBER like", value, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberNotLike(String value) {
            addCriterion("STOCK_NUMBER not like", value, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberIn(List<String> values) {
            addCriterion("STOCK_NUMBER in", values, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberNotIn(List<String> values) {
            addCriterion("STOCK_NUMBER not in", values, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberBetween(String value1, String value2) {
            addCriterion("STOCK_NUMBER between", value1, value2, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andStockNumberNotBetween(String value1, String value2) {
            addCriterion("STOCK_NUMBER not between", value1, value2, "stockNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsCostIsNull() {
            addCriterion("GOODS_COST is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCostIsNotNull() {
            addCriterion("GOODS_COST is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCostEqualTo(String value) {
            addCriterion("GOODS_COST =", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostNotEqualTo(String value) {
            addCriterion("GOODS_COST <>", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostGreaterThan(String value) {
            addCriterion("GOODS_COST >", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_COST >=", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostLessThan(String value) {
            addCriterion("GOODS_COST <", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostLessThanOrEqualTo(String value) {
            addCriterion("GOODS_COST <=", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostLike(String value) {
            addCriterion("GOODS_COST like", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostNotLike(String value) {
            addCriterion("GOODS_COST not like", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostIn(List<String> values) {
            addCriterion("GOODS_COST in", values, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostNotIn(List<String> values) {
            addCriterion("GOODS_COST not in", values, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostBetween(String value1, String value2) {
            addCriterion("GOODS_COST between", value1, value2, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostNotBetween(String value1, String value2) {
            addCriterion("GOODS_COST not between", value1, value2, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleIsNull() {
            addCriterion("GOODS_SALE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleIsNotNull() {
            addCriterion("GOODS_SALE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleEqualTo(String value) {
            addCriterion("GOODS_SALE =", value, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNotEqualTo(String value) {
            addCriterion("GOODS_SALE <>", value, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleGreaterThan(String value) {
            addCriterion("GOODS_SALE >", value, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_SALE >=", value, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleLessThan(String value) {
            addCriterion("GOODS_SALE <", value, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleLessThanOrEqualTo(String value) {
            addCriterion("GOODS_SALE <=", value, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleLike(String value) {
            addCriterion("GOODS_SALE like", value, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNotLike(String value) {
            addCriterion("GOODS_SALE not like", value, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleIn(List<String> values) {
            addCriterion("GOODS_SALE in", values, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNotIn(List<String> values) {
            addCriterion("GOODS_SALE not in", values, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleBetween(String value1, String value2) {
            addCriterion("GOODS_SALE between", value1, value2, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNotBetween(String value1, String value2) {
            addCriterion("GOODS_SALE not between", value1, value2, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleIsNull() {
            addCriterion("GOODS_MIDDLE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleIsNotNull() {
            addCriterion("GOODS_MIDDLE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleEqualTo(String value) {
            addCriterion("GOODS_MIDDLE =", value, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleNotEqualTo(String value) {
            addCriterion("GOODS_MIDDLE <>", value, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleGreaterThan(String value) {
            addCriterion("GOODS_MIDDLE >", value, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_MIDDLE >=", value, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleLessThan(String value) {
            addCriterion("GOODS_MIDDLE <", value, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleLessThanOrEqualTo(String value) {
            addCriterion("GOODS_MIDDLE <=", value, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleLike(String value) {
            addCriterion("GOODS_MIDDLE like", value, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleNotLike(String value) {
            addCriterion("GOODS_MIDDLE not like", value, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleIn(List<String> values) {
            addCriterion("GOODS_MIDDLE in", values, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleNotIn(List<String> values) {
            addCriterion("GOODS_MIDDLE not in", values, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleBetween(String value1, String value2) {
            addCriterion("GOODS_MIDDLE between", value1, value2, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleNotBetween(String value1, String value2) {
            addCriterion("GOODS_MIDDLE not between", value1, value2, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageIsNull() {
            addCriterion("REMARK_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageIsNotNull() {
            addCriterion("REMARK_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageEqualTo(String value) {
            addCriterion("REMARK_MESSAGE =", value, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageNotEqualTo(String value) {
            addCriterion("REMARK_MESSAGE <>", value, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageGreaterThan(String value) {
            addCriterion("REMARK_MESSAGE >", value, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK_MESSAGE >=", value, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageLessThan(String value) {
            addCriterion("REMARK_MESSAGE <", value, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageLessThanOrEqualTo(String value) {
            addCriterion("REMARK_MESSAGE <=", value, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageLike(String value) {
            addCriterion("REMARK_MESSAGE like", value, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageNotLike(String value) {
            addCriterion("REMARK_MESSAGE not like", value, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageIn(List<String> values) {
            addCriterion("REMARK_MESSAGE in", values, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageNotIn(List<String> values) {
            addCriterion("REMARK_MESSAGE not in", values, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageBetween(String value1, String value2) {
            addCriterion("REMARK_MESSAGE between", value1, value2, "remarkMessage");
            return (Criteria) this;
        }

        public Criteria andRemarkMessageNotBetween(String value1, String value2) {
            addCriterion("REMARK_MESSAGE not between", value1, value2, "remarkMessage");
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

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("COMPANY_ID like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("COMPANY_ID not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIsNull() {
            addCriterion("LAST_MODIFIED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIsNotNull() {
            addCriterion("LAST_MODIFIED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_TIME =", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_TIME <>", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeGreaterThan(Date value) {
            addCriterion("LAST_MODIFIED_TIME >", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_TIME >=", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeLessThan(Date value) {
            addCriterion("LAST_MODIFIED_TIME <", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_TIME <=", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIn(List<Date> values) {
            addCriterion("LAST_MODIFIED_TIME in", values, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotIn(List<Date> values) {
            addCriterion("LAST_MODIFIED_TIME not in", values, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED_TIME between", value1, value2, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED_TIME not between", value1, value2, "lastModifiedTime");
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