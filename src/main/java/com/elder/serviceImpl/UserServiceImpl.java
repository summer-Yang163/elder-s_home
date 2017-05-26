package com.elder.serviceImpl;

import com.elder.domain.User;
import com.elder.domain.UserDetails;
import com.elder.enums.IsHideUserEnums;
import com.elder.mapper.UserDetailsMapper;
import com.elder.mapper.UserMapper;
import com.elder.service.UserService;
import com.elder.util.exception.MessageException;
import com.elder.util.session.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jsf on 2017/5/15.
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserDetailsMapper userDetailsMapper;

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
        User validateUser = userMapper.userLogin(user.getUserName(), user.getPassword());
        if (validateUser != null) {
            SessionUtils.bindSession("user", user);
        }
        return validateUser;
    }

    @Override
    public void userLogOut() {
        if (SessionUtils.getSession().getAttribute("user") != null) {
            SessionUtils.logOutSession("user");
        } else {
            throw new MessageException("您已经退出了该系统");
        }
    }
    @Override
    public int updateUserPower(User user) {
        int i=userMapper.updateByPrimaryKey(user);
        return i;
    }

    @Override
    public int deleteUserByUserId(int userId) {
        User user=userMapper.selectByPrimaryKey(userId);
        if(user.getUserDetailsId()!=0){
            UserDetails userDetails=user.loadUserUserDetails();
            userDetails.setIsHide(IsHideUserEnums.YESHIDE.getIsHide());
            userDetailsMapper.updateByPrimaryKey(userDetails);
        }
        user.setIsHide(IsHideUserEnums.YESHIDE.getIsHide());
        userMapper.updateByPrimaryKey(user);
        return user.getIsHide();
    }

    @Override
    public int insertUser(User user) {
        user.setIsHide(IsHideUserEnums.NOHIDE.getIsHide());
        int i=userMapper.insert(user);
        return i;
    }

    @Override
    public int updateUserByPrimaryKey(User user) {
        int i=userMapper.updateByPrimaryKey(user);
        return i;
    }

    @Override
    public List<User> executeQueryAllByPage(int currentTotalCount, int pageSize) {
        List<User> userList = userMapper.executeQueryAllByPage(IsHideUserEnums.NOHIDE.getIsHide(),currentTotalCount, pageSize);
        for(User user:userList){
            user.setUserUserType(user.loadUserUserType());
        }
        return userList;
    }

    @Override
    public int queryTotalRows() {
        int totalRows = userMapper.queryTotalRows(IsHideUserEnums.NOHIDE.getIsHide());
        return totalRows;
    }


}
