package com.leaderment.service;

import java.util.List;

import com.leaderment.sqlserver_pojo.Vendor;
import com.leaderment.sqlserver_pojo.VendorVO;

public interface IVendorService {
	void deleteByPrimaryKey(String cvencode);

	void insert(Vendor record);

	Vendor selectByPrimaryKey(String cvencode);

    List<Vendor> selectAll();

    void updateByPrimaryKey(Vendor record);

	List<VendorVO> selectRequire();
}
