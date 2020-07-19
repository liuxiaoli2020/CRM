package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgMsg;

public interface BgMsgService {

	public void addMsg(BgMsg msg);
	
	public void updateMsg(BgMsg msg);
	
	public void deleteMsg(Long msgId);
	
	public BgMsg getMsg(Long msgId);
	
	public PageInfo<BgMsg> selectMsg(Integer pageNum,Integer pageSize,BgMsg msg);
}
