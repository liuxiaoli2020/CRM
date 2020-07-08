package com.sc.mapper;

import com.sc.entity.RsJobDetail;
import com.sc.entity.RsJobDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RsJobDetailMapper {
    int countByExample(RsJobDetailExample example);

    int deleteByExample(RsJobDetailExample example);

    int deleteByPrimaryKey(Long jobId);

    int insert(RsJobDetail record);

    int insertSelective(RsJobDetail record);

    List<RsJobDetail> selectByExample(RsJobDetailExample example);

    RsJobDetail selectByPrimaryKey(Long jobId);

    int updateByExampleSelective(@Param("record") RsJobDetail record, @Param("example") RsJobDetailExample example);

    int updateByExample(@Param("record") RsJobDetail record, @Param("example") RsJobDetailExample example);

    int updateByPrimaryKeySelective(RsJobDetail record);

    int updateByPrimaryKey(RsJobDetail record);
}