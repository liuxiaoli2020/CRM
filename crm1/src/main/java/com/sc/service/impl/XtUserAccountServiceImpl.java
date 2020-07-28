package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtPowerDetail;
import com.sc.entity.XtPowerDetailExample;
import com.sc.entity.XtPowerRole;
import com.sc.entity.XtPowerRoleExample;
import com.sc.entity.XtRole;
import com.sc.entity.XtUserAccount;
import com.sc.entity.XtUserAccountExample;
import com.sc.entity.XtUserRole;
import com.sc.entity.XtUserAccountExample.Criteria;
import com.sc.mapper.XtPowerDetailMapper;
import com.sc.mapper.XtPowerRoleMapper;
import com.sc.mapper.XtUserAccountMapper;
import com.sc.mapper.XtUserRoleMapper;
import com.sc.service.XtUserAccountService;

@Service
public class XtUserAccountServiceImpl implements XtUserAccountService
{
	@Autowired
	XtUserAccountMapper xtUserAccountMapper;
	@Autowired
	XtPowerRoleMapper xtPowerRoleMapper;
	@Autowired
	XtPowerDetailMapper xtPowerDetailMapper;
	@Autowired
	XtUserRoleMapper xtUserRoleMapper;
	@Override
	public void addXtUserAccount(XtUserAccount UserAccount)
	{
		
		String password=UserAccount.getUserPass();
		String salt="qwerty";//盐
		int count=3;//散列次数
		String i="23";
		
		//md5散列算法
		Md5Hash md5=new Md5Hash(password,salt,count);
		UserAccount.setUserPass(md5.toString());
		
		xtUserAccountMapper.insert(UserAccount);
		
		
		XtUserRole x=new XtUserRole();
		
		x.setUserId(UserAccount.getUserId());
		x.setRoleId(Long.parseLong(i));
		System.out.println("000000"+x);
		xtUserRoleMapper.insert(x);

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
	public void deleteXtUserAccount(Long userId)
	{
		if(userId!=null)
		{
			xtUserAccountMapper.deleteByPrimaryKey(userId);
		}

	}

	@Override
	public XtUserAccount getXtUserAccount(Long userId)
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
			System.out.println(UserAccount);
			
			//新的判空方法，用工具包
			if(!StringUtils.isEmpty(UserAccount.getUserName()))
			{
				System.out.println("进入用户名模糊查询");
				criteria.andUserNameLike("%"+UserAccount.getUserName()+"%");//用户名模糊查询
			}if(!StringUtils.isEmpty(UserAccount.getDatemin()))
			{
				//最后修改时间大于等于最小日期
				System.out.println("----小----"+UserAccount.getDatemin());
				criteria.andLastModifyDateGreaterThanOrEqualTo(UserAccount.getDatemin());
			}if(!StringUtils.isEmpty(UserAccount.getDatemax()))
			{
				//最后修改时间小于等于最大日期
				
				Date date = UserAccount.getDatemax();
				date.setHours(23);
				date.setMinutes(59);
				date.setSeconds(59);
				System.out.println("----大----"+date);
				criteria.andLastModifyDateLessThanOrEqualTo(date);
			}
		}
		
		
		PageHelper.startPage(pageNum,pageSize);
		List<XtUserAccount> list = xtUserAccountMapper.selectByExample(example);
		PageInfo<XtUserAccount> page=new PageInfo<XtUserAccount>(list);
		
		return page;
	}

	@Override
	public PageInfo<XtPowerDetail> seleteXtUserPower(Integer pageNum, Integer pageSize, XtUserAccount UserAccount)
	{
		ArrayList<XtPowerDetail> list3=new ArrayList<XtPowerDetail>();
		XtPowerRoleExample example=new XtPowerRoleExample();
		com.sc.entity.XtPowerRoleExample.Criteria criteria = example.createCriteria();
		if (!StringUtils.isEmpty(UserAccount.getUserId()))
		{
			
			criteria.andPowerIdEqualTo(UserAccount.getUserId());
		}
		//里面有权限编号
		List<XtPowerRole> list = xtPowerRoleMapper.selectByExample(example);
		
		//循环权限编号
		for (XtPowerRole xtPowerRole : list)
		{
			XtPowerDetailExample  example1= new XtPowerDetailExample();
			com.sc.entity.XtPowerDetailExample.Criteria criteria1 = example1.createCriteria();
			if (!StringUtils.isEmpty(xtPowerRole.getPowerId()))
			{
				criteria1.andPowerIdEqualTo(xtPowerRole.getPowerId());
			}
			
			//里面装着权限类
			List<XtPowerDetail> list2 = xtPowerDetailMapper.selectByExample(example1);
			
			System.out.println("这个用户拥有这么多权限"+list2);
			list3.addAll(list2);
			
			
		}
		PageHelper.startPage(pageNum,pageSize);
		PageInfo<XtPowerDetail> page=new PageInfo<XtPowerDetail>(list3);
		
		return page;
	}

}