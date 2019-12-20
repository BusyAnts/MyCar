package com.cimc.car.mapper;

import com.cimc.car.domain.DictCountry;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface DictCountryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictCountry record);

    int insertSelective(DictCountry record);

    DictCountry selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictCountry record);

    int updateByPrimaryKey(DictCountry record);
}