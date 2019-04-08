package com.AnalyzeSystem.service;

import com.AnalyzeSystem.model.Message;

import java.util.List;

public interface MessageService {
    //public  MessageDao getInstance();

    void updateContent(final String messageId, final String newContent);

    Message selectMessageById(String messageId);

    List<Message> selectMessageByUserId(String userId);
}
