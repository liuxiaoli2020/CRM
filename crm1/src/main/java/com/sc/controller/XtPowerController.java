package com.sc.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Message;
import com.sc.entity.XtPowerDetail;
import com.sc.entity.XtPowerSubfield;
import com.sc.entity.XtUserAccount;
import com.sc.mapper.XtPowerSubfieldMapper;
import com.sc.service.XtPowerService;

@Controller
@RequestMapping("/xtpowerctrl")
public class XtPowerController
{

	@Autowired
	XtPowerService xtPowerService;
	
	
	//查询权限管理中的权限信息
	@RequestMapping("/seletextpower.do")
	public ModelAndView seletextpower(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize){
		 System.out.println("进入查询权限管理方法了");
		 PageInfo<XtPowerSubfield> page = xtPowerService.seletepowerfile(pageNum, pageSize);
		
		 for (XtPowerSubfield xtPowerSubfield : page.getList())/*？？？？page*/
		{
			if(!StringUtils.isEmpty(xtPowerSubfield.getSubfieldId())) {
				List<XtPowerDetail> qx = xtPowerService.selectXtPowerDetailByfileId(xtPowerSubfield.getSubfieldId());
				if(!StringUtils.isEmpty(qx)){
					//xtPowerSubfield.setXtPowerDetailList(qx);
					
				}
			}
		}
		 
		 
		 mav.addObject("p",page);
		 mav.setViewName("xt/xtpower");
		return mav;
	}
	
	//为分栏添加权限
	@RequestMapping("/addxtpower.do")
	
	public void addxtpower(XtPowerDetail xtPowerDetail)
	{
		System.out.println("****@进入添加权限的方法:"+xtPowerDetail);
		
		xtPowerService.addXtPower(xtPowerDetail);
		
	}
	
	//删除单个权限
	
	@RequestMapping("/deletextpower.do")
	@ResponseBody
	public Message deletextpower(XtPowerDetail xtPowerDetail)
	{
		System.out.println("****@进入删除权限的方法:"+xtPowerDetail);
		
		xtPowerService.deleteXtPower(xtPowerDetail.getPowerId());
		return new Message("1", "success", "成功");
	}
	
	//去修改
	@RequestMapping("/goupdatextpower.do")
	@ResponseBody
	public XtPowerDetail goupdatextpower(XtPowerDetail xtPowerDetail){
		/*BigDecimal b=new BigDecimal(UserAccount.getUserId());*/
		XtPowerDetail data = xtPowerService.getxtPower(xtPowerDetail.getPowerId());
		System.out.println(data);
		return data;
	}
	
	//修改权限
	@RequestMapping("/updatextpower.do")
	@ResponseBody
	public int updatextxtpower(XtPowerDetail xtPowerDetail){
		int i=1;
		xtPowerService.updateXtPower(xtPowerDetail);
		return i;
	}
	
	//删除多个权限
	@RequestMapping("/deletextpowerall.do")
	public String deletextpowerall(BigDecimal[] ids){
		System.out.println("@@@@进入批量删除:"+ids);
		if(ids!=null&&ids.length>0)
		{
			for (BigDecimal id : ids)
			{
				xtPowerService.deleteXtPower(id.longValue());
			}
		}
		
		return "redirect:seletextpower.do";
	}
	
	//添加分栏
	
	@RequestMapping("/addxtpowersubfield.do")
	@ResponseBody
	public int addxtpowersubfield(XtPowerSubfield xtPowerSubfield)
	{
		int i=1;
		System.out.println("****@进入添加权限分栏的方法:"+xtPowerSubfield);
		
		xtPowerService.addXtPowersubfield(xtPowerSubfield);
		return i;
	}
	
}
