package com.sc.mapper;

import com.sc.entity.BgPrivateCalender;
import com.sc.entity.BgPrivateCalenderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BgPrivateCalenderMapper {
    int countByExample(BgPrivateCalenderExample example);

    int deleteByExample(BgPrivateCalenderExample example);

    int deleteByPrimaryKey(Long calendarId);

    int insert(BgPrivateCalender record);

    int insertSelective(BgPrivateCalender record);

    List<BgPrivateCalender> selectByExample(BgPrivateCalenderExample example);

    BgPrivateCalender selectByPrimaryKey(Long calendarId);

    int updateByExampleSelective(@Param("record") BgPrivateCalender record, @Param("example") BgPrivateCalenderExample example);

    int updateByExample(@Param("record") BgPrivateCalender record, @Param("example") BgPrivateCalenderExample example);

    int updateByPrimaryKeySelective(BgPrivateCalender record);

    int updateByPrimaryKey(BgPrivateCalender record);
}