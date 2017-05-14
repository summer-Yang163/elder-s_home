package com.elder.domain;

public class EmployeeProject {
    private Integer employProjectId;

    private Integer servicePersonId;

    private Integer projectId;

    private Integer evaluationId;

    public Integer getEmployProjectId() {
        return employProjectId;
    }

    public void setEmployProjectId(Integer employProjectId) {
        this.employProjectId = employProjectId;
    }

    public Integer getServicePersonId() {
        return servicePersonId;
    }

    public void setServicePersonId(Integer servicePersonId) {
        this.servicePersonId = servicePersonId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }
}