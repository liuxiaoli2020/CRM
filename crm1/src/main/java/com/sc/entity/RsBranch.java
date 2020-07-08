package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class RsBranch implements Serializable {
    private Long branchId;

    private String branchName;

    private String notes;

    private Long companyId;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public RsBranch(Long branchId, String branchName, String notes, Long companyId, Date lastModifyDate) {
        this.branchId = branchId;
        this.branchName = branchName;
        this.notes = notes;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public RsBranch() {
        super();
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName == null ? null : branchName.trim();
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
		return "RsBranch [branchId=" + branchId + ", branchName=" + branchName + ", notes=" + notes + ", companyId="
				+ companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}