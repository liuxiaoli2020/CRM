package com.sc.mapper;

import com.sc.entity.XtRole;
import com.sc.entity.XtRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtRoleMapper {
    int countByExample(XtRoleExample example);

    int deleteByExample(XtRoleExample example);
  //删除
    int deleteByPrimaryKey(Long roleId);
    //添加
    int insert(XtRole record);

    int insertSelective(XtRole record);

    List<XtRole> selectByExample(XtRoleExample example);
  //通过id做查询
    XtRole selectByPrimaryKey(Long roleId);

    int updateByExampleSelective(@Param("record") XtRole record, @Param("example") XtRoleExample example);

    int updateByExample(@Param("record") XtRole record, @Param("example") XtRoleExample example);

    int updateByPrimaryKeySelective(XtRole record);
  //修改
    int updateByPrimaryKey(XtRole record);
}