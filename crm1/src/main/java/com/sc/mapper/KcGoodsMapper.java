package com.sc.mapper;

import com.sc.entity.KcGoods;
import com.sc.entity.KcGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KcGoodsMapper {
    int countByExample(KcGoodsExample example);

    int deleteByExample(KcGoodsExample example);

    int deleteByPrimaryKey(Long goodsId);

    int insert(KcGoods record);

    int insertSelective(KcGoods record);

    List<KcGoods> selectByExample(KcGoodsExample example);

    KcGoods selectByPrimaryKey(Long goodsId);

    int updateByExampleSelective(@Param("record") KcGoods record, @Param("example") KcGoodsExample example);

    int updateByExample(@Param("record") KcGoods record, @Param("example") KcGoodsExample example);

    int updateByPrimaryKeySelective(KcGoods record);

    int updateByPrimaryKey(KcGoods record);
}