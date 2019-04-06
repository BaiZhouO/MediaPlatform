package com.AnalyzeSystem.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//获得session的单例类
public class SessionSingleton {
    static private SqlSessionFactory factory;
    static private SqlSession session;
    private static void init(){
        InputStream inputStream=null;
        try {
            inputStream = Resources.getResourceAsStream(
                    "mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        factory=new SqlSessionFactoryBuilder().build(inputStream);
        session=factory.openSession();
    }
    public static SqlSession getSession(){
        if (session==null){
            init();
        }
        return session;
    }
}
