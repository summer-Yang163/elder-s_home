package com.elder.mapper;

import com.elder.domain.CommunityNews;

public interface CommunityNewsMapper {
    int deleteByPrimaryKey(Integer newsId);

    int insert(CommunityNews record);

    int insertSelective(CommunityNews record);

    CommunityNews selectByPrimaryKey(Integer newsId);

    int updateByPrimaryKeySelective(CommunityNews record);

    int updateByPrimaryKey(CommunityNews record);
}