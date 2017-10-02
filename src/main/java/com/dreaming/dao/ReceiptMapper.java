package com.dreaming.dao;

import com.dreaming.pojo.Receipt;

public interface ReceiptMapper {
    int deleteByPrimaryKey(Integer receiptId);

    int insert(Receipt record);

    int insertSelective(Receipt record);

    Receipt selectByPrimaryKey(Integer receiptId);

    int updateByPrimaryKeySelective(Receipt record);

    int updateByPrimaryKey(Receipt record);
}