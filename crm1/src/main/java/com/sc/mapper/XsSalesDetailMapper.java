package com.sc.mapper;

import com.sc.entity.XsSalesDetail;
import com.sc.entity.XsSalesDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsSalesDetailMapper {
    int countByExample(XsSalesDetailExample example);

    int deleteByExample(XsSalesDetailExample example);

    int deleteByPrimaryKey(Long salesDetailId);

    int insert(XsSalesDetail record);

    int insertSelective(XsSalesDetail record);

    List<XsSalesDetail> selectByExample(XsSalesDetailExample example);

    XsSalesDetail selectByPrimaryKey(Long salesDetailId);

    int updateByExampleSelective(@Param("record") XsSalesDetail record, @Param("example") XsSalesDetailExample example);

    int updateByExample(@Param("record") XsSalesDetail record, @Param("example") XsSalesDetailExample example);

    int updateByPrimaryKeySelective(XsSalesDetail record);

    int updateByPrimaryKey(XsSalesDetail record);
}