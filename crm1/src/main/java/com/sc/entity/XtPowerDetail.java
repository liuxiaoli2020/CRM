package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class XtPowerDetail implements Serializable {
    private Long powerId;

    private String powerName;

    private String power;

    private Long subfieldId;

    private String remark;
    
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XtPowerDetail(Long powerId, String powerName, String power, Long subfieldId, String remark, Date lastModifyDate) {
        this.powerId = powerId;
        this.powerName = powerName;
        this.power = power;
        this.subfieldId = subfieldId;
        this.remark = remark;
        this.lastModifyDate = lastModifyDate;
    }

    public XtPowerDetail() {
        super();
    }

    public Long getPowerId() {
        return powerId;
    }

    public void setPowerId(Long powerId) {
        this.powerId = powerId;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName == null ? null : powerName.trim();
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power == null ? null : power.trim();
    }

    public Long getSubfieldId() {
        return subfieldId;
    }

    public void setSubfieldId(Long subfieldId) {
        this.subfieldId = subfieldId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
		return "XtPowerDetail [powerId=" + powerId + ", powerName=" + powerName + ", power=" + power + ", subfieldId="
				+ subfieldId + ", remark=" + remark + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}