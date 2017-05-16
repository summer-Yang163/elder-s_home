package com.elder.mapper;

import com.elder.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User validateUserName(String userName);

    int registerUser(@Param("userName") String userName,@Param("password") String password,@Param("typeId") int typeId);

    User userLogin(@Param("userName")String userName,@Param("password") String password);

}