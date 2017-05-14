package com.elder.mapper;

import com.elder.domain.CommunityAddress;

public interface CommunityAddressMapper {
    int deleteByPrimaryKey(Integer communityAddressId);

    int insert(CommunityAddress record);

    int insertSelective(CommunityAddress record);

    CommunityAddress selectByPrimaryKey(Integer communityAddressId);

    int updateByPrimaryKeySelective(CommunityAddress record);

    int updateByPrimaryKey(CommunityAddress record);
}