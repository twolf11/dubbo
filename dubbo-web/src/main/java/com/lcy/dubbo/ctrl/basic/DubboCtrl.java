/**
 * 
 */
package com.lcy.dubbo.ctrl.basic;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lcy.dubbo.basic.model.UserMo;
import com.lcy.dubbo.service.BasicService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lcy
 * @date 2018年10月17日下午3:44:55 
 *
 */
@RestController
public class DubboCtrl {
	
	@Reference(version="1.0.0")
	private BasicService basicService;
	
	@GetMapping(value="/test")
	public String getData()  {
		UserMo userMo = basicService.getUserById("1");
		return userMo.toString();
	}

	@GetMapping(value="/test2")
	public String getData1()  {
		UserMo userMo = basicService.getUserById("1");
		System.out.println(userMo.toString());
		return userMo.toString();
	}
	
}
