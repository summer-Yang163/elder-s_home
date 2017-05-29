package com.elder.mapper;

import com.elder.domain.ProjectType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectTypeMapper {
    int deleteByPrimaryKey(Integer projectTypeId);

    int insert(ProjectType record);

    int insertSelective(ProjectType record);

    ProjectType selectByPrimaryKey(Integer projectTypeId);

    int updateByPrimaryKeySelective(ProjectType record);

    int updateByPrimaryKey(ProjectType record);

    List<ProjectType> queryAllProjectType();
}