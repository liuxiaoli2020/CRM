package com.sc.service;

import java.math.BigDecimal;

import com.github.pagehelper.PageInfo;
import com.sc.entity.CpDepot;
import com.sc.entity.CpDepotExample;

public interface CpDepotService {

	public void addDepot(CpDepot depot);
	
	public void deleteDepot(BigDecimal depotId);
	
	public void updateDepot(CpDepot depot);
	
	public CpDepot getDepot(BigDecimal depotId);
	
	public PageInfo<CpDepot> selectDepot(Integer pageNum, Integer pageSize, CpDepot depot);
}
