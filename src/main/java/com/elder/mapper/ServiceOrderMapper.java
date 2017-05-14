package com.elder.mapper;

import com.elder.domain.ServiceOrder;

public interface ServiceOrderMapper {
    int deleteByPrimaryKey(Integer serviceOrderId);

    int insert(ServiceOrder record);

    int insertSelective(ServiceOrder record);

    ServiceOrder selectByPrimaryKey(Integer serviceOrderId);

    int updateByPrimaryKeySelective(ServiceOrder record);

    int updateByPrimaryKey(ServiceOrder record);
}