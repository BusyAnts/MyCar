package com.cimc.car.mapper;

import com.cimc.car.domain.ArticleCategory;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface ArticleCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleCategory record);

    int insertSelective(ArticleCategory record);

    ArticleCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleCategory record);

    int updateByPrimaryKey(ArticleCategory record);
}