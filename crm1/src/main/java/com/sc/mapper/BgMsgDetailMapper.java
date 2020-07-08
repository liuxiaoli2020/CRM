package com.sc.mapper;

import com.sc.entity.BgMsgDetail;
import com.sc.entity.BgMsgDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BgMsgDetailMapper {
    int countByExample(BgMsgDetailExample example);

    int deleteByExample(BgMsgDetailExample example);

    int deleteByPrimaryKey(Long msgDetailId);

    int insert(BgMsgDetail record);

    int insertSelective(BgMsgDetail record);

    List<BgMsgDetail> selectByExample(BgMsgDetailExample example);

    BgMsgDetail selectByPrimaryKey(Long msgDetailId);

    int updateByExampleSelective(@Param("record") BgMsgDetail record, @Param("example") BgMsgDetailExample example);

    int updateByExample(@Param("record") BgMsgDetail record, @Param("example") BgMsgDetailExample example);

    int updateByPrimaryKeySelective(BgMsgDetail record);

    int updateByPrimaryKey(BgMsgDetail record);
}