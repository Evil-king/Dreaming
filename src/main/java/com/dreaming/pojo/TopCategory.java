package com.dreaming.pojo;

public class TopCategory {
    private Integer topId;

    private String topName;

    public TopCategory(Integer topId, String topName) {
        this.topId = topId;
        this.topName = topName;
    }

    public TopCategory() {
        super();
    }

    public Integer getTopId() {
        return topId;
    }

    public void setTopId(Integer topId) {
        this.topId = topId;
    }

    public String getTopName() {
        return topName;
    }

    public void setTopName(String topName) {
        this.topName = topName == null ? null : topName.trim();
    }
}