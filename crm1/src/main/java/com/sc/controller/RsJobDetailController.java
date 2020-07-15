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
import com.sc.entity.RsJobDetail;
import com.sc.entity.RsUserDetail;
import com.sc.service.RsJobDetailService;

@Controller
@RequestMapping("/jobctrl")
public class RsJobDetailController {
	@Autowired
    RsJobDetailService rsJobDetailService;
    
    @RequestMapping("/selectpage.do")
	public ModelAndView selectpage(ModelAndView mav,
			@RequestParam(defaultValue="1") int pageNum,
			@RequestParam(defaultValue="5") int pageSize){
    	PageInfo<RsJobDetail> pageInfo=this.rsJobDetailService.selectjobPage(pageNum, pageSize);
    	mav.addObject("pi", pageInfo);
    	mav.setViewName("rs/joblist");
		return mav;
	}
    
    @RequestMapping("/likeselect.do")
   	public ModelAndView likeselect(ModelAndView mav,RsJobDetail j,
   			@RequestParam(defaultValue="1") int pageNum,
   			@RequestParam(defaultValue="5") int pageSize,
   			@RequestParam(defaultValue="") String jobName){
       	PageInfo<RsJobDetail> pageInfo=this.rsJobDetailService.selectjobName(pageNum, pageSize, jobName);
       	mav.addObject("pi", pageInfo);
       	mav.setViewName("rs/joblist");
       	/*String isback="yes";
       	mav.setViewName("redirect:../rs/joblist.jsp?isback="+isback);*/
   		return mav;
   	}
    
    @RequestMapping("/jobupdate.do")
   	public ModelAndView jobupdate(ModelAndView mav,RsJobDetail j){
       if (j.getJobId()!=null) {
		j=rsJobDetailService.getRsJobDetail(j.getJobId());
	}
    	mav.addObject("j",j );
       	mav.setViewName("rs/jobupdate");
   		return mav;
   	}
    
    @RequestMapping("/jupdate.do")
    @ResponseBody
  	public Message jupdate(ModelAndView mav,HttpServletRequest req
  			,RsJobDetail j) {
  		if (j.getJobId()!=null) {
  			System.out.println("11111");
  			rsJobDetailService.updateRsJobDetail(j);
		}else {
			System.out.println("11111");
			rsJobDetailService.addRsJobDetail(j);
		}
  		
  		return new Message("1", "success", "成功");
  	}
    
    @RequestMapping("/jobdelete.do")
   	public ModelAndView staffdelete(ModelAndView mav,RsJobDetail j){
       	
    	this.rsJobDetailService.deleteRsJobDetail(j);
       	mav.setViewName("redirect:selectpage.do");
   		return mav;
   	}
  //批量删除
    @RequestMapping("/deletemore.do")
    public ModelAndView deletemore(ModelAndView mav,HttpServletRequest req, HttpServletResponse res) {
		String items=req.getParameter("delitems");
    	String[] item=items.split(",");
    	for(int i=0;i<item.length;i++){
    		rsJobDetailService.deleteRsJobDetail(Long.parseLong(item[i]));
    	}
    	mav.setViewName("redirect:selectpage.do");
   		return mav;
	}
}
