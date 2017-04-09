package com.elder.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.elder.mapper.OldManMapper;
import com.elder.service.OldManService;
/**
* @author 杨新梅 [2448415727@qq.com]
* @version 1.0
* @apiNote
*/
@Component
public class OldManServiceImpl implements OldManService{

   @Autowired
   private OldManMapper oldManMapper;

}