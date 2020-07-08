package com.sc.mapper;

import com.sc.entity.XsSalesOut;
import com.sc.entity.XsSalesOutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsSalesOutMapper {
    int countByExample(XsSalesOutExample example);

    int deleteByExample(XsSalesOutExample example);

    int deleteByPrimaryKey(Long salesOrderId);

    int insert(XsSalesOut record);

    int insertSelective(XsSalesOut record);

    List<XsSalesOut> selectByExample(XsSalesOutExample example);

    XsSalesOut selectByPrimaryKey(Long salesOrderId);

    int updateByExampleSelective(@Param("record") XsSalesOut record, @Param("example") XsSalesOutExample example);

    int updateByExample(@Param("record") XsSalesOut record, @Param("example") XsSalesOutExample example);

    int updateByPrimaryKeySelective(XsSalesOut record);

    int updateByPrimaryKey(XsSalesOut record);
}