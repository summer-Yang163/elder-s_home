package com.elder.mapper;

import com.elder.domain.UserDetails;

public interface UserDetailsMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserDetails record);

    int insertSelective(UserDetails record);

    UserDetails selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserDetails record);

    int updateByPrimaryKey(UserDetails record);
}