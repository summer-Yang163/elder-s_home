package com.elder.domain;

public class CommunityService {
    private Integer communityServiceId;

    private Integer areaId;

    private Integer projectId;

    public Integer getCommunityServiceId() {
        return communityServiceId;
    }

    public void setCommunityServiceId(Integer communityServiceId) {
        this.communityServiceId = communityServiceId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
}