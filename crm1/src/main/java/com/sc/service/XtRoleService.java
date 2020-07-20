package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtRole;
import com.sc.entity.XtUserAccount;



public interface XtRoleService
{
	public void addXtRole(XtRole Role);
	
	public void deleteXtRole(Long roleId);
	
	public void updateXtRole(XtRole Role);
	
	public XtRole getXtRole(Long roleId);
	
	public PageInfo<XtRole> seleteXtRole(Integer pageNum,Integer pageSize,XtRole Role);
	
	
	
}
