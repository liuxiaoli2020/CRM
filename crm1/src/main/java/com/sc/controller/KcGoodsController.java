package com.sc.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.KcGoods;
import com.sc.entity.Message;
import com.sc.service.KcGoodsService;

@Controller
@RequestMapping("/kcgoodsctrl")
public class KcGoodsController {

	@Autowired
	KcGoodsService kcGoodsService;

	@RequestMapping("/selectgoods.do")
	public ModelAndView selectGoods(ModelAndView mav, @RequestParam(defaultValue = "1") Integer pageNum,
			@RequestParam(defaultValue = "10") Integer pageSize, KcGoods goods) {
		System.out.println("进入仓库管理的分页方法：" + goods);
		// System.out.println("---小---" + goods.getDatemin());
		// System.out.println("---大---" + goods.getDatemax());

		PageInfo<KcGoods> pageInfo = kcGoodsService.selectGoods(pageNum, pageSize, goods);

		mav.addObject("p", pageInfo);
		mav.addObject("goods", goods);
		mav.setViewName("kc/kcgoods-list");
		return mav;
	}
	
	@RequestMapping("/goodsdetail.do")
	public ModelAndView goodsDatil(ModelAndView mav, KcGoods goods) {
		System.out.println("进入商品详情界面：" + goods);
		goods = kcGoodsService.getGoods(goods.getGoodsId());
		mav.setViewName("kc/kcgoods-detail");
		mav.addObject("goods", goods);
		return mav;
	}

	@RequestMapping("/goaddgoods.do")
	public ModelAndView goaddGoods(ModelAndView mav, KcGoods goods) {
		System.out.println("进入仓库管理的添加/修改页面：" + goods);
		// 修改
		if (goods.getGoodsId() != null) {
			goods = kcGoodsService.getGoods(goods.getGoodsId());
		}

		mav.setViewName("kc/kcgoods-add");
		mav.addObject("goods", goods);
		return mav;
	}

	// 添加方法
	@RequestMapping("/addgoods.do")
	@ResponseBody
	public Message addGoods(ModelAndView mav, KcGoods goods) {
		System.out.println("进入仓库管理的添加/修改方法：" + goods);
		if (goods.getGoodsId() == null) {
			// 添加
			kcGoodsService.addGoods(goods);
		} else {
			// 修改
			kcGoodsService.updateGoods(goods);
		}
		return new Message("1", "success", "成功");
	}

	@RequestMapping("/deletegoods.do")
	@ResponseBody
	public Message deleteGoods(ModelAndView mav, KcGoods goods) {
		System.out.println("进入仓库管理的删除方法：" + goods);
		kcGoodsService.deleteGoods(goods.getGoodsId());
		return new Message("1", "success", "成功");
	}

	@RequestMapping("/deletegoodsall.do")
	public String deletegoodsall(ModelAndView mav, Long[] ids) {
		System.out.println("进入仓库管理的批量删除方法：" + Arrays.toString(ids));
		if (ids != null && ids.length > 0) {
			for (Long id : ids) {
				kcGoodsService.deleteGoods(id);
			}
		}
		return "redirect:selectgoods.do";
	}

}
