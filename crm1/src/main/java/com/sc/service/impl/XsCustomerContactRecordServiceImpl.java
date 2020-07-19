package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XsCustomerContactRecord;
import com.sc.entity.XsCustomerDetail;
import com.sc.mapper.XsCustomerContactRecordMapper;
import com.sc.mapper.XsCustomerDetailMapper;
import com.sc.service.XsCustomerContactRecordService;

@Service
public class XsCustomerContactRecordServiceImpl implements XsCustomerContactRecordService {

	@Autowired
	XsCustomerContactRecordMapper XsCCRMapper;
	@Autowired
	XsCustomerDetailMapper xsCDMapper;
	
	@Override
	public void addXsCustomerContactRecord(XsCustomerContactRecord u) {
		this.XsCCRMapper.insert(u);

	}

	@Override
	public void deleteXsCustomerContactRecord(Long contactRecordId) {
		this.XsCCRMapper.deleteByPrimaryKey(contactRecordId);

	}

	@Override
	public XsCustomerContactRecord getXsCustomerContactRecord(Long contactRecordId) {
		
		return this.XsCCRMapper.selectByPrimaryKey(contactRecordId);
	}

	@Override
	public PageInfo<XsCustomerContactRecord> selectcustomerPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<XsCustomerContactRecord> list = this.XsCCRMapper.selectByExample(null);
		PageInfo<XsCustomerContactRecord> pageInfo=new PageInfo<XsCustomerContactRecord>(list);
		return pageInfo;
	}

	@Override
	public List<XsCustomerContactRecord> selectXsCustomerContactRecord() {
		
		return this.XsCCRMapper.selectByExample(null);
	}
	
	
	@Override
	public XsCustomerDetail getCustomer(Long customerId) {
		if(customerId!=null){
			return xsCDMapper.selectByPrimaryKey(customerId);
		}
		return null;
	}

	@Override
	public PageInfo<XsCustomerContactRecord> selectPage(int pageNum, int pageSize, XsCustomerContactRecord u) {
		PageHelper.startPage(pageNum, pageSize);
		List<XsCustomerContactRecord> list = this.XsCCRMapper.selectcustomerId(u.getCustomerId());
		PageInfo<XsCustomerContactRecord> pageInfo=new PageInfo<XsCustomerContactRecord>(list);
		return pageInfo;
	}

}
