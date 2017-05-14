package com.elder.domain;

public class UserAuthority {
    private Integer userAuthorityId;

    private Integer userId;

    private String authorityBitmap;

    public Integer getUserAuthorityId() {
        return userAuthorityId;
    }

    public void setUserAuthorityId(Integer userAuthorityId) {
        this.userAuthorityId = userAuthorityId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAuthorityBitmap() {
        return authorityBitmap;
    }

    public void setAuthorityBitmap(String authorityBitmap) {
        this.authorityBitmap = authorityBitmap == null ? null : authorityBitmap.trim();
    }
}