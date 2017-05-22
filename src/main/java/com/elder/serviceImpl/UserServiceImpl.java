package com.elder.serviceImpl;

import com.elder.domain.User;
import com.elder.enums.UserTypeEnums;
import com.elder.mapper.UserMapper;
import com.elder.service.UserService;
import com.elder.util.exception.MessageException;
import com.elder.util.session.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jsf on 2017/5/15.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User validateUserName(String userName) {
        User user = userMapper.validateUserName(userName);
        return user;
    }

    @Override
    public int registerUser(String userName, String password, int typeId) {
        int i = userMapper.registerUser(userName, password, typeId);
        return i;
    }

    @Override
    public User userLogin(User user) {
        User validateUser=userMapper.userLogin(user.getUserName(),user.getPassword());
        if(validateUser!=null){
            SessionUtils.bindSession("user",user);
        }
        return validateUser;
    }

    @Override
    public void userLogOut() {
        if(SessionUtils.getSession().getAttribute("user")!=null){
            SessionUtils.logOutSession("user");
        }else{
            throw new MessageException("您已经退出了该系统");
        }
    }


}
