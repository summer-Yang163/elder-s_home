package com.elder.mapper;

import com.elder.domain.UserDetails;

public interface UserDetailsMapper {
    int deleteByPrimaryKey(Integer userDetailsId);

    int insert(UserDetails record);

    int insertSelective(UserDetails record);

    UserDetails selectByPrimaryKey(Integer userDetailsId);

    int updateByPrimaryKeySelective(UserDetails record);

    int updateByPrimaryKey(UserDetails record);
    List<UserDetails> executeQueryAllByPage(@Param("currentTotalCount") int currentTotalCount, @Param("pageSize") int pageSize);

   int queryTotalRows();
}
