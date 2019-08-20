package com.leaderment.sqlserver_mapper;


import com.leaderment.sqlserver_pojo.VenInvPrice;
import com.leaderment.sqlserver_pojo.VenInvPriceVO;

import java.util.List;

public interface VenInvPriceMapper {
    int deleteByPrimaryKey(Integer autoid);

    int insert(VenInvPrice record);

    int insertSelective(VenInvPrice record);

    VenInvPrice selectByPrimaryKey(Integer autoid);

    int updateByPrimaryKeySelective(VenInvPrice record);

    int updateByPrimaryKey(VenInvPrice record);

    List<VenInvPriceVO> selectRequire();
}