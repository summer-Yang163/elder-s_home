package com.elder.mapper;

import com.elder.domain.OldAdvice;

public interface OldAdviceMapper {
    int deleteByPrimaryKey(Integer oldAdviceId);

    int insert(OldAdvice record);

    int insertSelective(OldAdvice record);

    OldAdvice selectByPrimaryKey(Integer oldAdviceId);

    int updateByPrimaryKeySelective(OldAdvice record);

    int updateByPrimaryKey(OldAdvice record);
}