package com.sc.mapper;

import com.sc.entity.CgOrderDetail;
import com.sc.entity.CgOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CgOrderDetailMapper {
    int countByExample(CgOrderDetailExample example);

    int deleteByExample(CgOrderDetailExample example);

    int deleteByPrimaryKey(Long orderDetailId);

    int insert(CgOrderDetail record);

    int insertSelective(CgOrderDetail record);

    List<CgOrderDetail> selectByExample(CgOrderDetailExample example);

    CgOrderDetail selectByPrimaryKey(Long orderDetailId);

    int updateByExampleSelective(@Param("record") CgOrderDetail record, @Param("example") CgOrderDetailExample example);

    int updateByExample(@Param("record") CgOrderDetail record, @Param("example") CgOrderDetailExample example);

    int updateByPrimaryKeySelective(CgOrderDetail record);

    int updateByPrimaryKey(CgOrderDetail record);
}