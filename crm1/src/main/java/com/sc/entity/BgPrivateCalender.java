package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BgPrivateCalender implements Serializable {
    private Long calendarId;

    private String calendarCategory;

    private String calendarTitle;

    @DateTimeFormat(pattern="yyyy-mm-dd")
    private Date calendarStart;

    @DateTimeFormat(pattern="hh:mm:ss")
    private Date calendarTime;

    private String personNumber;

    private String calendarDetail;

    private Long companyId;

    @DateTimeFormat(pattern="yyyy-mm-dd hh:mm:ss")
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public BgPrivateCalender(Long calendarId, String calendarCategory, String calendarTitle, Date calendarStart, Date calendarTime, String personNumber, String calendarDetail, Long companyId, Date lastModifyDate) {
        this.calendarId = calendarId;
        this.calendarCategory = calendarCategory;
        this.calendarTitle = calendarTitle;
        this.calendarStart = calendarStart;
        this.calendarTime = calendarTime;
        this.personNumber = personNumber;
        this.calendarDetail = calendarDetail;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public BgPrivateCalender() {
        super();
    }

    public Long getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(Long calendarId) {
        this.calendarId = calendarId;
    }

    public String getCalendarCategory() {
        return calendarCategory;
    }

    public void setCalendarCategory(String calendarCategory) {
        this.calendarCategory = calendarCategory == null ? null : calendarCategory.trim();
    }

    public String getCalendarTitle() {
        return calendarTitle;
    }

    public void setCalendarTitle(String calendarTitle) {
        this.calendarTitle = calendarTitle == null ? null : calendarTitle.trim();
    }

    public Date getCalendarStart() {
        return calendarStart;
    }

    public void setCalendarStart(Date calendarStart) {
        this.calendarStart = calendarStart;
    }

    public Date getCalendarTime() {
        return calendarTime;
    }

    public void setCalendarTime(Date calendarTime) {
        this.calendarTime = calendarTime;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber == null ? null : personNumber.trim();
    }

    public String getCalendarDetail() {
        return calendarDetail;
    }

    public void setCalendarDetail(String calendarDetail) {
        this.calendarDetail = calendarDetail == null ? null : calendarDetail.trim();
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
		return "BgPrivateCalender [calendarId=" + calendarId + ", calendarCategory=" + calendarCategory
				+ ", calendarTitle=" + calendarTitle + ", calendarStart=" + calendarStart + ", calendarTime="
				+ calendarTime + ", personNumber=" + personNumber + ", calendarDetail=" + calendarDetail
				+ ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}