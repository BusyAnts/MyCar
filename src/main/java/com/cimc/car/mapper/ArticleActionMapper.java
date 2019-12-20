package com.cimc.car.mapper;

import com.cimc.car.domain.ArticleAction;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface ArticleActionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleAction record);

    int insertSelective(ArticleAction record);

    ArticleAction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleAction record);

    int updateByPrimaryKey(ArticleAction record);
}