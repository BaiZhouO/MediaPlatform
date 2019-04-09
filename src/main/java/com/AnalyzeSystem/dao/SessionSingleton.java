package com.AnalyzeSystem.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//获得session的单例类
public interface SessionSingleton {

    void init();

    SqlSession getSession();
}
