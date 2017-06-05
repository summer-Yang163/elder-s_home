package com.elder.service;

import com.elder.domain.Project;


public interface ProjectService extends BaseService<Project> {
    int deleteProjectByProjectId(int projectId);

    int updateProject(Project project);

    int insertProject(Project project);
}
