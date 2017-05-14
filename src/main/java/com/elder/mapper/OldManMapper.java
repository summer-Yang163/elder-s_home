package com.elder.mapper;

import com.elder.domain.OldMan;

public interface OldManMapper {
    int deleteByPrimaryKey(Integer oldId);

    int insert(OldMan record);

    int insertSelective(OldMan record);

    OldMan selectByPrimaryKey(Integer oldId);

    int updateByPrimaryKeySelective(OldMan record);

    int updateByPrimaryKey(OldMan record);
}