package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtPowerDetail;
import com.sc.entity.XtPowerSubfield;

public interface XtPowerService
{

	// 查询权限分栏
	public PageInfo<XtPowerSubfield> seletepowerfile(Integer pageNum, Integer pageSize);

	// 根据分栏id查出所属权限（不分页，要分页也可以一会自己该）
	public List<XtPowerDetail> selectXtPowerDetailByfileId(Long subfieldIds);

	// 添加
	public void addXtPower(XtPowerDetail xtPowerDetail);
	
	//单个删除
	public void deleteXtPower(Long powerId);
	
	//去修改
	public XtPowerDetail getxtPower(Long powerId);
	
	//修改
	public void updateXtPower(XtPowerDetail xtPowerDetail);

	//添加权限分栏
	public void addXtPowersubfield(XtPowerSubfield xtPowerSubfield);
	
	//查询所有权限
	public List<XtPowerDetail> selectpowerall();
	
	//通过用户账号查询次用户所拥有的所有权限
	public List<XtPowerDetail> selectpowerallbyuserid(Long userId);
	
	
}