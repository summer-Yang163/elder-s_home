package com.elder.mapper;

import com.elder.pojo.ServiceUser;
import org.springframework.stereotype.Component;
import java.util.List;


/**
* @author 令照辉 [lingzh21080@hundsun.com,zeekling@163.com]
* @version 1.0
* @apiNote 自动生成
*/
@Component
public interface ServiceUserMapper {

    void add(ServiceUser serviceUser);

    void update(ServiceUser serviceUser);

    void delete(ServiceUser serviceUser);

    List<ServiceUser> query(ServiceUser serviceUser);
}