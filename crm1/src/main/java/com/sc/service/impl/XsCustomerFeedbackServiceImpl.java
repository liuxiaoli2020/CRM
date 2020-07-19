package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XsCustomerContactRecord;
import com.sc.entity.XsCustomerDetail;
import com.sc.entity.XsCustomerFeedback;
import com.sc.mapper.XsCustomerFeedbackMapper;
import com.sc.service.XsCustomerFeedbackService;
@Service
public class XsCustomerFeedbackServiceImpl implements XsCustomerFeedbackService {

	@Autowired
	XsCustomerFeedbackMapper xsCFMapper;

	/*@Override
	public XsCustomerFeedback getCustomer(Long customerId) {
		return this.xsCFMapper.selectcustomerId(customerId);
	}*/

	@Override
	public PageInfo<XsCustomerFeedback> selectXsCustomerFeedback(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<XsCustomerFeedback> list = xsCFMapper.selectByExample(null);
		PageInfo<XsCustomerFeedback> page=new PageInfo<XsCustomerFeedback>(list);
		return page;
	}

	@Override
	public XsCustomerFeedback getCustomerFeedback(Long feedbackRecordId) {
		return this.xsCFMapper.selectByPrimaryKey(feedbackRecordId);
	}

	@Override
	public PageInfo<XsCustomerFeedback> selectPage(int pageNum, int pageSize, XsCustomerFeedback u) {
		PageHelper.startPage(pageNum, pageSize);
		List<XsCustomerFeedback> list = this.xsCFMapper.selectcustomerId(u.getCustomerId());
		PageInfo<XsCustomerFeedback> pageInfo=new PageInfo<XsCustomerFeedback>(list);
		return pageInfo;
	}

	@Override
	public void deleteXsCustomerFeedback(Long feedbackRecordId) {
		this.xsCFMapper.deleteByPrimaryKey(feedbackRecordId);
		
	}
	

}
