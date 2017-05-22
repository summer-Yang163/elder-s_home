package com.elder.service;

import com.elder.domain.User;

import java.util.List;

/**
 * Created by jsf on 2017/5/15.
 */
public interface UserService {
    User validateUserName(String userName);
    int registerUser(String userName,String password,int typeId);
    User userLogin(User user);
    void userLogOut();
    List<User> queryAllCommonUserByPage(int typeId,int pageNow,int pageSize);
}
