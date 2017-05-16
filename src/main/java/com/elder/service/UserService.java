package com.elder.service;

import com.elder.domain.User;

/**
 * Created by jsf on 2017/5/15.
 */
public interface UserService {
    User validateUserName(String userName);
    int registerUser(String userName,String password,int typeId);
    User userLogin(String userName,String password);
    void userLogOut();
}
