package com.sc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XsUserLoss;


public interface XsUserLossService {
	public List<XsUserLoss> selectXsUserLoss();
	//public void addRsJobDetail(RsJobDetail j);
	public void updateXsUserLoss(XsUserLoss u);
	//public void deleteRsJobDetail(RsJobDetail j);
	//public void deleteRsJobDetail(Long jobId);
	//public RsJobDetail getRsJobDetail(String jobName);
	public XsUserLoss getXsUserLoss(Long customerLossId);
	public XsUserLoss getXsUserLosskey(Long customerLossId);
	public PageInfo<XsUserLoss> selectuserPage(int pageNum,int pageSize);
	//public PageInfo<RsJobDetail> selectjobName(int pageNum,int pageSize,String jobName);
}
