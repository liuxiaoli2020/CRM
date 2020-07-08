package com.sc.mapper;

import com.sc.entity.CgSupplier;
import com.sc.entity.CgSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CgSupplierMapper {
    int countByExample(CgSupplierExample example);

    int deleteByExample(CgSupplierExample example);

    int deleteByPrimaryKey(Long supplierId);

    int insert(CgSupplier record);

    int insertSelective(CgSupplier record);

    List<CgSupplier> selectByExample(CgSupplierExample example);

    CgSupplier selectByPrimaryKey(Long supplierId);

    int updateByExampleSelective(@Param("record") CgSupplier record, @Param("example") CgSupplierExample example);

    int updateByExample(@Param("record") CgSupplier record, @Param("example") CgSupplierExample example);

    int updateByPrimaryKeySelective(CgSupplier record);

    int updateByPrimaryKey(CgSupplier record);
}