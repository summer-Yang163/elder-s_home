package com.elder.mapper;

import com.elder.domain.CommunityServicePerson;

public interface CommunityServicePersonMapper {
    int deleteByPrimaryKey(Integer servicePersonId);

    int insert(CommunityServicePerson record);

    int insertSelective(CommunityServicePerson record);

    CommunityServicePerson selectByPrimaryKey(Integer servicePersonId);

    int updateByPrimaryKeySelective(CommunityServicePerson record);

    int updateByPrimaryKey(CommunityServicePerson record);
}