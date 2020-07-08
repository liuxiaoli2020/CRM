package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class XtPowerRole implements Serializable {
    private Long powerRoleId;

    private Long powerId;

    private Long roleId;

    private Long operatorId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XtPowerRole(Long powerRoleId, Long powerId, Long roleId, Long operatorId, Date lastModifyDate) {
        this.powerRoleId = powerRoleId;
        this.powerId = powerId;
        this.roleId = roleId;
        this.operatorId = operatorId;
        this.lastModifyDate = lastModifyDate;
    }

    public XtPowerRole() {
        super();
    }

    public Long getPowerRoleId() {
        return powerRoleId;
    }

    public void setPowerRoleId(Long powerRoleId) {
        this.powerRoleId = powerRoleId;
    }

    public Long getPowerId() {
        return powerId;
    }

    public void setPowerId(Long powerId) {
        this.powerId = powerId;
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
		return "XtPowerRole [powerRoleId=" + powerRoleId + ", powerId=" + powerId + ", roleId=" + roleId
				+ ", operatorId=" + operatorId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}