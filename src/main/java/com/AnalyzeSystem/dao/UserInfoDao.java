package com.AnalyzeSystem.dao;


import com.AnalyzeSystem.model.UserInfo;

import java.util.List;

public interface UserInfoDao {

    void insertUser(UserInfo userInfo);

    void deleteUser(int id);

    void updateUser(UserInfo userInfo);

    UserInfo selectUserById(int id);

    List<UserInfo> selectAll();

    UserInfo selectUserByName(String name);

    List<UserInfo> selectUserByParams(UserInfo userInfo);

    int selectUserCount();

}
