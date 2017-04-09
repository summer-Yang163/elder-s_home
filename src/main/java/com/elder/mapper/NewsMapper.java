package com.elder.mapper;

import com.elder.pojo.News;
import org.springframework.stereotype.Component;
import java.util.List;


/**
* @author 杨新梅 [2448415727@qq.com]
* @version 1.0
* @apiNote
*/
@Component
public interface NewsMapper {

    void add(News news);

    void update(News news);

    void delete(News news);

    List<News> query(News news);
}