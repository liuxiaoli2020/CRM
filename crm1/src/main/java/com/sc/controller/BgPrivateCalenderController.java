package com.sc.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgPrivateCalender;
import com.sc.entity.Message;
import com.sc.service.BgPrivateCalenderService;

@Controller
@RequestMapping("/bgPrivateCalenderctrl")
public class BgPrivateCalenderController {

	@Autowired
	BgPrivateCalenderService bgPrivateCalenderService;
	
	//查询
	@RequestMapping("/selectpc.do")
	public ModelAndView selectPc(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			BgPrivateCalender pc){
		
		System.out.println("进入查询个人日程分页方法了");
		
		//为多条件查询做准备
		PageInfo<BgPrivateCalender> page = bgPrivateCalenderService.selectPrivateCalender(pageNum, pageSize, pc);
		
		mav.addObject("p", page);
		mav.addObject("pc", pc);
		mav.setViewName("bg/bgpc-list"); //WEB-INF/bg/bgpc-list.jsp
		return mav;
	}
	

	@RequestMapping("/goaddpc.do")
	public ModelAndView goAddPc(ModelAndView mav,BgPrivateCalender pc){
		System.out.println("进入添加页面"+pc);
		//修改
		if(pc.getCalendarId()!=null){
			pc=bgPrivateCalenderService.getPrivateCalender(pc.getCalendarId());
		}
		
		mav.setViewName("bg/bgpc-add"); //WEB-INF/bg/bgpc-add.jsp
		mav.addObject("pc", pc);
		return mav;
	}
	
	@RequestMapping("/addpc.do")
	@ResponseBody
	public Message addPc(ModelAndView mav,BgPrivateCalender pc){
		System.out.println("进入添加个人日程:"+pc);
		if(pc.getCalendarId()!=null){//修改
			bgPrivateCalenderService.updatePrivateCalender(pc);
		}else{//添加
			bgPrivateCalenderService.addPrivateCalender(pc);
		}
		return new Message("1","success","成功");
	}
	
	@RequestMapping("/deletepc.do")
	@ResponseBody
	public Message deletePc(ModelAndView mav,BgPrivateCalender pc){
		System.out.println("进入删除个人日程:"+pc);
		bgPrivateCalenderService.deletePrivateCalender(pc.getCalendarId());
		return new Message("1","success","成功");
	}
	
	@RequestMapping("/deletepcall.do")
	public String deleteTaskAll(ModelAndView mav,Long[] ids){
		System.out.println("进入批量删除个人日程:"+Arrays.toString(ids));
		if(ids!=null&&ids.length>0){
			for (Long id : ids) {
				bgPrivateCalenderService.deletePrivateCalender(id);
			}
		}
		//重定向到查询方法
		return "redirect:selectpc.do";
	}
}
