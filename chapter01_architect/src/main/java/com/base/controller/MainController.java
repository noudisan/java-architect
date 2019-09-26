package com.base.controller;

import com.base.dao.ArchitectDetailMapper;
import com.base.dao.ArchitectInfoMapper;
import com.base.dao.ArchitectMapper;
import com.base.dto.*;
import com.base.service.ArchitectService;
import com.base.util.GlobalConfiguration;
import com.base.util.HttpRequestDeviceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Date;
import java.util.List;

@Controller
public class MainController {

    @Value("${image.architect.url}")
    private String imageHead;

    @Value("${baiduCode}")
    private String baiduCode;

    @Autowired
    private ArchitectService architectService;

    @RequestMapping(value = {"","index","home"}, method = RequestMethod.GET)
    public String home(Model model,HttpServletRequest request) {
        model.addAttribute("baiduCode", baiduCode);
        if(HttpRequestDeviceUtils.isMobileDevice(request)){
            return "redirect:http://m.heyidesign.com";
        }
        return "home";
    }

    @RequestMapping(value = {"project"}, method = RequestMethod.GET)
    public String project(Model model,@RequestParam(value="projectType",required = false)String projectType) {
        model.addAttribute("baiduCode", baiduCode);
        model.addAttribute("imageHead", imageHead);
        model.addAttribute("projectType",projectType);
        return "ftpm/project";
    }

    @RequestMapping(value = {"idea"}, method = RequestMethod.GET)
    public String idea(Model model) {
        model.addAttribute("baiduCode", baiduCode);
        return "ftpm/idea";
    }

    @RequestMapping(value = {"contact"}, method = RequestMethod.GET)
    public String contact(Model model) {
        model.addAttribute("baiduCode", baiduCode);

        return "ftpm/contact";
    }

    @RequestMapping(value = {"company"}, method = RequestMethod.GET)
    public String company(Model model) {
        model.addAttribute("baiduCode", baiduCode);

        return "ftpm/company";
    }

    @RequestMapping(value = {"detail/{id}"}, method = RequestMethod.GET)
    public String detail(Model model,@PathVariable("id")Long id) {
        model.addAttribute("baiduCode", baiduCode);
        model.addAttribute("id",id);
        model.addAttribute("imageHead", imageHead);
        model.addAttribute("baiduCode", baiduCode);
        return "ftpm/detail";
    }
}
