package com.elder.mapper;

import com.elder.pojo.Tip;
import org.springframework.stereotype.Component;
import java.util.List;


/**
* @author 杨新梅 [2448415727@qq.com]
* @version 1.0
* @apiNote
*/
@Component
public interface TipMapper {

    void add(Tip tip);

    void update(Tip tip);

    void delete(Tip tip);

    List<Tip> query(Tip tip);
}