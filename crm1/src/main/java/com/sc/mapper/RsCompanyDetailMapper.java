package com.sc.mapper;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sc.entity.RsCompanyDetail;
import com.sc.entity.RsCompanyDetailExample;
import com.sc.entity.RsJobDetail;

public interface RsCompanyDetailMapper {
    int countByExample(RsCompanyDetailExample example);

    int deleteByExample(RsCompanyDetailExample example);

    int deleteByPrimaryKey(BigDecimal companyId);

    int insert(RsCompanyDetail record);

    int insertSelective(RsCompanyDetail record);

    List<RsCompanyDetail> selectByExample(RsCompanyDetailExample example);

    RsCompanyDetail selectByPrimaryKey(BigDecimal companyId);
    
  //根据姓名查询
    //List<RsCompanyDetail> selectByName(String companyName,String companyCode);
    List<RsCompanyDetail> selectByName(String companyName);
    
    int updateByExampleSelective(@Param("record") RsCompanyDetail record, @Param("example") RsCompanyDetailExample example);

    int updateByExample(@Param("record") RsCompanyDetail record, @Param("example") RsCompanyDetailExample example);

    int updateByPrimaryKeySelective(RsCompanyDetail record);

    int updateByPrimaryKey(RsCompanyDetail record);
}