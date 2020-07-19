package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgMsgDetail;

public interface BgMsgDetailService {

public void addMsgDetail(BgMsgDetail mdetail);
	
	public void updateMsgDetail(BgMsgDetail mdetail);
	
	public void deleteMsgDetail(Long msgDetailId);
	
	public BgMsgDetail getMsgDetail(Long msgDetailId);
	
	public PageInfo<BgMsgDetail> selectMsgDetail(Integer pageNum,Integer pageSize,BgMsgDetail mdetail);
}
