package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CgSupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CgSupplierExample() {
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

        public Criteria andSupplierIdIsNull() {
            addCriterion("SUPPLIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("SUPPLIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Long value) {
            addCriterion("SUPPLIER_ID =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Long value) {
            addCriterion("SUPPLIER_ID <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Long value) {
            addCriterion("SUPPLIER_ID >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SUPPLIER_ID >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Long value) {
            addCriterion("SUPPLIER_ID <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Long value) {
            addCriterion("SUPPLIER_ID <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Long> values) {
            addCriterion("SUPPLIER_ID in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Long> values) {
            addCriterion("SUPPLIER_ID not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Long value1, Long value2) {
            addCriterion("SUPPLIER_ID between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Long value1, Long value2) {
            addCriterion("SUPPLIER_ID not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("SUPPLIER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("SUPPLIER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("SUPPLIER_NAME =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("SUPPLIER_NAME <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("SUPPLIER_NAME >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NAME >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("SUPPLIER_NAME <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NAME <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("SUPPLIER_NAME like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("SUPPLIER_NAME not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("SUPPLIER_NAME in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("SUPPLIER_NAME not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NAME between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NAME not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierFnameIsNull() {
            addCriterion("SUPPLIER_FNAME is null");
            return (Criteria) this;
        }

        public Criteria andSupplierFnameIsNotNull() {
            addCriterion("SUPPLIER_FNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierFnameEqualTo(String value) {
            addCriterion("SUPPLIER_FNAME =", value, "supplierFname");
            return (Criteria) this;
        }

        public Criteria andSupplierFnameNotEqualTo(String value) {
            addCriterion("SUPPLIER_FNAME <>", value, "supplierFname");
            return (Criteria) this;
        }

        public Criteria andSupplierFnameGreaterThan(String value) {
            addCriterion("SUPPLIER_FNAME >", value, "supplierFname");
            return (Criteria) this;
        }

        public Criteria andSupplierFnameGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_FNAME >=", value, "supplierFname");
            return (Criteria) this;
        }

        public Criteria andSupplierFnameLessThan(String value) {
            addCriterion("SUPPLIER_FNAME <", value, "supplierFname");
            return (Criteria) this;
        }

        public Criteria andSupplierFnameLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_FNAME <=", value, "supplierFname");
            return (Criteria) this;
        }

        public Criteria andSupplierFnameLike(String value) {
            addCriterion("SUPPLIER_FNAME like", value, "supplierFname");
            return (Criteria) this;
        }

        public Criteria andSupplierFnameNotLike(String value) {
            addCriterion("SUPPLIER_FNAME not like", value, "supplierFname");
            return (Criteria) this;
        }

        public Criteria andSupplierFnameIn(List<String> values) {
            addCriterion("SUPPLIER_FNAME in", values, "supplierFname");
            return (Criteria) this;
        }

        public Criteria andSupplierFnameNotIn(List<String> values) {
            addCriterion("SUPPLIER_FNAME not in", values, "supplierFname");
            return (Criteria) this;
        }

        public Criteria andSupplierFnameBetween(String value1, String value2) {
            addCriterion("SUPPLIER_FNAME between", value1, value2, "supplierFname");
            return (Criteria) this;
        }

        public Criteria andSupplierFnameNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_FNAME not between", value1, value2, "supplierFname");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsIsNull() {
            addCriterion("SUPPLIER_CONTACTS is null");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsIsNotNull() {
            addCriterion("SUPPLIER_CONTACTS is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsEqualTo(String value) {
            addCriterion("SUPPLIER_CONTACTS =", value, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNotEqualTo(String value) {
            addCriterion("SUPPLIER_CONTACTS <>", value, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsGreaterThan(String value) {
            addCriterion("SUPPLIER_CONTACTS >", value, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_CONTACTS >=", value, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsLessThan(String value) {
            addCriterion("SUPPLIER_CONTACTS <", value, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_CONTACTS <=", value, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsLike(String value) {
            addCriterion("SUPPLIER_CONTACTS like", value, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNotLike(String value) {
            addCriterion("SUPPLIER_CONTACTS not like", value, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsIn(List<String> values) {
            addCriterion("SUPPLIER_CONTACTS in", values, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNotIn(List<String> values) {
            addCriterion("SUPPLIER_CONTACTS not in", values, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsBetween(String value1, String value2) {
            addCriterion("SUPPLIER_CONTACTS between", value1, value2, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_CONTACTS not between", value1, value2, "supplierContacts");
            return (Criteria) this;
        }

        public Criteria andSupplierFixedIsNull() {
            addCriterion("SUPPLIER_FIXED is null");
            return (Criteria) this;
        }

        public Criteria andSupplierFixedIsNotNull() {
            addCriterion("SUPPLIER_FIXED is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierFixedEqualTo(String value) {
            addCriterion("SUPPLIER_FIXED =", value, "supplierFixed");
            return (Criteria) this;
        }

        public Criteria andSupplierFixedNotEqualTo(String value) {
            addCriterion("SUPPLIER_FIXED <>", value, "supplierFixed");
            return (Criteria) this;
        }

        public Criteria andSupplierFixedGreaterThan(String value) {
            addCriterion("SUPPLIER_FIXED >", value, "supplierFixed");
            return (Criteria) this;
        }

        public Criteria andSupplierFixedGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_FIXED >=", value, "supplierFixed");
            return (Criteria) this;
        }

        public Criteria andSupplierFixedLessThan(String value) {
            addCriterion("SUPPLIER_FIXED <", value, "supplierFixed");
            return (Criteria) this;
        }

        public Criteria andSupplierFixedLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_FIXED <=", value, "supplierFixed");
            return (Criteria) this;
        }

        public Criteria andSupplierFixedLike(String value) {
            addCriterion("SUPPLIER_FIXED like", value, "supplierFixed");
            return (Criteria) this;
        }

        public Criteria andSupplierFixedNotLike(String value) {
            addCriterion("SUPPLIER_FIXED not like", value, "supplierFixed");
            return (Criteria) this;
        }

        public Criteria andSupplierFixedIn(List<String> values) {
            addCriterion("SUPPLIER_FIXED in", values, "supplierFixed");
            return (Criteria) this;
        }

        public Criteria andSupplierFixedNotIn(List<String> values) {
            addCriterion("SUPPLIER_FIXED not in", values, "supplierFixed");
            return (Criteria) this;
        }

        public Criteria andSupplierFixedBetween(String value1, String value2) {
            addCriterion("SUPPLIER_FIXED between", value1, value2, "supplierFixed");
            return (Criteria) this;
        }

        public Criteria andSupplierFixedNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_FIXED not between", value1, value2, "supplierFixed");
            return (Criteria) this;
        }

        public Criteria andSupplierMobileIsNull() {
            addCriterion("SUPPLIER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andSupplierMobileIsNotNull() {
            addCriterion("SUPPLIER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierMobileEqualTo(String value) {
            addCriterion("SUPPLIER_MOBILE =", value, "supplierMobile");
            return (Criteria) this;
        }

        public Criteria andSupplierMobileNotEqualTo(String value) {
            addCriterion("SUPPLIER_MOBILE <>", value, "supplierMobile");
            return (Criteria) this;
        }

        public Criteria andSupplierMobileGreaterThan(String value) {
            addCriterion("SUPPLIER_MOBILE >", value, "supplierMobile");
            return (Criteria) this;
        }

        public Criteria andSupplierMobileGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_MOBILE >=", value, "supplierMobile");
            return (Criteria) this;
        }

        public Criteria andSupplierMobileLessThan(String value) {
            addCriterion("SUPPLIER_MOBILE <", value, "supplierMobile");
            return (Criteria) this;
        }

        public Criteria andSupplierMobileLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_MOBILE <=", value, "supplierMobile");
            return (Criteria) this;
        }

        public Criteria andSupplierMobileLike(String value) {
            addCriterion("SUPPLIER_MOBILE like", value, "supplierMobile");
            return (Criteria) this;
        }

        public Criteria andSupplierMobileNotLike(String value) {
            addCriterion("SUPPLIER_MOBILE not like", value, "supplierMobile");
            return (Criteria) this;
        }

        public Criteria andSupplierMobileIn(List<String> values) {
            addCriterion("SUPPLIER_MOBILE in", values, "supplierMobile");
            return (Criteria) this;
        }

        public Criteria andSupplierMobileNotIn(List<String> values) {
            addCriterion("SUPPLIER_MOBILE not in", values, "supplierMobile");
            return (Criteria) this;
        }

        public Criteria andSupplierMobileBetween(String value1, String value2) {
            addCriterion("SUPPLIER_MOBILE between", value1, value2, "supplierMobile");
            return (Criteria) this;
        }

        public Criteria andSupplierMobileNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_MOBILE not between", value1, value2, "supplierMobile");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxIsNull() {
            addCriterion("SUPPLIER_FAX is null");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxIsNotNull() {
            addCriterion("SUPPLIER_FAX is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxEqualTo(String value) {
            addCriterion("SUPPLIER_FAX =", value, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxNotEqualTo(String value) {
            addCriterion("SUPPLIER_FAX <>", value, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxGreaterThan(String value) {
            addCriterion("SUPPLIER_FAX >", value, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_FAX >=", value, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxLessThan(String value) {
            addCriterion("SUPPLIER_FAX <", value, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_FAX <=", value, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxLike(String value) {
            addCriterion("SUPPLIER_FAX like", value, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxNotLike(String value) {
            addCriterion("SUPPLIER_FAX not like", value, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxIn(List<String> values) {
            addCriterion("SUPPLIER_FAX in", values, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxNotIn(List<String> values) {
            addCriterion("SUPPLIER_FAX not in", values, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxBetween(String value1, String value2) {
            addCriterion("SUPPLIER_FAX between", value1, value2, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_FAX not between", value1, value2, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressIsNull() {
            addCriterion("SUPPLIER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressIsNotNull() {
            addCriterion("SUPPLIER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressEqualTo(String value) {
            addCriterion("SUPPLIER_ADDRESS =", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNotEqualTo(String value) {
            addCriterion("SUPPLIER_ADDRESS <>", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressGreaterThan(String value) {
            addCriterion("SUPPLIER_ADDRESS >", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ADDRESS >=", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressLessThan(String value) {
            addCriterion("SUPPLIER_ADDRESS <", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ADDRESS <=", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressLike(String value) {
            addCriterion("SUPPLIER_ADDRESS like", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNotLike(String value) {
            addCriterion("SUPPLIER_ADDRESS not like", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressIn(List<String> values) {
            addCriterion("SUPPLIER_ADDRESS in", values, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNotIn(List<String> values) {
            addCriterion("SUPPLIER_ADDRESS not in", values, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ADDRESS between", value1, value2, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ADDRESS not between", value1, value2, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierPostcodeIsNull() {
            addCriterion("SUPPLIER_POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andSupplierPostcodeIsNotNull() {
            addCriterion("SUPPLIER_POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierPostcodeEqualTo(String value) {
            addCriterion("SUPPLIER_POSTCODE =", value, "supplierPostcode");
            return (Criteria) this;
        }

        public Criteria andSupplierPostcodeNotEqualTo(String value) {
            addCriterion("SUPPLIER_POSTCODE <>", value, "supplierPostcode");
            return (Criteria) this;
        }

        public Criteria andSupplierPostcodeGreaterThan(String value) {
            addCriterion("SUPPLIER_POSTCODE >", value, "supplierPostcode");
            return (Criteria) this;
        }

        public Criteria andSupplierPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_POSTCODE >=", value, "supplierPostcode");
            return (Criteria) this;
        }

        public Criteria andSupplierPostcodeLessThan(String value) {
            addCriterion("SUPPLIER_POSTCODE <", value, "supplierPostcode");
            return (Criteria) this;
        }

        public Criteria andSupplierPostcodeLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_POSTCODE <=", value, "supplierPostcode");
            return (Criteria) this;
        }

        public Criteria andSupplierPostcodeLike(String value) {
            addCriterion("SUPPLIER_POSTCODE like", value, "supplierPostcode");
            return (Criteria) this;
        }

        public Criteria andSupplierPostcodeNotLike(String value) {
            addCriterion("SUPPLIER_POSTCODE not like", value, "supplierPostcode");
            return (Criteria) this;
        }

        public Criteria andSupplierPostcodeIn(List<String> values) {
            addCriterion("SUPPLIER_POSTCODE in", values, "supplierPostcode");
            return (Criteria) this;
        }

        public Criteria andSupplierPostcodeNotIn(List<String> values) {
            addCriterion("SUPPLIER_POSTCODE not in", values, "supplierPostcode");
            return (Criteria) this;
        }

        public Criteria andSupplierPostcodeBetween(String value1, String value2) {
            addCriterion("SUPPLIER_POSTCODE between", value1, value2, "supplierPostcode");
            return (Criteria) this;
        }

        public Criteria andSupplierPostcodeNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_POSTCODE not between", value1, value2, "supplierPostcode");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailIsNull() {
            addCriterion("SUPPLIER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailIsNotNull() {
            addCriterion("SUPPLIER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailEqualTo(String value) {
            addCriterion("SUPPLIER_EMAIL =", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailNotEqualTo(String value) {
            addCriterion("SUPPLIER_EMAIL <>", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailGreaterThan(String value) {
            addCriterion("SUPPLIER_EMAIL >", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_EMAIL >=", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailLessThan(String value) {
            addCriterion("SUPPLIER_EMAIL <", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_EMAIL <=", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailLike(String value) {
            addCriterion("SUPPLIER_EMAIL like", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailNotLike(String value) {
            addCriterion("SUPPLIER_EMAIL not like", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailIn(List<String> values) {
            addCriterion("SUPPLIER_EMAIL in", values, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailNotIn(List<String> values) {
            addCriterion("SUPPLIER_EMAIL not in", values, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailBetween(String value1, String value2) {
            addCriterion("SUPPLIER_EMAIL between", value1, value2, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_EMAIL not between", value1, value2, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierBankIsNull() {
            addCriterion("SUPPLIER_BANK is null");
            return (Criteria) this;
        }

        public Criteria andSupplierBankIsNotNull() {
            addCriterion("SUPPLIER_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierBankEqualTo(String value) {
            addCriterion("SUPPLIER_BANK =", value, "supplierBank");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNotEqualTo(String value) {
            addCriterion("SUPPLIER_BANK <>", value, "supplierBank");
            return (Criteria) this;
        }

        public Criteria andSupplierBankGreaterThan(String value) {
            addCriterion("SUPPLIER_BANK >", value, "supplierBank");
            return (Criteria) this;
        }

        public Criteria andSupplierBankGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_BANK >=", value, "supplierBank");
            return (Criteria) this;
        }

        public Criteria andSupplierBankLessThan(String value) {
            addCriterion("SUPPLIER_BANK <", value, "supplierBank");
            return (Criteria) this;
        }

        public Criteria andSupplierBankLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_BANK <=", value, "supplierBank");
            return (Criteria) this;
        }

        public Criteria andSupplierBankLike(String value) {
            addCriterion("SUPPLIER_BANK like", value, "supplierBank");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNotLike(String value) {
            addCriterion("SUPPLIER_BANK not like", value, "supplierBank");
            return (Criteria) this;
        }

        public Criteria andSupplierBankIn(List<String> values) {
            addCriterion("SUPPLIER_BANK in", values, "supplierBank");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNotIn(List<String> values) {
            addCriterion("SUPPLIER_BANK not in", values, "supplierBank");
            return (Criteria) this;
        }

        public Criteria andSupplierBankBetween(String value1, String value2) {
            addCriterion("SUPPLIER_BANK between", value1, value2, "supplierBank");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_BANK not between", value1, value2, "supplierBank");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumIsNull() {
            addCriterion("SUPPLIER_BANK_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumIsNotNull() {
            addCriterion("SUPPLIER_BANK_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumEqualTo(String value) {
            addCriterion("SUPPLIER_BANK_NUM =", value, "supplierBankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumNotEqualTo(String value) {
            addCriterion("SUPPLIER_BANK_NUM <>", value, "supplierBankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumGreaterThan(String value) {
            addCriterion("SUPPLIER_BANK_NUM >", value, "supplierBankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_BANK_NUM >=", value, "supplierBankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumLessThan(String value) {
            addCriterion("SUPPLIER_BANK_NUM <", value, "supplierBankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_BANK_NUM <=", value, "supplierBankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumLike(String value) {
            addCriterion("SUPPLIER_BANK_NUM like", value, "supplierBankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumNotLike(String value) {
            addCriterion("SUPPLIER_BANK_NUM not like", value, "supplierBankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumIn(List<String> values) {
            addCriterion("SUPPLIER_BANK_NUM in", values, "supplierBankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumNotIn(List<String> values) {
            addCriterion("SUPPLIER_BANK_NUM not in", values, "supplierBankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumBetween(String value1, String value2) {
            addCriterion("SUPPLIER_BANK_NUM between", value1, value2, "supplierBankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_BANK_NUM not between", value1, value2, "supplierBankNum");
            return (Criteria) this;
        }

        public Criteria andSupplierCompanyHomepageIsNull() {
            addCriterion("SUPPLIER_COMPANY_HOMEPAGE is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCompanyHomepageIsNotNull() {
            addCriterion("SUPPLIER_COMPANY_HOMEPAGE is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCompanyHomepageEqualTo(String value) {
            addCriterion("SUPPLIER_COMPANY_HOMEPAGE =", value, "supplierCompanyHomepage");
            return (Criteria) this;
        }

        public Criteria andSupplierCompanyHomepageNotEqualTo(String value) {
            addCriterion("SUPPLIER_COMPANY_HOMEPAGE <>", value, "supplierCompanyHomepage");
            return (Criteria) this;
        }

        public Criteria andSupplierCompanyHomepageGreaterThan(String value) {
            addCriterion("SUPPLIER_COMPANY_HOMEPAGE >", value, "supplierCompanyHomepage");
            return (Criteria) this;
        }

        public Criteria andSupplierCompanyHomepageGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_COMPANY_HOMEPAGE >=", value, "supplierCompanyHomepage");
            return (Criteria) this;
        }

        public Criteria andSupplierCompanyHomepageLessThan(String value) {
            addCriterion("SUPPLIER_COMPANY_HOMEPAGE <", value, "supplierCompanyHomepage");
            return (Criteria) this;
        }

        public Criteria andSupplierCompanyHomepageLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_COMPANY_HOMEPAGE <=", value, "supplierCompanyHomepage");
            return (Criteria) this;
        }

        public Criteria andSupplierCompanyHomepageLike(String value) {
            addCriterion("SUPPLIER_COMPANY_HOMEPAGE like", value, "supplierCompanyHomepage");
            return (Criteria) this;
        }

        public Criteria andSupplierCompanyHomepageNotLike(String value) {
            addCriterion("SUPPLIER_COMPANY_HOMEPAGE not like", value, "supplierCompanyHomepage");
            return (Criteria) this;
        }

        public Criteria andSupplierCompanyHomepageIn(List<String> values) {
            addCriterion("SUPPLIER_COMPANY_HOMEPAGE in", values, "supplierCompanyHomepage");
            return (Criteria) this;
        }

        public Criteria andSupplierCompanyHomepageNotIn(List<String> values) {
            addCriterion("SUPPLIER_COMPANY_HOMEPAGE not in", values, "supplierCompanyHomepage");
            return (Criteria) this;
        }

        public Criteria andSupplierCompanyHomepageBetween(String value1, String value2) {
            addCriterion("SUPPLIER_COMPANY_HOMEPAGE between", value1, value2, "supplierCompanyHomepage");
            return (Criteria) this;
        }

        public Criteria andSupplierCompanyHomepageNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_COMPANY_HOMEPAGE not between", value1, value2, "supplierCompanyHomepage");
            return (Criteria) this;
        }

        public Criteria andSupplierEffectiveIsNull() {
            addCriterion("SUPPLIER_EFFECTIVE is null");
            return (Criteria) this;
        }

        public Criteria andSupplierEffectiveIsNotNull() {
            addCriterion("SUPPLIER_EFFECTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEffectiveEqualTo(String value) {
            addCriterion("SUPPLIER_EFFECTIVE =", value, "supplierEffective");
            return (Criteria) this;
        }

        public Criteria andSupplierEffectiveNotEqualTo(String value) {
            addCriterion("SUPPLIER_EFFECTIVE <>", value, "supplierEffective");
            return (Criteria) this;
        }

        public Criteria andSupplierEffectiveGreaterThan(String value) {
            addCriterion("SUPPLIER_EFFECTIVE >", value, "supplierEffective");
            return (Criteria) this;
        }

        public Criteria andSupplierEffectiveGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_EFFECTIVE >=", value, "supplierEffective");
            return (Criteria) this;
        }

        public Criteria andSupplierEffectiveLessThan(String value) {
            addCriterion("SUPPLIER_EFFECTIVE <", value, "supplierEffective");
            return (Criteria) this;
        }

        public Criteria andSupplierEffectiveLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_EFFECTIVE <=", value, "supplierEffective");
            return (Criteria) this;
        }

        public Criteria andSupplierEffectiveLike(String value) {
            addCriterion("SUPPLIER_EFFECTIVE like", value, "supplierEffective");
            return (Criteria) this;
        }

        public Criteria andSupplierEffectiveNotLike(String value) {
            addCriterion("SUPPLIER_EFFECTIVE not like", value, "supplierEffective");
            return (Criteria) this;
        }

        public Criteria andSupplierEffectiveIn(List<String> values) {
            addCriterion("SUPPLIER_EFFECTIVE in", values, "supplierEffective");
            return (Criteria) this;
        }

        public Criteria andSupplierEffectiveNotIn(List<String> values) {
            addCriterion("SUPPLIER_EFFECTIVE not in", values, "supplierEffective");
            return (Criteria) this;
        }

        public Criteria andSupplierEffectiveBetween(String value1, String value2) {
            addCriterion("SUPPLIER_EFFECTIVE between", value1, value2, "supplierEffective");
            return (Criteria) this;
        }

        public Criteria andSupplierEffectiveNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_EFFECTIVE not between", value1, value2, "supplierEffective");
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

        public Criteria andSupplierRemarkIsNull() {
            addCriterion("SUPPLIER_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkIsNotNull() {
            addCriterion("SUPPLIER_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkEqualTo(String value) {
            addCriterion("SUPPLIER_REMARK =", value, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkNotEqualTo(String value) {
            addCriterion("SUPPLIER_REMARK <>", value, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkGreaterThan(String value) {
            addCriterion("SUPPLIER_REMARK >", value, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_REMARK >=", value, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkLessThan(String value) {
            addCriterion("SUPPLIER_REMARK <", value, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_REMARK <=", value, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkLike(String value) {
            addCriterion("SUPPLIER_REMARK like", value, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkNotLike(String value) {
            addCriterion("SUPPLIER_REMARK not like", value, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkIn(List<String> values) {
            addCriterion("SUPPLIER_REMARK in", values, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkNotIn(List<String> values) {
            addCriterion("SUPPLIER_REMARK not in", values, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkBetween(String value1, String value2) {
            addCriterion("SUPPLIER_REMARK between", value1, value2, "supplierRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarkNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_REMARK not between", value1, value2, "supplierRemark");
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