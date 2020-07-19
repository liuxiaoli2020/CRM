package com.sc.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgCheckTask;
import com.sc.entity.Message;
import com.sc.service.BgCheckTaskService;

@Controller
@RequestMapping("/bgCheckTaskctrl")
public class BgCheckTaskController {

	@Autowired
	BgCheckTaskService bgCheckTaskService;
	
	//查询
	@RequestMapping("/selecttask.do")
	public ModelAndView selectTask(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			BgCheckTask task){
		
		System.out.println("进入查询考核任务分页方法了:"+task);
/*		System.out.println("-------小----------:"+task.getDatemin());
		System.out.println("-------大----------:"+task.getDatemax());*/
		
		//为多条件查询做准备
		PageInfo<BgCheckTask> page = bgCheckTaskService.selectTask(pageNum, pageSize, task);
		
		mav.addObject("p", page);
		mav.addObject("task", task);
		mav.setViewName("bg/bgchecktask-list"); //WEB-INF/bg/bgchecktask-list.jsp
		return mav;
	}
	

	@RequestMapping("/goaddtask.do")
	public ModelAndView goAddTask(ModelAndView mav,BgCheckTask task){
		System.out.println("进入添加页面"+task);
		//修改
		if(task.getTaskId()!=null){
			task=bgCheckTaskService.getTask(task.getTaskId());
		}
		
		mav.setViewName("bg/bgchecktask-add"); //WEB-INF/bg/bgchecktask-add.jsp
		mav.addObject("task", task);
		return mav;
	}
	
	@RequestMapping("/addtask.do")
	@ResponseBody
	public Message addTask(ModelAndView mav,BgCheckTask task){
		System.out.println("进入添加考核任务:"+task);
		if(task.getTaskId()!=null){//修改
			bgCheckTaskService.updateTask(task);
		}else{//添加
			bgCheckTaskService.addTask(task);
		}
		return new Message("1","success","成功");
	}
	
	@RequestMapping("/deletetask.do")
	@ResponseBody
	public Message deleteTask(ModelAndView mav,BgCheckTask task){
		System.out.println("进入删除考核任务:"+task);
		bgCheckTaskService.deleteTask(task.getTaskId());
		return new Message("1","success","成功");
	}
	
	@RequestMapping("/deletetaskall.do")
	public String deleteTaskAll(ModelAndView mav,Long[] ids){
		System.out.println("进入批量删除考核任务:"+Arrays.toString(ids));
		if(ids!=null&&ids.length>0){
			for (Long id : ids) {
				bgCheckTaskService.deleteTask(id);
			}
		}
		//重定向到查询方法
		return "redirect:selecttask.do";
	}
}
