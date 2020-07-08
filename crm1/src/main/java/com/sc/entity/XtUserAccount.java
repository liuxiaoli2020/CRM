package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class XtUserAccount implements Serializable {
    private Long userId;

    private String userName;

    private String userPass;

    private Long staffId;

    private Long companyId;

    private String accountStatus;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XtUserAccount(Long userId, String userName, String userPass, Long staffId, Long companyId, String accountStatus, Date lastModifyDate) {
        this.userId = userId;
        this.userName = userName;
        this.userPass = userPass;
        this.staffId = staffId;
        this.companyId = companyId;
        this.accountStatus = accountStatus;
        this.lastModifyDate = lastModifyDate;
    }

    public XtUserAccount() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus == null ? null : accountStatus.trim();
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

	@Override
	public String toString()
	{
		return "XtUserAccount [userId=" + userId + ", userName=" + userName + ", userPass=" + userPass + ", staffId="
				+ staffId + ", companyId=" + companyId + ", accountStatus=" + accountStatus + ", lastModifyDate="
				+ lastModifyDate + "]";
	}
    
}