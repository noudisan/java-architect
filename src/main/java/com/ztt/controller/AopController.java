package com.ztt.controller;

import com.ztt.security.UserBeanHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ztt.aop.Mask;
import com.ztt.model.TradeModel;

@Controller
@RequestMapping("/rest")
public class AopController {
	
	@RequestMapping(value = "get", method = RequestMethod.GET)
	public String hello(Model model) {
        model.addAttribute("name",UserBeanHelper.getUsername());
		String aa = "hello";
		return aa;
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.POST, consumes="application/json",produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String rest(@RequestBody TradeModel tradeModel) {
		String aa = "aaaaaaaaaaa" + tradeModel.getStatus();
		return aa;
	}


}
