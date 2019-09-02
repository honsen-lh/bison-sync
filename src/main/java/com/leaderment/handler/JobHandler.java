package com.leaderment.handler;

import com.leaderment.mysql_mapper.MRdrecord32Mapper;
import com.leaderment.mysql_mapper.MRdrecords32Mapper;
import com.leaderment.sqlserver_mapper.RdRecord23Mapper;
import com.leaderment.sqlserver_mapper.Rdrecords32Mapper;
import com.leaderment.sqlserver_pojo.RdRecord32VO;
import com.leaderment.sqlserver_pojo.Rdrecords32VO;
import com.leaderment.util.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leaderment.service.IJobService;

import java.util.List;


@RestController
@RequestMapping(value="/job")
public class JobHandler{
	private static final Logger LOGGER = Logger.getLogger(JobHandler.class);

	@Autowired
	@Qualifier("JobServiceImpl")
	private IJobService jobService;


	@Autowired
	RdRecord23Mapper rdRecord23Mapper;
	@Autowired
	Rdrecords32Mapper rdrecords32Mapper;

	@Autowired
	MRdrecord32Mapper mRdrecord32Mapper;

	@Autowired
	MRdrecords32Mapper mRdrecords32Mapper;

	
	
	@Scheduled(cron="0 0 19 * * ?")
	@RequestMapping(value="/{subscribeId}")
	public void doJob() {
		LOGGER.info("start_dojob======");
		jobService.doJob();
		LOGGER.info("ok_dojob======");
		
	}


	@GetMapping(value = "/InsertRdRecord32")
	public Object InsertRdRecord32(){
		Object obj = new Object();
		List<RdRecord32VO> rdRecord32VOS = rdRecord23Mapper.selectRequire();

		System.out.println(" ===1 " + rdRecord32VOS);
		System.out.println(" ===1 " + rdRecord32VOS.size());

		try {
			mRdrecord32Mapper.batchInsert(rdRecord32VOS);
			obj = "插入成功";
		}catch (Exception e){
			e.printStackTrace();
			obj = "插入失败";
		}

		return obj;
	}

	@GetMapping(value = "/testRdRecords32")
	public Object testRdRecords32(){
		Object obj = new Object();
		int count = rdrecords32Mapper.getCount();
		System.out.println("count = " + count);
		int num = 0;
		int pageNumber = 0;
		/**
		 * 数据量太大 分两次插入
		 */
		int pageSize = count/2;
		while (count >= num){

			List<Rdrecords32VO> rdRecord32VOS1 = rdrecords32Mapper.selectRequireLimit(pageNumber,pageSize);
			System.out.println(" ===2 " + rdRecord32VOS1);
			System.out.println(" ===2 " + rdRecord32VOS1.size());
			num += rdRecord32VOS1.size();
			pageNumber = num;
			try {
				mRdrecords32Mapper.batchInsert(rdRecord32VOS1);
			}catch (Exception e){
				e.printStackTrace();
				obj = "插入失败";
			}
		}

		if(obj instanceof String){
			if(!StringUtils.notNull((String)obj)){
				obj = "插入成功";
			}
		}

		return obj;
	}


}
