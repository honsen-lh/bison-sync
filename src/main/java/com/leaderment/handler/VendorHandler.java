package com.leaderment.handler;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leaderment.constant.StatusCode;
import com.leaderment.entity.ResultBean;
import com.leaderment.service.IVendorService;
import com.leaderment.sqlserver_mapper.POPodetailsMapper;
import com.leaderment.sqlserver_pojo.POPodetailsVO;
import com.leaderment.sqlserver_pojo.Vendor;
import com.leaderment.sqlserver_pojo.VendorVO;

@RestController
@RequestMapping(value="/vendor")
public class VendorHandler {
	private static final Logger LOGGER = LoggerFactory.getLogger(VendorHandler.class);
	
	@Autowired
	@Qualifier("VendorServiceImpl")
	IVendorService vendorService;
	@Autowired
	POPodetailsMapper POPodetailsMapper;
	/**
	 * 查询列表
	 * @return
	 */
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public ResultBean findAll() {
		ResultBean resultBean = new ResultBean();
		try {
			List<Vendor> list = vendorService.selectAll();
			resultBean.setData(list);
		} catch (Exception e) {
			resultBean.setCode(StatusCode.HTTP_FAILURE);
			resultBean.setMsg("获取列表失败");
			LOGGER.error(e.getMessage());
		}
		return resultBean;
	}
	@RequestMapping(value = "/selectRequire", method = RequestMethod.GET)
	public ResultBean selectRequire() {
		ResultBean resultBean = new ResultBean();
		try {
			List<VendorVO> list = vendorService.selectRequire();
			resultBean.setData(list);
		} catch (Exception e) {
			resultBean.setCode(StatusCode.HTTP_FAILURE);
			resultBean.setMsg("获取列表失败");
			LOGGER.error(e.getMessage());
		}
		return resultBean;
	}
	@RequestMapping(value = "/selectPORequire", method = RequestMethod.GET)
	public ResultBean selectPORequire() {
		ResultBean resultBean = new ResultBean();
		try {
			List<POPodetailsVO> list = POPodetailsMapper.selectRequire();
			resultBean.setData(list);
		} catch (Exception e) {
			resultBean.setCode(StatusCode.HTTP_FAILURE);
			resultBean.setMsg("获取列表失败");
			LOGGER.error(e.getMessage());
		}
		return resultBean;
	}
}
