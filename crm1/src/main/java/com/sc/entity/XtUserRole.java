package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class XtUserRole implements Serializable {
    private Long userRoleId;

    private Long userId;

    private Long roleId;

    private Long operatorId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XtUserRole(Long userRoleId, Long userId, Long roleId, Long operatorId, Date lastModifyDate) {
        this.userRoleId = userRoleId;
        this.userId = userId;
        this.roleId = roleId;
        this.operatorId = operatorId;
        this.lastModifyDate = lastModifyDate;
    }

    public XtUserRole() {
        super();
    }

    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
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
		return "XtUserRole [userRoleId=" + userRoleId + ", userId=" + userId + ", roleId=" + roleId + ", operatorId="
				+ operatorId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}