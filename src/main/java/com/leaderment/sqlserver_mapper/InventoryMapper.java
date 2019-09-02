package com.leaderment.sqlserver_mapper;


import com.leaderment.sqlserver_pojo.Inventory;
import com.leaderment.sqlserver_pojo.InventoryVO;

import java.util.List;

public interface InventoryMapper {
    int deleteByPrimaryKey(String cinvcode);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(String cinvcode);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKeyWithBLOBs(Inventory record);

    int updateByPrimaryKey(Inventory record);

    List<InventoryVO> selectRequire();
}