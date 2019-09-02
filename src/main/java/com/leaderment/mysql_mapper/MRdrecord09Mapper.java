package com.leaderment.mysql_mapper;

import java.util.List;

import com.leaderment.mysql_pojo.Rdrecord09;
import com.leaderment.sqlserver_pojo.RdRecord09VO;

public interface MRdrecord09Mapper {
    int deleteByPrimaryKey(Long id);

    int insert(Rdrecord09 record);

    Rdrecord09 selectByPrimaryKey(Long id);

    List<Rdrecord09> selectAll();

    int updateByPrimaryKey(Rdrecord09 record);

	void batchInsert(List<RdRecord09VO> rdRecord09VOList);
}