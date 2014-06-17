package com.ztt.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ztt.aop.Mask;

@Controller
@RequestMapping("/rest")
public class RestController {
	@RequestMapping(value = "get", method = RequestMethod.GET)
	@ResponseBody
	@Mask
	public String hello() {
		String aa = "aaaaaaaaaaa" + "get";
		return aa;
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.POST, consumes="application/json",produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String hello(@RequestBody TradeModel tradeModel) {
		String aa = "aaaaaaaaaaa" + tradeModel.getStatus();
		return aa;
	}
}
