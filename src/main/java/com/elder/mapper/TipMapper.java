package com.elder.mapper;

import com.elder.domain.Tip;

public interface TipMapper {
    int deleteByPrimaryKey(Integer tipId);

    int insert(Tip record);

    int insertSelective(Tip record);

    Tip selectByPrimaryKey(Integer tipId);

    int updateByPrimaryKeySelective(Tip record);

    int updateByPrimaryKey(Tip record);
}