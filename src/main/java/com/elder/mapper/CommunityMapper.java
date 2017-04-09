package com.elder.mapper;

import com.elder.pojo.Community;
import org.springframework.stereotype.Component;
import java.util.List;


/**
* @author 杨新梅 [2448415727@qq.com]
* @version 1.0
* @apiNote
*/
@Component
public interface CommunityMapper {

    void add(Community community);

    void update(Community community);

    void delete(Community community);

    List<Community> query(Community community);
}