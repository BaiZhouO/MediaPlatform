package com.AnalyzeSystem.service.Impl;

import com.AnalyzeSystem.dao.UserInfoDao;
import com.AnalyzeSystem.model.UserInfo;
import com.AnalyzeSystem.service.DaoService;
import com.AnalyzeSystem.service.UserInfoService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
   服务层调用dao层类完成特定服务，属dao层上层
 */

@Service("UserInfoService")   //声明以下类作为service注入
public class UserInfoServiceImpl implements UserInfoService,DaoService
{
    @Resource
    private UserInfoDao userInfoDao; //dao层处理类，寻找合适（按名字）的bean注入

    SqlSession session;

    public void commit(){
        session.commit();
    }
    public void close(){
        session.close();
    }
    public void insertUser(UserInfo user)
    {
        userInfoDao.insertUser(user);
    }

    public void deleteUser(int id)
    {
        userInfoDao.deleteUser(id);
    }

    public void updateUser(UserInfo user) {
        userInfoDao.updateUser(user);
    }

    public UserInfo selectUserById(int id) {
        return userInfoDao.selectUserById(id);
    }

    public List<UserInfo> selectAll() {
        return userInfoDao.selectAll();
    }

    public UserInfo selectUserByName(String name) {
        return userInfoDao.selectUserByName(name);
    }

    public List<UserInfo> selectUserByParams(UserInfo userInfo) {
        return userInfoDao.selectUserByParams(userInfo);
    }

    public int selectUserCount() {
        return userInfoDao.selectUserCount();
    }


}
