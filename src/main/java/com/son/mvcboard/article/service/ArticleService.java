package com.son.mvcboard.article.service;

import com.son.mvcboard.article.domain.ArticleVO;
import com.son.mvcboard.commons.paging.Criteria;

import java.util.List;

public interface ArticleService {
    void create(ArticleVO articleVO) throws Exception;

    ArticleVO read(Integer articleNo) throws Exception;

    void update(ArticleVO articleVO) throws Exception;

    void delete(Integer articleNo) throws  Exception;

    List<ArticleVO> listAll() throws Exception;

    List<ArticleVO> listCriteria(Criteria criteria) throws Exception;
}
