package com.leaderment.mysql_mapper;

import java.util.List;

import com.leaderment.mysql_pojo.Rdrecords09;
import com.leaderment.sqlserver_pojo.rdrecords09VO;

public interface MRdrecords09Mapper {
    int deleteByPrimaryKey(Long autoId);

    int insert(Rdrecords09 record);

    Rdrecords09 selectByPrimaryKey(Long autoId);

    List<Rdrecords09> selectAll();

    int updateByPrimaryKey(Rdrecords09 record);

	void batchInsert(List<rdrecords09VO> rdrecords09voList);
}