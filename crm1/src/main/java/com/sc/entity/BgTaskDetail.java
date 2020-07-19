package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BgTaskDetail implements Serializable {
    private Long id;

    private Long taskId;

    private Long acceptUserId;

    private String isFinish;

    private String state;

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

    public BgTaskDetail(Long id, Long taskId, Long acceptUserId, String isFinish, String state, Long companyId, Date lastModifyDate) {
        this.id = id;
        this.taskId = taskId;
        this.acceptUserId = acceptUserId;
        this.isFinish = isFinish;
        this.state = state;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public BgTaskDetail() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getAcceptUserId() {
        return acceptUserId;
    }

    public void setAcceptUserId(Long acceptUserId) {
        this.acceptUserId = acceptUserId;
    }

    public String getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(String isFinish) {
        this.isFinish = isFinish == null ? null : isFinish.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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
		return "BgTaskDetail [id=" + id + ", taskId=" + taskId + ", acceptUserId=" + acceptUserId + ", isFinish="
				+ isFinish + ", state=" + state + ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate
				+ "]";
	}
    
}