package com.elder.mapper;

import com.elder.pojo.OldMan;
import org.springframework.stereotype.Component;
import java.util.List;


/**
* @author 杨新梅 [2448415727@qq.com]
* @version 1.0
* @apiNote
*/
@Component
public interface OldManMapper {

    void add(OldMan oldMan);

    void update(OldMan oldMan);

    void delete(OldMan oldMan);

    List<OldMan> query(OldMan oldMan);
}