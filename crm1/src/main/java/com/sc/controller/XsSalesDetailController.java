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
import com.sc.entity.XsSalesDetail;
import com.sc.service.XsSalesDetailService;


@Controller
@RequestMapping("salesdetailctrl")
public class XsSalesDetailController {
	
	@Autowired
	XsSalesDetailService xsSalesDetailService;

	@RequestMapping("selectsalesdetail.do")
    public ModelAndView selectSalesDetail(ModelAndView mav,
    		@RequestParam(defaultValue="1")Integer pageNum,
    		@RequestParam(defaultValue="10")Integer pageSize,
    		XsSalesDetail salesdetail){
    	System.out.println("进入查询仓库分页方法了");
    	PageInfo<XsSalesDetail> page = xsSalesDetailService.selectSalesDetail(pageNum, pageSize, salesdetail);
    	mav.addObject("p", page);
    	mav.addObject("salesdetail", salesdetail);
    	mav.setViewName("xs/salesdetail-list");
    	return mav;
    }
	
	
	@RequestMapping("/goaddsalesdetail.do")
	public ModelAndView goAddSalesDetail(ModelAndView mav,XsSalesDetail salesdetail){
    	System.out.println("进入添加页面了"+salesdetail);
    	//修改
    	if(salesdetail.getSalesDetailId()!=null){
    		salesdetail=xsSalesDetailService.getSalesDetail(salesdetail.getSalesDetailId());
    	}
    	mav.setViewName("xs/salesdetail-add");
    	mav.addObject("salesdetail", salesdetail);
    	return mav;
    }
	
	@RequestMapping("/addsalesdetail.do")
	@ResponseBody
	public Message  addSalesDetail(ModelAndView mav,XsSalesDetail salesdetail){
    	System.out.println("进入添加用户"+salesdetail);
    	if(salesdetail.getSalesDetailId()!=null){//修改
    		xsSalesDetailService.updateSalesDetail(salesdetail);
    	}else{//添加
    		xsSalesDetailService.addSalesDetail(salesdetail);
    	}
    	return new Message("1", "success", "成功");
    }
	
	@RequestMapping("/deletesalesdetail.do")
	@ResponseBody
	public Message deleteSalesDetail(ModelAndView mav,XsSalesDetail salesdetail){
    	System.out.println("进入删除用户"+salesdetail);
    	xsSalesDetailService.deleteSalesDetail(salesdetail.getSalesDetailId());
    	return new Message("1", "success", "成功");
    }
	
	@RequestMapping("/deletecustomercontactall.do")
	@ResponseBody
	public ModelAndView deleteSalesDetailAll(ModelAndView mav,Long[] ids){
    	System.out.println("进入批量删除用户"+Arrays.toString(ids));
    	if(ids!=null&&ids.length>0){
    		for (Long id : ids) {
    			xsSalesDetailService.deleteSalesDetail(id);
			}
    		
    	}
    	mav.setViewName("redirect:selectsalesdetail.do");
    	 return mav;
    }
}

