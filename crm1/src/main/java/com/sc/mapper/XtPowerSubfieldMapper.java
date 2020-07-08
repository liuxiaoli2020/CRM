package com.sc.mapper;

import com.sc.entity.XtPowerSubfield;
import com.sc.entity.XtPowerSubfieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtPowerSubfieldMapper {
    int countByExample(XtPowerSubfieldExample example);

    int deleteByExample(XtPowerSubfieldExample example);

    int deleteByPrimaryKey(Long subfieldId);

    int insert(XtPowerSubfield record);

    int insertSelective(XtPowerSubfield record);

    List<XtPowerSubfield> selectByExample(XtPowerSubfieldExample example);

    XtPowerSubfield selectByPrimaryKey(Long subfieldId);

    int updateByExampleSelective(@Param("record") XtPowerSubfield record, @Param("example") XtPowerSubfieldExample example);

    int updateByExample(@Param("record") XtPowerSubfield record, @Param("example") XtPowerSubfieldExample example);

    int updateByPrimaryKeySelective(XtPowerSubfield record);

    int updateByPrimaryKey(XtPowerSubfield record);
}