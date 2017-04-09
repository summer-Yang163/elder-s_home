package com.elder.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.elder.mapper.CommunityMapper;
import com.elder.service.CommunityService;
/**
* @author 杨新梅 [2448415727@qq.com]
* @version 1.0
* @apiNote
*/
@Component
public class CommunityServiceImpl implements CommunityService{

   @Autowired
   private CommunityMapper communityMapper;

}