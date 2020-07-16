package com.sc.service;

import java.math.BigDecimal;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtUserAccount;

public interface XtUserAccountService
{
	public void addXtUserAccount(XtUserAccount UserAccount);
	
	public void updateXtUserAccount(XtUserAccount UserAccount);
	
	public void deleteXtUserAccount(BigDecimal id);
	
	public XtUserAccount getXtUserAccount(BigDecimal userId);
	
	public PageInfo<XtUserAccount> seleteXtUserAccount(Integer pageNum,Integer pageSize,XtUserAccount UserAccount);



	
	
	
	
} 
