package com.elder.mapper;

import com.elder.pojo.User;
import org.springframework.stereotype.Component;
import java.util.List;


/**
* @author 令照辉 [lingzh21080@hundsun.com,zeekling@163.com]
* @version 1.0
* @apiNote 自动生成
*/
@Component
public interface UserMapper {

    void add(User user);

    void update(User user);

    void delete(User user);

    List<User> query(User user);
}