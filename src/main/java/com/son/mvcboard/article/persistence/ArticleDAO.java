package com.son.mvcboard.article.persistence;

import com.son.mvcboard.article.domain.ArticleVO;
import com.son.mvcboard.commons.paging.Criteria;

import java.util.List;

public interface ArticleDAO {

    void create(ArticleVO articleVO) throws Exception;

    ArticleVO read(Integer articleNo) throws Exception;

    void update(ArticleVO articleVO) throws Exception;

    void delete(Integer articleNo) throws Exception;

    List<ArticleVO> listCriteria(Criteria criteria) throws  Exception;

    int countArticles(Criteria criteria) throws  Exception;
}
