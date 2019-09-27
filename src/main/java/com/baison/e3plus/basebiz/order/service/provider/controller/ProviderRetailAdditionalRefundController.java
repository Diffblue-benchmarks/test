package com.baison.e3plus.basebiz.order.service.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baison.e3plus.basebiz.order.api.model.RetailAdditionalRefund;
import com.baison.e3plus.basebiz.order.api.service.IRetailAdditionalRefundService;
import com.baison.e3plus.common.cncore.result.model.ServiceResult;

/**
 * 生产者模块-IRetailAdditionalRefundService
 * 
 * @author junyi.yue
 *
 */
@RestController
@RequestMapping(value = "providerRetailAdditionalRefundService")
public class ProviderRetailAdditionalRefundController {

	@Autowired
	private IRetailAdditionalRefundService service;
	
	@PostMapping(value = "createObject")
	public ServiceResult createObject(@RequestParam(name = "token", required = true) String token, 
			@RequestBody RetailAdditionalRefund[] beans) {
		return service.createObject(token, beans);
	}
	

}
