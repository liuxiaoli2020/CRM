package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.RsUserDetail;

public interface RsUserDetailService {

	public List<RsUserDetail> selectRsUserDetails();
	public void addRsUserDetails(RsUserDetail u);
	public void updateRsUserDetails(RsUserDetail u);
	public void deleteRsUserDetails(RsUserDetail u);
	public void deleteRsUserDetails(Long staffId);
	/*public RsUserDetail getRsUserDetail(String staffName);*/
	public RsUserDetail getRsUserDetail(Long staffId);
	public PageInfo<RsUserDetail> selectStaffPage(int pageNum,int pageSize);
	public PageInfo<RsUserDetail> selectStaffName(int pageNum,int pageSize,String staffName);
}
