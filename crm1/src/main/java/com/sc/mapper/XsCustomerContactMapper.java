package com.sc.mapper;

import com.sc.entity.XsCustomerContact;
import com.sc.entity.XsCustomerContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsCustomerContactMapper {
    int countByExample(XsCustomerContactExample example);

    int deleteByExample(XsCustomerContactExample example);

    int deleteByPrimaryKey(Long contactId);

    int insert(XsCustomerContact record);

    int insertSelective(XsCustomerContact record);

    List<XsCustomerContact> selectByExample(XsCustomerContactExample example);

    XsCustomerContact selectByPrimaryKey(Long contactId);

    int updateByExampleSelective(@Param("record") XsCustomerContact record, @Param("example") XsCustomerContactExample example);

    int updateByExample(@Param("record") XsCustomerContact record, @Param("example") XsCustomerContactExample example);

    int updateByPrimaryKeySelective(XsCustomerContact record);

    int updateByPrimaryKey(XsCustomerContact record);
}