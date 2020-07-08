package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class XtLog implements Serializable {
    private Long logId;

    private Long userId;

    private String accessIp;

    private String power;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date accessDate;

    private Long companyId;

    private static final long serialVersionUID = 1L;

    public XtLog(Long logId, Long userId, String accessIp, String power, Date accessDate, Long companyId) {
        this.logId = logId;
        this.userId = userId;
        this.accessIp = accessIp;
        this.power = power;
        this.accessDate = accessDate;
        this.companyId = companyId;
    }

    public XtLog() {
        super();
    }

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAccessIp() {
        return accessIp;
    }

    public void setAccessIp(String accessIp) {
        this.accessIp = accessIp == null ? null : accessIp.trim();
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power == null ? null : power.trim();
    }

    public Date getAccessDate() {
        return accessDate;
    }

    public void setAccessDate(Date accessDate) {
        this.accessDate = accessDate;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

	@Override
	public String toString()
	{
		return "XtLog [logId=" + logId + ", userId=" + userId + ", accessIp=" + accessIp + ", power=" + power
				+ ", accessDate=" + accessDate + ", companyId=" + companyId + "]";
	}
    
}