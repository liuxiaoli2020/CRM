package com.sc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sc.entity.RsJobDetail;
import com.sc.entity.RsJobDetailExample;
import com.sc.entity.RsUserDetail;

public interface RsJobDetailMapper {
    int countByExample(RsJobDetailExample example);

    int deleteByExample(RsJobDetailExample example);

    int deleteByPrimaryKey(Long jobId);

    int insert(RsJobDetail record);

    int insertSelective(RsJobDetail record);

    List<RsJobDetail> selectByExample(RsJobDetailExample example);

    RsJobDetail selectByPrimaryKey(Long jobId);

  //根据姓名查询
    List<RsJobDetail> selectByName(String jobName);
    
    int updateByExampleSelective(@Param("record") RsJobDetail record, @Param("example") RsJobDetailExample example);

    int updateByExample(@Param("record") RsJobDetail record, @Param("example") RsJobDetailExample example);

    int updateByPrimaryKeySelective(RsJobDetail record);

    int updateByPrimaryKey(RsJobDetail record);
}