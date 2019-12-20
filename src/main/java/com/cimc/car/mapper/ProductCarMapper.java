package com.cimc.car.mapper;

import com.cimc.car.domain.ProductCar;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface ProductCarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductCar record);

    int insertSelective(ProductCar record);

    ProductCar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductCar record);

    int updateByPrimaryKey(ProductCar record);
}