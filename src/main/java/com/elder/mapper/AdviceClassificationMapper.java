package com.elder.mapper;

import com.elder.domain.AdviceClassification;

public interface AdviceClassificationMapper {
    int deleteByPrimaryKey(Integer adviceClassifyId);

    int insert(AdviceClassification record);

    int insertSelective(AdviceClassification record);

    AdviceClassification selectByPrimaryKey(Integer adviceClassifyId);

    int updateByPrimaryKeySelective(AdviceClassification record);

    int updateByPrimaryKey(AdviceClassification record);
}