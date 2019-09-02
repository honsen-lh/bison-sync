package com.leaderment.sqlserver_mapper;

import com.leaderment.sqlserver_pojo.DispatchList;
import com.leaderment.sqlserver_pojo.DispatchListVO;

import java.util.List;

public interface DispatchListMapper {
    int insert(DispatchList record);

    int insertSelective(DispatchList record);

    List<DispatchListVO> selectRequire();
}