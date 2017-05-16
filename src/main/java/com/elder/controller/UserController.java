package com.elder.controller;

import com.elder.domain.User;
import com.elder.enums.UserTypeEnums;
import com.elder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jsf on 2017/5/15.
 */
@Controller
@RequestMapping(value="/user")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;

    @RequestMapping("/validate/{userName}")
    @ResponseBody
    public Map<String,Object> validateUserName(@PathVariable String userName){
        Map<String,Object> map=new HashMap<>();
        User user=userService.validateUserName(userName);
        if(user!=null){
            map=generateFailureMsg("该用户名已经存在");
            return map;
        }else{
            generateSuccessMsg("该用户名可以使用");
            return map;
        }
    }
    @RequestMapping("/register/{userName}/{password}")
    @ResponseBody
    public Map<String,Object> registerUser(@PathVariable String userName,@PathVariable String password){
        Map<String,Object> map=new HashMap<>();
        int i=userService.registerUser(userName,password, UserTypeEnums.ORDINARY.getTypeId());
        if(i!=0){
            map=generateSuccessMsg("注册成功");
        }else{
            map=generateFailureMsg("注册失败");
        }
        return map;
    }
    @RequestMapping("/login/{userName}/{password}")
    @ResponseBody
    public Map<String,Object> userLogin(@PathVariable String userName,@PathVariable String password){
        Map<String,Object> map=new HashMap<>();
        User user=userService.userLogin(userName,password);
        if(user!=null){
            map.put("user",user);
            map=generateSuccessMsg("登录成功");
        }else{
            map=generateFailureMsg("登录失败，请检查用户名密码是否正确");
        }
        return map;
    }
    @RequestMapping("/logOut")
    @ResponseBody
    public Map<String,Object> userLogOut(){
        Map<String,Object> map=new HashMap<>();
        userService.userLogOut();
        map=generateSuccessMsg("您已经成功退出该系统");
        return map;
    }


}
