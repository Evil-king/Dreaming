package com.dreaming.pojo;

public class UserInfo {
    private Integer userId;

    private String username;

    private String loginPassword;

    private String headPortrait;

    private String paymentPassword;

    private String eMail;

    private String eMailVerification;

    private String phone;

    private Integer identityId;

    private Integer identityModification;

    private Integer receiptId;

    public UserInfo(Integer userId, String username, String loginPassword, String headPortrait, String paymentPassword, String eMail, String eMailVerification, String phone, Integer identityId, Integer identityModification, Integer receiptId) {
        this.userId = userId;
        this.username = username;
        this.loginPassword = loginPassword;
        this.headPortrait = headPortrait;
        this.paymentPassword = paymentPassword;
        this.eMail = eMail;
        this.eMailVerification = eMailVerification;
        this.phone = phone;
        this.identityId = identityId;
        this.identityModification = identityModification;
        this.receiptId = receiptId;
    }

    public UserInfo() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait == null ? null : headPortrait.trim();
    }

    public String getPaymentPassword() {
        return paymentPassword;
    }

    public void setPaymentPassword(String paymentPassword) {
        this.paymentPassword = paymentPassword == null ? null : paymentPassword.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public String geteMailVerification() {
        return eMailVerification;
    }

    public void seteMailVerification(String eMailVerification) {
        this.eMailVerification = eMailVerification == null ? null : eMailVerification.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getIdentityId() {
        return identityId;
    }

    public void setIdentityId(Integer identityId) {
        this.identityId = identityId;
    }

    public Integer getIdentityModification() {
        return identityModification;
    }

    public void setIdentityModification(Integer identityModification) {
        this.identityModification = identityModification;
    }

    public Integer getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Integer receiptId) {
        this.receiptId = receiptId;
    }
}