package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.KcGoods;
import com.sc.entity.KcGoodsExample;
import com.sc.entity.KcGoodsExample.Criteria;
import com.sc.mapper.KcGoodsMapper;
import com.sc.service.KcGoodsService;

@Service
public class KcGoodsServiceImpl implements KcGoodsService {

	@Autowired
	KcGoodsMapper kcGoodsMapper;
	
	@Override
	public void addGoods(KcGoods goods) {
		kcGoodsMapper.insert(goods);

	}

	@Override
	public void deleteGoods(Long goodsId) {
		if(goodsId!=null){
			kcGoodsMapper.deleteByPrimaryKey(goodsId);
		}

	}

	@Override
	public void updateGoods(KcGoods goods) {
		if(goods!=null&&goods.getGoodsId()!=null){
			kcGoodsMapper.updateByPrimaryKey(goods);
		}

	}

	@Override
	public KcGoods getGoods(Long goodsId) {
		if(goodsId!=null){
			return kcGoodsMapper.selectByPrimaryKey(goodsId);
		}
		return null;
	}

	@Override
	public PageInfo<KcGoods> selectGoods(Integer pageNum, Integer pageSize, KcGoods goods) {
		KcGoodsExample example = new KcGoodsExample();		
		if(goods!=null){
			Criteria criteria = example.createCriteria();
			if(!StringUtils.isEmpty(goods.getGoodsName())){
				//商品名称模糊查询
				criteria.andGoodsNameLike("%"+goods.getGoodsName()+"%");
			}
			if(!StringUtils.isEmpty(goods.getGoodsKind())){
				//商品种类模糊查询
				criteria.andGoodsKindLike("%"+goods.getGoodsKind()+"%");
			}
			if(!StringUtils.isEmpty(goods.getCompanyId())){
				//商品公司编号模糊查询
				criteria.andCompanyIdLike("%"+goods.getCompanyId()+"%");
			}
			if(!StringUtils.isEmpty(goods.getDatemin())){
				System.out.println("最小日期："+goods.getDatemin());
				//最后修改时间大于等于最小日期
				criteria.andLastModifiedTimeGreaterThanOrEqualTo(goods.getDatemin());
			}
			if(!StringUtils.isEmpty(goods.getDatemax())){
				System.out.println("最大日期："+goods.getDatemax());				
				//最后修改时间小于等于最大日期
				Date d = goods.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				criteria.andLastModifiedTimeLessThanOrEqualTo(goods.getDatemax());
			}
		}
		PageHelper.startPage(pageNum, pageSize);
		List<KcGoods> list = kcGoodsMapper.selectByExample(example);
		PageInfo<KcGoods> pageInfo = new PageInfo<KcGoods>(list);
		return pageInfo;
	}

}
