package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtUserAccount;
import com.sc.entity.XtUserAccountExample;
import com.sc.entity.XtUserAccountExample.Criteria;
import com.sc.mapper.XtUserAccountMapper;
import com.sc.service.XtUserAccountService;

@Service
public class XtUserAccountServiceImpl implements XtUserAccountService
{
	@Autowired
	XtUserAccountMapper xtUserAccountMapper;
	
	@Override
	public void addXtUserAccount(XtUserAccount UserAccount)
	{
		xtUserAccountMapper.insert(UserAccount);

	}

	@Override
	public void updateXtUserAccount(XtUserAccount UserAccount)
	{
		if(UserAccount!=null&&UserAccount.getUserId()!=null)
		{
			xtUserAccountMapper.updateByPrimaryKey(UserAccount);
		}

	}

	@Override
	public void deleteXtUserAccount(BigDecimal userId)
	{
		if(userId!=null)
		{
			xtUserAccountMapper.deleteByPrimaryKey(userId);
		}

	}

	@Override
	public XtUserAccount getXtUserAccount(BigDecimal userId)
	{
		if(userId!=null)
		{
			return xtUserAccountMapper.selectByPrimaryKey(userId);
		}
		return null;
	}

	@Override
	public PageInfo<XtUserAccount> seleteXtUserAccount(Integer pageNum, Integer pageSize, XtUserAccount UserAccount)
	{
		XtUserAccountExample example=new XtUserAccountExample();
		if(UserAccount!=null)
		{
			Criteria criteria = example.createCriteria();
			
			System.out.println("进入搜索方法了");
			
			//新的判空方法，用工具包
			if(!StringUtils.isEmpty(UserAccount.getUserName()))
			{
				criteria.andUserNameLike("%"+UserAccount.getUserName()+"%");//用户名模糊查询
			}if(!StringUtils.isEmpty(UserAccount.getDatemin()))
			{
				//最后修改时间大于等于最小日期
				criteria.andLastModifyDateGreaterThanOrEqualTo(UserAccount.getDatemin());
			}if(!StringUtils.isEmpty(UserAccount.getDatemax()))
			{
				//最后修改时间小于等于最大日期
				criteria.andLastModifyDateLessThanOrEqualTo(UserAccount.getDatemax());
				Date date = UserAccount.getDatemax();
				date.setHours(23);
				date.setMinutes(59);
				date.setSeconds(59);
				
				criteria.andLastModifyDateLessThanOrEqualTo(date);
			}
		}
		
		
		PageHelper.startPage(pageNum,pageSize);
		List<XtUserAccount> list = xtUserAccountMapper.selectByExample(null);
		PageInfo<XtUserAccount> page=new PageInfo<XtUserAccount>(list);
		
		
		
		return page;
	}

}
