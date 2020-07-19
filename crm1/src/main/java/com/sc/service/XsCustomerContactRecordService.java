package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XsCustomerContactRecord;
import com.sc.entity.XsCustomerDetail;

public interface XsCustomerContactRecordService {

	public List<XsCustomerContactRecord> selectXsCustomerContactRecord();
	public void addXsCustomerContactRecord(XsCustomerContactRecord u);
	//public void updateRsUserDetails(RsUserDetail u);
	//public void deleteRsUserDetails(RsUserDetail u);
	public void deleteXsCustomerContactRecord(Long contactRecordId);
	/*public RsUserDetail getRsUserDetail(String staffName);*/
	
    
    XsCustomerDetail getCustomer(Long customerId);
	public XsCustomerContactRecord getXsCustomerContactRecord(Long contactRecordId);
	public PageInfo<XsCustomerContactRecord> selectcustomerPage(int pageNum,int pageSize);
	public PageInfo<XsCustomerContactRecord> selectPage(int pageNum,int pageSize,XsCustomerContactRecord u);
}
