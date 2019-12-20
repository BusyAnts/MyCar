package com.cimc.car.mapper;

import com.cimc.car.domain.ArticleTag;

/**
@author chenz
@create 2019-12-20 14:39
*/
public interface ArticleTagMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleTag record);

    int insertSelective(ArticleTag record);

    ArticleTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleTag record);

    int updateByPrimaryKey(ArticleTag record);
}