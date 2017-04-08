package com.elder.mapper;

import com.elder.pojo.News;
import org.springframework.stereotype.Component;
import java.util.List;


/**
* @author 令照辉 [lingzh21080@hundsun.com,zeekling@163.com]
* @version 1.0
* @apiNote 自动生成
*/
@Component
public interface NewsMapper {

    void add(News news);

    void update(News news);

    void delete(News news);

    List<News> query(News news);
}