package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class RsUserDetail implements Serializable {
    private Long staffId;

    private String staffName;

    private String staffSex;

    private String staffPhoto;

    private String idNumber;

    private String homeAddress;

    private String nowAddress;

    private String staffEducation;

    private String politicalOutlook;

    private String graduateSchool;

    private String telephone;

    private String onlineContactWay;

    private String onlineContactDetail;

    private String auditStatus;

    private Long jobId;

    private String staffState;

    private String notes;

    private Long companyId;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public RsUserDetail(Long staffId, String staffName, String staffSex, String staffPhoto, String idNumber, String homeAddress, String nowAddress, String staffEducation, String politicalOutlook, String graduateSchool, String telephone, String onlineContactWay, String onlineContactDetail, String auditStatus, Long jobId, String staffState, String notes, Long companyId, Date lastModifyDate) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.staffSex = staffSex;
        this.staffPhoto = staffPhoto;
        this.idNumber = idNumber;
        this.homeAddress = homeAddress;
        this.nowAddress = nowAddress;
        this.staffEducation = staffEducation;
        this.politicalOutlook = politicalOutlook;
        this.graduateSchool = graduateSchool;
        this.telephone = telephone;
        this.onlineContactWay = onlineContactWay;
        this.onlineContactDetail = onlineContactDetail;
        this.auditStatus = auditStatus;
        this.jobId = jobId;
        this.staffState = staffState;
        this.notes = notes;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public RsUserDetail() {
        super();
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex == null ? null : staffSex.trim();
    }

    public String getStaffPhoto() {
        return staffPhoto;
    }

    public void setStaffPhoto(String staffPhoto) {
        this.staffPhoto = staffPhoto == null ? null : staffPhoto.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress == null ? null : homeAddress.trim();
    }

    public String getNowAddress() {
        return nowAddress;
    }

    public void setNowAddress(String nowAddress) {
        this.nowAddress = nowAddress == null ? null : nowAddress.trim();
    }

    public String getStaffEducation() {
        return staffEducation;
    }

    public void setStaffEducation(String staffEducation) {
        this.staffEducation = staffEducation == null ? null : staffEducation.trim();
    }

    public String getPoliticalOutlook() {
        return politicalOutlook;
    }

    public void setPoliticalOutlook(String politicalOutlook) {
        this.politicalOutlook = politicalOutlook == null ? null : politicalOutlook.trim();
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool == null ? null : graduateSchool.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getOnlineContactWay() {
        return onlineContactWay;
    }

    public void setOnlineContactWay(String onlineContactWay) {
        this.onlineContactWay = onlineContactWay == null ? null : onlineContactWay.trim();
    }

    public String getOnlineContactDetail() {
        return onlineContactDetail;
    }

    public void setOnlineContactDetail(String onlineContactDetail) {
        this.onlineContactDetail = onlineContactDetail == null ? null : onlineContactDetail.trim();
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getStaffState() {
        return staffState;
    }

    public void setStaffState(String staffState) {
        this.staffState = staffState == null ? null : staffState.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

	@Override
	public String toString() {
		return "RsUserDetail [staffId=" + staffId + ", staffName=" + staffName + ", staffSex=" + staffSex
				+ ", staffPhoto=" + staffPhoto + ", idNumber=" + idNumber + ", homeAddress=" + homeAddress
				+ ", nowAddress=" + nowAddress + ", staffEducation=" + staffEducation + ", politicalOutlook="
				+ politicalOutlook + ", graduateSchool=" + graduateSchool + ", telephone=" + telephone
				+ ", onlineContactWay=" + onlineContactWay + ", onlineContactDetail=" + onlineContactDetail
				+ ", auditStatus=" + auditStatus + ", jobId=" + jobId + ", staffState=" + staffState + ", notes="
				+ notes + ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}