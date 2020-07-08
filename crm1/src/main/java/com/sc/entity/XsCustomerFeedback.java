package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class XsCustomerFeedback implements Serializable {
    private Long feedbackRecordId;

    private String recordPriority;

    private Long customerId;

    private String state;

    private String feedbackType;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date feedbackDate;

    private String feedbackReason;

    private String head;

    private String feedbackResource;

    private String feedbackTheme;

    private String feedbackDescribe;

    private String analysis;

    private Long companyId;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XsCustomerFeedback(Long feedbackRecordId, String recordPriority, Long customerId, String state, String feedbackType, Date feedbackDate, String feedbackReason, String head, String feedbackResource, String feedbackTheme, String feedbackDescribe, String analysis, Long companyId, Date lastModifyDate) {
        this.feedbackRecordId = feedbackRecordId;
        this.recordPriority = recordPriority;
        this.customerId = customerId;
        this.state = state;
        this.feedbackType = feedbackType;
        this.feedbackDate = feedbackDate;
        this.feedbackReason = feedbackReason;
        this.head = head;
        this.feedbackResource = feedbackResource;
        this.feedbackTheme = feedbackTheme;
        this.feedbackDescribe = feedbackDescribe;
        this.analysis = analysis;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public XsCustomerFeedback() {
        super();
    }

    public Long getFeedbackRecordId() {
        return feedbackRecordId;
    }

    public void setFeedbackRecordId(Long feedbackRecordId) {
        this.feedbackRecordId = feedbackRecordId;
    }

    public String getRecordPriority() {
        return recordPriority;
    }

    public void setRecordPriority(String recordPriority) {
        this.recordPriority = recordPriority == null ? null : recordPriority.trim();
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getFeedbackType() {
        return feedbackType;
    }

    public void setFeedbackType(String feedbackType) {
        this.feedbackType = feedbackType == null ? null : feedbackType.trim();
    }

    public Date getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    public String getFeedbackReason() {
        return feedbackReason;
    }

    public void setFeedbackReason(String feedbackReason) {
        this.feedbackReason = feedbackReason == null ? null : feedbackReason.trim();
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head == null ? null : head.trim();
    }

    public String getFeedbackResource() {
        return feedbackResource;
    }

    public void setFeedbackResource(String feedbackResource) {
        this.feedbackResource = feedbackResource == null ? null : feedbackResource.trim();
    }

    public String getFeedbackTheme() {
        return feedbackTheme;
    }

    public void setFeedbackTheme(String feedbackTheme) {
        this.feedbackTheme = feedbackTheme == null ? null : feedbackTheme.trim();
    }

    public String getFeedbackDescribe() {
        return feedbackDescribe;
    }

    public void setFeedbackDescribe(String feedbackDescribe) {
        this.feedbackDescribe = feedbackDescribe == null ? null : feedbackDescribe.trim();
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis == null ? null : analysis.trim();
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
		return "XsCustomerFeedback [feedbackRecordId=" + feedbackRecordId + ", recordPriority=" + recordPriority
				+ ", customerId=" + customerId + ", state=" + state + ", feedbackType=" + feedbackType
				+ ", feedbackDate=" + feedbackDate + ", feedbackReason=" + feedbackReason + ", head=" + head
				+ ", feedbackResource=" + feedbackResource + ", feedbackTheme=" + feedbackTheme + ", feedbackDescribe="
				+ feedbackDescribe + ", analysis=" + analysis + ", companyId=" + companyId + ", lastModifyDate="
				+ lastModifyDate + "]";
	}
    
}