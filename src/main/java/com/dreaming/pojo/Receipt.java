package com.dreaming.pojo;

public class Receipt {
    private Integer receiptId;

    private Integer userId;

    private String location;

    private String detailedAddress;

    private String receiptPhone;

    private String receiptName;

    private String zipCode;

    public Receipt(Integer receiptId, Integer userId, String location, String detailedAddress, String receiptPhone, String receiptName, String zipCode) {
        this.receiptId = receiptId;
        this.userId = userId;
        this.location = location;
        this.detailedAddress = detailedAddress;
        this.receiptPhone = receiptPhone;
        this.receiptName = receiptName;
        this.zipCode = zipCode;
    }

    public Receipt() {
        super();
    }

    public Integer getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Integer receiptId) {
        this.receiptId = receiptId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress == null ? null : detailedAddress.trim();
    }

    public String getReceiptPhone() {
        return receiptPhone;
    }

    public void setReceiptPhone(String receiptPhone) {
        this.receiptPhone = receiptPhone == null ? null : receiptPhone.trim();
    }

    public String getReceiptName() {
        return receiptName;
    }

    public void setReceiptName(String receiptName) {
        this.receiptName = receiptName == null ? null : receiptName.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }
}