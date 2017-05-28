package com.elder.serviceImpl;

import com.elder.domain.Project;
import com.elder.enums.IsHideEnums;
import com.elder.mapper.ProjectMapper;
import com.elder.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jsf on 2017/5/27.
 */
@Service
public class ProjectServiceImpl extends BaseServiceImpl<Project> implements ProjectService {
    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public List<Project> executeQueryAllByPage(int currentTotalCount, int pageSize) {
        List<Project> projectList = projectMapper.executeQueryAllByPage(IsHideEnums.NOHIDE.getIsHide(), currentTotalCount, pageSize);
        return projectList;
    }

    @Override
    public int queryTotalRows() {
        int totalRows = projectMapper.queryTotalRows(IsHideEnums.NOHIDE.getIsHide());
        return totalRows;
    }

    @Override
    public int deleteProjectByProjectId(int projecId) {
        Project project = projectMapper.selectByPrimaryKey(projecId);
        if (project != null) {
            project.setIsHide(IsHideEnums.YESHIDE.getIsHide());
            projectMapper.updateByPrimaryKey(project);
        }
        return project.getIsHide();
    }

    @Override
    public int updateProject(Project project) {
        int i = projectMapper.updateByPrimaryKey(project);
        return i;
    }

    @Override
    public int insertProject(Project project) {
        project.setIsHide(IsHideEnums.NOHIDE.getIsHide());
        int i = projectMapper.insert(project);
        return i;
    }
}
