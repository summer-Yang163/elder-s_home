package com.elder.mapper;

import com.elder.pojo.User;
import org.springframework.stereotype.Component;
import java.util.List;


/**
* @author 杨新梅 [2448415727@qq.com]
* @version 1.0
* @apiNote
*/
@Component
public interface UserMapper {

    void add(User user);

    void update(User user);

    void delete(User user);

    List<User> query(User user);
}