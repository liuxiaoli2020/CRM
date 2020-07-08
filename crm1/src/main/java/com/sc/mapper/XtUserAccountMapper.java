package com.sc.mapper;

import com.sc.entity.XtUserAccount;
import com.sc.entity.XtUserAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtUserAccountMapper {
    int countByExample(XtUserAccountExample example);

    int deleteByExample(XtUserAccountExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(XtUserAccount record);

    int insertSelective(XtUserAccount record);

    List<XtUserAccount> selectByExample(XtUserAccountExample example);

    XtUserAccount selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") XtUserAccount record, @Param("example") XtUserAccountExample example);

    int updateByExample(@Param("record") XtUserAccount record, @Param("example") XtUserAccountExample example);

    int updateByPrimaryKeySelective(XtUserAccount record);

    int updateByPrimaryKey(XtUserAccount record);
}