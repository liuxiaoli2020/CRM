package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.sc.entity.XsSalesDetail;
import com.sc.entity.XsSalesDetailExample;
import com.sc.entity.XsSalesDetailExample.Criteria;
import com.sc.mapper.XsSalesDetailMapper;
import com.sc.service.XsSalesDetailService;
@Service
public class XsSalesDetailServiceImpl implements XsSalesDetailService {

	@Autowired
	XsSalesDetailMapper xsSalesDetailMapper;
	@Override
	public void addSalesDetail(XsSalesDetail salesdetail) {
		// TODO Auto-generated method stub
		xsSalesDetailMapper.insert(salesdetail);
	}

	@Override
	public void updateSalesDetail(XsSalesDetail salesdetail) {
		// TODO Auto-generated method stub
		xsSalesDetailMapper.updateByPrimaryKey(salesdetail);
	}

	@Override
	public void deleteSalesDetail(Long salesDetailId) {
		// TODO Auto-generated method stub
		xsSalesDetailMapper.deleteByPrimaryKey(salesDetailId);
	}

	@Override
	public XsSalesDetail getSalesDetail(Long salesDetailId) {
		// TODO Auto-generated method stub
		if(salesDetailId!=null){
			return xsSalesDetailMapper.selectByPrimaryKey(salesDetailId);
		}
		return null;
	}

	@Override
	public PageInfo<XsSalesDetail> selectSalesDetail(Integer pageNum, Integer pageSize, XsSalesDetail salesdetail) {
		XsSalesDetailExample example =new XsSalesDetailExample();
	
		if(salesdetail!=null){//如果传入的对象不等于空，就进行条件查询
		Criteria criteria = example.createCriteria();
		//通过输入的名字进行查询，所以要判断传入的用户名字
		//if(customercontact.getContactName()!=null&&customercontact.getContactName().equals(""))
	   
	  //对最小输入日期进行判断，如果不为空的话，就让最后修改时间大于等于它
		if(!StringUtils.isEmpty(salesdetail.getDatemin())){//最后修改时间大于等最小
			criteria.andLastModifyDateGreaterThanOrEqualTo(salesdetail.getDatemin());
		}
		if(!StringUtils.isEmpty(salesdetail.getDatemax())){
			Date datemax=salesdetail.getDatemax();
			datemax.setHours(23);
			datemax.setMinutes(59);
			datemax.setSeconds(59);
			System.out.println("---------大时间----------"+datemax);
			criteria.andLastModifyDateGreaterThanOrEqualTo(datemax);
		}
	}
	//分页查询
	 PageHelper.startPage(pageNum, pageSize);
	 List<XsSalesDetail> list = xsSalesDetailMapper.selectByExample(example);
     PageInfo<XsSalesDetail> page=new PageInfo<XsSalesDetail>(list);
      return page;
    }

}