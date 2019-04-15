package com.son.mvcboard.article.domain;

import java.util.Date;

public class ArticleVO {

    private Integer articleNo;

    private String title;

    private String content;

    private String writer;

    private Date regDate;

    private int viewCnt;

    public void setArticleNo(Integer articleNo) {
        this.articleNo = articleNo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }

}
