package com.elder.service;

import com.elder.domain.ProjectType;

import java.util.List;


public interface ProjectTypeService extends BaseService<ProjectType> {

    List<ProjectType> queryAllProjectType();

}
