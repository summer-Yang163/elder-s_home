package com.elder.domain;

public class Tip {
    private Integer tipId;

    private Integer userId;

    private Integer servicePersonId;

    private String tipContent;

    private Long tipTime;

    private Integer isComplete;

    private Integer evaluationId;

    private String remarks;

    public Integer getTipId() {
        return tipId;
    }

    public void setTipId(Integer tipId) {
        this.tipId = tipId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getServicePersonId() {
        return servicePersonId;
    }

    public void setServicePersonId(Integer servicePersonId) {
        this.servicePersonId = servicePersonId;
    }

    public String getTipContent() {
        return tipContent;
    }

    public void setTipContent(String tipContent) {
        this.tipContent = tipContent == null ? null : tipContent.trim();
    }

    public Long getTipTime() {
        return tipTime;
    }

    public void setTipTime(Long tipTime) {
        this.tipTime = tipTime;
    }

    public Integer getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(Integer isComplete) {
        this.isComplete = isComplete;
    }

    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}