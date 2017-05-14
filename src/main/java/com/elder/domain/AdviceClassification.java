package com.elder.domain;

public class AdviceClassification {
    private Integer adviceClassifyId;

    private String name;

    private Integer parentId;

    public Integer getAdviceClassifyId() {
        return adviceClassifyId;
    }

    public void setAdviceClassifyId(Integer adviceClassifyId) {
        this.adviceClassifyId = adviceClassifyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}