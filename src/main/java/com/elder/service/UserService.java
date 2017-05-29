package com.elder.service;

import com.elder.domain.User;
import com.elder.util.page.PageModel;

import java.util.List;

/**
 * Created by jsf on 2017/5/15.
 */
public interface UserService extends BaseService<User> {
    User validateUserName(String userName);

    int registerUser(String userName, String password, int typeId);

    User userLogin(User user);

    void userLogOut();

    int updateUserPower(User user);

    int deleteUserByUserId(int userId);

    int insertUser(User user);

    int updateUserByPrimaryKey(User user);
}
