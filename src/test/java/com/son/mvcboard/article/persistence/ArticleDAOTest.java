package com.son.mvcboard.article.persistence;

import com.son.mvcboard.article.domain.ArticleVO;
import com.son.mvcboard.commons.paging.Criteria;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring-config/applicationContext.xml"})
public class ArticleDAOTest {

    private static final Logger logger = LoggerFactory.getLogger(ArticleDAOTest.class);

    @Inject
    private ArticleDAO articleDAO;

    @Test
    public void create() throws Exception{
        for(int i = 1; i <= 1000; i++) {
            ArticleVO article = new ArticleVO();
            article.setTitle( i + "번째 글 제목");
            article.setContent( i + "번째 글 내용");
            article.setWriter("user0" + (i%10));

            articleDAO.create(article);
        }
    }

    @Test
    public void read() throws Exception {
        logger.info(articleDAO.read(1).toString());
    }

    @Test
    public void update() throws Exception {
        ArticleVO article = new ArticleVO();
        article.setArticleNo(1);
        article.setTitle("글 수정 테스트 제목");
        article.setContent("글 수정 테스트 내용");
        articleDAO.update(article);
    }

    @Test
    public void delete() throws Exception {
        articleDAO.delete(1);
    }

    @Test
    public void listCriteria() throws Exception {
        Criteria criteria = new Criteria();
        criteria.setPage(3);
        criteria.setPerPageNum(20);

        List<ArticleVO> articles = articleDAO.listCriteria(criteria);

        for (ArticleVO article : articles) {
            System.out.println(article.getArticleNo() + " : " + article.getTitle());
        }
    }

}