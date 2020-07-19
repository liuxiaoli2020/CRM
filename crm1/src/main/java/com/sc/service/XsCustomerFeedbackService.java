package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XsCustomerFeedback;

public interface XsCustomerFeedbackService {
	//XsCustomerFeedback getCustomer(Long customerId);
	public void deleteXsCustomerFeedback(Long feedbackRecordId);
	XsCustomerFeedback getCustomerFeedback(Long feedbackRecordId);
	public PageInfo<XsCustomerFeedback> selectXsCustomerFeedback(Integer pageNum,Integer pageSize);
	public PageInfo<XsCustomerFeedback> selectPage(int pageNum,int pageSize,XsCustomerFeedback u);

}
