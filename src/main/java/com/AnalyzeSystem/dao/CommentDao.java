package com.AnalyzeSystem.dao;

import com.AnalyzeSystem.model.Comment;

import java.util.List;

public interface CommentDao{

    //public  CommentDao getInstance();

    void insertComment(Comment comment);

    Comment selectCommentByCommentId(String commentId);

    List<Comment> selectCommentByUserId(String userId);

    List<Comment> selectCommentByMessageId(String messageId);

    void deleteCommentById (String commentId);
}
