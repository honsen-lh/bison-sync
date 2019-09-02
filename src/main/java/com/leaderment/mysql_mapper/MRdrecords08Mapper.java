package com.leaderment.mysql_mapper;

import java.util.List;

import com.leaderment.mysql_pojo.Rdrecords08;
import com.leaderment.sqlserver_pojo.Rdrecords08VO;

public interface MRdrecords08Mapper {
    int deleteByPrimaryKey(Long autoId);

    int insert(Rdrecords08 record);

    Rdrecords08 selectByPrimaryKey(Long autoId);

    List<Rdrecords08> selectAll();

    int updateByPrimaryKey(Rdrecords08 record);

	void batchInsert(List<Rdrecords08VO> rdRecords08VOList);
}