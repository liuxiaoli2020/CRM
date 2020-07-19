package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XsCustomerContact;
import com.sc.entity.XsCustomerContactExample;

import com.sc.entity.XsCustomerContactExample.Criteria;
import com.sc.mapper.XsCustomerContactMapper;
import com.sc.service.XsCustomerContactService;

@Service
public class XsCustomerContactServiceImpl implements XsCustomerContactService {

	@Autowired
	XsCustomerContactMapper xsCustomerContactMapper;
	
	
	@Override
	public void addCustomerContact(XsCustomerContact customercontact) {
		// TODO Auto-generated method stub
		xsCustomerContactMapper.insert(customercontact);
	}

	@Override
	public void updateCustomerContact(XsCustomerContact customercontact) {
		// TODO Auto-generated method stub
		if(customercontact!=null&&customercontact.getContactId()!=null){
			xsCustomerContactMapper.updateByPrimaryKey(customercontact);
		}

	}
	

	@Override
	public void deleteCustomerContact(Long contactId) {
		// TODO Auto-generated method stub
		if(contactId!=null){
			xsCustomerContactMapper.deleteByPrimaryKey(contactId);
		}
	}

	@Override
	public XsCustomerContact getCustomerContact(Long contactId) {
		// TODO Auto-generated method stub
		if(contactId!=null){
			return xsCustomerContactMapper.selectByPrimaryKey(contactId);
		}
		return null;
	}

	@Override
	public PageInfo<XsCustomerContact> selectCustomerContact(Integer pageNum, Integer pageSize,
			XsCustomerContact customercontact) {
		
		XsCustomerContactExample example=new XsCustomerContactExample();
		if(customercontact!=null){//如果传入的对象不等于空，就进行条件查询
		Criteria criteria = example.createCriteria();
		//通过输入的名字进行查询，所以要判断传入的用户名字
		//if(customercontact.getContactName()!=null&&customercontact.getContactName().equals(""))
	    if(!StringUtils.isEmpty(customercontact.getContactName())){//用户名称模糊查询
	    	criteria.andContactNameLike("%"+customercontact.getContactName()+"%");//带上通配符
	    }
	  //对最小输入日期进行判断，如果不为空的话，就让最后修改时间大于等于它
		if(!StringUtils.isEmpty(customercontact.getDatemin())){//最后修改时间大于等最小
			criteria.andLastModifyDateGreaterThanOrEqualTo(customercontact.getDatemin());
		}
		if(!StringUtils.isEmpty(customercontact.getDatemax())){
			Date datemax=customercontact.getDatemax();
			datemax.setHours(23);
			datemax.setMinutes(59);
			datemax.setSeconds(59);
			System.out.println("---------大时间----------"+datemax);
			criteria.andLastModifyDateGreaterThanOrEqualTo(datemax);
		}
	}
	//分页查询
	 PageHelper.startPage(pageNum, pageSize);
	 List<XsCustomerContact> list = xsCustomerContactMapper.selectByExample(example);
     PageInfo<XsCustomerContact> page=new PageInfo<XsCustomerContact>(list);
      return page;
    }

}
