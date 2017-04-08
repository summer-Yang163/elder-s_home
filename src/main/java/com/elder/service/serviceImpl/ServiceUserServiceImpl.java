package com.elder.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.elder.mapper.ServiceUserMapper;
import com.elder.service.ServiceUserService;
/**
* @author 令照辉 [lingzh21080@hundsun.com,zeekling@163.com]
* @version 1.0
* @apiNote 自动生成
*/
@Component
public class ServiceUserServiceImpl implements ServiceUserService{

   @Autowired
   private ServiceUserMapper serviceUserMapper;

}