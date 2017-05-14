package com.elder.mapper;

import com.elder.domain.CommunityService;

public interface CommunityServiceMapper {
    int deleteByPrimaryKey(Integer communityServiceId);

    int insert(CommunityService record);

    int insertSelective(CommunityService record);

    CommunityService selectByPrimaryKey(Integer communityServiceId);

    int updateByPrimaryKeySelective(CommunityService record);

    int updateByPrimaryKey(CommunityService record);
}