package com.leaderment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leaderment.service.IVendorService;
import com.leaderment.sqlserver_mapper.VendorMapper;
import com.leaderment.sqlserver_pojo.Vendor;
import com.leaderment.sqlserver_pojo.VendorVO;

@Service("VendorServiceImpl")
public class VendorServiceImpl implements IVendorService {
	@Autowired
	VendorMapper vendorMapper;

	@Override
	public void deleteByPrimaryKey(String cvencode) {
		vendorMapper.deleteByPrimaryKey(cvencode);
		
	}

	@Override
	public void insert(Vendor record) {
		vendorMapper.insert(record);
		
	}

	@Override
	public Vendor selectByPrimaryKey(String cvencode) {
		return vendorMapper.selectByPrimaryKey(cvencode);
	}

	@Override
	public List<Vendor> selectAll() {
		return vendorMapper.selectAll();
	}

	@Override
	public void updateByPrimaryKey(Vendor record) {
		vendorMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<VendorVO> selectRequire() {
		return vendorMapper.selectRequire();
	}


}
