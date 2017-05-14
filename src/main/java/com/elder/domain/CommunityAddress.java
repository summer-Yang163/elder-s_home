package com.elder.domain;

public class CommunityAddress {
    private Integer communityAddressId;

    private Integer areaId;

    private Integer communityId;

    public Integer getCommunityAddressId() {
        return communityAddressId;
    }

    public void setCommunityAddressId(Integer communityAddressId) {
        this.communityAddressId = communityAddressId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }
}