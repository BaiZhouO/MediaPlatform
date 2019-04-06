package com.AnalyzeSystem.dao;

import org.apache.ibatis.session.SqlSession;

public class Dao {
    SqlSession session;
    protected Dao(){
        session=SessionSingleton.getSession();
    }
    public void commit(){
        session.commit();
    }
    public void close(){
        session.close();
    }
}
