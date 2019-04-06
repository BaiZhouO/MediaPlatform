package com.AnalyzeSystem.dao;

import com.AnalyzeSystem.model.Comment;

import java.util.List;

public class CommentDao extends Dao{
    static CommentDao commentDao;
    public static CommentDao getInstance(){
        if (commentDao==null){
            commentDao=new CommentDao();
        }
        return commentDao;
    }
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
