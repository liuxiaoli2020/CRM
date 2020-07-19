package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.CpDepot;
import com.sc.entity.CpDepotExample;
import com.sc.entity.CpDepotExample.Criteria;
import com.sc.mapper.CpDepotMapper;
import com.sc.service.CpDepotService;

@Service
public class CpDepotServiceImpl implements CpDepotService {

	@Autowired
	CpDepotMapper cpDepotMapper;
	
	@Override
	public void addDepot(CpDepot depot) {
		cpDepotMapper.insert(depot);

	}

	@Override
	public void deleteDepot(BigDecimal depotId) {
		if(depotId!=null){
			cpDepotMapper.deleteByPrimaryKey(depotId);
		}

	}

	@Override
	public void updateDepot(CpDepot depot) {
		if(depot!=null&&depot.getDepotId()!=null){
			cpDepotMapper.updateByPrimaryKey(depot);
		}

	}

	@Override
	public CpDepot getDepot(BigDecimal depotId) {
		if(depotId!=null){
			return cpDepotMapper.selectByPrimaryKey(depotId);
		}
		return null;
	}

	@Override
	public PageInfo<CpDepot> selectDepot(Integer pageNum, Integer pageSize, CpDepot depot) {
		CpDepotExample example = new CpDepotExample();
		if(depot!=null){
			Criteria criteria = example.createCriteria();
			//if(depot.getDepotName()!=null&&!depot.getDepotName().equals(""))
			if(!StringUtils.isEmpty(depot.getDepotName())){
				//仓库名称模糊查询
				criteria.andDepotNameLike("%"+depot.getDepotName()+"%");
			}
			if(!StringUtils.isEmpty(depot.getDatemin())){
				System.out.println("最小日期："+depot.getDatemin());
				//最后修改时间大于等于最小日期
				criteria.andLastModifiedTimeGreaterThanOrEqualTo(depot.getDatemin());
			}
			if(!StringUtils.isEmpty(depot.getDatemax())){
				System.out.println("最大日期："+depot.getDatemax());				
				//最后修改时间小于等于最大日期
				Date d = depot.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				criteria.andLastModifiedTimeLessThanOrEqualTo(depot.getDatemax());
			}
		}
		PageHelper.startPage(pageNum, pageSize);
		List<CpDepot> list = cpDepotMapper.selectByExample(example);
		PageInfo<CpDepot> pageInfo = new PageInfo<CpDepot>(list);
		return pageInfo;
	}

}
