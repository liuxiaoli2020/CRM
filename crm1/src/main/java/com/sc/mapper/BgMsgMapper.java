package com.sc.mapper;

import com.sc.entity.BgMsg;
import com.sc.entity.BgMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BgMsgMapper {
    int countByExample(BgMsgExample example);

    int deleteByExample(BgMsgExample example);

    int deleteByPrimaryKey(Long msgId);

    int insert(BgMsg record);

    int insertSelective(BgMsg record);

    List<BgMsg> selectByExample(BgMsgExample example);

    BgMsg selectByPrimaryKey(Long msgId);

    int updateByExampleSelective(@Param("record") BgMsg record, @Param("example") BgMsgExample example);

    int updateByExample(@Param("record") BgMsg record, @Param("example") BgMsgExample example);

    int updateByPrimaryKeySelective(BgMsg record);

    int updateByPrimaryKey(BgMsg record);
}