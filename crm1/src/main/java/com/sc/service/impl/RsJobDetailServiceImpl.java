package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.RsJobDetail;
import com.sc.mapper.RsJobDetailMapper;
import com.sc.service.RsJobDetailService;
@Service
public class RsJobDetailServiceImpl implements RsJobDetailService {

	@Autowired
	RsJobDetailMapper rsJobDetailMapper;
	@Override
	public List<RsJobDetail> selectRsJobDetail() {
		return this.rsJobDetailMapper.selectByExample(null);
	}

	@Override
	public void addRsJobDetail(RsJobDetail j) {
		this.rsJobDetailMapper.insert(j);

	}

	@Override
	public void updateRsJobDetail(RsJobDetail j) {
		this.rsJobDetailMapper.updateByPrimaryKey(j);

	}

	@Override
	public void deleteRsJobDetail(RsJobDetail j) {
		this.rsJobDetailMapper.deleteByPrimaryKey(j.getJobId());

	}

	/*@Override
	public RsJobDetail getRsJobDetail(String jobName) {
		return this.rsJobDetailMapper.selectByName(jobName);
	}*/

	@Override
	public RsJobDetail getRsJobDetail(Long jobId) {
		return this.rsJobDetailMapper.selectByPrimaryKey(jobId);
	}

	@Override
	public PageInfo<RsJobDetail> selectjobPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<RsJobDetail> list = this.rsJobDetailMapper.selectByExample(null);
		PageInfo<RsJobDetail> info=new PageInfo<RsJobDetail>(list);
		return info;
	}

	@Override
	public void deleteRsJobDetail(Long jobId) {
		this.rsJobDetailMapper.deleteByPrimaryKey(jobId);
		
	}

	@Override
	public PageInfo<RsJobDetail> selectjobName(int pageNum, int pageSize, String jobName) {
		PageHelper.startPage(pageNum, pageSize);
		List<RsJobDetail> list = this.rsJobDetailMapper.selectByName(jobName);
		PageInfo<RsJobDetail> info=new PageInfo<RsJobDetail>(list);
		return info;
	}

}
