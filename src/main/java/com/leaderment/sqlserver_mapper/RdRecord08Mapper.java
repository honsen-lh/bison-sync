package com.leaderment.sqlserver_mapper;


import java.util.List;

import com.leaderment.sqlserver_pojo.RdRecord08;
import com.leaderment.sqlserver_pojo.RdRecord08VO;

public interface RdRecord08Mapper {
    int deleteByPrimaryKey(Long id);

    int insert(RdRecord08 record);

    int insertSelective(RdRecord08 record);

    RdRecord08 selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RdRecord08 record);

    int updateByPrimaryKeyWithBLOBs(RdRecord08 record);

    int updateByPrimaryKey(RdRecord08 record);

	List<RdRecord08VO> selectRequire();
}