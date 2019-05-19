package com.leaderment.handler;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leaderment.service.IJobService;


@RestController
@RequestMapping(value="/job")
public class JobHandler{
	private static final Logger LOGGER = Logger.getLogger(JobHandler.class);

	@Autowired
	@Qualifier("JobServiceImpl")
	private IJobService jobService;

	@RequestMapping(value="/{subscribeId}")
	public void doJob(@PathVariable Integer subscribeId) {
		LOGGER.info("start_dojob======");
		jobService.doJob();
		LOGGER.info("ok_dojob======");
		
	}
}
