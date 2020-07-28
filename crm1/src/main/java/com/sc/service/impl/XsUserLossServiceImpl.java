package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XsUserLoss;
import com.sc.mapper.XsUserLossMapper;
import com.sc.service.XsUserLossService;
@Service
public class XsUserLossServiceImpl implements XsUserLossService {

	@Autowired
	XsUserLossMapper xsUserLossMapper;
	@Override
	public List<XsUserLoss> selectXsUserLoss() {
		return this.xsUserLossMapper.selectByExample(null);
	}

	@Override
	public void updateXsUserLoss(XsUserLoss u) {
		this.xsUserLossMapper.updateByPrimaryKey(u);
	}

	@Override
	public XsUserLoss getXsUserLoss(Long customerLossId) {
		return this.xsUserLossMapper.selectByPrimaryKey(customerLossId);
	}

	@Override
	public PageInfo<XsUserLoss> selectuserPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<XsUserLoss> list = this.xsUserLossMapper.selectByExample(null);
		PageInfo<XsUserLoss> pageInfo=new PageInfo<XsUserLoss>(list);
		return pageInfo;
	}

	@Override
	public XsUserLoss getXsUserLosskey(Long customerLossId) {
		return this.xsUserLossMapper.selectByPrimaryKey(customerLossId);
	}

	@Override
	public void deleteXsUserLoss(Long customerLossId) {
		this.xsUserLossMapper.deleteByPrimaryKey(customerLossId);
		
	}

	@Override
	public PageInfo<XsUserLoss> likeselect(int pageNum, int pageSize, String isLoss) {
		PageHelper.startPage(pageNum, pageSize);
		List<XsUserLoss> list = this.xsUserLossMapper.likeselect(isLoss);
		PageInfo<XsUserLoss> pageInfo=new PageInfo<XsUserLoss>(list);
		return pageInfo;
	}

	

}
