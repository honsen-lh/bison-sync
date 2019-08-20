package com.leaderment.mysql_mapper;

import com.leaderment.mysql_pojo.VenInvPrice;
import com.leaderment.sqlserver_pojo.VenInvPriceVO;

import java.util.List;

public interface MVenInvPriceMapper {
    int deleteByPrimaryKey(Integer autoid);

    int insert(VenInvPrice record);

    int insertSelective(VenInvPrice record);

    VenInvPrice selectByPrimaryKey(Integer autoid);

    int updateByPrimaryKeySelective(VenInvPrice record);

    int updateByPrimaryKey(VenInvPrice record);

    void batchInsert(List<VenInvPriceVO> invPriceVOList);
}