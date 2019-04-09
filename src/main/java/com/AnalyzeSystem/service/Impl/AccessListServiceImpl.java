/*
package com.AnalyzeSystem.service.Impl;

import com.AnalyzeSystem.dao.AccessListDao;
import com.AnalyzeSystem.model.SequenceNumber;
import com.AnalyzeSystem.service.AccessListService;
import com.AnalyzeSystem.service.DaoService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;


@Service("AccessListService")
public class AccessListServiceImpl implements AccessListService,DaoService {
    @Resource
    static private AccessListDao accessListDao;
    SqlSession session;

    public void commit(){
        session.commit();
    }
    public void close(){
        session.close();
    }

   */
/* public AccessListDao getInstance(){
        if (accessListDao==null){
            accessListDao=new AccessListDao();
        }
        return accessListDao;
    }*//*

    public void insertAccessList(String sequenceId){
        session.insert("AccessList.insertAccessList",sequenceId);
    }
    public void updateFlag(final String sequenceId, final boolean newFlag){
        session.update("AccessList.updateFlag",new HashMap<String,Object>(){
            {
                put("sequenceId",sequenceId);
                put("newFlag",newFlag);
            }
        });
    }
    public void deleteBySequenceId(String sequenceId){
        session.delete("AccessList.deleteBySequenceId",sequenceId);
    }
    public SequenceNumber selectBySequenceId(String sequenceId){
        return session.selectOne("AccessList.selectBySequenceId",sequenceId);
    }
    public List<SequenceNumber> selectAll(){
        return session.selectList("AccessList.selectAll");
    }

}
*/
