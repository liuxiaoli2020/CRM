package com.sc.mapper;

import com.sc.entity.XsUserLoss;
import com.sc.entity.XsUserLossExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsUserLossMapper {
    int countByExample(XsUserLossExample example);

    int deleteByExample(XsUserLossExample example);

    int deleteByPrimaryKey(Long customerLossId);

    int insert(XsUserLoss record);

    int insertSelective(XsUserLoss record);

    List<XsUserLoss> selectByExample(XsUserLossExample example);

    XsUserLoss selectByPrimaryKey(Long customerLossId);

    int updateByExampleSelective(@Param("record") XsUserLoss record, @Param("example") XsUserLossExample example);

    int updateByExample(@Param("record") XsUserLoss record, @Param("example") XsUserLossExample example);

    int updateByPrimaryKeySelective(XsUserLoss record);

    int updateByPrimaryKey(XsUserLoss record);
}