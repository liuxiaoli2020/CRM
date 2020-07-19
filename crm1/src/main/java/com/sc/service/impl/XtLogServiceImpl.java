package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtLog;
import com.sc.mapper.XtLogMapper;
import com.sc.service.XtLogService;
@Service
public class XtLogServiceImpl implements XtLogService {

	@Autowired
	XtLogMapper xtLogMapper;

	@Override
	public List<XtLog> select() {
		return this.xtLogMapper.selectByExample(null);
	}


	@Override
	public void adddall(XtLog log) {
		if (log !=null) {
			this.xtLogMapper.insert(log);
		}
		
	}

	@Override
	public PageInfo<XtLog> findall(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<XtLog> list=this.xtLogMapper.selectByExample(null);
		PageInfo<XtLog> pageInfo=new PageInfo<XtLog>(list);
		return pageInfo;
	}


	@Override
	public void deletextlog(Long logId) {
		this.xtLogMapper.deleteByPrimaryKey(logId);
		
	}


	@Override
	public XtLog getXtLog(Long logId) {
		return this.xtLogMapper.selectByPrimaryKey(logId);
	}
	

}
