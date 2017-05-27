package com.elder.domain;

public class OldMan {
    private Integer oldId;

    private String oldName;

    private Integer oldGender;

    private String oldPhone;

    private Integer oldAge;

    private String oldPhoto;

    private Integer userId;

    private String oldRelationship;

    private String oldEmContact;

    private String oldEmPhone;

    private Integer oldCommunityId;

    private String remarks;

    private String idCard;

    private Integer isHide;

    public Integer getOldId() {
        return oldId;
    }

    public void setOldId(Integer oldId) {
        this.oldId = oldId;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName == null ? null : oldName.trim();
    }

    public Integer getOldGender() {
        return oldGender;
    }

    public void setOldGender(Integer oldGender) {
        this.oldGender = oldGender;
    }

    public String getOldPhone() {
        return oldPhone;
    }

    public void setOldPhone(String oldPhone) {
        this.oldPhone = oldPhone == null ? null : oldPhone.trim();
    }

    public Integer getOldAge() {
        return oldAge;
    }

    public void setOldAge(Integer oldAge) {
        this.oldAge = oldAge;
    }

    public String getOldPhoto() {
        return oldPhoto;
    }

    public void setOldPhoto(String oldPhoto) {
        this.oldPhoto = oldPhoto == null ? null : oldPhoto.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOldRelationship() {
        return oldRelationship;
    }

    public void setOldRelationship(String oldRelationship) {
        this.oldRelationship = oldRelationship == null ? null : oldRelationship.trim();
    }

    public String getOldEmContact() {
        return oldEmContact;
    }

    public void setOldEmContact(String oldEmContact) {
        this.oldEmContact = oldEmContact == null ? null : oldEmContact.trim();
    }

    public String getOldEmPhone() {
        return oldEmPhone;
    }

    public void setOldEmPhone(String oldEmPhone) {
        this.oldEmPhone = oldEmPhone == null ? null : oldEmPhone.trim();
    }

    public Integer getOldCommunityId() {
        return oldCommunityId;
    }

    public void setOldCommunityId(Integer oldCommunityId) {
        this.oldCommunityId = oldCommunityId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Integer getIsHide() {
        return isHide;
    }

    public void setIsHide(Integer isHide) {
        this.isHide = isHide;
    }
}