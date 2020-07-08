package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.entity.XtUserAccount;
import com.sc.entity.XtUserAccountExample;
import com.sc.entity.XtUserAccountExample.Criteria;
import com.sc.mapper.XtUserAccountMapper;


@Service
public class XtUserAccountServiceImpl implements com.sc.service.XtUserAccountService {

   
	@Autowired
	XtUserAccountMapper xtUserAccountMapper;

	@Override
	public XtUserAccount login(String usercode) {
		XtUserAccountExample example=new XtUserAccountExample();
		Criteria criteria=example.createCriteria();
		criteria.andUserNameEqualTo(usercode);
		List<XtUserAccount> list = xtUserAccountMapper.selectByExample(example);
		if (list!=null&&list.size()>0) {
			return list.get(0);
		}
		return null;
	}
	
	
	
}
