package com.AnalyzeSystem.dao;


import com.AnalyzeSystem.model.Message;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;

public interface MessageDao{

    //public  MessageDao getInstance();

    public void updateContent(final String messageId, final String newContent);

    public Message selectMessageById(String messageId);

    public List<Message> selectMessageByUserId(String userId);
}
