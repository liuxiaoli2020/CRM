package com.sc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.RsJobDetail;
import com.sc.entity.XsCustomerContactRecord;
import com.sc.entity.XsCustomerDetail;
import com.sc.entity.XsUserLoss;
import com.sc.service.XsCustomerDetailService;
import com.sc.service.XsUserLossService;

@Controller
@RequestMapping("/xsuserlossctrl")
public class XsUserLossController {

	@Autowired
	XsUserLossService xsUserLossService;
	@Autowired
	XsCustomerDetailService xsCDService;
	
	@RequestMapping("/selectpage.do")
	public ModelAndView selectpage(ModelAndView mav,
			@RequestParam(defaultValue="1") int pageNum,
			@RequestParam(defaultValue="5") int pageSize){
    	PageInfo<XsUserLoss> pageInfo=this.xsUserLossService.selectuserPage(pageNum, pageSize);
    	mav.addObject("pi", pageInfo);
    	mav.setViewName("xs/xsuserlosslist");
		return mav;
	}
	
	 @RequestMapping("/supdate.do")
	   	public ModelAndView supdate(ModelAndView mav,XsUserLoss u,int a){
		/* XsUserLoss xsUserLoss = this.xsUserLossService.getXsUserLosskey(u.getCustomerLossId());
		 
	      if (treatmentMode=="确认流失") {
	    	  xsUserLoss.setTreatmentMode("确认流失");
	    	  xsUserLoss.setTreatmentMeasures(xsUserLoss.getTreatmentMeasures()+u.getTreatmentMeasures());
	    	  xsUserLoss.setIsLoss("是");
	    	  xsUserLossService.updateXsUserLoss(xsUserLoss);
		}else {
			  xsUserLoss.setTreatmentMode("暂缓流失");
	    	  xsUserLoss.setTreatmentMeasures(u.getTreatmentMeasures());
	    	  xsUserLoss.setIsLoss("否");
	    	  xsUserLossService.updateXsUserLoss(xsUserLoss);
		}*/
		 if (a==1) {
			 XsCustomerDetail xsCustomerDetail=this.xsCDService.getCustomer(u.getCustomerId());
			 xsCustomerDetail.setCustomerState("已流失");
			 xsCDService.updateCustomerDetail(xsCustomerDetail);
		}else if (a==0) {
			XsCustomerDetail xsCustomerDetail=this.xsCDService.getCustomer(u.getCustomerId());
			 xsCustomerDetail.setCustomerState("未流失");
			 xsCDService.updateCustomerDetail(xsCustomerDetail);
		}
		 XsUserLoss xsUserLoss = this.xsUserLossService.getXsUserLosskey(u.getCustomerLossId());
		 u.setTreatmentMeasures(xsUserLoss.getTreatmentMeasures()+"\n"+u.getTreatmentMeasures());
		 xsUserLossService.updateXsUserLoss(u);
		 
		
	        mav.setViewName("redirect:selectpage.do"); 
	   		return mav;
	   	}
	
	 
	@RequestMapping("/gouser.do")
	public ModelAndView gocustomer(ModelAndView mav,XsUserLoss userLoss,HttpSession session,@RequestParam(defaultValue="1") int pageNum,
			@RequestParam(defaultValue="5") int pageSize){
    	
    	
    	
    	 session.setAttribute("userLossid", userLoss.getCustomerLossId());
    	
    	
		//暂缓流失
    	 //确认流失
    	 XsUserLoss loss = this.xsUserLossService.getXsUserLoss(userLoss.getCustomerLossId());
    	 mav.addObject("u", loss);
		      
    	mav.setViewName("xs/xsuserlosstabs");
    	return mav;
    }
}
