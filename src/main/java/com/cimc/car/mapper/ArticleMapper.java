package com.cimc.car.mapper;

import com.cimc.car.domain.Article;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface ArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);
}