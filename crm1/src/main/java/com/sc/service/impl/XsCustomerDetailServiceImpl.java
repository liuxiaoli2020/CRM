package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.sc.entity.XsCustomerDetail;
import com.sc.entity.XsCustomerDetailExample;
import com.sc.entity.XsCustomerDetailExample.Criteria;
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
		
		XsCustomerDetailExample example=new XsCustomerDetailExample();
		if(customerdetail!=null){//如果传入的对象不等于空，就进行条件查询
			Criteria criteria = example.createCriteria();
			//通过输入的名字进行查询，所以要判断传入的用户名字
			//if(customerdetail.getCustomerName()!=null&&customerdetail.getCustomerName().equals(""))
		    if(!StringUtils.isEmpty(customerdetail.getCustomerName())){//用户名称模糊查询
		    	criteria.andCustomerNameLike("%"+customerdetail.getCustomerName()+"%");//带上通配符
		    }
			//对最小输入日期进行判断，如果不为空的话，就让最后修改时间大于等于它
			if(!StringUtils.isEmpty(customerdetail.getDatemin())){//最后修改时间大于等最小
				criteria.andLastModifyDateGreaterThanOrEqualTo(customerdetail.getDatemin());
			}
			if(!StringUtils.isEmpty(customerdetail.getDatemax())){
				Date datemax=customerdetail.getDatemax();
				datemax.setHours(23);
				datemax.setMinutes(59);
				datemax.setSeconds(59);
				System.out.println("---------大时间----------"+datemax);
				criteria.andLastModifyDateGreaterThanOrEqualTo(datemax);
			}
		}
		//分页查询
		PageHelper.startPage(pageNum, pageSize);
		List<XsCustomerDetail> list = xsCustomerDetailMapper.selectByExample(example);
		PageInfo<XsCustomerDetail> page=new PageInfo<XsCustomerDetail>(list);
		return page;
	}

	
}
