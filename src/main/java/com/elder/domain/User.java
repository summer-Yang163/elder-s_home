package com.elder.domain;

import com.elder.mapper.UserDetailsMapper;
import com.elder.mapper.UserTypeMapper;
import com.elder.util.bean.BeanUtil;

public class User {
    private Integer userId;

    private Integer typeId;

    private String userName;

    private String password;

    private Integer isHide;

    private UserType userUserType;

    private Integer userDetailsId;

    private Integer servicePersonId;

    private UserDetails userUserDetails;

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

    public Integer getIsHide() {
        return isHide;
    }

    public void setIsHide(Integer isHide) {
        this.isHide = isHide;
    }

    public Integer getUserDetailsId() {
        return userDetailsId;
    }

    public void setUserDetailsId(Integer userDetailsId) {
        this.userDetailsId = userDetailsId;
    }

    public Integer getServicePersonId() {
        return servicePersonId;
    }

    public void setServicePersonId(Integer servicePersonId) {
        this.servicePersonId = servicePersonId;
    }

    public UserType loadUserUserType() {
        if(userUserType==null){
            if(typeId==0){
                userUserType=new UserType();
            }else{
                UserTypeMapper userTypeMapper = (UserTypeMapper) BeanUtil.load("userTypeMapper");
                userUserType = userTypeMapper.selectByPrimaryKey(typeId);
            }
        }
        return userUserType;
    }
    public UserDetails loadUserUserDetails(){
        if(userUserDetails==null){
            if(userDetailsId==0){
                userUserDetails=new UserDetails();
            }else{
                UserDetailsMapper userDetailsMapper=(UserDetailsMapper)BeanUtil.load("userDetailsMapper");
                userUserDetails=userDetailsMapper.selectByPrimaryKey(userDetailsId);
            }
        }
        return userUserDetails;
    }


}