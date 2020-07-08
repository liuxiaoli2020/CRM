package com.sc.mapper;

import com.sc.entity.XtUserRole;
import com.sc.entity.XtUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtUserRoleMapper {
    int countByExample(XtUserRoleExample example);

    int deleteByExample(XtUserRoleExample example);

    int deleteByPrimaryKey(Long userRoleId);

    int insert(XtUserRole record);

    int insertSelective(XtUserRole record);

    List<XtUserRole> selectByExample(XtUserRoleExample example);

    XtUserRole selectByPrimaryKey(Long userRoleId);

    int updateByExampleSelective(@Param("record") XtUserRole record, @Param("example") XtUserRoleExample example);

    int updateByExample(@Param("record") XtUserRole record, @Param("example") XtUserRoleExample example);

    int updateByPrimaryKeySelective(XtUserRole record);

    int updateByPrimaryKey(XtUserRole record);
}