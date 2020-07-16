package com.sc.mapper;

import com.sc.entity.CpDepot;
import com.sc.entity.CpDepotExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CpDepotMapper {
    int countByExample(CpDepotExample example);

    int deleteByExample(CpDepotExample example);

    int deleteByPrimaryKey(BigDecimal depotId);

    int insert(CpDepot record);

    int insertSelective(CpDepot record);

    List<CpDepot> selectByExample(CpDepotExample example);

    CpDepot selectByPrimaryKey(BigDecimal depotId);

    int updateByExampleSelective(@Param("record") CpDepot record, @Param("example") CpDepotExample example);

    int updateByExample(@Param("record") CpDepot record, @Param("example") CpDepotExample example);

    int updateByPrimaryKeySelective(CpDepot record);

    int updateByPrimaryKey(CpDepot record);
}