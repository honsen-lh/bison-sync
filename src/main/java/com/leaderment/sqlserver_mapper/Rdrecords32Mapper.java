package com.leaderment.sqlserver_mapper;


import com.leaderment.sqlserver_pojo.Rdrecords32VO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Rdrecords32Mapper {


    @Select("select * from rdrecords32 ")
	List<Rdrecords32VO> selectRequire();


	List<Rdrecords32VO> selectRequireLimit(@Param("pageNumber") int pageNumber, @Param("pageSize")int pageSize);


    @Select("select count(1) from rdrecords32")
    int getCount();


}