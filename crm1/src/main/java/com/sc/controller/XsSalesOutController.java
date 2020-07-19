package com.sc.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Message;
import com.sc.entity.XsSalesOut;
import com.sc.service.XsSalesOutService;




@Controller
@RequestMapping("salesoutctrl")
public class XsSalesOutController {
	@Autowired
	XsSalesOutService xsSalesOutService;
	@RequestMapping("selectsalesout.do")
    public ModelAndView selectSalesOut(ModelAndView mav,
    		@RequestParam(defaultValue="1")Integer pageNum,
    		@RequestParam(defaultValue="10")Integer pageSize,
    		XsSalesOut salesout){
    	System.out.println("进入查询仓库分页方法了");
    	PageInfo<XsSalesOut> page = xsSalesOutService.selectSalesOut(pageNum, pageSize, salesout);
    	mav.addObject("p", page);
    	mav.addObject("salesout", salesout);
    	mav.setViewName("xs/salesout-list");
    	return mav;
    }
	
	
	@RequestMapping("/goaddsalesout.do")
	public ModelAndView goAddSalesOut(ModelAndView mav,XsSalesOut salesout){
    	System.out.println("进入添加页面了"+salesout);
    	//修改
    	if(salesout.getSalesOrderId()!=null){
    		salesout=xsSalesOutService.getSalesOut(salesout.getSalesOrderId());
    	}
    	mav.setViewName("xs/salesout-add");
    	mav.addObject("salesout", salesout);
    	return mav;
    }
	
	@RequestMapping("/addsalesout.do")
	@ResponseBody
	public Message  addSalesOut(ModelAndView mav,XsSalesOut salesout){
    	System.out.println("进入添加用户"+salesout);
    	if(salesout.getSalesOrderId()!=null){//修改
    		xsSalesOutService.updateSalesOut(salesout);
    	}else{//添加
    		xsSalesOutService.addSalesOut(salesout);
    	}
    	return new Message("1", "success", "成功");
    }
	
	@RequestMapping("/deletesalesout.do")
	@ResponseBody
	public Message deleteSalesOut(ModelAndView mav,XsSalesOut salesout){
    	System.out.println("进入删除用户"+salesout);
    	xsSalesOutService.deleteSalesOut(salesout.getSalesOrderId());
    	return new Message("1", "success", "成功");
    }
	
	@RequestMapping("/deletesalesoutall.do")
	@ResponseBody
	public String deleteSalesOutAll(ModelAndView mav,Long[] ids){
    	System.out.println("进入批量删除用户"+Arrays.toString(ids));
    	if(ids!=null&&ids.length>0){
    		for (Long id : ids) {
    			xsSalesOutService.deleteSalesOut(id);
			}
    		
    	}
    	
    	 return "redirect:selectsalesout.do";
    }
}

