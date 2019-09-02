package com.leaderment.sqlserver_mapper;


import java.util.List;

import com.leaderment.sqlserver_pojo.POPomain;
import com.leaderment.sqlserver_pojo.POPomainVO;

public interface POPomainMapper {
    int deleteByPrimaryKey(Integer poid);

    int insert(POPomain record);

    int insertSelective(POPomain record);

    POPomain selectByPrimaryKey(Integer poid);

    int updateByPrimaryKeySelective(POPomain record);

    int updateByPrimaryKeyWithBLOBs(POPomain record);

    int updateByPrimaryKey(POPomain record);

	List<POPomainVO> selectRequire();
}