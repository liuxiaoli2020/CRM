package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgPrivateCalender;

public interface BgPrivateCalenderService {

	public void addPrivateCalender(BgPrivateCalender pc);
	
	public void updatePrivateCalender(BgPrivateCalender pc);
	
	public void deletePrivateCalender(Long calendarId);
	
	public BgPrivateCalender getPrivateCalender(Long calendarId);
	
	public PageInfo<BgPrivateCalender> selectPrivateCalender(Integer pageNum,Integer pageSize,BgPrivateCalender pc);
}
