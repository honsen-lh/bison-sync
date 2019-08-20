package com.leaderment.sqlserver_mapper;

import com.leaderment.sqlserver_pojo.DispatchLists;
import com.leaderment.sqlserver_pojo.DispatchListsVO;

import java.util.List;

public interface DispatchListsMapper {
    int deleteByPrimaryKey(Integer autoid);

    int insert(DispatchLists record);

    int insertSelective(DispatchLists record);

    DispatchLists selectByPrimaryKey(Integer autoid);

    int updateByPrimaryKeySelective(DispatchLists record);

    int updateByPrimaryKey(DispatchLists record);

    List<DispatchListsVO> selectRequire();
}