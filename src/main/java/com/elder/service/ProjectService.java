package com.elder.service;

import com.elder.domain.Project;

/**
 * Created by jsf on 2017/5/27.
 */
public interface ProjectService extends BaseService<Project> {
    int deleteProjectByProjectId(int projectId);

    int updateProject(Project project);

    int insertProject(Project project);
}
