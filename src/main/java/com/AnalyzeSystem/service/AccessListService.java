package com.AnalyzeSystem.service;

import com.AnalyzeSystem.dao.AccessListDao;
import com.AnalyzeSystem.model.SequenceNumber;

import java.util.List;

public interface AccessListService {

    void insertAccessList(String sequenceId);

    void updateFlag(final String sequenceId, final boolean newFlag);

    void deleteBySequenceId(String sequenceId);

    SequenceNumber selectBySequenceId(String sequenceId);

    List<SequenceNumber> selectAll();
}
