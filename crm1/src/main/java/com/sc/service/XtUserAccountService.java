package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtUserAccount;

public interface XtUserAccountService
{
	public void addXtUserAccount(XtUserAccount UserAccount);
	
	public void updateXtUserAccount(XtUserAccount UserAccount);
	
	public void deleteXtUserAccount(Long id);
	
	public XtUserAccount getXtUserAccount(Long userId);
	
	public PageInfo<XtUserAccount> seleteXtUserAccount(Integer pageNum,Integer pageSize,XtUserAccount UserAccount);



	
	
	
	
} 
