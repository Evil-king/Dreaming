package com.dreaming.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Commodity {
    private Integer commodityId;

    private String commodityName;

    private String commodityPhoto;

    private Date updateTime;

    private BigDecimal price;

    private Integer detailedId;

    public Commodity(Integer commodityId, String commodityName, String commodityPhoto, Date updateTime, BigDecimal price, Integer detailedId) {
        this.commodityId = commodityId;
        this.commodityName = commodityName;
        this.commodityPhoto = commodityPhoto;
        this.updateTime = updateTime;
        this.price = price;
        this.detailedId = detailedId;
    }

    public Commodity() {
        super();
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public String getCommodityPhoto() {
        return commodityPhoto;
    }

    public void setCommodityPhoto(String commodityPhoto) {
        this.commodityPhoto = commodityPhoto == null ? null : commodityPhoto.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getDetailedId() {
        return detailedId;
    }

    public void setDetailedId(Integer detailedId) {
        this.detailedId = detailedId;
    }
}