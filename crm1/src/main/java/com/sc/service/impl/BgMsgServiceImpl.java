package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.BgMsg;
import com.sc.entity.BgMsgExample;
import com.sc.entity.BgMsgExample.Criteria;
import com.sc.mapper.BgMsgMapper;
import com.sc.service.BgMsgService;

@Service
public class BgMsgServiceImpl implements BgMsgService {

	@Autowired
	BgMsgMapper bgMsgMapper;
	
	@Override
	public void addMsg(BgMsg msg) {
		bgMsgMapper.insert(msg);

	}

	@Override
	public void updateMsg(BgMsg msg) {
		if(msg!=null&&msg.getMsgId()!=null){
			bgMsgMapper.updateByPrimaryKey(msg);
		}

	}

	@Override
	public void deleteMsg(Long msgId) {
		if(msgId!=null){
			bgMsgMapper.deleteByPrimaryKey(msgId);
		}

	}

	@Override
	public BgMsg getMsg(Long msgId) {
		if(msgId!=null){
			return bgMsgMapper.selectByPrimaryKey(msgId);
		}
		return null;
	}

	@Override
	public PageInfo<BgMsg> selectMsg(Integer pageNum, Integer pageSize, BgMsg msg) {
		
		BgMsgExample example=new BgMsgExample();
		if(msg!=null){
			Criteria criteria = example.createCriteria();
			
			if(!StringUtils.isEmpty(msg.getMsgTitle())){//短消息标题模糊查询
				criteria.andMsgTitleLike("%"+msg.getMsgTitle()+"%");
			}
			if(!StringUtils.isEmpty(msg.getDatemin())){//最后修改时间大于等于最小日期
				System.out.println("-------小----------:"+msg.getDatemin());
				criteria.andLastModifyDateGreaterThanOrEqualTo(msg.getDatemin());
			}
			if(!StringUtils.isEmpty(msg.getDatemax())){//最后修改时间小于等于最大日期
				Date d=msg.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("-------大----------:"+d);
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
		}
		
		PageHelper.startPage(pageNum, pageSize);
		List<BgMsg> list = bgMsgMapper.selectByExample(example);
		PageInfo<BgMsg> page=new PageInfo<BgMsg>(list);
		return page;
	}

}
