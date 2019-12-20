package com.cimc.car.mapper;

import com.cimc.car.domain.Product;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}