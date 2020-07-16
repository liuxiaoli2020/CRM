package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.RsUserDetail;
import com.sc.mapper.RsUserDetailMapper;
import com.sc.service.RsUserDetailService;
@Service
public class RsUserDetailServiceImpl implements RsUserDetailService {

	@Autowired
	RsUserDetailMapper rsUserDetailMapper;
	
	@Override
	public List<RsUserDetail> selectRsUserDetails() {
		return this.rsUserDetailMapper.selectByExample(null);
	}

	@Override
	public void addRsUserDetails(RsUserDetail u) {
		if (u!=null) {
			this.rsUserDetailMapper.insert(u);
		}

	}

	@Override
	public void updateRsUserDetails(RsUserDetail u) {
		this.rsUserDetailMapper.updateByPrimaryKey(u);

	}

	@Override
	public void deleteRsUserDetails(RsUserDetail u) {
		this.rsUserDetailMapper.deleteByPrimaryKey(u.getStaffId());

	}

	/*@Override
	public RsUserDetail getRsUserDetail(String staffName) {
		
		return this.rsUserDetailMapper.selectByName(staffName);
	}*/

	@Override
	public PageInfo<RsUserDetail> selectStaffPage(int pageNum, int pageSize) {
	
		PageHelper.startPage(pageNum, pageSize);
		List<RsUserDetail> list=this.rsUserDetailMapper.selectByExample(null);
		PageInfo<RsUserDetail> pageInfo=new PageInfo<RsUserDetail>(list);
		return pageInfo;
	}

	@Override
	public RsUserDetail getRsUserDetail(Long staffId) {
		return this.rsUserDetailMapper.selectByPrimaryKey(staffId);
	}

	@Override
	public PageInfo<RsUserDetail> selectStaffName(int pageNum, int pageSize,String staffName) {
		PageHelper.startPage(pageNum, pageSize);
		List<RsUserDetail> list=this.rsUserDetailMapper.selectByName(staffName);
		PageInfo<RsUserDetail> pageInfo=new PageInfo<RsUserDetail>(list);
		return pageInfo;
	}

	@Override
	public void deleteRsUserDetails(Long staffId) {
		this.rsUserDetailMapper.deleteByPrimaryKey(staffId);
		
	}

}
