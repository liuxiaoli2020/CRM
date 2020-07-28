package com.sc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtRole;
import com.sc.entity.XtUserAccount;
import com.sc.entity.XtUserAccountExample;
import com.sc.entity.XtUserRole;
import com.sc.entity.XtUserRoleExample;
import com.sc.entity.XtUserRoleExample.Criteria;
import com.sc.mapper.XtUserAccountMapper;
import com.sc.mapper.XtUserRoleMapper;
import com.sc.service.XtRoleMemberService;
@Service
public class xtRoleMemberServiceImpl implements XtRoleMemberService
{
	@Autowired
	XtUserAccountMapper xtUserAccountMapper;
	@Autowired
	XtUserRoleMapper xtUserRoleMapper;
	
	
	@Override
	public PageInfo<XtUserAccount> xtRoleMemberService(Integer pageNum, Integer pageSize, XtRole xtRole)
	{
		ArrayList<XtUserAccount> list0=new ArrayList<XtUserAccount>();
		XtUserRoleExample example=new XtUserRoleExample();
		Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(xtRole.getRoleId());
		List<XtUserRole> list = xtUserRoleMapper.selectByExample(example);
		
		for (XtUserRole xtUserRole : list)
		{
			System.out.println("**"+xtUserRole.getUserId());
			XtUserAccountExample example1=new XtUserAccountExample();
			com.sc.entity.XtUserAccountExample.Criteria criteria2 = example1.createCriteria();
			criteria2.andUserIdEqualTo(xtUserRole.getUserId());
			
			List<XtUserAccount> list2 = xtUserAccountMapper.selectByExample(example1);
			
			list0.addAll(list2);
		}
		PageHelper.startPage(pageNum,pageSize);
		PageInfo<XtUserAccount> page=new PageInfo<XtUserAccount>(list0);
		System.out.println("3"+page);
		return page;
	}

	@Override
	public void deletemumber(Long roleId)
	{
		if(roleId!=null)
		{
			xtUserRoleMapper.deleteByPrimaryKey(roleId);
		}
		
	}

	@Override
	public PageInfo<XtUserAccount> xtAddRoleMemberService(Integer pageNum, Integer pageSize, XtRole xtRole)
	{
		ArrayList<XtUserAccount> list0=new ArrayList<XtUserAccount>();
		
		/*XtUserRoleExample example=new XtUserRoleExample();
		Criteria criteria = example.createCriteria();
		criteria.andRoleIdNotEqualTo(xtRole.getRoleId());
		//这个list里面放着角色编号不是**的用户角色信息
		List<XtUserRole> list = xtUserRoleMapper.selectByExample(example);
		
		for (XtUserRole xtUserRole : list)
		{
			XtUserAccountExample example1=new XtUserAccountExample();
			com.sc.entity.XtUserAccountExample.Criteria criteria2 = example1.createCriteria();
			criteria2.andUserIdNotEqualTo(xtUserRole.getUserId());
			
			List<XtUserAccount> list2 = xtUserAccountMapper.selectByExample(example1);
			XtUserAccount account = xtUserAccountMapper.selectByPrimaryKey(xtUserRole.getUserId());
			
			list0.add(account);
		}*/
		List<XtUserAccount> list = xtUserAccountMapper.selectByExample(null);
		
		for (XtUserAccount xtUserAccount : list)
		{
			XtUserRoleExample example=new XtUserRoleExample();
			Criteria criteria = example.createCriteria();
			criteria.andUserIdEqualTo(xtUserAccount.getUserId());
			
			List<XtUserRole> list1 = xtUserRoleMapper.selectByExample(example);
			
			for (XtUserRole xtUserRole : list1)
			{
				if((xtUserRole.getRoleId())!=xtRole.getRoleId())
				{
					list0.add(xtUserAccount);
				}
			}
		}
		
		PageHelper.startPage(pageNum,pageSize);
		PageInfo<XtUserAccount> page=new PageInfo<XtUserAccount>(list0);
		System.out.println("去添加成员的page"+page);
		return page;
	}

	@Override
	public void addmember(XtUserRole xtUserRole)
	{
		if(xtUserRole!=null)
		{
			System.out.println("999999"+xtUserRole);
			xtUserRoleMapper.insert(xtUserRole);
		}
		
	}

}