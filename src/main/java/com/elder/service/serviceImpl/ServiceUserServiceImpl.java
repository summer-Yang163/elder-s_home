package com.elder.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.elder.mapper.ServiceUserMapper;
import com.elder.service.ServiceUserService;
/**
* @author 杨新梅 [2448415727@qq.com]
* @version 1.0
* @apiNote
*/
@Component
public class ServiceUserServiceImpl implements ServiceUserService{

   @Autowired
   private ServiceUserMapper serviceUserMapper;

}