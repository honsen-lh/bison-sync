package com.leaderment.mysql_mapper;

import com.leaderment.mysql_pojo.DispatchList;
import com.leaderment.sqlserver_pojo.DispatchListVO;

import java.util.List;

public interface MDispatchListMapper {
    int deleteByPrimaryKey(Integer dlid);

    int insert(DispatchList record);

    int insertSelective(DispatchList record);

    DispatchList selectByPrimaryKey(Integer dlid);

    int updateByPrimaryKeySelective(DispatchList record);

    int updateByPrimaryKey(DispatchList record);

    void batchInsert(List<DispatchListVO> dispatchListVOList);
}