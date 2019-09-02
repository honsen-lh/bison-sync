package com.leaderment.sqlserver_mapper;


import java.util.List;

import com.leaderment.sqlserver_pojo.Vendor;
import com.leaderment.sqlserver_pojo.VendorVO;

public interface VendorMapper {
    int deleteByPrimaryKey(String cvencode);

    int insert(Vendor record);

    int insertSelective(Vendor record);

    Vendor selectByPrimaryKey(String cvencode);

    int updateByPrimaryKeySelective(Vendor record);

    int updateByPrimaryKeyWithBLOBs(Vendor record);

    int updateByPrimaryKey(Vendor record);
    
    List<Vendor> selectAll();
    
	List<VendorVO> selectRequire();

	List<VendorVO> selectName();
}