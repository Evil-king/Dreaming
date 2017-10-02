package com.dreaming.dao;

import com.dreaming.pojo.TopCategory;

public interface TopCategoryMapper {
    int deleteByPrimaryKey(Integer topId);

    int insert(TopCategory record);

    int insertSelective(TopCategory record);

    TopCategory selectByPrimaryKey(Integer topId);

    int updateByPrimaryKeySelective(TopCategory record);

    int updateByPrimaryKey(TopCategory record);
}