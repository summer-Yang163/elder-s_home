package com.elder.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.elder.mapper.ServiceMapper;
import com.elder.service.ServiceService;
/**
* @author 杨新梅 [2448415727@qq.com]
* @version 1.0
* @apiNote
*/
@Component
public class ServiceServiceImpl implements ServiceService{

   @Autowired
   private ServiceMapper serviceMapper;

}