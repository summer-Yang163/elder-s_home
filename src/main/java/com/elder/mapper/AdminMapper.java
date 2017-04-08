package com.elder.mapper;

import com.elder.pojo.Admin;
import org.springframework.stereotype.Component;
import java.util.List;


/**
* @author 令照辉 [lingzh21080@hundsun.com,zeekling@163.com]
* @version 1.0
* @apiNote 自动生成
*/
@Component
public interface AdminMapper {

    void add(Admin admin);

    void update(Admin admin);

    void delete(Admin admin);

    List<Admin> query(Admin admin);
}