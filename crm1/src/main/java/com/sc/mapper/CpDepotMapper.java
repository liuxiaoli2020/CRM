package com.sc.mapper;

import com.sc.entity.CpDepot;
import com.sc.entity.CpDepotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CpDepotMapper {
    int countByExample(CpDepotExample example);

    int deleteByExample(CpDepotExample example);

    int insert(CpDepot record);

    int insertSelective(CpDepot record);

    List<CpDepot> selectByExample(CpDepotExample example);

    int updateByExampleSelective(@Param("record") CpDepot record, @Param("example") CpDepotExample example);

    int updateByExample(@Param("record") CpDepot record, @Param("example") CpDepotExample example);
}