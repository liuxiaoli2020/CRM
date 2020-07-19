package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgTaskDetail;

public interface BgTaskDetailService {

	public void addTaskDetail(BgTaskDetail tdetail);
	
	public void updateTaskDetail(BgTaskDetail tdetail);
	
	public void deleteTaskDetail(Long id);
	
	public BgTaskDetail getTaskDetail(Long id);
	
	public PageInfo<BgTaskDetail> selectTaskDetail(Integer pageNum,Integer pageSize,BgTaskDetail tdetail);
}
