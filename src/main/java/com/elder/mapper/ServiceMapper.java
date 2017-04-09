package com.elder.mapper;

import com.elder.pojo.Service;
import org.springframework.stereotype.Component;
import java.util.List;


/**
* @author 杨新梅 [2448415727@qq.com]
* @version 1.0
* @apiNote
*/
@Component
public interface ServiceMapper {

    void add(Service service);

    void update(Service service);

    void delete(Service service);

    List<Service> query(Service service);
}