package com.AnalyzeSystem.dao;

import com.AnalyzeSystem.model.Notice;

import java.util.HashMap;
import java.util.List;

public class NoticeDao extends Dao {
    static NoticeDao noticeDao;
    static public NoticeDao getInstance(){
        if (noticeDao==null){
            noticeDao=new NoticeDao();
        }
        return noticeDao;
    }

    public void insertNotice(Notice notice){
        session.insert("Notice.insertNotice",notice);
    }
    public void deleteNotice(String noticeId){
        session.delete("Notice.deleteNotice",noticeId);
    }
    public Notice selectNoticeById(String noticeId){
        return session.selectOne("Notice.selectNoticeById",noticeId);
    }
    public List<Notice> selectAll(){
        return session.selectList("Notice.selectAll");
    }

    public void updateContentById(final String noticeId, final String newContent) {
        session.update("Notice.updateContentById",new HashMap<String,Object>(){
            {
                put("noticeId",noticeId);
                put("newContent",newContent);
            }
        });
    }
}
