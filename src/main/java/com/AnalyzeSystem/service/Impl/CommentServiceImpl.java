package com.AnalyzeSystem.service.Impl;

import com.AnalyzeSystem.dao.CommentDao;
import com.AnalyzeSystem.model.Comment;
import com.AnalyzeSystem.service.CommentService;
import com.AnalyzeSystem.service.DaoService;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CommentServiceImpl implements CommentService,DaoService
{
    static CommentDao commentDao;

    SqlSession session;

    public void commit(){
        session.commit();
    }
    public void close(){
        session.close();
    }
    /*public static CommentDao getInstance(){
        if (commentDao==null){
            commentDao=new CommentDao();
        }
        return commentDao;
    }*/
    public void insertComment(Comment comment){
        session.insert("Comment.insertComment",comment);
    }
    public Comment selectCommentByCommentId(String commentId){
        return session.selectOne("Comment.selectCommentByCommentId",commentId);
    }
    public List<Comment> selectCommentByUserId(String userId){
        return session.selectList("Comment.selectCommentByUserId",userId);
    }
    public List<Comment> selectCommentByMessageId(String messageId){
        return session.selectList("Comment.selectCommentByMessageId",messageId);
    }
    public void deleteCommentById (String commentId){
        session.delete("Comment.deleteCommentById",commentId);
    }
}
