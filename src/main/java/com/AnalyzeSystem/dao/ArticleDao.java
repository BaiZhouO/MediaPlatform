package com.AnalyzeSystem.dao;

import com.AnalyzeSystem.model.Article;

import java.util.List;

public class ArticleDao extends Dao {
    private static ArticleDao articleDao;
    public static ArticleDao getInstance(){
        if (articleDao==null){
            articleDao=new ArticleDao();
        }
        return articleDao;
    }
    private ArticleDao(){}
    public void insertArticle(Article article){
        session.insert("Article.insertArticle",article);
    }
    public Article selectArticleById(String articleId){
        return session.selectOne("Article.selectArticleById",articleId);
    }
    public List<Article> selectArticleByTitle(String title){
        return session.selectList("Article.selectArticleByTitle",title);
    }
    public void deleteArticle(String articleId){
        session.delete("Article.deleteArticle",articleId);
    }
}
