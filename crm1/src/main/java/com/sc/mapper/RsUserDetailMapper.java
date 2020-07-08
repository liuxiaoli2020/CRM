package com.sc.mapper;

import com.sc.entity.RsUserDetail;
import com.sc.entity.RsUserDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RsUserDetailMapper {
    int countByExample(RsUserDetailExample example);

    int deleteByExample(RsUserDetailExample example);

    int deleteByPrimaryKey(Long staffId);

    int insert(RsUserDetail record);

    int insertSelective(RsUserDetail record);

    List<RsUserDetail> selectByExample(RsUserDetailExample example);

    RsUserDetail selectByPrimaryKey(Long staffId);

    int updateByExampleSelective(@Param("record") RsUserDetail record, @Param("example") RsUserDetailExample example);

    int updateByExample(@Param("record") RsUserDetail record, @Param("example") RsUserDetailExample example);

    int updateByPrimaryKeySelective(RsUserDetail record);

    int updateByPrimaryKey(RsUserDetail record);
}