package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class XsCustomerContact implements Serializable {
    private Long contactId;

    private Long customerId;

    private String contactName;

    private String englishName;

    private String job;

    private String department;

    private String mobilephone;

    private String officePhone;

    private String email;

    private String address;

    private String noteInformation;

    private Long companyId;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XsCustomerContact(Long contactId, Long customerId, String contactName, String englishName, String job, String department, String mobilephone, String officePhone, String email, String address, String noteInformation, Long companyId, Date lastModifyDate) {
        this.contactId = contactId;
        this.customerId = customerId;
        this.contactName = contactName;
        this.englishName = englishName;
        this.job = job;
        this.department = department;
        this.mobilephone = mobilephone;
        this.officePhone = officePhone;
        this.email = email;
        this.address = address;
        this.noteInformation = noteInformation;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public XsCustomerContact() {
        super();
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone == null ? null : officePhone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getNoteInformation() {
        return noteInformation;
    }

    public void setNoteInformation(String noteInformation) {
        this.noteInformation = noteInformation == null ? null : noteInformation.trim();
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
		return "XsCustomerContact [contactId=" + contactId + ", customerId=" + customerId + ", contactName="
				+ contactName + ", englishName=" + englishName + ", job=" + job + ", department=" + department
				+ ", mobilephone=" + mobilephone + ", officePhone=" + officePhone + ", email=" + email + ", address="
				+ address + ", noteInformation=" + noteInformation + ", companyId=" + companyId + ", lastModifyDate="
				+ lastModifyDate + "]";
	}
    
}