package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XsSalesOut;


public interface XsSalesOutService {
	    public void addSalesOut(XsSalesOut salesout);
	    
	    public void updateSalesOut(XsSalesOut salesout);
	    
	    public void deleteSalesOut(Long salesOrderId);
	    
	    XsSalesOut getSalesOut(Long salesOrderId);
	    
	    public PageInfo<XsSalesOut> selectSalesOut(Integer pageNum,Integer pageSize,XsSalesOut salesout);
}
