package com.sc.mapper;

import com.sc.entity.XtPowerRole;
import com.sc.entity.XtPowerRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtPowerRoleMapper {
    int countByExample(XtPowerRoleExample example);

    int deleteByExample(XtPowerRoleExample example);

    int deleteByPrimaryKey(Long powerRoleId);

    int insert(XtPowerRole record);

    int insertSelective(XtPowerRole record);

    List<XtPowerRole> selectByExample(XtPowerRoleExample example);

    XtPowerRole selectByPrimaryKey(Long powerRoleId);

    int updateByExampleSelective(@Param("record") XtPowerRole record, @Param("example") XtPowerRoleExample example);

    int updateByExample(@Param("record") XtPowerRole record, @Param("example") XtPowerRoleExample example);

    int updateByPrimaryKeySelective(XtPowerRole record);

    int updateByPrimaryKey(XtPowerRole record);
}