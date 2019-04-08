package com.AnalyzeSystem.dao;

import com.AnalyzeSystem.model.Article;

import java.util.List;

public interface ArticleDao{
    //public ArticleDao getInstance();

    List<Article> selectArticleByTitle(String title);

    void deleteArticle(String articleId);
}
