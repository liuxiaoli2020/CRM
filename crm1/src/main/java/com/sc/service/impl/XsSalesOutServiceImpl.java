package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.sc.entity.XsSalesOut;
import com.sc.entity.XsSalesOutExample;
import com.sc.entity.XsSalesOutExample.Criteria;
import com.sc.mapper.XsSalesOutMapper;
import com.sc.service.XsSalesOutService;
@Service
public class XsSalesOutServiceImpl implements XsSalesOutService {

	@Autowired
	XsSalesOutMapper xsSalesOutMapper;
	
	@Override
	public void addSalesOut(XsSalesOut salesout) {
		// TODO Auto-generated method stub
		xsSalesOutMapper.insert(salesout);
         
	}

	@Override
	public void updateSalesOut(XsSalesOut salesout) {
		// TODO Auto-generated method stub
		if(salesout!=null&&salesout.getSalesOrderId()!=null){
			xsSalesOutMapper.updateByPrimaryKey(salesout);
		}
		
	}

	@Override
	public void deleteSalesOut(Long salesOrderId) {
		// TODO Auto-generated method stub
		if(salesOrderId!=null){
			xsSalesOutMapper.deleteByPrimaryKey(salesOrderId);
		}
	}

	@Override
	public XsSalesOut getSalesOut(Long salesOrderId) {
		// TODO Auto-generated method stub
		if(salesOrderId!=null){
			return xsSalesOutMapper.selectByPrimaryKey(salesOrderId);
		}
		return null;
	}

	@Override
	public PageInfo<XsSalesOut> selectSalesOut(Integer pageNum, Integer pageSize, XsSalesOut salesout) {
		// TODO Auto-generated method stub
		XsSalesOutExample example=new XsSalesOutExample();
		if(salesout!=null){//如果传入的对象不等于空，就进行条件查询
			Criteria criteria  = example.createCriteria();
			//通过输入的名字进行查询，所以要判断传入的用户名字
			//if(customercontact.getContactName()!=null&&customercontact.getContactName().equals(""))
		   
		  //对最小输入日期进行判断，如果不为空的话，就让最后修改时间大于等于它
			if(!StringUtils.isEmpty(salesout.getDatemin())){//最后修改时间大于等最小
				criteria.andLastModifyDateGreaterThanOrEqualTo(salesout.getDatemin());
			}
			if(!StringUtils.isEmpty(salesout.getDatemax())){
				Date datemax=salesout.getDatemax();
				datemax.setHours(23);
				datemax.setMinutes(59);
				datemax.setSeconds(59);
				System.out.println("---------大时间----------"+datemax);
				criteria.andLastModifyDateGreaterThanOrEqualTo(datemax);
			}
		}
		//分页查询
		 PageHelper.startPage(pageNum, pageSize);
		 List<XsSalesOut> list = xsSalesOutMapper.selectByExample(example);
	     PageInfo<XsSalesOut> page=new PageInfo<XsSalesOut>(list);
	      return page;
	    }


}
