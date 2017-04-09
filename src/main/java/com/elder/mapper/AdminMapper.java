package com.elder.mapper;

import com.elder.pojo.Admin;
import org.springframework.stereotype.Component;
import java.util.List;


/**
* @author 杨新梅 [2448415727@qq.com]
* @version 1.0
* @apiNote
*/
@Component
public interface AdminMapper {

    void add(Admin admin);

    void update(Admin admin);

    void delete(Admin admin);

    List<Admin> query(Admin admin);
}