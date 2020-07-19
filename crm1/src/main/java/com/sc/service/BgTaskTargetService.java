package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgTaskTarget;

public interface BgTaskTargetService {
	
	public void addTaskTarget(BgTaskTarget target);
	
	public void updateTaskTarget(BgTaskTarget target);
	
	public void deleteTaskTarget(Long targetId);
	
	public BgTaskTarget getTaskTarget(Long targetId);
	
	public PageInfo<BgTaskTarget> selectTaskTarget(Integer pageNum,Integer pageSize,BgTaskTarget target);
}
