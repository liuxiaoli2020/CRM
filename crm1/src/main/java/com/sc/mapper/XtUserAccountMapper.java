package com.sc.mapper;

import com.sc.entity.XtUserAccount;
import com.sc.entity.XtUserAccountExample;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtUserAccountMapper {
    int countByExample(XtUserAccountExample example);

    int deleteByExample(XtUserAccountExample example);

    
    //删除
    int deleteByPrimaryKey(BigDecimal userId);

    //添加
    int insert(XtUserAccount record);

    int insertSelective(XtUserAccount record);

    List<XtUserAccount> selectByExample(XtUserAccountExample example);

    //通过id做查询
    XtUserAccount selectByPrimaryKey(BigDecimal userId);

    int updateByExampleSelective(@Param("record") XtUserAccount record, @Param("example") XtUserAccountExample example);

    int updateByExample(@Param("record") XtUserAccount record, @Param("example") XtUserAccountExample example);

    int updateByPrimaryKeySelective(XtUserAccount record);

    //修改
    int updateByPrimaryKey(XtUserAccount record);
}