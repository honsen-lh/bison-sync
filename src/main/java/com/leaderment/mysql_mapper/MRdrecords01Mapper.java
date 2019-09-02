package com.leaderment.mysql_mapper;

import java.util.List;

import com.leaderment.sqlserver_pojo.Rdrecords01;
import com.leaderment.sqlserver_pojo.Rdrecords01VO;

public interface MRdrecords01Mapper {
    int deleteByPrimaryKey(Long autoId);

    int insert(Rdrecords01 record);

    Rdrecords01 selectByPrimaryKey(Long autoId);

    List<Rdrecords01> selectAll();

    int updateByPrimaryKey(Rdrecords01 record);

	void batchInsert(List<Rdrecords01VO> rdRecords01VOList);
}