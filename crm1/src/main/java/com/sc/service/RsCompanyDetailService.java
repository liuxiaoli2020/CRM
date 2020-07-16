package com.sc.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.RsCompanyDetail;



public interface RsCompanyDetailService {
	public List<RsCompanyDetail> selectRsCompanyDetail();
	public void addRsCompanyDetail(RsCompanyDetail c);
	public void updateRsCompanyDetail(RsCompanyDetail c);
	public void deleteRsCompanyDetail(RsCompanyDetail c);
	public void deleteRsCompanyDetail(BigDecimal companyId);
	/*public RsCompanyDetail getRsCompanyDetail(String companyName);*/
	public RsCompanyDetail getRsCompanyDetail(BigDecimal companyId);
	public PageInfo<RsCompanyDetail> selectcompanyPage(int pageNum,int pageSize);
	public PageInfo<RsCompanyDetail> selectcompany(int pageNum,int pageSize,String companyName);
	
}
