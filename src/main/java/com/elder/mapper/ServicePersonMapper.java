package com.elder.mapper;

import com.elder.domain.ServicePerson;

public interface ServicePersonMapper {
    int deleteByPrimaryKey(Integer servicePersonId);

    int insert(ServicePerson record);

    int insertSelective(ServicePerson record);

    ServicePerson selectByPrimaryKey(Integer servicePersonId);

    int updateByPrimaryKeySelective(ServicePerson record);

    int updateByPrimaryKey(ServicePerson record);
}