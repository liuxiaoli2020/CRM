package com.sc.mapper;

import com.sc.entity.XsCustomerFeedback;
import com.sc.entity.XsCustomerFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsCustomerFeedbackMapper {
    int countByExample(XsCustomerFeedbackExample example);

    int deleteByExample(XsCustomerFeedbackExample example);

    int deleteByPrimaryKey(Long feedbackRecordId);

    int insert(XsCustomerFeedback record);

    int insertSelective(XsCustomerFeedback record);

    List<XsCustomerFeedback> selectByExample(XsCustomerFeedbackExample example);

    //
    List<XsCustomerFeedback>  selectcustomerId(Long customerId);
    
    XsCustomerFeedback selectByPrimaryKey(Long feedbackRecordId);

    int updateByExampleSelective(@Param("record") XsCustomerFeedback record, @Param("example") XsCustomerFeedbackExample example);

    int updateByExample(@Param("record") XsCustomerFeedback record, @Param("example") XsCustomerFeedbackExample example);

    int updateByPrimaryKeySelective(XsCustomerFeedback record);

    int updateByPrimaryKey(XsCustomerFeedback record);
}