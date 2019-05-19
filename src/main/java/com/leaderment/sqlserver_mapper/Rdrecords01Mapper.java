package com.leaderment.sqlserver_mapper;


import java.util.List;

import com.leaderment.sqlserver_pojo.Rdrecords01;
import com.leaderment.sqlserver_pojo.Rdrecords01VO;

public interface Rdrecords01Mapper {
    int deleteByPrimaryKey(Long autoid);

    int insert(Rdrecords01 record);

    int insertSelective(Rdrecords01 record);

    Rdrecords01 selectByPrimaryKey(Long autoid);

    int updateByPrimaryKeySelective(Rdrecords01 record);

    int updateByPrimaryKeyWithBLOBs(Rdrecords01 record);

    int updateByPrimaryKey(Rdrecords01 record);

	List<Rdrecords01VO> selectRequire();
}