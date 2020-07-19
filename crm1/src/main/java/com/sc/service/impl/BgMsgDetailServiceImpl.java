package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.BgMsgDetail;
import com.sc.entity.BgMsgDetailExample;
import com.sc.entity.BgMsgDetailExample.Criteria;
import com.sc.mapper.BgMsgDetailMapper;
import com.sc.service.BgMsgDetailService;

@Service
public class BgMsgDetailServiceImpl implements BgMsgDetailService {

	@Autowired
	BgMsgDetailMapper bgMsgDetailMapper;
	@Override
	public void addMsgDetail(BgMsgDetail mdetail) {
		bgMsgDetailMapper.insert(mdetail);

	}

	@Override
	public void updateMsgDetail(BgMsgDetail mdetail) {
		if(mdetail!=null&&mdetail.getMsgDetailId()!=null){
			bgMsgDetailMapper.updateByPrimaryKey(mdetail);
		}

	}

	@Override
	public void deleteMsgDetail(Long msgDetailId) {
		if(msgDetailId!=null){
			bgMsgDetailMapper.deleteByPrimaryKey(msgDetailId);
		}

	}

	@Override
	public BgMsgDetail getMsgDetail(Long msgDetailId) {
		if(msgDetailId!=null){
			return bgMsgDetailMapper.selectByPrimaryKey(msgDetailId);
		}
		return null;
	}

	@Override
	public PageInfo<BgMsgDetail> selectMsgDetail(Integer pageNum, Integer pageSize, BgMsgDetail mdetail) {
		BgMsgDetailExample example=new BgMsgDetailExample();
		if(mdetail!=null){
			Criteria criteria = example.createCriteria();
			if(!StringUtils.isEmpty(mdetail.getMsgState())){//消息状态模糊查询
				criteria.andMsgStateLike("%"+mdetail.getMsgState()+"%");
			}
			if(!StringUtils.isEmpty(mdetail.getDatemin())){//最后修改时间大于等于最小日期
				System.out.println("-------小----------:"+mdetail.getDatemin());
				criteria.andLastModifyDateGreaterThanOrEqualTo(mdetail.getDatemin());
			}
			if(!StringUtils.isEmpty(mdetail.getDatemax())){//最后修改时间小于等于最大日期
				Date d=mdetail.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("-------大----------:"+d);
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
		}
		
		PageHelper.startPage(pageNum, pageSize);
		List<BgMsgDetail> list = bgMsgDetailMapper.selectByExample(example);
		PageInfo<BgMsgDetail> page=new PageInfo<BgMsgDetail>(list);
		
		return page;
	}

}
