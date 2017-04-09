package com.elder.mapper;

import com.elder.pojo.ServiceUser;
import org.springframework.stereotype.Component;
import java.util.List;


/**
* @author 杨新梅 [2448415727@qq.com]
* @version 1.0
* @apiNote
*/
@Component
public interface ServiceUserMapper {

    void add(ServiceUser serviceUser);

    void update(ServiceUser serviceUser);

    void delete(ServiceUser serviceUser);

    List<ServiceUser> query(ServiceUser serviceUser);
}