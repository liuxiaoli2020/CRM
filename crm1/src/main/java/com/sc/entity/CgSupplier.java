package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class CgSupplier implements Serializable {
    private Long supplierId;

    private String supplierName;

    private String supplierFname;

    private String supplierContacts;

    private String supplierFixed;

    private String supplierMobile;

    private String supplierFax;

    private String supplierAddress;

    private String supplierPostcode;

    private String supplierEmail;

    private String supplierBank;

    private String supplierBankNum;

    private String supplierCompanyHomepage;

    private String supplierEffective;

    private Long staffId;

    private String supplierRemark;

    private Long companyId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;
    
    //拓展方法，用于查询-start
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date csDatemax;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date csDatemin;
	
	public Date getCsDatemax() {
		return csDatemax;
	}

	public void setCsDatemax(Date csDatemax) {
		this.csDatemax = csDatemax;
	}

	public Date getCsDatemin() {
		return csDatemin;
	}

	public void setCsDatemin(Date csDatemin) {
		this.csDatemin = csDatemin;
	}
	//拓展方法，用于查询-end

	//拓展方法，用于批量删除-start
	private Long[] supplierIds;
	
    
    public Long[] getSupplierIds() {
		return supplierIds;
	}

	public void setSupplierIds(Long[] supplierIds) {
		this.supplierIds = supplierIds;
	}
	//拓展方法，用于批量删除-end

	private static final long serialVersionUID = 1L;

    public CgSupplier(Long supplierId, String supplierName, String supplierFname, String supplierContacts, String supplierFixed, String supplierMobile, String supplierFax, String supplierAddress, String supplierPostcode, String supplierEmail, String supplierBank, String supplierBankNum, String supplierCompanyHomepage, String supplierEffective, Long staffId, String supplierRemark, Long companyId, Date lastModifyDate) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.supplierFname = supplierFname;
        this.supplierContacts = supplierContacts;
        this.supplierFixed = supplierFixed;
        this.supplierMobile = supplierMobile;
        this.supplierFax = supplierFax;
        this.supplierAddress = supplierAddress;
        this.supplierPostcode = supplierPostcode;
        this.supplierEmail = supplierEmail;
        this.supplierBank = supplierBank;
        this.supplierBankNum = supplierBankNum;
        this.supplierCompanyHomepage = supplierCompanyHomepage;
        this.supplierEffective = supplierEffective;
        this.staffId = staffId;
        this.supplierRemark = supplierRemark;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public CgSupplier() {
        super();
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getSupplierFname() {
        return supplierFname;
    }

    public void setSupplierFname(String supplierFname) {
        this.supplierFname = supplierFname == null ? null : supplierFname.trim();
    }

    public String getSupplierContacts() {
        return supplierContacts;
    }

    public void setSupplierContacts(String supplierContacts) {
        this.supplierContacts = supplierContacts == null ? null : supplierContacts.trim();
    }

    public String getSupplierFixed() {
        return supplierFixed;
    }

    public void setSupplierFixed(String supplierFixed) {
        this.supplierFixed = supplierFixed == null ? null : supplierFixed.trim();
    }

    public String getSupplierMobile() {
        return supplierMobile;
    }

    public void setSupplierMobile(String supplierMobile) {
        this.supplierMobile = supplierMobile == null ? null : supplierMobile.trim();
    }

    public String getSupplierFax() {
        return supplierFax;
    }

    public void setSupplierFax(String supplierFax) {
        this.supplierFax = supplierFax == null ? null : supplierFax.trim();
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress == null ? null : supplierAddress.trim();
    }

    public String getSupplierPostcode() {
        return supplierPostcode;
    }

    public void setSupplierPostcode(String supplierPostcode) {
        this.supplierPostcode = supplierPostcode == null ? null : supplierPostcode.trim();
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail == null ? null : supplierEmail.trim();
    }

    public String getSupplierBank() {
        return supplierBank;
    }

    public void setSupplierBank(String supplierBank) {
        this.supplierBank = supplierBank == null ? null : supplierBank.trim();
    }

    public String getSupplierBankNum() {
        return supplierBankNum;
    }

    public void setSupplierBankNum(String supplierBankNum) {
        this.supplierBankNum = supplierBankNum == null ? null : supplierBankNum.trim();
    }

    public String getSupplierCompanyHomepage() {
        return supplierCompanyHomepage;
    }

    public void setSupplierCompanyHomepage(String supplierCompanyHomepage) {
        this.supplierCompanyHomepage = supplierCompanyHomepage == null ? null : supplierCompanyHomepage.trim();
    }

    public String getSupplierEffective() {
        return supplierEffective;
    }

    public void setSupplierEffective(String supplierEffective) {
        this.supplierEffective = supplierEffective == null ? null : supplierEffective.trim();
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getSupplierRemark() {
        return supplierRemark;
    }

    public void setSupplierRemark(String supplierRemark) {
        this.supplierRemark = supplierRemark == null ? null : supplierRemark.trim();
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
		return "CgSupplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierFname="
				+ supplierFname + ", supplierContacts=" + supplierContacts + ", supplierFixed=" + supplierFixed
				+ ", supplierMobile=" + supplierMobile + ", supplierFax=" + supplierFax + ", supplierAddress="
				+ supplierAddress + ", supplierPostcode=" + supplierPostcode + ", supplierEmail=" + supplierEmail
				+ ", supplierBank=" + supplierBank + ", supplierBankNum=" + supplierBankNum
				+ ", supplierCompanyHomepage=" + supplierCompanyHomepage + ", supplierEffective=" + supplierEffective
				+ ", staffId=" + staffId + ", supplierRemark=" + supplierRemark + ", companyId=" + companyId
				+ ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}