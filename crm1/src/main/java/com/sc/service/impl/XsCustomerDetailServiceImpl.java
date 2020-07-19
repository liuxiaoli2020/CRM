package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XsCustomerDetail;
import com.sc.mapper.XsCustomerDetailMapper;
import com.sc.service.XsCustomerDetailService;

@Service
public class XsCustomerDetailServiceImpl implements XsCustomerDetailService {
    
	@Autowired
	XsCustomerDetailMapper xsCustomerDetailMapper;
	
	@Override
	public void addCustomerDetail(XsCustomerDetail customerdetail) {
		xsCustomerDetailMapper.insert(customerdetail);

	}

	@Override
	public void updateCustomerDetail(XsCustomerDetail customerdetail) {
		if(customerdetail!=null&&customerdetail.getCustomerId()!=null){
			xsCustomerDetailMapper.updateByPrimaryKey(customerdetail);
		}

	}

	@Override
	public void deleteCustomerDetail(Long customerId) {
		if(customerId!=null){
			xsCustomerDetailMapper.deleteByPrimaryKey(customerId);
		}

	}

	@Override
	public XsCustomerDetail getCustomer(Long customerId) {
		if(customerId!=null){
			return xsCustomerDetailMapper.selectByPrimaryKey(customerId);
		}
		return null;
	}

	@Override
	public PageInfo<XsCustomerDetail> selectCustomerDetail(Integer pageNum, Integer pageSize,
			XsCustomerDetail customerdetail) {
		PageHelper.startPage(pageNum, pageSize);
		List<XsCustomerDetail> list = xsCustomerDetailMapper.selectByExample(null);
		PageInfo<XsCustomerDetail> page=new PageInfo<XsCustomerDetail>(list);
		return page;
	}

	
}
