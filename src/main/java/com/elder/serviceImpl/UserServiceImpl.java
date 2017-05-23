package com.elder.serviceImpl;

import com.elder.domain.User;
import com.elder.mapper.UserMapper;
import com.elder.service.UserService;
import com.elder.util.exception.MessageException;
import com.elder.util.page.PageModel;
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
        int  i=userMapper.deleteByPrimaryKey(userId);
        return i;
    }

    @Override
    public int insertUser(User user) {
        int i=userMapper.insert(user);
        return i;
    }

    @Override
    public List<User> executeQueryAllByPage(int currentTotalCount, int pageSize) {
        List<User> userList = userMapper.executeQueryAllByPage(currentTotalCount, pageSize);
        for(User user:userList){
            user.setUserUserType(user.loadUserUserType());
        }
        return userList;
    }

    @Override
    public int queryTotalRows() {
        int totalRows = userMapper.queryTotalRows();
        return totalRows;
    }


}
