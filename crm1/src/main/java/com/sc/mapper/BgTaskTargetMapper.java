package com.sc.mapper;

import com.sc.entity.BgTaskTarget;
import com.sc.entity.BgTaskTargetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BgTaskTargetMapper {
    int countByExample(BgTaskTargetExample example);

    int deleteByExample(BgTaskTargetExample example);

    int deleteByPrimaryKey(Long targetId);

    int insert(BgTaskTarget record);

    int insertSelective(BgTaskTarget record);

    List<BgTaskTarget> selectByExample(BgTaskTargetExample example);

    BgTaskTarget selectByPrimaryKey(Long targetId);

    int updateByExampleSelective(@Param("record") BgTaskTarget record, @Param("example") BgTaskTargetExample example);

    int updateByExample(@Param("record") BgTaskTarget record, @Param("example") BgTaskTargetExample example);

    int updateByPrimaryKeySelective(BgTaskTarget record);

    int updateByPrimaryKey(BgTaskTarget record);
}