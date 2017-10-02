package com.dreaming.dao;

import com.dreaming.pojo.CommodityInfo;

public interface CommodityInfoMapper {
    int deleteByPrimaryKey(Integer detailedId);

    int insert(CommodityInfo record);

    int insertSelective(CommodityInfo record);

    CommodityInfo selectByPrimaryKey(Integer detailedId);

    int updateByPrimaryKeySelective(CommodityInfo record);

    int updateByPrimaryKey(CommodityInfo record);
}