package com.sc.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtRole;
import com.sc.entity.XtUserAccount;
import com.sc.entity.XtUserRole;
import com.sc.mapper.XtRoleMapper;
import com.sc.mapper.XtUserRoleMapper;
import com.sc.service.XtRoleService;

@Service
public  class XtRoleServiceImpl implements XtRoleService
{

	@Autowired
	XtRoleMapper xtRoleMapper;
	@Autowired
	XtUserRoleMapper xtUserRoleMapper;
	
	@Override
	public void addXtRole(XtRole Role)
	{
		xtRoleMapper.insert(Role);

	}

	@Override
	public void deleteXtRole(Long roleId)
	{
		if(roleId!=null)
		{
			xtRoleMapper.deleteByPrimaryKey(roleId);
		}

	}

	@Override
	public void updateXtRole(XtRole Role)
	{
		if(Role!=null&&Role.getRoleId()!=null)
		{
			xtRoleMapper.updateByPrimaryKey(Role);
		}

	}

	@Override
	public XtRole getXtRole(Long roleId)
	{
		if(roleId!=null)
		{
			
			return xtRoleMapper.selectByPrimaryKey(roleId);
		}
		return null;
	}

	@Override
	public PageInfo<XtRole> seleteXtRole(Integer pageNum, Integer pageSize, XtRole Role)
	{
		PageHelper.startPage(pageNum,pageSize);
		List<XtRole> list = xtRoleMapper.selectByExample(null);
		PageInfo<XtRole> page=new PageInfo<XtRole>(list);
		
		
		return page;
	}

	

	/*@Override
	public List<XtUserAccount> getUserId(Long roleId)
	{
		if(roleId!=null)
		{
			List<XtUserAccount> list = xtUserRoleMapper.selectuserid(roleId);
			return list;
		}
		
		return null;
	}*/

}
