package com.leaderment.mysql_mapper;

import com.leaderment.mysql_pojo.DispatchLists;
import com.leaderment.sqlserver_pojo.DispatchListsVO;

import java.util.List;

public interface MDispatchListsMapper {
    int deleteByPrimaryKey(Integer autoid);

    int insert(DispatchLists record);

    int insertSelective(DispatchLists record);

    DispatchLists selectByPrimaryKey(Integer autoid);

    int updateByPrimaryKeySelective(DispatchLists record);

    int updateByPrimaryKey(DispatchLists record);

    void batchInsert(List<DispatchListsVO> dispatchListsVOList);

    void insertDispatchListsVO(DispatchListsVO vo);
}