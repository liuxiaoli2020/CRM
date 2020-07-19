/*package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtLog;
import com.sc.service.XtLogService;

@Controller
@RequestMapping("/logctrl")
public class XtLogController {
   @Autowired
	XtLogService xtLogService;
	
   @RequestMapping("/findall.do")
   public ModelAndView findAll(ModelAndView mav,
			@RequestParam(defaultValue="1") int pageNum,
			@RequestParam(defaultValue="5") int pageSize) {
	
	   PageInfo<XtLog> pageInfo=this.xtLogService.findall(pageNum, pageSize);
	   	mav.addObject("pi", pageInfo);
	   	mav.setViewName("log/log");
		return mav;
}
}
*/