package com.elder.controller;

import com.elder.domain.User;
import com.elder.enums.UserTypeEnums;
import com.elder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by jsf on 2017/5/15.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;

    @RequestMapping("/validateUserName/{userName}")
    @ResponseBody
    public Map<String, Object> validateUserName(@PathVariable String userName) {
        Map<String, Object> map = new HashMap<>();
        User user = userService.validateUserName(userName);
        if (user != null) {
            map = generateFailureMsg("该用户名已经存在");
        } else {
            map = generateSuccessMsg("该用户名可以使用");
        }
        return map;
    }

    @RequestMapping("/registerUser")
    @ResponseBody
    public Map<String, Object> registerUser(@PathVariable String userName, @PathVariable String password) {
        Map<String, Object> map = new HashMap<>();
        int i = userService.registerUser(userName, password, UserTypeEnums.ORDINARY.getTypeId());
        if (i != 0) {
            map = generateSuccessMsg("注册成功");
        } else {
            map = generateFailureMsg("注册失败");
        }
        return map;
    }
    //支持跨域请求
    @CrossOrigin
    @RequestMapping(value = "/userLogin")
    @ResponseBody
    public Map<String, Object> userLogin(@RequestBody User user) {
        Map<String, Object> map = new HashMap<>();
        userService.userLogin(user);
        if (user != null) {
            map.put("user", user);
            map = generateSuccessMsg("登录成功");
        } else {
            map = generateFailureMsg("登录失败，请检查用户名密码是否正确");
        }
        return map;
    }

    @RequestMapping("/userLogOut")
    @ResponseBody
    public Map<String, Object> userLogOut() {
        Map<String, Object> map = new HashMap<>();
        userService.userLogOut();
        map = generateSuccessMsg("您已经成功退出该系统");
        return map;
    }
    @RequestMapping("/user/queryUserByPage/{userPageNow}/{userPageSize}")
    @ResponseBody
    public List<User> queryUserByPage0(@PathVariable int userPageNow,@PathVariable int userPageSize){
        List<User> userList=new ArrayList<User>();
        return userList;
    }

}
