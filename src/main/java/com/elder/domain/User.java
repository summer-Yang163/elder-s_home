package com.elder.domain;

import com.elder.mapper.UserTypeMapper;
import com.elder.util.bean.BeanUtil;

public class User {
    private Integer userId;

    private Integer typeId;

    private String userName;

    private String password;

    private UserType userUserType;

    public User() {
    }

    public User(Integer typeId, String userName, String password) {
        this.typeId = typeId;
        this.userName = userName;
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public UserType getUserUserType() {
        return userUserType;
    }

    public void setUserUserType(UserType userUserType) {
        this.userUserType = userUserType;
    }

    public UserType loadUserUserType(){
        UserTypeMapper userTypeMapper= (UserTypeMapper) BeanUtil.load("userTypeMapper");
        if(typeId!=0){
            userUserType=userTypeMapper.selectByPrimaryKey(typeId);
        }
        return userUserType;
    }
}