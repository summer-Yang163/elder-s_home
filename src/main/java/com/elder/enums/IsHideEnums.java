package com.elder.enums;

/**
 * Created by jsf on 2017/5/26.
 */
public enum IsHideEnums {
    YESHIDE(1,"隐藏"), NOHIDE(2,"不隐藏");
    private int isHide;
    private String describe;
    private IsHideEnums(int isHide, String describe){
        this.isHide=isHide;
        this.describe=describe;
    }

    public int getIsHide() {
        return isHide;
    }

    public void setIsHide(int isHide) {
        this.isHide = isHide;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
