package com.elder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.elder.service.ServiceUserService;

/**
* @author 令照辉 [lingzh21080@hundsun.com,zeekling@163.com]
* @version 1.0
* @apiNote 自动生成
*/
@Controller
@RequestMapping("serviceUser")
public class ServiceUserController{

   @Autowired
   private ServiceUserService serviceUserService;

}