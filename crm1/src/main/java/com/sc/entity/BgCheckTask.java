package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BgCheckTask implements Serializable {
    private Long taskId;

    private String taskTitle;

    private String taskDetail;

    private String taskPublisher;

    private String taskTarget;

    private String taskStatr;

    private String taskFinish;

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
	
/*    //扩展属性,用于批量删除-start
    private Long[] ids;
    
    public Long[] getIds() {
		return ids;
	}

	public void setIds(Long[] ids) {
		this.ids = ids;
	}
    //扩展属性,用于批量删除-end
*/
	private static final long serialVersionUID = 1L;

    public BgCheckTask(Long taskId, String taskTitle, String taskDetail, String taskPublisher, String taskTarget, String taskStatr, String taskFinish, Long companyId, Date lastModifyDate) {
        this.taskId = taskId;
        this.taskTitle = taskTitle;
        this.taskDetail = taskDetail;
        this.taskPublisher = taskPublisher;
        this.taskTarget = taskTarget;
        this.taskStatr = taskStatr;
        this.taskFinish = taskFinish;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public BgCheckTask() {
        super();
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle == null ? null : taskTitle.trim();
    }

    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail == null ? null : taskDetail.trim();
    }

    public String getTaskPublisher() {
        return taskPublisher;
    }

    public void setTaskPublisher(String taskPublisher) {
        this.taskPublisher = taskPublisher == null ? null : taskPublisher.trim();
    }

    public String getTaskTarget() {
        return taskTarget;
    }

    public void setTaskTarget(String taskTarget) {
        this.taskTarget = taskTarget == null ? null : taskTarget.trim();
    }

    public String getTaskStatr() {
        return taskStatr;
    }

    public void setTaskStatr(String taskStatr) {
        this.taskStatr = taskStatr == null ? null : taskStatr.trim();
    }

    public String getTaskFinish() {
        return taskFinish;
    }

    public void setTaskFinish(String taskFinish) {
        this.taskFinish = taskFinish == null ? null : taskFinish.trim();
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
}