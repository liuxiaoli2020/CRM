package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BgMsg implements Serializable {
    private Long msgId;

    private String msgTitle;

    private String msgDetail;

    private String msgSender;

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

    public BgMsg(Long msgId, String msgTitle, String msgDetail, String msgSender, Long companyId, Date lastModifyDate) {
        this.msgId = msgId;
        this.msgTitle = msgTitle;
        this.msgDetail = msgDetail;
        this.msgSender = msgSender;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public BgMsg() {
        super();
    }

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle == null ? null : msgTitle.trim();
    }

    public String getMsgDetail() {
        return msgDetail;
    }

    public void setMsgDetail(String msgDetail) {
        this.msgDetail = msgDetail == null ? null : msgDetail.trim();
    }

    public String getMsgSender() {
        return msgSender;
    }

    public void setMsgSender(String msgSender) {
        this.msgSender = msgSender == null ? null : msgSender.trim();
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
		return "BgMsg [msgId=" + msgId + ", msgTitle=" + msgTitle + ", msgDetail=" + msgDetail + ", msgSender="
				+ msgSender + ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}