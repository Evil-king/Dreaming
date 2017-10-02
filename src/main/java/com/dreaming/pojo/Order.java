package com.dreaming.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Integer orderId;

    private Date orderTime;

    private String submitter;

    private String orderType;

    private String orderStatus;

    private String orderAuditor;

    private BigDecimal orderAmount;

    private Integer receiptId;

    public Order(Integer orderId, Date orderTime, String submitter, String orderType, String orderStatus, String orderAuditor, BigDecimal orderAmount, Integer receiptId) {
        this.orderId = orderId;
        this.orderTime = orderTime;
        this.submitter = submitter;
        this.orderType = orderType;
        this.orderStatus = orderStatus;
        this.orderAuditor = orderAuditor;
        this.orderAmount = orderAmount;
        this.receiptId = receiptId;
    }

    public Order() {
        super();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter == null ? null : submitter.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getOrderAuditor() {
        return orderAuditor;
    }

    public void setOrderAuditor(String orderAuditor) {
        this.orderAuditor = orderAuditor == null ? null : orderAuditor.trim();
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Integer receiptId) {
        this.receiptId = receiptId;
    }
}