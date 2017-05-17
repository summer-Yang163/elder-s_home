package com.elder.controller;

import com.elder.util.exception.MessageException;
import com.elder.util.string.StringUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jsf on 2017/5/14.
 */
public class BaseController {
   public Map<String,Object>  generateFailureMsg(Exception e,String defaultMsg){
       Map<String,Object> map=new HashMap<>();
       if(e instanceof MessageException){
           map.put("msg",((MessageException)e).getMsg());
       }else if(!StringUtil.isEmpty(defaultMsg)){
           map.put("msg",defaultMsg);
       }
       map.put("success",false);
       e.printStackTrace();
       return map;
   }
   public Map<String,Object> generateFailureMsg(String defaultMsg){
       Map<String,Object> map=new HashMap<>();
       if(!StringUtil.isEmpty(defaultMsg)){
           map.put("msg",defaultMsg);
           map.put("success",false);
           return map;
       }
       return map;
   }
    public Map<String, Object> generateSuccessMsg(String defaultMsg) {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", defaultMsg);
        map.put("success", true);
        return map;
    }

}
