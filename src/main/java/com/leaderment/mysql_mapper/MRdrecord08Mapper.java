package com.leaderment.mysql_mapper;

import java.util.List;

import com.leaderment.mysql_pojo.Rdrecord08;
import com.leaderment.sqlserver_pojo.RdRecord08VO;

public interface MRdrecord08Mapper {
    int deleteByPrimaryKey(Long id);

    int insert(Rdrecord08 record);

    Rdrecord08 selectByPrimaryKey(Long id);

    List<Rdrecord08> selectAll();

    int updateByPrimaryKey(Rdrecord08 record);

	void batchInsert(List<RdRecord08VO> rdRecord08VOList);
}