package com.leaderment.sqlserver_mapper;


import java.util.List;

import com.leaderment.sqlserver_pojo.RdRecord09;
import com.leaderment.sqlserver_pojo.RdRecord09VO;

public interface RdRecord09Mapper {
    int deleteByPrimaryKey(Long id);

    int insert(RdRecord09 record);

    int insertSelective(RdRecord09 record);

    RdRecord09 selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RdRecord09 record);

    int updateByPrimaryKeyWithBLOBs(RdRecord09 record);

    int updateByPrimaryKey(RdRecord09 record);

	List<RdRecord09VO> selectRequire();
}