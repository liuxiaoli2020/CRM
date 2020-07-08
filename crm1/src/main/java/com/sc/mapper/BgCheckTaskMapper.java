package com.sc.mapper;

import com.sc.entity.BgCheckTask;
import com.sc.entity.BgCheckTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BgCheckTaskMapper {
    int countByExample(BgCheckTaskExample example);

    int deleteByExample(BgCheckTaskExample example);

    int deleteByPrimaryKey(Long taskId);

    int insert(BgCheckTask record);

    int insertSelective(BgCheckTask record);

    List<BgCheckTask> selectByExample(BgCheckTaskExample example);

    BgCheckTask selectByPrimaryKey(Long taskId);

    int updateByExampleSelective(@Param("record") BgCheckTask record, @Param("example") BgCheckTaskExample example);

    int updateByExample(@Param("record") BgCheckTask record, @Param("example") BgCheckTaskExample example);

    int updateByPrimaryKeySelective(BgCheckTask record);

    int updateByPrimaryKey(BgCheckTask record);
}