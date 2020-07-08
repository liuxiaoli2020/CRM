package com.sc.mapper;

import com.sc.entity.CgPurchase;
import com.sc.entity.CgPurchaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CgPurchaseMapper {
    int countByExample(CgPurchaseExample example);

    int deleteByExample(CgPurchaseExample example);

    int deleteByPrimaryKey(Long purchaseId);

    int insert(CgPurchase record);

    int insertSelective(CgPurchase record);

    List<CgPurchase> selectByExample(CgPurchaseExample example);

    CgPurchase selectByPrimaryKey(Long purchaseId);

    int updateByExampleSelective(@Param("record") CgPurchase record, @Param("example") CgPurchaseExample example);

    int updateByExample(@Param("record") CgPurchase record, @Param("example") CgPurchaseExample example);

    int updateByPrimaryKeySelective(CgPurchase record);

    int updateByPrimaryKey(CgPurchase record);
}