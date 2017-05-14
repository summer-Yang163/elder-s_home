package com.elder.domain;

public class Evaluation {
    private Integer evaluationId;

    private Integer serviceOrderId;

    private String evaluationContent;

    private Integer isSatisfaction;

    private String remarks;

    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public Integer getServiceOrderId() {
        return serviceOrderId;
    }

    public void setServiceOrderId(Integer serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
    }

    public String getEvaluationContent() {
        return evaluationContent;
    }

    public void setEvaluationContent(String evaluationContent) {
        this.evaluationContent = evaluationContent == null ? null : evaluationContent.trim();
    }

    public Integer getIsSatisfaction() {
        return isSatisfaction;
    }

    public void setIsSatisfaction(Integer isSatisfaction) {
        this.isSatisfaction = isSatisfaction;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}