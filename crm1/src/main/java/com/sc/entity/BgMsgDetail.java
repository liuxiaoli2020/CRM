package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BgMsgDetail implements Serializable {
    private Long msgDetailId;

    private Long msgId;

    private Long acceptId;

    private String msgState;

    private Long companyId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;

    //扩展属性,用于查询-start
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datemin;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datemax; 
    
    public Date getDatemin() {
		return datemin;
	}

	public void setDatemin(Date datemin) {
		this.datemin = datemin;
	}

	public Date getDatemax() {
		return datemax;
	}

	public void setDatemax(Date datemax) {
		this.datemax = datemax;
	}
    //扩展属性,用于查询-end
    
    private static final long serialVersionUID = 1L;

    public BgMsgDetail(Long msgDetailId, Long msgId, Long acceptId, String msgState, Long companyId, Date lastModifyDate) {
        this.msgDetailId = msgDetailId;
        this.msgId = msgId;
        this.acceptId = acceptId;
        this.msgState = msgState;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public BgMsgDetail() {
        super();
    }

    public Long getMsgDetailId() {
        return msgDetailId;
    }

    public void setMsgDetailId(Long msgDetailId) {
        this.msgDetailId = msgDetailId;
    }

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    public Long getAcceptId() {
        return acceptId;
    }

    public void setAcceptId(Long acceptId) {
        this.acceptId = acceptId;
    }

    public String getMsgState() {
        return msgState;
    }

    public void setMsgState(String msgState) {
        this.msgState = msgState == null ? null : msgState.trim();
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
		return "BgMsgDetail [msgDetailId=" + msgDetailId + ", msgId=" + msgId + ", acceptId=" + acceptId + ", msgState="
				+ msgState + ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}