package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.RsJobDetail;


public interface RsJobDetailService {
	public List<RsJobDetail> selectRsJobDetail();
	public void addRsJobDetail(RsJobDetail j);
	public void updateRsJobDetail(RsJobDetail j);
	public void deleteRsJobDetail(RsJobDetail j);
	public void deleteRsJobDetail(Long jobId);
	//public RsJobDetail getRsJobDetail(String jobName);
	public RsJobDetail getRsJobDetail(Long jobId);
	public PageInfo<RsJobDetail> selectjobPage(int pageNum,int pageSize);
	public PageInfo<RsJobDetail> selectjobName(int pageNum,int pageSize,String jobName);
}
