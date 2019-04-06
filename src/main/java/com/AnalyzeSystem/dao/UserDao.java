package com.AnalyzeSystem.dao;

import com.AnalyzeSystem.model.User;
import org.apache.ibatis.session.SqlSession;
import java.util.HashMap;
import java.util.Map;

public class UserDao extends Dao{
    static UserDao userDao;
    public static UserDao getInstance(){
        if (userDao==null){
            userDao=new UserDao();
        }
        return userDao;
    }
    private UserDao(){}
    public void insertUser(User user){
        session.insert("User.insertUser",user);
    };
    public void deleteUser(String id){
        session.delete("User.delete",id);
    };
    public void updateName(final String id, final String newName){
        session.update("User.updateName", new HashMap<String,Object>() {
            {
                put("id",id);
                put("newName",newName);
            }
        });

    };
    public User selectUserById(String id){
        return session.selectOne("User.selectUserById",id);
    };
    public User selectUserByName(String name){
        return session.selectOne("User.selectUserByName",name);
    };
    public void changePassword(final String id, final String newPassword){
        session.update("User.changePassword",new HashMap<String,Object>(){
            {
                put("id",id);
                put("newPassword",newPassword);
            }
        });
    };
}
