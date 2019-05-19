package com.leaderment.sqlserver_mapper;

import java.util.List;

import com.leaderment.sqlserver_pojo.RdRecord01;
import com.leaderment.sqlserver_pojo.RdRecord01VO;

public interface RdRecord01Mapper {
    int deleteByPrimaryKey(Long id);

    int insert(RdRecord01 record);

    int insertSelective(RdRecord01 record);

    RdRecord01 selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RdRecord01 record);

    int updateByPrimaryKeyWithBLOBs(RdRecord01 record);

    int updateByPrimaryKey(RdRecord01 record);

	List<RdRecord01VO> selectRequire();
}