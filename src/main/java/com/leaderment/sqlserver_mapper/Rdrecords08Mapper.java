package com.leaderment.sqlserver_mapper;


import java.util.List;

import com.leaderment.sqlserver_pojo.Rdrecords08;
import com.leaderment.sqlserver_pojo.Rdrecords08VO;

public interface Rdrecords08Mapper {
    int deleteByPrimaryKey(Long autoid);

    int insert(Rdrecords08 record);

    int insertSelective(Rdrecords08 record);

    Rdrecords08 selectByPrimaryKey(Long autoid);

    int updateByPrimaryKeySelective(Rdrecords08 record);

    int updateByPrimaryKeyWithBLOBs(Rdrecords08 record);

    int updateByPrimaryKey(Rdrecords08 record);

	List<Rdrecords08VO> selectRequire();
}