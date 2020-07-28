package com.sc.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Message;
import com.sc.entity.XsCustomerContact;

import com.sc.service.XsCustomerContactService;

@Controller
@RequestMapping("customercontactctrl")
public class XsCustomerContactController {
	@Autowired
	XsCustomerContactService xsCustomerContactService;
	@RequestMapping("selectcustomercontact.do")
    public ModelAndView selectCustomer(ModelAndView mav,
    		@RequestParam(defaultValue="1")Integer pageNum,
    		@RequestParam(defaultValue="10")Integer pageSize,
    		XsCustomerContact customercontact){
    	System.out.println("进入查询仓库分页方法了");
    	PageInfo<XsCustomerContact> page = xsCustomerContactService.selectCustomerContact(pageNum, pageSize, customercontact);
    	mav.addObject("p", page);
    	mav.addObject("customercontact", customercontact);
    	mav.setViewName("xs/customercontact-list");
    	return mav;
    }
	
	
	@RequestMapping("/goaddcustomercontact.do")
	public ModelAndView goAddCustomerContact(ModelAndView mav,XsCustomerContact customercontact){
    	System.out.println("进入添加页面了"+customercontact);
    	//修改
    	if(customercontact.getContactId()!=null){
    		customercontact=xsCustomerContactService.getCustomerContact(customercontact.getContactId());
    	}
    	mav.setViewName("xs/customercontact-add");
    	mav.addObject("customercontact", customercontact);
    	return mav;
    }
	
	@RequestMapping("/addcustomercontact.do")
	@ResponseBody
	public Message  addCustomer(ModelAndView mav,XsCustomerContact customercontact){
    	System.out.println("进入添加用户"+customercontact);
    	if(customercontact.getContactId()!=null){//修改
    		xsCustomerContactService.updateCustomerContact(customercontact);
    	}else{//添加
    		xsCustomerContactService.addCustomerContact(customercontact);
    	}
    	return new Message("1", "success", "成功");
    }
	
	@RequestMapping("/deletecustomercontact.do")
	@ResponseBody
	public Message deleteCustomer(ModelAndView mav,XsCustomerContact customercontact){
    	System.out.println("进入删除用户"+customercontact);
    	xsCustomerContactService.deleteCustomerContact(customercontact.getContactId());
    	return new Message("1", "success", "成功");
    }
	
	@RequestMapping("/deletecustomercontactall.do")
	@ResponseBody
	public ModelAndView deleteCustomerContactAll(ModelAndView mav,Long[] ids){
    	System.out.println("进入批量删除用户"+Arrays.toString(ids));
    	if(ids!=null&&ids.length>0){
    		for (Long id : ids) {
    			xsCustomerContactService.deleteCustomerContact(id);;
			}
    		
    	}
    	mav.setViewName("redirect:selectcustomercontact.do");
    	 return mav;
    }
}

