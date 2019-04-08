package com.AnalyzeSystem.service.Impl;

import com.AnalyzeSystem.dao.MessageDao;
import com.AnalyzeSystem.model.Message;
import com.AnalyzeSystem.service.DaoService;
import com.AnalyzeSystem.service.MessageService;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;

public class MessageServiveImpl implements MessageService,DaoService
{
    static MessageDao messageDao;

    SqlSession session;

    public void commit(){
        session.commit();
    }
    public void close(){
        session.close();
    }
    /*public static MessageDao getInstance(){
        if (messageDao==null){
            messageDao=new MessageDao();
        }
        return messageDao;
    }*/

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
