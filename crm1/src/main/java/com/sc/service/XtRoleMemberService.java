package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtRole;
import com.sc.entity.XtUserAccount;
import com.sc.entity.XtUserRole;

public interface XtRoleMemberService
{
	//通过角色编号查询成员信息
	public PageInfo<XtUserAccount> xtRoleMemberService(Integer pageNum,Integer pageSize,XtRole xtRole);
	
	//通过角色编号查询成员信息,为添加做准备工作
		public PageInfo<XtUserAccount> xtAddRoleMemberService(Integer pageNum,Integer pageSize,XtRole xtRole);
	
	//批量删除角色
	public void deletemumber(Long roleId);
	//批量添加成员
	public void addmember(XtUserRole xtUserRole);
	
}
