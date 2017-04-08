package com.elder.mapper;

import com.elder.pojo.OldMan;
import org.springframework.stereotype.Component;
import java.util.List;


/**
* @author 令照辉 [lingzh21080@hundsun.com,zeekling@163.com]
* @version 1.0
* @apiNote 自动生成
*/
@Component
public interface OldManMapper {

    void add(OldMan oldMan);

    void update(OldMan oldMan);

    void delete(OldMan oldMan);

    List<OldMan> query(OldMan oldMan);
}