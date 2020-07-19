package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgCheckTask;

public interface BgCheckTaskService {

	public void addTask(BgCheckTask task);
	
	public void updateTask(BgCheckTask task);
	
	public void deleteTask(Long taskId);
	
	public BgCheckTask getTask(Long taskId);
	
	public PageInfo<BgCheckTask> selectTask(Integer pageNum,Integer pageSize,BgCheckTask task);
}
