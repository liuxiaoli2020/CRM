package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XsCustomerDetail;

public interface XsCustomerDetailService {
    public void addCustomerDetail(XsCustomerDetail customerdetail);
    
    public void updateCustomerDetail(XsCustomerDetail customerdetail);
    
    public void deleteCustomerDetail(Long customerId);
    
    XsCustomerDetail getCustomer(Long customerId);
    
    public PageInfo<XsCustomerDetail> selectCustomerDetail(Integer pageNum,Integer pageSize,XsCustomerDetail customerdetail);

}
