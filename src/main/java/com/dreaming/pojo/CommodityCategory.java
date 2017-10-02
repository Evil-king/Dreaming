package com.dreaming.pojo;

public class CommodityCategory {
    private Integer id;

    private Integer commodityId;

    private Integer secId;

    public CommodityCategory(Integer id, Integer commodityId, Integer secId) {
        this.id = id;
        this.commodityId = commodityId;
        this.secId = secId;
    }

    public CommodityCategory() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getSecId() {
        return secId;
    }

    public void setSecId(Integer secId) {
        this.secId = secId;
    }
}