package com.sc.service;

import java.math.BigDecimal;

import com.github.pagehelper.PageInfo;
import com.sc.entity.KcGoods;

public interface KcGoodsService {

	public void addGoods(KcGoods goods);
	
	public void deleteGoods(Long goodsId);
	
	public void updateGoods(KcGoods goods);
	
	public KcGoods getGoods(Long goodsId);
	
	public PageInfo<KcGoods> selectGoods(Integer pageNum, Integer pageSize, KcGoods goods);
}
