package com.sc.mapper;

import com.sc.entity.RsBranch;
import com.sc.entity.RsBranchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RsBranchMapper {
    int countByExample(RsBranchExample example);

    int deleteByExample(RsBranchExample example);

    int deleteByPrimaryKey(Long branchId);

    int insert(RsBranch record);

    int insertSelective(RsBranch record);

    List<RsBranch> selectByExample(RsBranchExample example);

    RsBranch selectByPrimaryKey(Long branchId);

    int updateByExampleSelective(@Param("record") RsBranch record, @Param("example") RsBranchExample example);

    int updateByExample(@Param("record") RsBranch record, @Param("example") RsBranchExample example);

    int updateByPrimaryKeySelective(RsBranch record);

    int updateByPrimaryKey(RsBranch record);
}