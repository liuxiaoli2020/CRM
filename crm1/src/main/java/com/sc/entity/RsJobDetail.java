package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class RsJobDetail implements Serializable {
    private Long jobId;

    private String jobName;

    private Long branchId;

    private String notes;

    private Long companyId;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public RsJobDetail(Long jobId, String jobName, Long branchId, String notes, Long companyId, Date lastModifyDate) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.branchId = branchId;
        this.notes = notes;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public RsJobDetail() {
        super();
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
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
		return "RsJobDetail [jobId=" + jobId + ", jobName=" + jobName + ", branchId=" + branchId + ", notes=" + notes
				+ ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}