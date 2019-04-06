package com.AnalyzeSystem.dao;

import com.AnalyzeSystem.model.SequenceNumber;

import java.util.HashMap;
import java.util.List;

public class AccessListDao extends Dao{
    static private AccessListDao accessListDao;
    static public AccessListDao getInstance(){
        if (accessListDao==null){
            accessListDao=new AccessListDao();
        }
        return accessListDao;
    }
    private AccessListDao(){}
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
