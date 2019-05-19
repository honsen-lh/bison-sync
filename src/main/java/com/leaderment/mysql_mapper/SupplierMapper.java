package com.leaderment.mysql_mapper;

import java.util.List;

import com.leaderment.mysql_pojo.Supplier;
import com.leaderment.sqlserver_pojo.VendorVO;

public interface SupplierMapper {
    int deleteByPrimaryKey(Integer supplierId);

    int insert(Supplier record);

    Supplier selectByPrimaryKey(Integer supplierId);

    List<Supplier> selectAll();

    int updateByPrimaryKey(Supplier record);

	void batchInsert(List<VendorVO> list);
}