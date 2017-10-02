package com.dreaming.pojo;

public class OrderCommodity {
    private Integer id;

    private Integer orderId;

    private Integer commodityId;

    private Integer count;

    public OrderCommodity(Integer id, Integer orderId, Integer commodityId, Integer count) {
        this.id = id;
        this.orderId = orderId;
        this.commodityId = commodityId;
        this.count = count;
    }

    public OrderCommodity() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}