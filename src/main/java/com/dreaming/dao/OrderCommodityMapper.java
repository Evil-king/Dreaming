package com.dreaming.dao;

import com.dreaming.pojo.OrderCommodity;

public interface OrderCommodityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderCommodity record);

    int insertSelective(OrderCommodity record);

    OrderCommodity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderCommodity record);

    int updateByPrimaryKey(OrderCommodity record);
}