package com.sc.controller;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Message;
import com.sc.entity.RsCompanyDetail;
import com.sc.entity.RsUserDetail;
import com.sc.service.RsCompanyDetailService;
@Controller
@RequestMapping("/companyctrl")
public class RsCompanyDetailController {
	
		@Autowired
	    RsCompanyDetailService rsCompanyDetailService;
	    
	    @RequestMapping("/selectpage.do")
		public ModelAndView selectpage(ModelAndView mav,
				@RequestParam(defaultValue="1") int pageNum,
				@RequestParam(defaultValue="5") int pageSize){
	    	PageInfo<RsCompanyDetail> pageInfo=this.rsCompanyDetailService.selectcompanyPage(pageNum, pageSize);
	    	mav.addObject("pi", pageInfo);
	    	mav.setViewName("rs/companylist");
			return mav;
		}
	    
	    @RequestMapping("/likeselect.do")
	   	public ModelAndView likeselect(ModelAndView mav,RsCompanyDetail c,
	   			@RequestParam(defaultValue="1") int pageNum,
	   			@RequestParam(defaultValue="5") int pageSize,
	   			@RequestParam(defaultValue="") String companyName){
	       	PageInfo<RsCompanyDetail> pageInfo=this.rsCompanyDetailService.selectcompany(pageNum, pageSize, companyName);
	       	mav.addObject("pi", pageInfo);
	       	mav.setViewName("rs/companylist");
	       /*	String isback="yes";
	       	mav.setViewName("redirect:../rs/stafflist.jsp?isback="+isback);*/
	   		return mav;
	   	}
	    
	    
	    
	    @RequestMapping("/companyupdate.do")
	   	public ModelAndView staffupdate(ModelAndView mav,RsCompanyDetail c){
	       if (c.getCompanyId()!=null) {
			c=rsCompanyDetailService.getRsCompanyDetail(c.getCompanyId());
		}
	    	mav.addObject("c",c );
	       	mav.setViewName("rs/companyupdate");
	   		return mav;
	   	}
	    
	    @RequestMapping("/cupdate.do")
	    @ResponseBody
	  	public Message jupdate(ModelAndView mav,HttpServletRequest req
	  			,RsCompanyDetail c) {
	  		if (c.getCompanyId()!=null) {
	  			rsCompanyDetailService.updateRsCompanyDetail(c);
			}else {
				rsCompanyDetailService.addRsCompanyDetail(c);
			}
	  		
	  		return new Message("1", "success", "成功");
	  	}
	    
	    @RequestMapping("/companydelete.do")
	   	public ModelAndView staffdelete(ModelAndView mav,RsCompanyDetail c){
	       	
	    	this.rsCompanyDetailService.deleteRsCompanyDetail(c);
	       	mav.setViewName("redirect:selectpage.do");
	   		return mav;
	   	}
	  //批量删除
	    @RequestMapping("/deletemore.do")
	    public ModelAndView deletemore(ModelAndView mav,HttpServletRequest req, HttpServletResponse res) {
			String items=req.getParameter("delitems");
	    	String[] item=items.split(",");
	    	for(int i=0;i<item.length;i++){
	    		rsCompanyDetailService.deleteRsCompanyDetail(new BigDecimal(item[i]));
	    	}
	    	mav.setViewName("redirect:selectpage.do");
	   		return mav;
		}
}
