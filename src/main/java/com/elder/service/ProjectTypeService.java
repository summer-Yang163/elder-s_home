package com.elder.service;

import com.elder.domain.ProjectType;

import java.util.List;

/**
 * Created by jsf on 2017/5/28.
 */
public interface ProjectTypeService extends BaseService<ProjectType> {

    List<ProjectType> queryAllProjectType();

}
