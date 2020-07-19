package com.sc.controller;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.CpDepot;
import com.sc.entity.Message;
import com.sc.service.CpDepotService;

@Controller
@RequestMapping("/cpdepotctrl")
public class CpDepotController {

	@Autowired
	CpDepotService cpDepotService;

	// 分页查询方法
	@RequestMapping("/selectdepot.do")
	public ModelAndView selectDepot(ModelAndView mav, @RequestParam(defaultValue = "1") Integer pageNum,
			@RequestParam(defaultValue = "10") Integer pageSize, CpDepot depot) {
		System.out.println("进入仓库管理的分页方法" + depot);
		System.out.println("---小---" + depot.getDatemin());
		System.out.println("---大---" + depot.getDatemax());

		PageInfo<CpDepot> pageInfo = cpDepotService.selectDepot(pageNum, pageSize, depot);

		mav.addObject("p", pageInfo);
		mav.addObject("depot", depot);
		mav.setViewName("kc/cpdepot-list");
		return mav;
	}

	@RequestMapping("/goadddepot.do")
	public ModelAndView goaddDept(ModelAndView mav, CpDepot depot) {
		System.out.println("进入仓库管理的添加页面：" + depot);
		// 修改
		if (depot.getDepotId() != null) {
			depot = cpDepotService.getDepot(depot.getDepotId());
		}
		mav.setViewName("kc/cpdepot-add");
		mav.addObject("depot", depot);
		return mav;
	}

	// 添加方法
	@RequestMapping("/adddepot.do")
	@ResponseBody
	public Message adddepot(ModelAndView mav, CpDepot depot) {
		System.out.println("进入仓库管理的添加方法：" + depot);
		if (depot.getDepotId() == null) {
			// 修改
			cpDepotService.addDepot(depot);
		} else {
			// 添加
			cpDepotService.updateDepot(depot);
		}
		return new Message("1", "success", "成功");
	}

	@RequestMapping("/deletedepot.do")
	@ResponseBody
	public Message deletedepot(ModelAndView mav, CpDepot depot) {
		System.out.println("进入仓库管理的删除方法：" + depot);
		cpDepotService.deleteDepot(depot.getDepotId());
		return new Message("1", "success", "成功");
	}

	@RequestMapping("/deletedepotall.do")
	public String deletedepotall(ModelAndView mav, BigDecimal[] ids) {
		System.out.println("进入仓库管理的批量删除方法：" + Arrays.toString(ids));
		if(ids!=null&&ids.length>0){
			for (BigDecimal id : ids) {
				cpDepotService.deleteDepot(id);
			}
		}		
		return "redirect:selectdepot.do";
	}

}
