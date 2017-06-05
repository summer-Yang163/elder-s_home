package com.elder.serviceImpl;

import com.elder.domain.ProjectType;
import com.elder.mapper.ProjectTypeMapper;
import com.elder.service.ProjectTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectTypeServiceImpl extends BaseServiceImpl<ProjectType> implements ProjectTypeService {
    @Autowired
    private ProjectTypeMapper projectTypeMapper;

    @Override
    public List<ProjectType> executeQueryAllByPage(int currentTotalCount, int pageSize) {
        return null;
    }

    @Override
    public List<ProjectType> executeQueryAll() {
        return null;
    }

    @Override
    public int queryTotalRows() {
        return 0;
    }

    @Override
    public List<ProjectType> queryAllProjectType() {
        List<ProjectType> projectTypeList=projectTypeMapper.queryAllProjectType();
        return projectTypeList;
    }
}
