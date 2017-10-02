package com.dreaming.dao;

import com.dreaming.pojo.CommodityCategory;

public interface CommodityCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommodityCategory record);

    int insertSelective(CommodityCategory record);

    CommodityCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommodityCategory record);

    int updateByPrimaryKey(CommodityCategory record);
}