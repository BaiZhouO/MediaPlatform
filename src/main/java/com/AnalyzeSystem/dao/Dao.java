package com.AnalyzeSystem.dao;

import org.apache.ibatis.session.SqlSession;

public interface Dao {

    void commit();

    void close();
}
