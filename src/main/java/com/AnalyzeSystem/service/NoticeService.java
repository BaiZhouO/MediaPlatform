package com.AnalyzeSystem.service;

import com.AnalyzeSystem.model.Notice;

import java.util.List;

public interface NoticeService {
    //public NoticeDao getInstance();

    void insertNotice(Notice notice);

    void deleteNotice(String noticeId);

    Notice selectNoticeById(String noticeId);

    List<Notice> selectAll();

    void updateContentById(final String noticeId, final String newContent) ;
}
