package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.RsBranch;


public interface RsBranchService {
	public List<RsBranch> selectRsBranch();
	public void addRsBranch(RsBranch b);
	public void updateRsBranch(RsBranch b);
	public void deleteRsBranch(RsBranch b);
	public void deleteRsBranch(Long branchId);
	//public RsBranch getRsBranch(String branchName);
	public RsBranch getRsBranch(Long branchId);
	public PageInfo<RsBranch> selectbranchPage(int pageNum,int pageSize);
	public PageInfo<RsBranch> selectbranchPage(int pageNum,int pageSize,String branchName);
}
