package com.sc.service.impl;

import java.util.ArrayList;
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
import com.sc.entity.XtUserRoleExample;
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
		List<XtPowerDetail> list = xtPowerDetailMapper.selectByExample(null);
		return list;
		
	}

	@Override
	public List<XtPowerDetail> selectpowerallbyuserid(Long userId)
	{
		
		ArrayList<XtPowerDetail> list2=new ArrayList<XtPowerDetail>();
		System.out.println("1.userid是"+userId);
		XtUserRoleExample example=new XtUserRoleExample();
		System.out.println("2.");
		com.sc.entity.XtUserRoleExample.Criteria createCriteria = example.createCriteria();
		System.out.println("3.");
		createCriteria.andUserIdEqualTo(userId);
		System.out.println("4.");
		List<XtUserRole> selectByExample = xtUserRoleMapper.selectByExample(example);
		System.out.println("5.得到的用户角色类是"+selectByExample);
		for (XtUserRole xtUserRole : selectByExample)
		{
			System.out.println("进去了");
			XtPowerRoleExample examples=new XtPowerRoleExample();
			com.sc.entity.XtPowerRoleExample.Criteria criteria = examples.createCriteria();
			criteria.andRoleIdEqualTo(xtUserRole.getRoleId());
			
			//问题所在？？？？？？？
			List<XtPowerRole> list = xtPowerRoleMapper.selectByExample(examples);
			//循环权限编号
			for (XtPowerRole xtPowerRole : list)
			{
				System.out.println("$$$$$$$$$$$$$$$"+xtPowerRole.getPowerId());
				XtPowerDetail detail = xtPowerDetailMapper.selectByPrimaryKey(xtPowerRole.getPowerId());
				list2.add(detail);
				System.out.println("*@@@@@@@@@@@@@@@@@@@@@@"+detail);
				
			}
			
		}
		
		return list2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}