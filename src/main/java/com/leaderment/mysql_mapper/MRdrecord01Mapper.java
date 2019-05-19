package com.leaderment.mysql_mapper;

import java.util.List;

import com.leaderment.mysql_pojo.Rdrecord01;
import com.leaderment.sqlserver_pojo.RdRecord01VO;

public interface MRdrecord01Mapper {
    int deleteByPrimaryKey(Long id);

    int insert(Rdrecord01 record);

    Rdrecord01 selectByPrimaryKey(Long id);

    List<Rdrecord01> selectAll();

    int updateByPrimaryKey(Rdrecord01 record);

	void batchInsert(List<RdRecord01VO> rdRecord01VOList);
}