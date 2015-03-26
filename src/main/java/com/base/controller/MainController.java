package com.base.controller;

import com.base.dao.ArchitectDetailMapper;
import com.base.dao.ArchitectInfoMapper;
import com.base.dao.ArchitectMapper;
import com.base.dto.ArchitectDetailDto;
import com.base.dto.ArchitectDto;
import com.base.dto.ArchitectInfoDto;
import com.base.dto.ProjectType;
import com.base.util.GlobalConfiguration;
import com.base.util.HttpRequestDeviceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Date;

@Controller
public class MainController {

    @Value("${image.architect.url}")
    private String imageHead;

    @RequestMapping(value = {"","index","home"}, method = RequestMethod.GET)
    public String home(Model model,HttpServletRequest request) {
        if(HttpRequestDeviceUtils.isMobileDevice(request)){
            return "redirect:http://m.heyidesign.com";
        }
        return "home";
    }

    @RequestMapping(value = {"project"}, method = RequestMethod.GET)
    public String project(Model model,@RequestParam(value="projectType",required = false)String projectType) {

        model.addAttribute("imageHead", imageHead);
        model.addAttribute("projectType",projectType);
        return "ftpm/project";
    }
    @RequestMapping(value = {"idea"}, method = RequestMethod.GET)
    public String idea(Model model) {
        return "ftpm/idea";
    }

    @RequestMapping(value = {"contact"}, method = RequestMethod.GET)
    public String contact(Model model) {
        return "ftpm/contact";
    }


}
