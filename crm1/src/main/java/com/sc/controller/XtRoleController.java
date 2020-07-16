package com.sc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Message;
import com.sc.entity.XtRole;
import com.sc.entity.XtUserAccount;
import com.sc.entity.XtUserRole;
import com.sc.service.XtRoleService;

@Controller
@RequestMapping("/xtrolectrl")
public class XtRoleController
{
	@Autowired
	XtRoleService xtRoleService;
	
	//查询角色
	@RequestMapping("/selectxtrole.do")
	public ModelAndView seleteXtRole(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			XtRole Role){
		 System.out.println("进入查询角色分页方法了");
		 PageInfo<XtRole> page = xtRoleService.seleteXtRole(pageNum, pageSize, Role);
		 mav.addObject("r",page);
		 mav.setViewName("xt/xtrole");//找xt目录下的xtrole.jsp
		return mav;
	}
	
	//添加角色
	@RequestMapping("/addxtrole.do")

	public void addXtRole(XtRole Role)
	{
		System.out.println("进入角色添加方法:"+Role);
		
		xtRoleService.addXtRole(Role);
		
	}
	
	//删除角色
	@RequestMapping("/deletextrole.do")
	@ResponseBody
	public int deletextrole(XtRole Role){
		int i=1;
		System.out.println("进入角色删除:"+Role);
		xtRoleService.deleteXtRole(Role.getRoleId());
		return i;
	}
	
	
	//去修改
	@RequestMapping("/goupdatextrole.do")
	@ResponseBody
	public XtRole goupdatextrole(XtRole Role){
		XtRole data = xtRoleService.getXtRole(Role.getRoleId());
		
		return data;/*可不可以用mav,mav是用来跳转到别的页面，然后可以带参数，这里不用跳到别的页面*/
	}
	
	
	//修改角色
	@RequestMapping("/updatextrole.do")
	@ResponseBody
	public int updatextrole(XtRole Role){
		int i=1;
		System.out.println("进入修改:"+Role);
		xtRoleService.updateXtRole(Role);
		return i;
	}
	
	//查看成员
	
	/*@RequestMapping("/selectmumber.do")
	@ResponseBody
	public List<XtUserAccount> selectmumber(Long roleId){
		 System.out.println("进入查询成员的方法了");
		 List<XtUserAccount> list =(List<XtUserAccount>)XtRoleService.getUserId(roleId);
		 List<XtUserAccount> list = xtRoleService.getUserId(roleId);
		 for (XtUserAccount cs : list)
		{
			System.out.println("@@@@@"+cs);
		}
		return list;
	}*/
	
}
