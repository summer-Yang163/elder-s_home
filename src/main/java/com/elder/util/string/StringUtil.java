package com.elder.util.string;


public class StringUtil {
    /**
     * 判断字符串是否为空
     * @param str
     * @return 是否为空
     * **/
    public static boolean isEmpty(String str){
        if(str == null || "".equals(str)){
            return true;
        }else {
            return false;
        }
    }

}
