package com.elder.mapper;

import com.elder.domain.UserType;

public interface UserTypeMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(UserType record);

    int insertSelective(UserType record);

    UserType selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(UserType record);

    int updateByPrimaryKey(UserType record);
}