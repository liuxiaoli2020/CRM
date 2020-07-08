package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BgCheckTask implements Serializable {
    private Long taskId;

    private Long taskTitle;

    private String taskDetail;

    private String taskPublisher;

    private String taskTarget;

    private String taskStatr;

    private String taskFinish;

    private Long companyId;

    @DateTimeFormat(pattern="yyyy-mm-dd hh:mm:ss")
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public BgCheckTask(Long taskId, Long taskTitle, String taskDetail, String taskPublisher, String taskTarget, String taskStatr, String taskFinish, Long companyId, Date lastModifyDate) {
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

    public Long getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(Long taskTitle) {
        this.taskTitle = taskTitle;
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

	@Override
	public String toString() {
		return "BgCheckTask [taskId=" + taskId + ", taskTitle=" + taskTitle + ", taskDetail=" + taskDetail
				+ ", taskPublisher=" + taskPublisher + ", taskTarget=" + taskTarget + ", taskStatr=" + taskStatr
				+ ", taskFinish=" + taskFinish + ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate
				+ "]";
	}
    
}