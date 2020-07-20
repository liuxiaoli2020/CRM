package com.sc.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Message;
import com.sc.entity.XtUserAccount;
import com.sc.service.XtUserAccountService;

@Controller
@RequestMapping("/xtuseraccountctrl")
public class XtUserAccountController
{
	@Autowired
	XtUserAccountService xtUserAccountService;
	
	//查询用户账户
	@RequestMapping("/seletextuseraccountctrl.do")
	public ModelAndView seleteXtUserAccount(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			XtUserAccount UserAccount)
	{
		 System.out.println("进入查询用户账户分页方法了");
		 PageInfo<XtUserAccount> page = xtUserAccountService.seleteXtUserAccount(pageNum, pageSize, UserAccount);
		 mav.addObject("p",page);
		 mav.addObject("UA",UserAccount);
		 mav.setViewName("xt/xtuseraccount");//找xt目录下的xtuseraccount.jsp
		return mav;
	}
	
	
	//添加用户账号
	@RequestMapping("/addxtuseraccount.do")
	@ResponseBody
	public int addXtUserAccount(XtUserAccount UserAccount)
	{
		int i=1;
		System.out.println("进入添加方法:"+UserAccount);
		
		xtUserAccountService.addXtUserAccount(UserAccount);
		return i;
	}
	
	//删除账户
	@RequestMapping("/deletextuseraccount.do")
	@ResponseBody
	public Message deletextuseraccount(XtUserAccount UserAccount){
		System.out.println("进入删除:"+UserAccount);
		xtUserAccountService.deleteXtUserAccount(UserAccount.getUserId());
		return new Message("1", "success", "成功");
	}
	
	//删除所有账户
		@RequestMapping("/deletextuseraccountall.do")

		public String deletextuseraccountall(BigDecimal[] ids){
			System.out.println("进入批量删除:"+ids);
			if(ids!=null&&ids.length>0)
			{
				for (BigDecimal id : ids)
				{
					
					xtUserAccountService.deleteXtUserAccount(id.longValue());  
					
				}
			}
			
			return "redirect:seletextuseraccountctrl.do";
		}
	
	//去修改
	@RequestMapping("/goupdatextuseraccount.do")
	@ResponseBody
	public XtUserAccount goupdatextuseraccount(XtUserAccount UserAccount){
		/*BigDecimal b=new BigDecimal(UserAccount.getUserId());*/
		XtUserAccount data = xtUserAccountService.getXtUserAccount(UserAccount.getUserId());
		System.out.println(data);
		return data;
	}
	
	//修改账户
	@RequestMapping("/updatextuseraccount.do")
	@ResponseBody
	public int updatextuseraccount(XtUserAccount UserAccount){
		int i=1;
		xtUserAccountService.updateXtUserAccount(UserAccount);
		return i;
	}
	
	
	//修改密码
	@RequestMapping("/updatextuseraccountpass.do")
	@ResponseBody
	public int updatextuseraccountpass(XtUserAccount UserAccount){
		int i=1;
		System.out.println("进入修改密码:"+UserAccount);
		/*BigDecimal b=new BigDecimal(UserAccount.getUserId());*/
		XtUserAccount a = xtUserAccountService.getXtUserAccount(UserAccount.getUserId());
		a.setUserPass(UserAccount.getUserPass());
		System.out.println(a);
		xtUserAccountService.updateXtUserAccount(a);
		return i;
	}
	
}
