package com.elder.domain;

public class CommunityServicePerson {
    private Integer communityServicePersonId;

    private Integer communityId;

    private Integer projectId;

    private Integer servicePersonId;

    public Integer getCommunityServicePersonId() {
        return communityServicePersonId;
    }

    public void setCommunityServicePersonId(Integer communityServicePersonId) {
        this.communityServicePersonId = communityServicePersonId;
    }

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getServicePersonId() {
        return servicePersonId;
    }

    public void setServicePersonId(Integer servicePersonId) {
        this.servicePersonId = servicePersonId;
    }
}