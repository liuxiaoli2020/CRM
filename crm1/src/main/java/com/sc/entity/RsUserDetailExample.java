package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RsUserDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RsUserDetailExample() {
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

        public Criteria andStaffNameIsNull() {
            addCriterion("STAFF_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("STAFF_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("STAFF_NAME =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("STAFF_NAME <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("STAFF_NAME >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_NAME >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("STAFF_NAME <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("STAFF_NAME <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("STAFF_NAME like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("STAFF_NAME not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("STAFF_NAME in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("STAFF_NAME not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("STAFF_NAME between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("STAFF_NAME not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNull() {
            addCriterion("STAFF_SEX is null");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNotNull() {
            addCriterion("STAFF_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSexEqualTo(String value) {
            addCriterion("STAFF_SEX =", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotEqualTo(String value) {
            addCriterion("STAFF_SEX <>", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThan(String value) {
            addCriterion("STAFF_SEX >", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_SEX >=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThan(String value) {
            addCriterion("STAFF_SEX <", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThanOrEqualTo(String value) {
            addCriterion("STAFF_SEX <=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLike(String value) {
            addCriterion("STAFF_SEX like", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotLike(String value) {
            addCriterion("STAFF_SEX not like", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexIn(List<String> values) {
            addCriterion("STAFF_SEX in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotIn(List<String> values) {
            addCriterion("STAFF_SEX not in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexBetween(String value1, String value2) {
            addCriterion("STAFF_SEX between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotBetween(String value1, String value2) {
            addCriterion("STAFF_SEX not between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoIsNull() {
            addCriterion("STAFF_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoIsNotNull() {
            addCriterion("STAFF_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoEqualTo(String value) {
            addCriterion("STAFF_PHOTO =", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoNotEqualTo(String value) {
            addCriterion("STAFF_PHOTO <>", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoGreaterThan(String value) {
            addCriterion("STAFF_PHOTO >", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_PHOTO >=", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoLessThan(String value) {
            addCriterion("STAFF_PHOTO <", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoLessThanOrEqualTo(String value) {
            addCriterion("STAFF_PHOTO <=", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoLike(String value) {
            addCriterion("STAFF_PHOTO like", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoNotLike(String value) {
            addCriterion("STAFF_PHOTO not like", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoIn(List<String> values) {
            addCriterion("STAFF_PHOTO in", values, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoNotIn(List<String> values) {
            addCriterion("STAFF_PHOTO not in", values, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoBetween(String value1, String value2) {
            addCriterion("STAFF_PHOTO between", value1, value2, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoNotBetween(String value1, String value2) {
            addCriterion("STAFF_PHOTO not between", value1, value2, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("ID_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("ID_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("ID_NUMBER =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("ID_NUMBER <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("ID_NUMBER >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NUMBER >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("ID_NUMBER <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("ID_NUMBER <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("ID_NUMBER like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("ID_NUMBER not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("ID_NUMBER in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("ID_NUMBER not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("ID_NUMBER between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("ID_NUMBER not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNull() {
            addCriterion("HOME_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNotNull() {
            addCriterion("HOME_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressEqualTo(String value) {
            addCriterion("HOME_ADDRESS =", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotEqualTo(String value) {
            addCriterion("HOME_ADDRESS <>", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThan(String value) {
            addCriterion("HOME_ADDRESS >", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("HOME_ADDRESS >=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThan(String value) {
            addCriterion("HOME_ADDRESS <", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThanOrEqualTo(String value) {
            addCriterion("HOME_ADDRESS <=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLike(String value) {
            addCriterion("HOME_ADDRESS like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotLike(String value) {
            addCriterion("HOME_ADDRESS not like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIn(List<String> values) {
            addCriterion("HOME_ADDRESS in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotIn(List<String> values) {
            addCriterion("HOME_ADDRESS not in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressBetween(String value1, String value2) {
            addCriterion("HOME_ADDRESS between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotBetween(String value1, String value2) {
            addCriterion("HOME_ADDRESS not between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressIsNull() {
            addCriterion("NOW_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andNowAddressIsNotNull() {
            addCriterion("NOW_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andNowAddressEqualTo(String value) {
            addCriterion("NOW_ADDRESS =", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressNotEqualTo(String value) {
            addCriterion("NOW_ADDRESS <>", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressGreaterThan(String value) {
            addCriterion("NOW_ADDRESS >", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressGreaterThanOrEqualTo(String value) {
            addCriterion("NOW_ADDRESS >=", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressLessThan(String value) {
            addCriterion("NOW_ADDRESS <", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressLessThanOrEqualTo(String value) {
            addCriterion("NOW_ADDRESS <=", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressLike(String value) {
            addCriterion("NOW_ADDRESS like", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressNotLike(String value) {
            addCriterion("NOW_ADDRESS not like", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressIn(List<String> values) {
            addCriterion("NOW_ADDRESS in", values, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressNotIn(List<String> values) {
            addCriterion("NOW_ADDRESS not in", values, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressBetween(String value1, String value2) {
            addCriterion("NOW_ADDRESS between", value1, value2, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressNotBetween(String value1, String value2) {
            addCriterion("NOW_ADDRESS not between", value1, value2, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andStaffEducationIsNull() {
            addCriterion("STAFF_EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andStaffEducationIsNotNull() {
            addCriterion("STAFF_EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEducationEqualTo(String value) {
            addCriterion("STAFF_EDUCATION =", value, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationNotEqualTo(String value) {
            addCriterion("STAFF_EDUCATION <>", value, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationGreaterThan(String value) {
            addCriterion("STAFF_EDUCATION >", value, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_EDUCATION >=", value, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationLessThan(String value) {
            addCriterion("STAFF_EDUCATION <", value, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationLessThanOrEqualTo(String value) {
            addCriterion("STAFF_EDUCATION <=", value, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationLike(String value) {
            addCriterion("STAFF_EDUCATION like", value, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationNotLike(String value) {
            addCriterion("STAFF_EDUCATION not like", value, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationIn(List<String> values) {
            addCriterion("STAFF_EDUCATION in", values, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationNotIn(List<String> values) {
            addCriterion("STAFF_EDUCATION not in", values, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationBetween(String value1, String value2) {
            addCriterion("STAFF_EDUCATION between", value1, value2, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andStaffEducationNotBetween(String value1, String value2) {
            addCriterion("STAFF_EDUCATION not between", value1, value2, "staffEducation");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookIsNull() {
            addCriterion("POLITICAL_OUTLOOK is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookIsNotNull() {
            addCriterion("POLITICAL_OUTLOOK is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookEqualTo(String value) {
            addCriterion("POLITICAL_OUTLOOK =", value, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookNotEqualTo(String value) {
            addCriterion("POLITICAL_OUTLOOK <>", value, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookGreaterThan(String value) {
            addCriterion("POLITICAL_OUTLOOK >", value, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookGreaterThanOrEqualTo(String value) {
            addCriterion("POLITICAL_OUTLOOK >=", value, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookLessThan(String value) {
            addCriterion("POLITICAL_OUTLOOK <", value, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookLessThanOrEqualTo(String value) {
            addCriterion("POLITICAL_OUTLOOK <=", value, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookLike(String value) {
            addCriterion("POLITICAL_OUTLOOK like", value, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookNotLike(String value) {
            addCriterion("POLITICAL_OUTLOOK not like", value, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookIn(List<String> values) {
            addCriterion("POLITICAL_OUTLOOK in", values, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookNotIn(List<String> values) {
            addCriterion("POLITICAL_OUTLOOK not in", values, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookBetween(String value1, String value2) {
            addCriterion("POLITICAL_OUTLOOK between", value1, value2, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticalOutlookNotBetween(String value1, String value2) {
            addCriterion("POLITICAL_OUTLOOK not between", value1, value2, "politicalOutlook");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIsNull() {
            addCriterion("GRADUATE_SCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIsNotNull() {
            addCriterion("GRADUATE_SCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolEqualTo(String value) {
            addCriterion("GRADUATE_SCHOOL =", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotEqualTo(String value) {
            addCriterion("GRADUATE_SCHOOL <>", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolGreaterThan(String value) {
            addCriterion("GRADUATE_SCHOOL >", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("GRADUATE_SCHOOL >=", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLessThan(String value) {
            addCriterion("GRADUATE_SCHOOL <", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLessThanOrEqualTo(String value) {
            addCriterion("GRADUATE_SCHOOL <=", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLike(String value) {
            addCriterion("GRADUATE_SCHOOL like", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotLike(String value) {
            addCriterion("GRADUATE_SCHOOL not like", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIn(List<String> values) {
            addCriterion("GRADUATE_SCHOOL in", values, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotIn(List<String> values) {
            addCriterion("GRADUATE_SCHOOL not in", values, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolBetween(String value1, String value2) {
            addCriterion("GRADUATE_SCHOOL between", value1, value2, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotBetween(String value1, String value2) {
            addCriterion("GRADUATE_SCHOOL not between", value1, value2, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("TELEPHONE =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("TELEPHONE <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("TELEPHONE >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("TELEPHONE >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("TELEPHONE <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("TELEPHONE <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("TELEPHONE like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("TELEPHONE not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("TELEPHONE in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("TELEPHONE not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("TELEPHONE between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("TELEPHONE not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andOnlineContactWayIsNull() {
            addCriterion("ONLINE_CONTACT_WAY is null");
            return (Criteria) this;
        }

        public Criteria andOnlineContactWayIsNotNull() {
            addCriterion("ONLINE_CONTACT_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineContactWayEqualTo(String value) {
            addCriterion("ONLINE_CONTACT_WAY =", value, "onlineContactWay");
            return (Criteria) this;
        }

        public Criteria andOnlineContactWayNotEqualTo(String value) {
            addCriterion("ONLINE_CONTACT_WAY <>", value, "onlineContactWay");
            return (Criteria) this;
        }

        public Criteria andOnlineContactWayGreaterThan(String value) {
            addCriterion("ONLINE_CONTACT_WAY >", value, "onlineContactWay");
            return (Criteria) this;
        }

        public Criteria andOnlineContactWayGreaterThanOrEqualTo(String value) {
            addCriterion("ONLINE_CONTACT_WAY >=", value, "onlineContactWay");
            return (Criteria) this;
        }

        public Criteria andOnlineContactWayLessThan(String value) {
            addCriterion("ONLINE_CONTACT_WAY <", value, "onlineContactWay");
            return (Criteria) this;
        }

        public Criteria andOnlineContactWayLessThanOrEqualTo(String value) {
            addCriterion("ONLINE_CONTACT_WAY <=", value, "onlineContactWay");
            return (Criteria) this;
        }

        public Criteria andOnlineContactWayLike(String value) {
            addCriterion("ONLINE_CONTACT_WAY like", value, "onlineContactWay");
            return (Criteria) this;
        }

        public Criteria andOnlineContactWayNotLike(String value) {
            addCriterion("ONLINE_CONTACT_WAY not like", value, "onlineContactWay");
            return (Criteria) this;
        }

        public Criteria andOnlineContactWayIn(List<String> values) {
            addCriterion("ONLINE_CONTACT_WAY in", values, "onlineContactWay");
            return (Criteria) this;
        }

        public Criteria andOnlineContactWayNotIn(List<String> values) {
            addCriterion("ONLINE_CONTACT_WAY not in", values, "onlineContactWay");
            return (Criteria) this;
        }

        public Criteria andOnlineContactWayBetween(String value1, String value2) {
            addCriterion("ONLINE_CONTACT_WAY between", value1, value2, "onlineContactWay");
            return (Criteria) this;
        }

        public Criteria andOnlineContactWayNotBetween(String value1, String value2) {
            addCriterion("ONLINE_CONTACT_WAY not between", value1, value2, "onlineContactWay");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailIsNull() {
            addCriterion("ONLINE_CONTACT_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailIsNotNull() {
            addCriterion("ONLINE_CONTACT_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailEqualTo(String value) {
            addCriterion("ONLINE_CONTACT_DETAIL =", value, "onlineContactDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailNotEqualTo(String value) {
            addCriterion("ONLINE_CONTACT_DETAIL <>", value, "onlineContactDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailGreaterThan(String value) {
            addCriterion("ONLINE_CONTACT_DETAIL >", value, "onlineContactDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailGreaterThanOrEqualTo(String value) {
            addCriterion("ONLINE_CONTACT_DETAIL >=", value, "onlineContactDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailLessThan(String value) {
            addCriterion("ONLINE_CONTACT_DETAIL <", value, "onlineContactDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailLessThanOrEqualTo(String value) {
            addCriterion("ONLINE_CONTACT_DETAIL <=", value, "onlineContactDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailLike(String value) {
            addCriterion("ONLINE_CONTACT_DETAIL like", value, "onlineContactDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailNotLike(String value) {
            addCriterion("ONLINE_CONTACT_DETAIL not like", value, "onlineContactDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailIn(List<String> values) {
            addCriterion("ONLINE_CONTACT_DETAIL in", values, "onlineContactDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailNotIn(List<String> values) {
            addCriterion("ONLINE_CONTACT_DETAIL not in", values, "onlineContactDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailBetween(String value1, String value2) {
            addCriterion("ONLINE_CONTACT_DETAIL between", value1, value2, "onlineContactDetail");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailNotBetween(String value1, String value2) {
            addCriterion("ONLINE_CONTACT_DETAIL not between", value1, value2, "onlineContactDetail");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("AUDIT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("AUDIT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(String value) {
            addCriterion("AUDIT_STATUS =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(String value) {
            addCriterion("AUDIT_STATUS <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(String value) {
            addCriterion("AUDIT_STATUS >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_STATUS >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(String value) {
            addCriterion("AUDIT_STATUS <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_STATUS <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLike(String value) {
            addCriterion("AUDIT_STATUS like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotLike(String value) {
            addCriterion("AUDIT_STATUS not like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<String> values) {
            addCriterion("AUDIT_STATUS in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<String> values) {
            addCriterion("AUDIT_STATUS not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(String value1, String value2) {
            addCriterion("AUDIT_STATUS between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(String value1, String value2) {
            addCriterion("AUDIT_STATUS not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("JOB_ID is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("JOB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Long value) {
            addCriterion("JOB_ID =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Long value) {
            addCriterion("JOB_ID <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Long value) {
            addCriterion("JOB_ID >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Long value) {
            addCriterion("JOB_ID >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Long value) {
            addCriterion("JOB_ID <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Long value) {
            addCriterion("JOB_ID <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Long> values) {
            addCriterion("JOB_ID in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Long> values) {
            addCriterion("JOB_ID not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Long value1, Long value2) {
            addCriterion("JOB_ID between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Long value1, Long value2) {
            addCriterion("JOB_ID not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andStaffStateIsNull() {
            addCriterion("STAFF_STATE is null");
            return (Criteria) this;
        }

        public Criteria andStaffStateIsNotNull() {
            addCriterion("STAFF_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStaffStateEqualTo(String value) {
            addCriterion("STAFF_STATE =", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateNotEqualTo(String value) {
            addCriterion("STAFF_STATE <>", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateGreaterThan(String value) {
            addCriterion("STAFF_STATE >", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_STATE >=", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateLessThan(String value) {
            addCriterion("STAFF_STATE <", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateLessThanOrEqualTo(String value) {
            addCriterion("STAFF_STATE <=", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateLike(String value) {
            addCriterion("STAFF_STATE like", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateNotLike(String value) {
            addCriterion("STAFF_STATE not like", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateIn(List<String> values) {
            addCriterion("STAFF_STATE in", values, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateNotIn(List<String> values) {
            addCriterion("STAFF_STATE not in", values, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateBetween(String value1, String value2) {
            addCriterion("STAFF_STATE between", value1, value2, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateNotBetween(String value1, String value2) {
            addCriterion("STAFF_STATE not between", value1, value2, "staffState");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("NOTES is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("NOTES is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("NOTES =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("NOTES <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("NOTES >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("NOTES >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("NOTES <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("NOTES <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("NOTES like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("NOTES not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("NOTES in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("NOTES not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("NOTES between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("NOTES not between", value1, value2, "notes");
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