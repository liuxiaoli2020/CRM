package com.sc.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgTaskDetail;
import com.sc.entity.Message;
import com.sc.service.BgTaskDetailService;

@Controller
@RequestMapping("/bgTaskDetailctrl")
public class BgTaskDetailController {

	@Autowired
	BgTaskDetailService bgTaskDetailService;
	
	//查询
	@RequestMapping("/selecttdetail.do")
	public ModelAndView selectTaskDetail(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			BgTaskDetail tdetail){
		
		System.out.println("进入查询考核任务分页方法了"+tdetail);
		
		//为多条件查询做准备
		PageInfo<BgTaskDetail> page = bgTaskDetailService.selectTaskDetail(pageNum, pageSize, tdetail);
		
		mav.addObject("p", page);
		mav.addObject("tdetail", tdetail);
		mav.setViewName("bg/bgtdetail-list"); //WEB-INF/bg/bgtdetail-list.jsp
		return mav;
	}
	

	@RequestMapping("/goaddtdetail.do")
	public ModelAndView goAddTaskDetail(ModelAndView mav,BgTaskDetail tdetail){
		System.out.println("进入添加页面"+tdetail);
		//修改
		if(tdetail.getId()!=null){
			tdetail=bgTaskDetailService.getTaskDetail(tdetail.getId());
		}
		
		mav.setViewName("bg/bgtdetail-add"); //WEB-INF/bg/bgtdetail-add.jsp
		mav.addObject("tdetail", tdetail);
		return mav;
	}
	
	@RequestMapping("/addtdetail.do")
	@ResponseBody
	public Message addTaskDetail(ModelAndView mav,BgTaskDetail tdetail){
		System.out.println("进入添加考核任务:"+tdetail);
		if(tdetail.getId()!=null){//修改
			bgTaskDetailService.updateTaskDetail(tdetail);
		}else{//添加
			bgTaskDetailService.addTaskDetail(tdetail);
		}
		return new Message("1","success","成功");
	}
	
	@RequestMapping("/deletetdetail.do")
	@ResponseBody
	public Message deleteTaskDetail(ModelAndView mav,BgTaskDetail tdetail){
		System.out.println("进入删除考核任务:"+tdetail);
		bgTaskDetailService.deleteTaskDetail(tdetail.getId());
		return new Message("1","success","成功");
	}
	
	@RequestMapping("/deletetdetailall.do")
	public String deleteTaskDetailAll(ModelAndView mav,Long[] ids){
		System.out.println("进入批量删除考核任务:"+Arrays.toString(ids));
		if(ids!=null&&ids.length>0){
			for (Long id1 : ids) {
				bgTaskDetailService.deleteTaskDetail(id1);
			}
		}
		//重定向到查询方法
		return "redirect:selecttdetail.do";
	}
}
