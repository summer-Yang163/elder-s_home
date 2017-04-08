package com.elder.mapper;

import com.elder.pojo.Service;
import org.springframework.stereotype.Component;
import java.util.List;


/**
* @author 令照辉 [lingzh21080@hundsun.com,zeekling@163.com]
* @version 1.0
* @apiNote 自动生成
*/
@Component
public interface ServiceMapper {

    void add(Service service);

    void update(Service service);

    void delete(Service service);

    List<Service> query(Service service);
}