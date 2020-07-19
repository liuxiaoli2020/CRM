package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XsSalesDetail;

public interface XsSalesDetailService {
	    public void addSalesDetail(XsSalesDetail salesdetail);
	    
	    public void updateSalesDetail(XsSalesDetail salesdetail);
	    
	    public void deleteSalesDetail(Long salesDetailId);
	    
	    XsSalesDetail getSalesDetail(Long salesDetailId);
	    
	    public PageInfo<XsSalesDetail> selectSalesDetail(Integer pageNum,Integer pageSize,XsSalesDetail salesdetail);
}
