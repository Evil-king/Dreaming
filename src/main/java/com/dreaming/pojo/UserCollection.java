package com.dreaming.pojo;

public class UserCollection {
    private Integer id;

    private Integer userId;

    private Integer commodityId;

    private String status;

    public UserCollection(Integer id, Integer userId, Integer commodityId, String status) {
        this.id = id;
        this.userId = userId;
        this.commodityId = commodityId;
        this.status = status;
    }

    public UserCollection() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}