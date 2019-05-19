package com.leaderment.sqlserver_mapper;


import java.util.List;

import com.leaderment.sqlserver_pojo.POPodetails;
import com.leaderment.sqlserver_pojo.POPodetailsVO;

public interface POPodetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(POPodetails record);

    int insertSelective(POPodetails record);

    POPodetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(POPodetails record);

    int updateByPrimaryKeyWithBLOBs(POPodetails record);

    int updateByPrimaryKey(POPodetails record);

	List<POPodetailsVO> selectRequire();
}