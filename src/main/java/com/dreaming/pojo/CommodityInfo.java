package com.dreaming.pojo;

import java.util.Date;

public class CommodityInfo {
    private Integer detailedId;

    private String edition;

    private Date reservationDate;

    private Date offeringDate;

    private String series;

    private String type;

    private String producer;

    private String roleName;

    private String size;

    private String proportion;

    private String explain;

    public CommodityInfo(Integer detailedId, String edition, Date reservationDate, Date offeringDate, String series, String type, String producer, String roleName, String size, String proportion, String explain) {
        this.detailedId = detailedId;
        this.edition = edition;
        this.reservationDate = reservationDate;
        this.offeringDate = offeringDate;
        this.series = series;
        this.type = type;
        this.producer = producer;
        this.roleName = roleName;
        this.size = size;
        this.proportion = proportion;
        this.explain = explain;
    }

    public CommodityInfo() {
        super();
    }

    public Integer getDetailedId() {
        return detailedId;
    }

    public void setDetailedId(Integer detailedId) {
        this.detailedId = detailedId;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition == null ? null : edition.trim();
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Date getOfferingDate() {
        return offeringDate;
    }

    public void setOfferingDate(Date offeringDate) {
        this.offeringDate = offeringDate;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series == null ? null : series.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer == null ? null : producer.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getProportion() {
        return proportion;
    }

    public void setProportion(String proportion) {
        this.proportion = proportion == null ? null : proportion.trim();
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
    }
}