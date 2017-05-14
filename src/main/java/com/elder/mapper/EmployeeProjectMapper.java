package com.elder.mapper;

import com.elder.domain.EmployeeProject;

public interface EmployeeProjectMapper {
    int deleteByPrimaryKey(Integer employProjectId);

    int insert(EmployeeProject record);

    int insertSelective(EmployeeProject record);

    EmployeeProject selectByPrimaryKey(Integer employProjectId);

    int updateByPrimaryKeySelective(EmployeeProject record);

    int updateByPrimaryKey(EmployeeProject record);
}