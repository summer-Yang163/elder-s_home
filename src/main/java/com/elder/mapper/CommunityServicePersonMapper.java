package com.elder.mapper;

import com.elder.domain.CommunityServicePerson;

public interface CommunityServicePersonMapper {
    int deleteByPrimaryKey(Integer communityServicePersonId);

    int insert(CommunityServicePerson record);

    int insertSelective(CommunityServicePerson record);

    CommunityServicePerson selectByPrimaryKey(Integer communityServicePersonId);

    int updateByPrimaryKeySelective(CommunityServicePerson record);

    int updateByPrimaryKey(CommunityServicePerson record);
}