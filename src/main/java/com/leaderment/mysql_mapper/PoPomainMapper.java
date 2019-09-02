package com.leaderment.mysql_mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.leaderment.mysql_pojo.PoPomain;
import com.leaderment.sqlserver_pojo.POPomainVO;


public interface PoPomainMapper {
    int deleteByPrimaryKey(@Param("poId") Integer poId, @Param("cModifyTime") Date cModifyTime);

    int insert(PoPomain record);

    PoPomain selectByPrimaryKey(@Param("poId") Integer poId, @Param("cModifyTime") Date cModifyTime);

    List<PoPomain> selectAll();

    int updateByPrimaryKey(PoPomain record);

	void batchInsert(List<POPomainVO> poPomainVOList);
}