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
import com.leaderment.mysql_pojo.Supplier;
import com.leaderment.service.ISupplierService;

@RestController
@RequestMapping(value="/supplier")
public class SupplierHandler {
	private static final Logger LOGGER = LoggerFactory.getLogger(SupplierHandler.class);
	
	@Autowired
	@Qualifier("SupplierServiceImpl")
	ISupplierService supplierService;
	/**
	 * 查询列表
	 * @return
	 */
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public ResultBean findAll() {
		ResultBean resultBean = new ResultBean();
		try {
			List<Supplier> list = supplierService.selectAll();
			resultBean.setData(list);
		} catch (Exception e) {
			resultBean.setCode(StatusCode.HTTP_FAILURE);
			resultBean.setMsg("获取列表失败");
			LOGGER.error(e.getMessage());
		}
		return resultBean;
	}

}
