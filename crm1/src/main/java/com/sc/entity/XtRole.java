package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class XtRole implements Serializable {
    private Long roleId;

    private String roleName;

    private String roleDetail;

    private Long superiorRoleId;

    private Long operatorId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XtRole(Long roleId, String roleName, String roleDetail, Long superiorRoleId, Long operatorId, Date lastModifyDate) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleDetail = roleDetail;
        this.superiorRoleId = superiorRoleId;
        this.operatorId = operatorId;
        this.lastModifyDate = lastModifyDate;
    }

    public XtRole() {
        super();
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDetail() {
        return roleDetail;
    }

    public void setRoleDetail(String roleDetail) {
        this.roleDetail = roleDetail == null ? null : roleDetail.trim();
    }

    public Long getSuperiorRoleId() {
        return superiorRoleId;
    }

    public void setSuperiorRoleId(Long superiorRoleId) {
        this.superiorRoleId = superiorRoleId;
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
		return "XtRole [roleId=" + roleId + ", roleName=" + roleName + ", roleDetail=" + roleDetail
				+ ", superiorRoleId=" + superiorRoleId + ", operatorId=" + operatorId + ", lastModifyDate="
				+ lastModifyDate + "]";
	}
    
}