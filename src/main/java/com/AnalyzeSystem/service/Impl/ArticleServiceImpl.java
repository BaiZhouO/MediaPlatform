package com.AnalyzeSystem.service.Impl;

import com.AnalyzeSystem.dao.ArticleDao;
import com.AnalyzeSystem.model.Article;
import com.AnalyzeSystem.service.ArticleService;
import com.AnalyzeSystem.service.DaoService;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ArticleServiceImpl implements ArticleService ,DaoService
{
    private static ArticleDao articleDao;

    SqlSession session;

    public void commit(){
        session.commit();
    }
    public void close(){
        session.close();
    }
    /*public static ArticleDao getInstance(){
        if (articleDao==null){
            articleDao=new ArticleDao();
        }
        return articleDao;
    }*/

    //private ArticleDao(){}

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
