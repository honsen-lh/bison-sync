package com.leaderment.sqlserver_mapper;




import com.leaderment.sqlserver_pojo.RdRecord32VO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
public interface RdRecord23Mapper {


	@Select("select *   from RdRecord32")
	List<RdRecord32VO> selectRequire();


}