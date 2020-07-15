package com.sc.controller;

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
import com.sc.entity.RsBranch;
import com.sc.entity.RsCompanyDetail;
import com.sc.service.RsBranchService;

@Controller
@RequestMapping("/branchctrl")
public class RsBranchController {
	@Autowired
    RsBranchService rsBranchService;
    
    @RequestMapping("/selectpage.do")
	public ModelAndView selectpage(ModelAndView mav,
			@RequestParam(defaultValue="1") int pageNum,
			@RequestParam(defaultValue="5") int pageSize){
    	PageInfo<RsBranch> pageInfo=this.rsBranchService.selectbranchPage(pageNum, pageSize);
    	mav.addObject("pi", pageInfo);
    	mav.setViewName("rs/branchlist");
		return mav;
	}
    
    @RequestMapping("/likeselect.do")
   	public ModelAndView likeselect(ModelAndView mav,
   			@RequestParam(defaultValue="1") int pageNum,
   			@RequestParam(defaultValue="5") int pageSize,
   			@RequestParam(defaultValue="") String branchName){
       	PageInfo<RsBranch> pageInfo=this.rsBranchService.selectbranchPage(pageNum, pageSize, branchName);
       	mav.addObject("pi", pageInfo);
       	mav.setViewName("rs/branchlist");
       /*	String isback="yes";
       	mav.setViewName("redirect:../rs/stafflist.jsp?isback="+isback);*/
   		return mav;
   	}
    
    @RequestMapping("/branchupdate.do")
   	public ModelAndView staffupdate(ModelAndView mav,RsBranch b){
       if (b.getBranchId()!=null) {
		b=rsBranchService.getRsBranch(b.getBranchId());
	}
    	mav.addObject("b",b );
       	mav.setViewName("rs/branchupdate");
   		return mav;
   	}
    
    @RequestMapping("/bupdate.do")
    @ResponseBody
  	public Message bupdate(ModelAndView mav,HttpServletRequest req
  			,RsBranch b) {
  		if (b.getBranchId()!=null) {
  			rsBranchService.updateRsBranch(b);
		}else {
			rsBranchService.addRsBranch(b);
		}
  		
  		return new Message("1", "success", "成功");
  	}
    
    @RequestMapping("/branchdelete.do")
   	public ModelAndView staffdelete(ModelAndView mav,RsBranch b){
       	
    	this.rsBranchService.deleteRsBranch(b);
       	mav.setViewName("redirect:selectpage.do");
   		return mav;
   	}
    
   //批量删除
    @RequestMapping("/deletemore.do")
    public ModelAndView deletemore(ModelAndView mav,HttpServletRequest req, HttpServletResponse res) {
		String items=req.getParameter("delitems");
    	String[] item=items.split(",");
    	for(int i=0;i<item.length;i++){
    		rsBranchService.deleteRsBranch(Long.parseLong(item[i]));
    	}
    	mav.setViewName("redirect:selectpage.do");
   		return mav;
	}
}
