package com.sc.controller;

import java.math.BigDecimal;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtRole;
import com.sc.entity.XtUserAccount;
import com.sc.entity.XtUserRole;
import com.sc.service.XtRoleMemberService;

@Controller
@RequestMapping("/xtrolememberctrl")
public class XtRoleMemberController
{
	@Autowired
	XtRoleMemberService xtRoleMemberService;
	//成员查询
	@RequestMapping("/goselectmumber.do")
	public ModelAndView seleteXtRole(ModelAndView mav,XtRole xtRole,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			HttpSession session){
		session.setAttribute("nowRole", xtRole);
		
		PageInfo<XtUserAccount> page = xtRoleMemberService.xtRoleMemberService(pageNum, pageSize, xtRole);
		mav.addObject("p0",page);
		mav.addObject("Ro",xtRole);
		
		mav.setViewName("xt/xtrolemember");
		return mav;
	}
	//去成员添加
		@RequestMapping("/goaddmumber.do")
		public ModelAndView addXtRole(ModelAndView mav,XtRole xtRole,
				@RequestParam(defaultValue="1") Integer pageNum,
				@RequestParam(defaultValue="10") Integer pageSize){
			
			
			PageInfo<XtUserAccount> page = xtRoleMemberService.xtAddRoleMemberService(pageNum, pageSize, xtRole);
			System.out.println("去成员添加********"+page.getList());
			mav.addObject("p1",page);
			mav.addObject("xRo",xtRole);
			
			return mav;
		}
	//批量成员添加
		@RequestMapping("/addmumberall.do")

		public String addmumberall(BigDecimal[] idss,XtUserRole xtUserRole){
			System.out.println("进入批量添加:"+idss);
			if(idss!=null&&idss.length>0)
			{
				for (BigDecimal id : idss)
				{
					xtUserRole.setUserId(id.longValue());
					xtRoleMemberService.addmember(xtUserRole);
					
				}
			}
			
			return "redirect:goselectmumber.do";
		}
	
	//删除角色
		@RequestMapping("/deletemumber.do")
		
		public int deletextrole(XtRole Role){
			int i=1;
			System.out.println("进入角色删除:"+Role);
			xtRoleMemberService.deletemumber(Role.getRoleId());
			return i;
		}
	
	
	//批量删除
	@RequestMapping("/deletemumberall.do")

	public String deletextuseraccountall(BigDecimal[] ids){
		System.out.println("进入批量删除:"+ids);
		if(ids!=null&&ids.length>0)
		{
			for (BigDecimal id : ids)
			{
				xtRoleMemberService.deletemumber(id.longValue());
				
			}
		}
		
		return "redirect:goselectmumber.do";
	}
	
	
}
