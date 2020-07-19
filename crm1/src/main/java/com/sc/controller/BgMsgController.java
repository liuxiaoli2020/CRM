package com.sc.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgMsg;
import com.sc.entity.Message;
import com.sc.service.BgMsgService;

@Controller
@RequestMapping("/bgMsgctrl")
public class BgMsgController {

	@Autowired
	BgMsgService bgMsgService;
	
	//查询
		@RequestMapping("/selectmsg.do")
		public ModelAndView selectMsg(ModelAndView mav,
				@RequestParam(defaultValue="1") Integer pageNum,
				@RequestParam(defaultValue="10") Integer pageSize,
				BgMsg msg){
			
			System.out.println("进入查询短消息分页方法了"+msg);
			
			//为多条件查询做准备
			PageInfo<BgMsg> page = bgMsgService.selectMsg(pageNum, pageSize, msg);
			
			mav.addObject("p", page);
			mav.addObject("msg", msg);
			mav.setViewName("bg/bgmsg-list"); //WEB-INF/bg/bgmsg-list.jsp
			return mav;
		}
		

		@RequestMapping("/goaddmsg.do")
		public ModelAndView goAddMsg(ModelAndView mav,BgMsg msg){
			System.out.println("进入添加页面"+msg);
			//修改
			if(msg.getMsgId()!=null){
				msg=bgMsgService.getMsg(msg.getMsgId());
			}
			
			mav.setViewName("bg/bgmsg-add"); //WEB-INF/bg/bgmsg-add.jsp
			mav.addObject("msg", msg);
			return mav;
		}
		
		@RequestMapping("/addmsg.do")
		@ResponseBody
		public Message addMsg(ModelAndView mav,BgMsg msg){
			System.out.println("进入添加短消息:"+msg);
			if(msg.getMsgId()!=null){//修改
				bgMsgService.updateMsg(msg);
			}else{//添加
				bgMsgService.addMsg(msg);
			}
			return new Message("1","success","成功");
		}
		
		@RequestMapping("/deletemsg.do")
		@ResponseBody
		public Message deleteMsg(ModelAndView mav,BgMsg msg){
			System.out.println("进入删除短消息:"+msg);
			bgMsgService.deleteMsg(msg.getMsgId());
			return new Message("1","success","成功");
		}
		
		@RequestMapping("/deletemsgall.do")
		public String deleteMsgAll(ModelAndView mav,Long[] ids){
			System.out.println("进入批量删除考核任务:"+Arrays.toString(ids));
			if(ids!=null&&ids.length>0){
				for (Long id : ids) {
					bgMsgService.deleteMsg(id);
				}
			}
			//重定向到查询方法
			return "redirect:selectmsg.do";
		}
}
