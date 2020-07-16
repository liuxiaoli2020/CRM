package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.RsBranch;
import com.sc.mapper.RsBranchMapper;
import com.sc.service.RsBranchService;
@Service
public class RsBranchServiceImpl implements RsBranchService {
    @Autowired
	RsBranchMapper rsBranchMapper;
	@Override
	public List<RsBranch> selectRsBranch() {
		return this.rsBranchMapper.selectByExample(null);
	}

	@Override
	public void addRsBranch(RsBranch b) {
		if (b!=null) {
			this.rsBranchMapper.insert(b);
		}
	}

	@Override
	public void updateRsBranch(RsBranch b) {
		this.rsBranchMapper.updateByPrimaryKey(b);

	}

	@Override
	public void deleteRsBranch(RsBranch b) {
		this.rsBranchMapper.deleteByPrimaryKey(b.getBranchId());

	}

	/*@Override
	public RsBranch getRsBranch(String branchName) {
		return this.rsBranchMapper.selectByName(branchName);
	}*/

	@Override
	public RsBranch getRsBranch(Long branchId) {
		return this.rsBranchMapper.selectByPrimaryKey(branchId);
	}

	@Override
	public PageInfo<RsBranch> selectbranchPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<RsBranch> list=this.rsBranchMapper.selectByExample(null);
		PageInfo<RsBranch> pageInfo=new PageInfo<RsBranch>(list);
		
		return pageInfo;
	}

	@Override
	public void deleteRsBranch(Long branchId) {
		this.rsBranchMapper.deleteByPrimaryKey(branchId);

	}

	@Override
	public PageInfo<RsBranch> selectbranchPage(int pageNum, int pageSize, String branchName) {
		PageHelper.startPage(pageNum, pageSize);
		List<RsBranch> list=this.rsBranchMapper.selectByName(branchName);
		PageInfo<RsBranch> pageInfo=new PageInfo<RsBranch>(list);
		
		return pageInfo;
	}

}
