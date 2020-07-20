package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtPowerDetail;
import com.sc.entity.XtPowerDetailExample;
import com.sc.entity.XtPowerDetailExample.Criteria;
import com.sc.entity.XtPowerRole;
import com.sc.entity.XtPowerRoleExample;
import com.sc.entity.XtPowerSubfield;
import com.sc.entity.XtUserRole;
import com.sc.mapper.XtPowerDetailMapper;
import com.sc.mapper.XtPowerRoleMapper;
import com.sc.mapper.XtPowerSubfieldMapper;
import com.sc.mapper.XtUserRoleMapper;
import com.sc.service.XtPowerService;

@Service
public class XtPowerServiceImpl implements XtPowerService
{
	@Autowired
	XtPowerDetailMapper xtPowerDetailMapper;
	@Autowired
	XtPowerSubfieldMapper xtPowerSubfieldMapper;
	@Autowired
	XtUserRoleMapper xtUserRoleMapper;
	@Autowired
	XtPowerRoleMapper xtPowerRoleMapper;
	

	//添加权限
	@Override
	public void addXtPower(XtPowerDetail xtPowerDetail)
	{
		xtPowerDetailMapper.insert(xtPowerDetail);

	}
	
	//查询权限分栏
	@Override
	public PageInfo<XtPowerSubfield> seletepowerfile(Integer pageNum, Integer pageSize)
	{
		// TODO Auto-generated method stubs
		PageHelper.startPage(pageNum, pageSize);
		List<XtPowerSubfield> list = xtPowerSubfieldMapper.selectByExample(null);
		PageInfo<XtPowerSubfield> page = new PageInfo<XtPowerSubfield>(list);
		return page;
	}
	//通过分栏id查权限
	@Override
	public List<XtPowerDetail> selectXtPowerDetailByfileId(Long subfieldIds)
	{
		// TODO Auto-generated method stub
		XtPowerDetailExample e = new XtPowerDetailExample();
		Criteria c = e.createCriteria();
		if (!StringUtils.isEmpty(subfieldIds))
		{
			c.andSubfieldIdEqualTo(subfieldIds);
		}
		List<XtPowerDetail> list = xtPowerDetailMapper.selectByExample(e);
		return list;
	}
	//单个删除
	@Override
	public void deleteXtPower(Long PowerId)
	{
		xtPowerDetailMapper.deleteByPrimaryKey(PowerId);
		
	}
	//去修改
	@Override
	public XtPowerDetail getxtPower(Long powerId)
	{
		
		return xtPowerDetailMapper.selectByPrimaryKey(powerId);
	}
	//删除
	@Override
	public void updateXtPower(XtPowerDetail xtPowerDetail)
	{
		xtPowerDetailMapper.updateByPrimaryKey(xtPowerDetail);
		
	}
	//添加权限分栏
	@Override
	public void addXtPowersubfield(XtPowerSubfield xtPowerSubfield)
	{
		xtPowerSubfieldMapper.insert(xtPowerSubfield);
		
	}

	@Override
	public List<XtPowerDetail> selectpowerall()
	{
		xtPowerDetailMapper.selectByExample(null);
		return null;
	}

	@Override
	public List<XtPowerDetail> selectpowerallbyuserid(Long userId)
	{
		//这个类里面对应有角色编号
		XtUserRole xtUserRole = xtUserRoleMapper.selectByPrimaryKey(userId);
		XtPowerRoleExample example=new XtPowerRoleExample();
		com.sc.entity.XtPowerRoleExample.Criteria criteria = example.createCriteria();
		if (!StringUtils.isEmpty(xtUserRole.getRoleId()))
		{
			
			criteria.andPowerIdEqualTo(xtUserRole.getRoleId());
		}
		//里面有权限编号
		List<XtPowerRole> list = xtPowerRoleMapper.selectByExample(example);
		
		//循环权限编号
		for (XtPowerRole xtPowerRole : list)
		{
			XtPowerDetailExample  example1= new XtPowerDetailExample();
			Criteria criteria1 = example1.createCriteria();
			if (!StringUtils.isEmpty(xtPowerRole.getPowerId()))
			{
				criteria1.andPowerIdEqualTo(xtPowerRole.getPowerId());
			}
			//里面有权限路径
			List<XtPowerDetail> list2 = xtPowerDetailMapper.selectByExample(example1);
			
			System.out.println(list2);
			return list2;
			
		}
		
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
