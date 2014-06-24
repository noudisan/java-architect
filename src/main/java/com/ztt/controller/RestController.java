package com.ztt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ztt.aop.Mask;
import com.ztt.model.TradeModel;

@Controller
@RequestMapping("/rest")
public class RestController {
	
	@RequestMapping(value = "get", method = RequestMethod.GET)
	@ResponseBody
	@Mask
	public String hello() {
		String aa = "hello" + "get";
		return aa;
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.POST, consumes="application/json",produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String rest(@RequestBody TradeModel tradeModel) {
		String aa = "aaaaaaaaaaa" + tradeModel.getStatus();
		return aa;
	}
}
