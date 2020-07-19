package com.sc.controller;

import java.util.Arrays;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Message;
import com.sc.entity.RsUserDetail;
import com.sc.entity.XsCustomerContact;
import com.sc.entity.XsCustomerContactRecord;
import com.sc.entity.XsCustomerDetail;
import com.sc.entity.XsCustomerFeedback;
import com.sc.service.XsCustomerContactRecordService;
import com.sc.service.XsCustomerContactService;
import com.sc.service.XsCustomerDetailService;
import com.sc.service.XsCustomerFeedbackService;

@Controller
@RequestMapping("customerdetailctrl")
public class XsCustomerDetailController {
    @Autowired
	XsCustomerDetailService xsCustomerDetailService;
    @Autowired
	XsCustomerContactRecordService xsCCRService;
    @Autowired
    XsCustomerFeedbackService xsCFService;
    @Autowired
    XsCustomerContactService xsCustomerContactService;
    
	@RequestMapping("selectcustomerdetail.do")
    public ModelAndView selectCustomer(ModelAndView mav,
    		@RequestParam(defaultValue="1")Integer pageNum,
    		@RequestParam(defaultValue="10")Integer pageSize,
    		XsCustomerDetail customerdetail){
    	System.out.println("进入查询仓库分页方法了");
    	PageInfo<XsCustomerDetail> page = xsCustomerDetailService.selectCustomerDetail(pageNum, pageSize, customerdetail);
    	mav.addObject("p", page);
    	mav.setViewName("xs/customerdetaill-list");
    	return mav;
    }
	
	@RequestMapping("/goaddcustomer.do")
	public ModelAndView goAddCustomer(ModelAndView mav,XsCustomerDetail customerdetail){
    	System.out.println("进入添加页面了"+customerdetail);
    	//修改
    	if(customerdetail.getCustomerId()!=null){
    		xsCustomerDetailService.getCustomer(customerdetail.getCustomerId());
    	}
    	
    	mav.setViewName("xs/customer-add");
    	mav.addObject("customerdetail", customerdetail);
    	return mav;
    }
	@RequestMapping("/goaddcustomer1.do")
	public ModelAndView goAddCustomer1(ModelAndView mav,XsCustomerDetail customerdetail){
    	System.out.println("进入添加页面了"+customerdetail);
    	//修改
    	if(customerdetail.getCustomerId()!=null){
    		customerdetail=xsCustomerDetailService.getCustomer(customerdetail.getCustomerId());
    	    
    	}
    	mav.setViewName("xs/customer-list-xiangxi");
    	mav.addObject("customerdetail", customerdetail);
    	return mav;
    }
	
	
	
	@RequestMapping("/addcustomer.do")
	@ResponseBody
	public Message  addCustomer(ModelAndView mav,XsCustomerDetail customerdetail){
    	System.out.println("进入添加用户"+customerdetail);
    	if(customerdetail.getCustomerId()!=null){//修改
    		xsCustomerDetailService.updateCustomerDetail(customerdetail);
    	}else{//添加
    		xsCustomerDetailService.addCustomerDetail(customerdetail);
    	}
    	return new Message("1", "success", "成功");
    }
	
	@RequestMapping("/deletecustomer.do")
	@ResponseBody
	public Message deleteCustomer(ModelAndView mav,XsCustomerDetail customerdetail){
    	System.out.println("进入删除用户"+customerdetail);
    	xsCustomerDetailService.deleteCustomerDetail(customerdetail.getCustomerId());
    	return new Message("1", "success", "成功");
    }
	
	@RequestMapping("/deletecustomerall.do")
	@ResponseBody
	public String deleteCustomerAll(ModelAndView mav,Long[] ids){
    	System.out.println("进入批量删除用户"+Arrays.toString(ids));
    	if(ids!=null&&ids.length>0){
    		for (Long id : ids) {
    			xsCustomerDetailService.deleteCustomerDetail(id);
			}
    		
    	}
    	return "redirect:selectcustomerdetail.do";
    }
	@RequestMapping("/gocustomer.do")
	public ModelAndView gocustomer(ModelAndView mav,XsCustomerDetail customerdetail,HttpSession session,@RequestParam(defaultValue="1") int pageNum,
			@RequestParam(defaultValue="5") int pageSize){
    	System.out.println("仓库对象："+customerdetail);
    	
    	//session.setAttribute("nowdepotid", customerdetail.getCustomerId());//seesion.getAttribute("nowdepotid")
    	
    	
    	//客户信息
    	
    	 session.setAttribute("customerid", customerdetail.getCustomerId());//seesion.getAttribute("customerid")
    	
    	//客户联系人
    	/*Connect con=new Connect();
    	con.setCustomerid(customer.getCustomerid());
    	PageInfo<CpDepot> page = connectService.selectConnect(pageNum, pageSize, con);
		
		mav.addObject("p", page);
		mav.addObject("connect", connect);*/
    	 XsCustomerContact xsCustomerContact=new XsCustomerContact();
    	 xsCustomerContact.setCustomerId(customerdetail.getCustomerId());
    	PageInfo<XsCustomerContact> page = xsCustomerContactService.selectCustomerContact(pageNum, pageSize, xsCustomerContact);
     	mav.addObject("p", page);
     	mav.addObject("customercontact", xsCustomerContact);
		
		//客户联系记录
    	 XsCustomerContactRecord xccr=new XsCustomerContactRecord();
    	 xccr.setCustomerId(customerdetail.getCustomerId());
    	 
    	 PageInfo<XsCustomerContactRecord> pageInfo = this.xsCCRService.selectPage(pageNum, pageSize, xccr);
    	 mav.addObject("pi", pageInfo);
    	 mav.addObject("xccr", xccr);
		
    	 //客户反馈
    	 XsCustomerFeedback xscFeedback=new XsCustomerFeedback();
    	 xscFeedback.setCustomerId(customerdetail.getCustomerId());
    	 PageInfo<XsCustomerFeedback> pageInfo2=this.xsCFService.selectPage(pageNum, pageSize, xscFeedback);
    	 mav.addObject("pi2", pageInfo2);
    	 
		/*Connect con=new Connect();
    	con.setCustomerid(customer.getCustomerid());
    	PageInfo<CpDepot> page2 = connectService.selectConnect(pageNum, pageSize, con);
		mav.addObject("p2", page2);
		mav.addObject("connect", connect);*/
    	 
    	 
    	mav.setViewName("xs/xstabs");
    	return mav;
    }
	 @RequestMapping("/xscFeedback.do")
	   	public ModelAndView xscFeedback(ModelAndView mav,XsCustomerFeedback s){
		 System.out.println(s);
		    s=xsCFService.getCustomerFeedback(s.getFeedbackRecordId());
	    	mav.addObject("u",s );
	       	mav.setViewName("xs/xsuserlossdetail");
	   		return mav;
	   	}
	 @RequestMapping("/xscFeedbackdel.do")
	   	public ModelAndView xscFeedbackdel(ModelAndView mav,XsCustomerFeedback s){
		    xsCFService.deleteXsCustomerFeedback(s.getFeedbackRecordId());
	       	mav.setViewName("xs/xsuserlossdetail");
	   		return mav;
	   	}
}
