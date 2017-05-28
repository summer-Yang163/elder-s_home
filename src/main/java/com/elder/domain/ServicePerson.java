package com.elder.domain;

public class ServicePerson {
    private Integer servicePersonId;

    private String serviceName;

    private Integer serviceGender;

    private String servicePhone;

    private Integer serviceAge;

    private String serviceJobNum;

    private Integer communityId;

    private String serviceWorkTime;

    private String serviceWorkPosition;

    private Integer userId;

    private Integer isHide;

    public Integer getServicePersonId() {
        return servicePersonId;
    }

    public void setServicePersonId(Integer servicePersonId) {
        this.servicePersonId = servicePersonId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public Integer getServiceGender() {
        return serviceGender;
    }

    public void setServiceGender(Integer serviceGender) {
        this.serviceGender = serviceGender;
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone == null ? null : servicePhone.trim();
    }

    public Integer getServiceAge() {
        return serviceAge;
    }

    public void setServiceAge(Integer serviceAge) {
        this.serviceAge = serviceAge;
    }

    public String getServiceJobNum() {
        return serviceJobNum;
    }

    public void setServiceJobNum(String serviceJobNum) {
        this.serviceJobNum = serviceJobNum == null ? null : serviceJobNum.trim();
    }

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public String getServiceWorkTime() {
        return serviceWorkTime;
    }

    public void setServiceWorkTime(String serviceWorkTime) {
        this.serviceWorkTime = serviceWorkTime == null ? null : serviceWorkTime.trim();
    }

    public String getServiceWorkPosition() {
        return serviceWorkPosition;
    }

    public void setServiceWorkPosition(String serviceWorkPosition) {
        this.serviceWorkPosition = serviceWorkPosition == null ? null : serviceWorkPosition.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIsHide() {
        return isHide;
    }

    public void setIsHide(Integer isHide) {
        this.isHide = isHide;
    }
}