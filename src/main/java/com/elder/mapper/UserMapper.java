package com.elder.mapper;

import com.elder.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User validateUserName(String userName);

    int registerUser(@Param("userName") String userName, @Param("password") String password, @Param("typeId") int typeId);

    User userLogin(@Param("userName") String userName, @Param("password") String password);


    List<User> executeQueryAllByPage(@Param("isHide") int isHide,@Param("currentTotalCount") int currentTotalCount, @Param("pageSize") int pageSize);

    int queryTotalRows(@Param("isHide")int isHide);


}