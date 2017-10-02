package com.dreaming.dao;

import com.dreaming.pojo.Commodity;

public interface CommodityMapper {
    int deleteByPrimaryKey(Integer commodityId);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(Integer commodityId);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
}