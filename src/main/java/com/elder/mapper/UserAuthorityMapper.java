package com.elder.mapper;

import com.elder.domain.UserAuthority;

public interface UserAuthorityMapper {
    int deleteByPrimaryKey(Integer userAuthorityId);

    int insert(UserAuthority record);

    int insertSelective(UserAuthority record);

    UserAuthority selectByPrimaryKey(Integer userAuthorityId);

    int updateByPrimaryKeySelective(UserAuthority record);

    int updateByPrimaryKey(UserAuthority record);
}