package com.elder.domain;

public class Community {
    private Integer communityId;

    private String communityName;

    private String communityPhone;

    private Integer servicePersonId;

    private String communityPhoto;

    private String communityDescribe;

    private Double communityHousePrice;

    private Double communityRentPrice;

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName == null ? null : communityName.trim();
    }

    public String getCommunityPhone() {
        return communityPhone;
    }

    public void setCommunityPhone(String communityPhone) {
        this.communityPhone = communityPhone == null ? null : communityPhone.trim();
    }

    public Integer getServicePersonId() {
        return servicePersonId;
    }

    public void setServicePersonId(Integer servicePersonId) {
        this.servicePersonId = servicePersonId;
    }

    public String getCommunityPhoto() {
        return communityPhoto;
    }

    public void setCommunityPhoto(String communityPhoto) {
        this.communityPhoto = communityPhoto == null ? null : communityPhoto.trim();
    }

    public String getCommunityDescribe() {
        return communityDescribe;
    }

    public void setCommunityDescribe(String communityDescribe) {
        this.communityDescribe = communityDescribe == null ? null : communityDescribe.trim();
    }

    public Double getCommunityHousePrice() {
        return communityHousePrice;
    }

    public void setCommunityHousePrice(Double communityHousePrice) {
        this.communityHousePrice = communityHousePrice;
    }

    public Double getCommunityRentPrice() {
        return communityRentPrice;
    }

    public void setCommunityRentPrice(Double communityRentPrice) {
        this.communityRentPrice = communityRentPrice;
    }
}