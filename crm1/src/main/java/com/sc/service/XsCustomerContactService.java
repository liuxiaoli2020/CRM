package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XsCustomerContact;


public interface XsCustomerContactService {
    public void addCustomerContact(XsCustomerContact customercontact);
    
    public void updateCustomerContact(XsCustomerContact customercontact);
    
    public void deleteCustomerContact(Long contactId);
    
    XsCustomerContact getCustomerContact(Long contactId);
    
    public PageInfo<XsCustomerContact> selectCustomerContact(Integer pageNum,Integer pageSize,XsCustomerContact customercontact);

}
