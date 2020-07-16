package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.RsCompanyDetail;
import com.sc.mapper.RsCompanyDetailMapper;
import com.sc.service.RsCompanyDetailService;

import oracle.net.aso.c;
@Service
public class RsCompanyDetailServiceImpl implements RsCompanyDetailService {

	@Autowired
	RsCompanyDetailMapper rsCompanyDetailMapper;
	@Override
	public List<RsCompanyDetail> selectRsCompanyDetail() {
		
		return this.rsCompanyDetailMapper.selectByExample(null);
	}

	@Override
	public void addRsCompanyDetail(RsCompanyDetail c) {
		this.rsCompanyDetailMapper.insert(c);

	}

	@Override
	public void updateRsCompanyDetail(RsCompanyDetail c) {
		this.rsCompanyDetailMapper.updateByPrimaryKey(c);

	}

	@Override
	public void deleteRsCompanyDetail(RsCompanyDetail c) {
		this.rsCompanyDetailMapper.deleteByPrimaryKey(c.getCompanyId());

	}

	/*@Override
	public RsCompanyDetail getRsCompanyDetail(String companyName) {
		return this.rsCompanyDetailMapper.selectByName(companyName);
	}*/

	@Override
	public RsCompanyDetail getRsCompanyDetail(BigDecimal companyId) {
		return this.rsCompanyDetailMapper.selectByPrimaryKey(companyId);
	}

	@Override
	public PageInfo<RsCompanyDetail> selectcompanyPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<RsCompanyDetail> list = this.rsCompanyDetailMapper.selectByExample(null);
		PageInfo<RsCompanyDetail> pageInfo=new PageInfo<RsCompanyDetail>(list);
		return pageInfo;
	}

	@Override
	public void deleteRsCompanyDetail(BigDecimal companyId) {
		this.rsCompanyDetailMapper.deleteByPrimaryKey(companyId);
		
	}

	@Override
	public PageInfo<RsCompanyDetail> selectcompany(int pageNum, int pageSize, String companyName) {
		PageHelper.startPage(pageNum, pageSize);
		List<RsCompanyDetail> list = this.rsCompanyDetailMapper.selectByName(companyName);
		PageInfo<RsCompanyDetail> pageInfo=new PageInfo<RsCompanyDetail>(list);
		return pageInfo;
	}

	
}
