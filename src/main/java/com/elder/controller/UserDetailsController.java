package com.elder.controller;

import com.elder.domain.User;
import com.elder.domain.UserDetails;
import com.elder.enums.IsHideEnums;
import com.elder.enums.UserTypeEnums;
import com.elder.service.UserDetailService;
import com.elder.service.UserService;
import com.elder.util.page.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jsf on 2017/5/24.
 */
@Controller
@RequestMapping("/userDetails")
public class UserDetailsController extends BaseController {
    @Autowired
    private UserDetailService userDetailService;
    @Autowired
    private UserService userService;

    @RequestMapping("/queryAllUserDetailsByPage")
    @ResponseBody
    public Map<String, Object> queryAllUserDetailsByPage(@RequestBody PageModel initialPageModel) {
        PageModel<UserDetails> finalPageModel = new PageModel<>();
        Map<String, Object> map = new HashMap<>();
        try {
            finalPageModel = userDetailService.queryAllByPage(initialPageModel);
            map = generateSuccessMsg("查询成功");
            map.put("pageMode", finalPageModel);
        } catch (Exception e) {
            map = generateFailureMsg("查询失败");
            e.printStackTrace();
        }
        return map;
    }

    @RequestMapping("/updateUserDetails")
    @ResponseBody
    public Map<String, Object> updateUserDetails(@RequestBody UserDetails userDetails) {
        Map<String, Object> map = new HashMap<>();
        int i = userService.updateUserByPrimaryKey(userDetails.getUserDetatilsUser());
        int j = userDetailService.updateUserDetails(userDetails);
        if (i != 0 && j != 0) {
            map = generateSuccessMsg("更新成功");
        } else {
            map = generateFailureMsg("更新失败");
        }
        return map;
    }

    @RequestMapping("/deleteUserDetailsByUserDetailsId/{userDetailsId}/{userId}")
    @ResponseBody
    public Map<String, Object> deleteUserDetailsByUserDetailsId(@PathVariable int userDetailsId, @PathVariable int userId) {
        Map<String, Object> map = new HashMap<>();
        int i = userDetailService.deleteUserDetailsByUserDetailsId(userDetailsId, userId);
        if (i != IsHideEnums.NOHIDE.getIsHide()) {
            map = generateSuccessMsg("成功删除");
        } else {
            map = generateFailureMsg("删除失败");
        }
        return map;
    }

    @RequestMapping("/insertUserDetails")
    @ResponseBody
    public Map<String, Object> insertUserDetails(@RequestBody UserDetails userDetails) {
        Map<String, Object> map = new HashMap<>();
        User user = new User();
        user.setUserName(userDetails.getUserDetatilsUser().getUserName());
        user.setPassword(userDetails.getUserDetatilsUser().getPassword());
        user.setTypeId(UserTypeEnums.ORDINARY.getTypeId());
        user.setIsHide(IsHideEnums.NOHIDE.getIsHide());
        int j = userService.insertUser(user);
        userDetails.setUserId(user.getUserId());
        int i = userDetailService.insertUserDetails(userDetails);
        if (i != 0 && j != 0) {
            map = generateSuccessMsg("成功添加");
        } else {
            map = generateFailureMsg("添加失败");
        }
        return map;
    }
}
