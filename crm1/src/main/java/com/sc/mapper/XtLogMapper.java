package com.sc.mapper;

import com.sc.entity.XtLog;
import com.sc.entity.XtLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtLogMapper {
    int countByExample(XtLogExample example);

    int deleteByExample(XtLogExample example);

    int deleteByPrimaryKey(Long logId);

    int insert(XtLog record);

    int insertSelective(XtLog record);

    List<XtLog> selectByExample(XtLogExample example);

    XtLog selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") XtLog record, @Param("example") XtLogExample example);

    int updateByExample(@Param("record") XtLog record, @Param("example") XtLogExample example);

    int updateByPrimaryKeySelective(XtLog record);

    int updateByPrimaryKey(XtLog record);
}