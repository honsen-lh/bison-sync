package com.leaderment.mysql_mapper;


import com.leaderment.sqlserver_pojo.RdRecord32VO;

import java.util.List;

public interface MRdrecord32Mapper {

	void batchInsert(List<RdRecord32VO> rdRecord32VOList);
}