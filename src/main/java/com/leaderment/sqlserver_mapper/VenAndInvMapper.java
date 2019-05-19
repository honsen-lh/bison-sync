package com.leaderment.sqlserver_mapper;


import java.util.List;

import com.leaderment.sqlserver_pojo.VenAndInv;
import com.leaderment.sqlserver_pojo.VenAndInvVO;

public interface VenAndInvMapper {
    int deleteByPrimaryKey(Integer autoid);

    int insert(VenAndInv record);

    int insertSelective(VenAndInv record);

    VenAndInv selectByPrimaryKey(Integer autoid);

    int updateByPrimaryKeySelective(VenAndInv record);

    int updateByPrimaryKeyWithBLOBs(VenAndInv record);

    int updateByPrimaryKey(VenAndInv record);

	List<VenAndInvVO> selectRequire();
}