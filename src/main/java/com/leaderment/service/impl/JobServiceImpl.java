package com.leaderment.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leaderment.mysql_mapper.MRdrecord01Mapper;
import com.leaderment.mysql_mapper.MRdrecord08Mapper;
import com.leaderment.mysql_mapper.MRdrecord09Mapper;
import com.leaderment.mysql_mapper.MRdrecords01Mapper;
import com.leaderment.mysql_mapper.MRdrecords08Mapper;
import com.leaderment.mysql_mapper.MRdrecords09Mapper;
import com.leaderment.mysql_mapper.MVenAndInvMapper;
import com.leaderment.mysql_mapper.PoPodetailsMapper;
import com.leaderment.mysql_mapper.PoPomainMapper;
import com.leaderment.mysql_mapper.SupplierMapper;
import com.leaderment.service.IJobService;
import com.leaderment.sqlserver_mapper.POPodetailsMapper;
import com.leaderment.sqlserver_mapper.POPomainMapper;
import com.leaderment.sqlserver_mapper.RdRecord01Mapper;
import com.leaderment.sqlserver_mapper.RdRecord08Mapper;
import com.leaderment.sqlserver_mapper.RdRecord09Mapper;
import com.leaderment.sqlserver_mapper.Rdrecords01Mapper;
import com.leaderment.sqlserver_mapper.Rdrecords08Mapper;
import com.leaderment.sqlserver_mapper.Rdrecords09Mapper;
import com.leaderment.sqlserver_mapper.VenAndInvMapper;
import com.leaderment.sqlserver_mapper.VendorMapper;
import com.leaderment.sqlserver_pojo.POPodetailsVO;
import com.leaderment.sqlserver_pojo.POPomainVO;
import com.leaderment.sqlserver_pojo.RdRecord01VO;
import com.leaderment.sqlserver_pojo.RdRecord08VO;
import com.leaderment.sqlserver_pojo.RdRecord09VO;
import com.leaderment.sqlserver_pojo.Rdrecords01VO;
import com.leaderment.sqlserver_pojo.Rdrecords08VO;
import com.leaderment.sqlserver_pojo.VenAndInvVO;
import com.leaderment.sqlserver_pojo.VendorVO;
import com.leaderment.sqlserver_pojo.rdrecords09VO;

@Service("JobServiceImpl")
public class JobServiceImpl implements IJobService{
	private static final Logger LOGGER = Logger.getLogger(JobServiceImpl.class);
	@Autowired
	SupplierMapper supplierMapper;
	@Autowired
	VendorMapper vendorMapper;
	@Autowired
	POPomainMapper POPomainMapper;
	@Autowired
	PoPomainMapper PoPomainMapper;
	@Autowired
	POPodetailsMapper POPodetailsMapper;
	@Autowired
	PoPodetailsMapper PoPodetailsMapper;
	@Autowired
	VenAndInvMapper sqlServerVenAndInvMapper;
	@Autowired
	MVenAndInvMapper mysqlVenAndInvMapper;
	@Autowired
	MRdrecord01Mapper mRdrecord01Mapper;
	@Autowired
	RdRecord01Mapper rdRecord01Mapper;
	@Autowired
	MRdrecords01Mapper mRdrecords01Mapper;
	@Autowired
	Rdrecords01Mapper rdRecords01Mapper;
	
	@Autowired
	MRdrecord09Mapper mRdrecord09Mapper;
	@Autowired
	RdRecord09Mapper rdRecord09Mapper;
	@Autowired
	MRdrecords09Mapper mRdrecords09Mapper;
	@Autowired
	Rdrecords09Mapper rdRecords09Mapper;
	@Autowired
	MRdrecord08Mapper mRdrecord08Mapper;
	@Autowired
	RdRecord08Mapper rdRecord08Mapper;
	@Autowired
	MRdrecords08Mapper mRdrecords08Mapper;
	@Autowired
	Rdrecords08Mapper rdRecords08Mapper;
	
	@Override
	public void doJob() {
		//同步供应商表
		//把U8的部分字段查询出来，导入生产库
		LOGGER.info("start_syncVendor...");
		List<VendorVO> vendorVOList = vendorMapper.selectRequire();
		supplierMapper.batchInsert(vendorVOList);
		LOGGER.info("end_syncVendor...");
		//同步其他表...
		//同步供应商关系表
		List<VenAndInvVO> venAndInvVOList = sqlServerVenAndInvMapper.selectRequire();
		mysqlVenAndInvMapper.batchInsert(venAndInvVOList);
		//同步采购订单主表
		LOGGER.info("start_syncPOPomain...");
		List<POPomainVO> poPomainVOList = POPomainMapper.selectRequire();
		PoPomainMapper.batchInsert(poPomainVOList);
		LOGGER.info("end_syncPOPomain...");
		//同步采购订单字表
		LOGGER.info("start_syncPOPodetails...");
		List<POPodetailsVO> POPodetailsVOList = POPodetailsMapper.selectRequire();
		PoPodetailsMapper.batchInsert(POPodetailsVOList);
		LOGGER.info("end_syncPOPodetails...");
		//同步采购入库单
		LOGGER.info("start_syncRdrecord01...");
		List<RdRecord01VO> rdRecord01VOList = rdRecord01Mapper.selectRequire();
		mRdrecord01Mapper.batchInsert(rdRecord01VOList);
		LOGGER.info("end_syncRdrecord01...");
		//同步采购入库单子表
		LOGGER.info("start_syncRdrecords01...");
		List<Rdrecords01VO> rdRecords01VOList = rdRecords01Mapper.selectRequire();
		mRdrecords01Mapper.batchInsert(rdRecords01VOList);
		LOGGER.info("end_syncRdrecords01...");
		//同步其他出库单主表
		LOGGER.info("start_syncRdrecord09...");
		List<RdRecord09VO> rdRecord09VOList = rdRecord09Mapper.selectRequire();
		mRdrecord09Mapper.batchInsert(rdRecord09VOList);
		LOGGER.info("end_syncRdrecord09...");
		//同步其他出库单子表
		LOGGER.info("start_syncRdrecords09...");
		List<rdrecords09VO> rdrecords09VOList = rdRecords09Mapper.selectRequire();
		mRdrecords09Mapper.batchInsert(rdrecords09VOList);
		LOGGER.info("end_syncRdrecords09...");
		//同步其他入库单主表
		LOGGER.info("start_syncRdrecord08...");
		List<RdRecord08VO> rdRecord08VOList = rdRecord08Mapper.selectRequire();
		mRdrecord08Mapper.batchInsert(rdRecord08VOList);
		LOGGER.info("end_syncRdrecord08...");
		//同步其他入库单子表
		LOGGER.info("start_syncRdrecords08...");
		List<Rdrecords08VO> rdRecords08VOList = rdRecords08Mapper.selectRequire();
		mRdrecords08Mapper.batchInsert(rdRecords08VOList);
		LOGGER.info("end_syncRdrecords08...");
	}
}
