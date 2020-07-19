package com.sc.controller;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Message;
import com.sc.entity.XsCustomerContactRecord;
import com.sc.entity.XsCustomerDetail;
import com.sc.service.XsCustomerContactRecordService;
import com.sc.service.XsCustomerDetailService;

@Controller
@RequestMapping("/customerctrl")
public class XsCustomerContactRecordController {
	@Autowired
	XsCustomerContactRecordService xsCCRService;
	@Autowired
	XsCustomerDetailService xsCDService;

	@RequestMapping("/customerlist.do")
	public ModelAndView customerlist(ModelAndView mav,
			@RequestParam(defaultValue="1") int pageNum,
			@RequestParam(defaultValue="5") int pageSize) {
		PageInfo<XsCustomerContactRecord> pageInfo = this.xsCCRService.selectcustomerPage(pageNum, pageSize);
		mav.addObject("pi", pageInfo);
    	mav.setViewName("xs/customerlist");
		return mav;
	}
	
	@RequestMapping("/customeradd.do")
   	public ModelAndView customeradd(ModelAndView mav,HttpSession session,Long customerId){
           
		XsCustomerContactRecord xccr=new XsCustomerContactRecord();
   	    xccr.setCustomerId(customerId);
		session.setAttribute("xccr", xccr);
       	mav.setViewName("xs/customeradd");
   		return mav;
   	}
	
	@RequestMapping("/customergoadd.do")
	@ResponseBody
  	public Message customergoadd(ModelAndView mav,HttpServletRequest req,HttpSession session,
  			XsCustomerContactRecord ccr,Long customerId) {
		    //添加数据
		    xsCCRService.addXsCustomerContactRecord(ccr);
		    //根据customerId查询信息表
		    XsCustomerDetail customer = xsCDService.getCustomer(customerId);
		    //获取一个Calendar对象并可以进行时间的计算
		    Calendar c1 = Calendar.getInstance();
		    //将下一次联系时间输入 Calendar 对象时间
		    c1.setTime(customer.getNextContactDate());
		    //时间加7
			c1.add(Calendar.DATE, 7);
			//新时间存入customer
		    customer.setNextContactDate(c1.getTime());
		    //更新
		    xsCDService.updateCustomerDetail(customer);
		    
		    //xsCCRService.updatetime(customer);
		    return new Message("1", "success", "成功");
  	}
	
	@RequestMapping("/customerdelete.do")
   	public ModelAndView customerdelete(ModelAndView mav,Long contactRecordId){
       	this.xsCCRService.deleteXsCustomerContactRecord(contactRecordId);
       	mav.setViewName("redirect:customerlist.do");
   		return mav;
   	}
	
	//批量删除
    @RequestMapping("/deletemore.do")
    public ModelAndView deletemore(ModelAndView mav,HttpServletRequest req, HttpServletResponse res) {
		String items=req.getParameter("delitems");
    	String[] item=items.split(",");
    	for(int i=0;i<item.length;i++){
    		xsCCRService.deleteXsCustomerContactRecord(Long.parseLong(item[i]));;
    	}
    	mav.setViewName("redirect:customerlist.do");
   		return mav;
	}
}
