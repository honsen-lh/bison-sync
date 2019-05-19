package com.leaderment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leaderment.mysql_mapper.SupplierMapper;
import com.leaderment.mysql_pojo.Supplier;
import com.leaderment.service.ISupplierService;

@Service("SupplierServiceImpl")
public class SupplierServiceImpl implements ISupplierService {
	@Autowired
	SupplierMapper supplierMapper;

	@Override
	public void deleteByPrimaryKey(Integer supplierId) {
		supplierMapper.deleteByPrimaryKey(supplierId);
		
	}

	@Override
	public void insert(Supplier record) {
		supplierMapper.insert(record);
		
	}

	@Override
	public Supplier selectByPrimaryKey(Integer supplierId) {
		return supplierMapper.selectByPrimaryKey(supplierId);
	}

	@Override
	public List<Supplier> selectAll() {
		return supplierMapper.selectAll();
	}

	@Override
	public void updateByPrimaryKey(Supplier record) {
		supplierMapper.updateByPrimaryKey(record);
		
	}

}
