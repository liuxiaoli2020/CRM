package com.sc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sc.entity.XtUserAccount;
import com.sc.entity.XtUserRole;
import com.sc.entity.XtUserRoleExample;

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
    
   /* 
    //通过角色id查用户姓名---查看成员
    List<XtUserAccount> selectuserid(@Param(value="roleId") Long roleId);*/
}