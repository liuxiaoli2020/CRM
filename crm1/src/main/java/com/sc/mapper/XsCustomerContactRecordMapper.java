package com.sc.mapper;

import com.sc.entity.XsCustomerContactRecord;
import com.sc.entity.XsCustomerContactRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsCustomerContactRecordMapper {
    int countByExample(XsCustomerContactRecordExample example);

    int deleteByExample(XsCustomerContactRecordExample example);

    int deleteByPrimaryKey(Long contactRecordId);

    int insert(XsCustomerContactRecord record);

    int insertSelective(XsCustomerContactRecord record);

    List<XsCustomerContactRecord> selectByExample(XsCustomerContactRecordExample example);

    XsCustomerContactRecord selectByPrimaryKey(Long contactRecordId);

    int updateByExampleSelective(@Param("record") XsCustomerContactRecord record, @Param("example") XsCustomerContactRecordExample example);

    int updateByExample(@Param("record") XsCustomerContactRecord record, @Param("example") XsCustomerContactRecordExample example);

    int updateByPrimaryKeySelective(XsCustomerContactRecord record);

    int updateByPrimaryKey(XsCustomerContactRecord record);
}