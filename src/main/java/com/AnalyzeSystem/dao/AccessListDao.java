package com.AnalyzeSystem.dao;

import com.AnalyzeSystem.model.SequenceNumber;


import java.util.List;

public interface AccessListDao{

    //AccessListDao getInstance();

    void insertAccessList(String sequenceId);

    void updateFlag(final String sequenceId, final boolean newFlag);

    void deleteBySequenceId(String sequenceId);

    SequenceNumber selectBySequenceId(String sequenceId);

    List<SequenceNumber> selectAll();
}
