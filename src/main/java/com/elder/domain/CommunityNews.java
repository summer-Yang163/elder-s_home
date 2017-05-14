package com.elder.domain;

public class CommunityNews {
    private Integer newsId;

    private String newsTitle;

    private String newsContent;

    private Long publishTime;

    private Integer importent;

    private Integer servicePersonId;

    private String newsBrief;

    private Integer communityId;

    private Integer communityNewsType;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent == null ? null : newsContent.trim();
    }

    public Long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getImportent() {
        return importent;
    }

    public void setImportent(Integer importent) {
        this.importent = importent;
    }

    public Integer getServicePersonId() {
        return servicePersonId;
    }

    public void setServicePersonId(Integer servicePersonId) {
        this.servicePersonId = servicePersonId;
    }

    public String getNewsBrief() {
        return newsBrief;
    }

    public void setNewsBrief(String newsBrief) {
        this.newsBrief = newsBrief == null ? null : newsBrief.trim();
    }

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public Integer getCommunityNewsType() {
        return communityNewsType;
    }

    public void setCommunityNewsType(Integer communityNewsType) {
        this.communityNewsType = communityNewsType;
    }
}