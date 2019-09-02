package com.leaderment.sqlserver_mapper;


import java.util.List;

import com.leaderment.sqlserver_pojo.rdrecords09;
import com.leaderment.sqlserver_pojo.rdrecords09VO;

public interface Rdrecords09Mapper {
    int deleteByPrimaryKey(Long autoid);

    int insert(rdrecords09 record);

    int insertSelective(rdrecords09 record);

    rdrecords09 selectByPrimaryKey(Long autoid);

    int updateByPrimaryKeySelective(rdrecords09 record);

    int updateByPrimaryKeyWithBLOBs(rdrecords09 record);

    int updateByPrimaryKey(rdrecords09 record);

	List<rdrecords09VO> selectRequire();
}