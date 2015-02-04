package com.ztt.controller;

import com.ztt.service.AopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/aop")
public class AopController {
    @Autowired
    public AopService aopService;

    @RequestMapping(value = "/post", method = RequestMethod.POST, consumes = "application/json", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String rest() {
        String aa = "aaaaaaaaaaa";
        return aa;
    }




}
