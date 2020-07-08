package com.sc.mapper;

import com.sc.entity.XtPowerDetail;
import com.sc.entity.XtPowerDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtPowerDetailMapper {
    int countByExample(XtPowerDetailExample example);

    int deleteByExample(XtPowerDetailExample example);

    int deleteByPrimaryKey(Long powerId);

    int insert(XtPowerDetail record);

    int insertSelective(XtPowerDetail record);

    List<XtPowerDetail> selectByExample(XtPowerDetailExample example);

    XtPowerDetail selectByPrimaryKey(Long powerId);

    int updateByExampleSelective(@Param("record") XtPowerDetail record, @Param("example") XtPowerDetailExample example);

    int updateByExample(@Param("record") XtPowerDetail record, @Param("example") XtPowerDetailExample example);

    int updateByPrimaryKeySelective(XtPowerDetail record);

    int updateByPrimaryKey(XtPowerDetail record);
}