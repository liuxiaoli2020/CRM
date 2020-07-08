package com.sc.mapper;

import com.sc.entity.BgTaskDetail;
import com.sc.entity.BgTaskDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BgTaskDetailMapper {
    int countByExample(BgTaskDetailExample example);

    int deleteByExample(BgTaskDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BgTaskDetail record);

    int insertSelective(BgTaskDetail record);

    List<BgTaskDetail> selectByExample(BgTaskDetailExample example);

    BgTaskDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BgTaskDetail record, @Param("example") BgTaskDetailExample example);

    int updateByExample(@Param("record") BgTaskDetail record, @Param("example") BgTaskDetailExample example);

    int updateByPrimaryKeySelective(BgTaskDetail record);

    int updateByPrimaryKey(BgTaskDetail record);
}