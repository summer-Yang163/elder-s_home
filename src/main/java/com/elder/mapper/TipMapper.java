package com.elder.mapper;

import com.elder.pojo.Tip;
import org.springframework.stereotype.Component;
import java.util.List;


/**
* @author 令照辉 [lingzh21080@hundsun.com,zeekling@163.com]
* @version 1.0
* @apiNote 自动生成
*/
@Component
public interface TipMapper {

    void add(Tip tip);

    void update(Tip tip);

    void delete(Tip tip);

    List<Tip> query(Tip tip);
}