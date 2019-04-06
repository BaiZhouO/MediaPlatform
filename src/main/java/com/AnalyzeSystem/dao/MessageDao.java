package com.AnalyzeSystem.dao;


import com.AnalyzeSystem.model.Message;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;

public class MessageDao extends Dao{
    static MessageDao messageDao;
    public static MessageDao getInstance(){
        if (messageDao==null){
            messageDao=new MessageDao();
        }
        return messageDao;
    }
    private MessageDao(){}
    public void insertMessage(Message message){
        session.insert("Message.insertMessage",message);
    }
    public void deleteMessage(String messageId){

        session.delete("Message.deleteMessage",messageId);
    }
    public void updateContent(final String messageId, final String newContent){
        session.update("Message.updateContent",new HashMap<String,Object>(){
            {
                put("messageId",messageId);
                put("newContent",newContent);
            }
        });
    }
    public Message selectMessageById(String messageId){
        return session.selectOne("Message.selectMessageById",messageId);
    }
    public List<Message> selectMessageByUserId(String userId){
        return session.selectList("Message.selectMessageByUserId",userId);
    }
}
