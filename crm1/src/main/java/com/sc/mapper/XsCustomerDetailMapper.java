package com.sc.mapper;

import com.sc.entity.XsCustomerDetail;
import com.sc.entity.XsCustomerDetailExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsCustomerDetailMapper {
    int countByExample(XsCustomerDetailExample example);

    int deleteByExample(XsCustomerDetailExample example);

    int deleteByPrimaryKey(Long customerId);

    int insert(XsCustomerDetail record);

    int insertSelective(XsCustomerDetail record);

    
   
    List<XsCustomerDetail> selectByExample(XsCustomerDetailExample example);

    XsCustomerDetail selectByPrimaryKey(Long customerId);

    int updateByExampleSelective(@Param("record") XsCustomerDetail record, @Param("example") XsCustomerDetailExample example);

    int updateByExample(@Param("record") XsCustomerDetail record, @Param("example") XsCustomerDetailExample example);

    int updateByPrimaryKeySelective(XsCustomerDetail record);

    int updateByPrimaryKey(XsCustomerDetail record);
}