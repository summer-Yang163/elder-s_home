package com.elder.domain;

public class UserDetails {
    private Integer userDetailsId;

    private String trueName;

    private Integer userGender;

    private String userPhone;

    private Integer userAge;

    private String userEmail;

    private Integer communityId;

    private String userAddress;

    private Integer userId;

    private User userDetatilsUser;

    public Integer getUserDetailsId() {
        return userDetailsId;
    }

    public void setUserDetailsId(Integer userDetailsId) {
        this.userDetailsId = userDetailsId;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName == null ? null : trueName.trim();
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public User getUserDetatilsUser() {
        return userDetatilsUser;
    }

    public void setUserDetatilsUser(User userDetatilsUser) {
        this.userDetatilsUser = userDetatilsUser;
    }

    public User loadUserDetatilsUser(){
        UserMapper userMapper=(UserMapper) BeanUtil.load("userMapper");
        if(userId!=0){
            userDetatilsUser=userMapper.selectByPrimaryKey(userId);
        }
        return userDetatilsUser;
    }
}
