package com.elder.domain;

import com.elder.mapper.ProjectTypeMapper;
import com.elder.util.bean.BeanUtil;

public class Project {
    private Integer projectId;

    private String projectName;

    private String projectContentDescrible;

    private Double projectPrice;

    private Integer projectLimitedNumber;

    private String projectServiceConditions;

    private Double projectSalePrice;

    private Long projectServiceTime;

    private String projectServicePicture;

    private Integer isFeatures;

    private String remarks;

    private Integer isHide;

    private Integer projectTypeId;

    private ProjectType projectProjectType;


    public ProjectType getProjectProjectType() {
        return projectProjectType;
    }

    public void setProjectProjectType(ProjectType projectProjectType) {
        this.projectProjectType = projectProjectType;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectContentDescrible() {
        return projectContentDescrible;
    }

    public void setProjectContentDescrible(String projectContentDescrible) {
        this.projectContentDescrible = projectContentDescrible == null ? null : projectContentDescrible.trim();
    }

    public Double getProjectPrice() {
        return projectPrice;
    }

    public void setProjectPrice(Double projectPrice) {
        this.projectPrice = projectPrice;
    }

    public Integer getProjectLimitedNumber() {
        return projectLimitedNumber;
    }

    public void setProjectLimitedNumber(Integer projectLimitedNumber) {
        this.projectLimitedNumber = projectLimitedNumber;
    }

    public String getProjectServiceConditions() {
        return projectServiceConditions;
    }

    public void setProjectServiceConditions(String projectServiceConditions) {
        this.projectServiceConditions = projectServiceConditions == null ? null : projectServiceConditions.trim();
    }

    public Double getProjectSalePrice() {
        return projectSalePrice;
    }

    public void setProjectSalePrice(Double projectSalePrice) {
        this.projectSalePrice = projectSalePrice;
    }

    public Long getProjectServiceTime() {
        return projectServiceTime;
    }

    public void setProjectServiceTime(Long projectServiceTime) {
        this.projectServiceTime = projectServiceTime;
    }

    public String getProjectServicePicture() {
        return projectServicePicture;
    }

    public void setProjectServicePicture(String projectServicePicture) {
        this.projectServicePicture = projectServicePicture == null ? null : projectServicePicture.trim();
    }

    public Integer getIsFeatures() {
        return isFeatures;
    }

    public void setIsFeatures(Integer isFeatures) {
        this.isFeatures = isFeatures;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getIsHide() {
        return isHide;
    }

    public void setIsHide(Integer isHide) {
        this.isHide = isHide;
    }

    public Integer getProjectTypeId() {
        return projectTypeId;
    }

    public void setProjectTypeId(Integer projectTypeId) {
        this.projectTypeId = projectTypeId;
    }


    public ProjectType loadProjectProjectType(){
        if(projectProjectType==null){
            if(projectTypeId==0){
                projectProjectType=new ProjectType();
            }else{
                ProjectTypeMapper projectTypeMapper=(ProjectTypeMapper)BeanUtil.load("projectTypeMapper");
                projectProjectType=projectTypeMapper.selectByPrimaryKey(projectTypeId);
            }
        }
        return projectProjectType;
    }
}