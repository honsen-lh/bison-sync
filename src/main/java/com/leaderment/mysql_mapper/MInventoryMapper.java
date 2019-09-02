package com.leaderment.mysql_mapper;


import com.leaderment.mysql_pojo.Inventory;
import com.leaderment.sqlserver_pojo.InventoryVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MInventoryMapper {
    int deleteByPrimaryKey(String cinvcode);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(String cinvcode);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);

    void batchInsert(List<InventoryVO> inventoryVOList);
}