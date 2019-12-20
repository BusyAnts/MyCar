package com.cimc.car.mapper;

import com.cimc.car.domain.ProductCarActivity;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface ProductCarActivityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductCarActivity record);

    int insertSelective(ProductCarActivity record);

    ProductCarActivity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductCarActivity record);

    int updateByPrimaryKey(ProductCarActivity record);
}