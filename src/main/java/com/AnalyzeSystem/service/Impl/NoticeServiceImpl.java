package com.AnalyzeSystem.service.Impl;

import com.AnalyzeSystem.dao.NoticeDao;
import com.AnalyzeSystem.model.Notice;
import com.AnalyzeSystem.service.DaoService;
import com.AnalyzeSystem.service.NoticeService;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;

public class NoticeServiceImpl implements NoticeService,DaoService
{
    static NoticeDao noticeDao;

    SqlSession session;

    public void commit(){
        session.commit();
    }
    public void close(){
        session.close();
    }
    /*static public NoticeDao getInstance(){
        if (noticeDao==null){
            noticeDao=new NoticeDao();
        }
        return noticeDao;
    }*/

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
