package com.sc.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgMsgDetail;
import com.sc.entity.Message;
import com.sc.service.BgMsgDetailService;

@Controller
@RequestMapping("/bgMsgDetailctrl")
public class BgMsgDetailController {

	@Autowired
	BgMsgDetailService bgMsgDetailService;
	
	//查询
	@RequestMapping("/selectmdetail.do")
	public ModelAndView selectMsgDetail(ModelAndView mav,
			@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="10") Integer pageSize,
			BgMsgDetail mdetail){
		
		System.out.println("进入查询考核任务分页方法了:"+mdetail);
		/*System.out.println("-------小----------:"+mdetail.getDatemin());
		System.out.println("-------大----------:"+mdetail.getDatemax());*/
		
		//为多条件查询做准备
		PageInfo<BgMsgDetail> page = bgMsgDetailService.selectMsgDetail(pageNum, pageSize, mdetail);
		
		mav.addObject("p", page);
		mav.addObject("mdetail", mdetail);
		mav.setViewName("bg/bgmdetail-list"); //WEB-INF/bg/bgmdetail-list.jsp
		return mav;
	}
	

	@RequestMapping("/goaddmdetail.do")
	public ModelAndView goAddMsgDetail(ModelAndView mav,BgMsgDetail mdetail){
		System.out.println("进入添加页面"+mdetail);
		//修改
		if(mdetail.getMsgDetailId()!=null){
			mdetail=bgMsgDetailService.getMsgDetail(mdetail.getMsgDetailId());
		}
		
		mav.setViewName("bg/bgmdetail-add"); //WEB-INF/bg/bgmdetail-add.jsp
		mav.addObject("mdetail", mdetail);
		return mav;
	}
	
	@RequestMapping("/addmdetail.do")
	@ResponseBody
	public Message addMsgDetail(ModelAndView mav,BgMsgDetail mdetail){
		System.out.println("进入添加考核任务:"+mdetail);
		if(mdetail.getMsgDetailId()!=null){//修改
			bgMsgDetailService.updateMsgDetail(mdetail);
		}else{//添加
			bgMsgDetailService.addMsgDetail(mdetail);
		}
		return new Message("1","success","成功");
	}
	
	@RequestMapping("/deletemdetail.do")
	@ResponseBody
	public Message deleteMsgDetail(ModelAndView mav,BgMsgDetail mdetail){
		System.out.println("进入删除考核任务:"+mdetail);
		bgMsgDetailService.deleteMsgDetail(mdetail.getMsgDetailId());
		return new Message("1","success","成功");
	}
	
	@RequestMapping("/deletemdetailall.do")
	public String deleteMsgAll(ModelAndView mav,Long[] ids){
		System.out.println("进入批量删除考核任务:"+Arrays.toString(ids));
		if(ids!=null&&ids.length>0){
			for (Long id : ids) {
				bgMsgDetailService.deleteMsgDetail(id);
			}
		}
		//重定向到查询方法
		return "redirect:selectmdetail.do";
	}
}
