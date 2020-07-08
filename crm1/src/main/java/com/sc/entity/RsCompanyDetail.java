package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class RsCompanyDetail implements Serializable {
    private BigDecimal companyId;

    private String companyName;

    private String companyCode;

    private String email;

    private String contacts;

    private String companyAddress;

    private String fixedTel;

    private String mobileTel;

    private String fax;

    private String bank;

    private String bankAccount;

    private String effect;

    private String notes;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public RsCompanyDetail(BigDecimal companyId, String companyName, String companyCode, String email, String contacts, String companyAddress, String fixedTel, String mobileTel, String fax, String bank, String bankAccount, String effect, String notes, Date lastModifyDate) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.companyCode = companyCode;
        this.email = email;
        this.contacts = contacts;
        this.companyAddress = companyAddress;
        this.fixedTel = fixedTel;
        this.mobileTel = mobileTel;
        this.fax = fax;
        this.bank = bank;
        this.bankAccount = bankAccount;
        this.effect = effect;
        this.notes = notes;
        this.lastModifyDate = lastModifyDate;
    }

    public RsCompanyDetail() {
        super();
    }

    public BigDecimal getCompanyId() {
        return companyId;
    }

    public void setCompanyId(BigDecimal companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getFixedTel() {
        return fixedTel;
    }

    public void setFixedTel(String fixedTel) {
        this.fixedTel = fixedTel == null ? null : fixedTel.trim();
    }

    public String getMobileTel() {
        return mobileTel;
    }

    public void setMobileTel(String mobileTel) {
        this.mobileTel = mobileTel == null ? null : mobileTel.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect == null ? null : effect.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

	@Override
	public String toString() {
		return "RsCompanyDetail [companyId=" + companyId + ", companyName=" + companyName + ", companyCode="
				+ companyCode + ", email=" + email + ", contacts=" + contacts + ", companyAddress=" + companyAddress
				+ ", fixedTel=" + fixedTel + ", mobileTel=" + mobileTel + ", fax=" + fax + ", bank=" + bank
				+ ", bankAccount=" + bankAccount + ", effect=" + effect + ", notes=" + notes + ", lastModifyDate="
				+ lastModifyDate + "]";
	}
    
}