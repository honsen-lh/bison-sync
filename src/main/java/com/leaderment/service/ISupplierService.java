package com.leaderment.service;

import java.util.List;

import com.leaderment.mysql_pojo.Supplier;

public interface ISupplierService {
	void deleteByPrimaryKey(Integer supplierId);

	void insert(Supplier record);

	Supplier selectByPrimaryKey(Integer supplierId);

    List<Supplier> selectAll();

    void updateByPrimaryKey(Supplier record);
}
