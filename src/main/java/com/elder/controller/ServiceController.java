package com.elder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.elder.service.ServiceService;

/**
* @author 杨新梅 [2448415727@qq.com]
* @version 1.0
* @apiNote
*/
@Controller
@RequestMapping("service")
public class ServiceController{

   @Autowired
   private ServiceService serviceService;

}