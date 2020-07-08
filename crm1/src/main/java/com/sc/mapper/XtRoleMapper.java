package com.sc.mapper;

import com.sc.entity.XtRole;
import com.sc.entity.XtRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtRoleMapper {
    int countByExample(XtRoleExample example);

    int deleteByExample(XtRoleExample example);

    int deleteByPrimaryKey(Long roleId);

    int insert(XtRole record);

    int insertSelective(XtRole record);

    List<XtRole> selectByExample(XtRoleExample example);

    XtRole selectByPrimaryKey(Long roleId);

    int updateByExampleSelective(@Param("record") XtRole record, @Param("example") XtRoleExample example);

    int updateByExample(@Param("record") XtRole record, @Param("example") XtRoleExample example);

    int updateByPrimaryKeySelective(XtRole record);

    int updateByPrimaryKey(XtRole record);
}