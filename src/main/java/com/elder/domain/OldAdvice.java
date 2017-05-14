package com.elder.domain;

public class OldAdvice {
    private Integer oldAdviceId;

    private String oldAdviceTitle;

    private String oldAdviceContent;

    private Long publishTime;

    private Integer servicePersonId;

    private Integer adviceClassifyId;

    private String oldAdviceBrief;

    public Integer getOldAdviceId() {
        return oldAdviceId;
    }

    public void setOldAdviceId(Integer oldAdviceId) {
        this.oldAdviceId = oldAdviceId;
    }

    public String getOldAdviceTitle() {
        return oldAdviceTitle;
    }

    public void setOldAdviceTitle(String oldAdviceTitle) {
        this.oldAdviceTitle = oldAdviceTitle == null ? null : oldAdviceTitle.trim();
    }

    public String getOldAdviceContent() {
        return oldAdviceContent;
    }

    public void setOldAdviceContent(String oldAdviceContent) {
        this.oldAdviceContent = oldAdviceContent == null ? null : oldAdviceContent.trim();
    }

    public Long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getServicePersonId() {
        return servicePersonId;
    }

    public void setServicePersonId(Integer servicePersonId) {
        this.servicePersonId = servicePersonId;
    }

    public Integer getAdviceClassifyId() {
        return adviceClassifyId;
    }

    public void setAdviceClassifyId(Integer adviceClassifyId) {
        this.adviceClassifyId = adviceClassifyId;
    }

    public String getOldAdviceBrief() {
        return oldAdviceBrief;
    }

    public void setOldAdviceBrief(String oldAdviceBrief) {
        this.oldAdviceBrief = oldAdviceBrief == null ? null : oldAdviceBrief.trim();
    }
}