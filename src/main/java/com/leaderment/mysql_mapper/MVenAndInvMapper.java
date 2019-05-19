package com.leaderment.mysql_mapper;

import java.util.List;

import com.leaderment.sqlserver_pojo.VenAndInv;
import com.leaderment.sqlserver_pojo.VenAndInvVO;

public interface MVenAndInvMapper {
    int deleteByPrimaryKey(Integer autoId);

    int insert(VenAndInv record);

    VenAndInv selectByPrimaryKey(Integer autoId);

    List<VenAndInv> selectAll();

    int updateByPrimaryKey(VenAndInv record);

	void batchInsert(List<VenAndInvVO> venAndInvVOList);
}