package com.dreaming.pojo;

public class Identity {
    private Integer identityId;

    private String fullName;

    private String idNumber;

    private String idPhoto;

    public Identity(Integer identityId, String fullName, String idNumber, String idPhoto) {
        this.identityId = identityId;
        this.fullName = fullName;
        this.idNumber = idNumber;
        this.idPhoto = idPhoto;
    }

    public Identity() {
        super();
    }

    public Integer getIdentityId() {
        return identityId;
    }

    public void setIdentityId(Integer identityId) {
        this.identityId = identityId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getIdPhoto() {
        return idPhoto;
    }

    public void setIdPhoto(String idPhoto) {
        this.idPhoto = idPhoto == null ? null : idPhoto.trim();
    }
}