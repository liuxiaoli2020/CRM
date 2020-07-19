package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtLog;

public interface XtLogService {
	public List<XtLog> select();
	XtLog getXtLog(Long logId);
	public void adddall(XtLog log);
	public void deletextlog(Long logId);
	public PageInfo<XtLog> findall(int pageNum,int pageSize);
}
