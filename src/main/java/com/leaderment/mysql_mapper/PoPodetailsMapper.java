package com.leaderment.mysql_mapper;

import java.util.List;

import com.leaderment.mysql_pojo.PoPodetails;
import com.leaderment.sqlserver_pojo.POPodetailsVO;

public interface PoPodetailsMapper {
    int deleteByPrimaryKey(Integer poPodetailsId);

    int insert(PoPodetails record);

    PoPodetails selectByPrimaryKey(Integer poPodetailsId);

    List<PoPodetails> selectAll();

    int updateByPrimaryKey(PoPodetails record);

	void batchInsert(List<POPodetailsVO> POPodetailsVOList);
}