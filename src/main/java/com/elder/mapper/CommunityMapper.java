package com.elder.mapper;

import com.elder.pojo.Community;
import org.springframework.stereotype.Component;
import java.util.List;


/**
* @author 令照辉 [lingzh21080@hundsun.com,zeekling@163.com]
* @version 1.0
* @apiNote 自动生成
*/
@Component
public interface CommunityMapper {

    void add(Community community);

    void update(Community community);

    void delete(Community community);

    List<Community> query(Community community);
}