package com.elder.mapper;

import com.elder.domain.Project;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectMapper {
    int deleteByPrimaryKey(Integer projectId);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer projectId);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);

    List<Project> executeQueryAllByPage(@Param("isHide")int isHide, @Param("currentTotalCount") int currentTotalCount, @Param("pageSize") int pageSize);

    int queryTotalRows(@Param("isHide")int isHide);
}