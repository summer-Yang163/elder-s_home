package com.elder.mapper;

import com.elder.domain.OldMan;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OldManMapper {
    int deleteByPrimaryKey(Integer oldId);

    int insert(OldMan record);

    int insertSelective(OldMan record);

    OldMan selectByPrimaryKey(Integer oldId);

    int updateByPrimaryKeySelective(OldMan record);

    int updateByPrimaryKey(OldMan record);


    List<OldMan> executeQueryAllByPage(@Param("isHide") int isHide, @Param("currentTotalCount") int currentTotalCount, @Param("pageSize") int pageSize);

    int queryTotalRows(@Param("isHide")int isHide);
}