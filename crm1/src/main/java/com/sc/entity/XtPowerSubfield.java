package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class XtPowerSubfield implements Serializable {
    private Long subfieldId;

    private String subfieldName;

    private String remark;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XtPowerSubfield(Long subfieldId, String subfieldName, String remark, Date lastModifyDate) {
        this.subfieldId = subfieldId;
        this.subfieldName = subfieldName;
        this.remark = remark;
        this.lastModifyDate = lastModifyDate;
    }

    public XtPowerSubfield() {
        super();
    }

    public Long getSubfieldId() {
        return subfieldId;
    }

    public void setSubfieldId(Long subfieldId) {
        this.subfieldId = subfieldId;
    }

    public String getSubfieldName() {
        return subfieldName;
    }

    public void setSubfieldName(String subfieldName) {
        this.subfieldName = subfieldName == null ? null : subfieldName.trim();
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
		return "XtPowerSubfield [subfieldId=" + subfieldId + ", subfieldName=" + subfieldName + ", remark=" + remark
				+ ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}