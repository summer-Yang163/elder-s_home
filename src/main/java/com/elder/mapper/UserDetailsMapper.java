package com.elder.mapper;

import com.elder.domain.UserDetails;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDetailsMapper {
    int deleteByPrimaryKey(Integer userDetailsId);

    int insert(UserDetails record);

    int insertSelective(UserDetails record);

    UserDetails selectByPrimaryKey(Integer userDetailsId);

    int updateByPrimaryKeySelective(UserDetails record);

    int updateByPrimaryKey(UserDetails record);

    List<UserDetails> executeQueryAllByPage(@Param("isHide")int isHide,@Param("currentTotalCount") int currentTotalCount, @Param("pageSize") int pageSize);

    int queryTotalRows(@Param("isHide")int isHide);
}
