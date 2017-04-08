package com.elder.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.elder.mapper.TipMapper;
import com.elder.service.TipService;
/**
* @author 令照辉 [lingzh21080@hundsun.com,zeekling@163.com]
* @version 1.0
* @apiNote 自动生成
*/
@Component
public class TipServiceImpl implements TipService{

   @Autowired
   private TipMapper tipMapper;

}