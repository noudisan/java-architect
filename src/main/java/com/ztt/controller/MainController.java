package com.ztt.controller;

import com.ztt.dao.ArchitectDetailMapper;
import com.ztt.dao.ArchitectMapper;
import com.ztt.dto.ArchitectDetailDto;
import com.ztt.dto.ArchitectDto;
import com.ztt.util.GlobalConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.util.Date;

@Controller
public class MainController {
    @Autowired
    private ArchitectMapper architectMapper;
    @Autowired
    private ArchitectDetailMapper architectDetailMapper;

    @RequestMapping(value = {"","index"}, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("imageHead", GlobalConfiguration.IMAGE_ARCHITECT_URL);
        return "index";
    }

    @RequestMapping(value = {"home"}, method = RequestMethod.GET)
    public String home(Model model) {
        return "home";
    }

    @RequestMapping(value = {"project"}, method = RequestMethod.GET)
    public String project(Model model) {
        model.addAttribute("imageHead", GlobalConfiguration.IMAGE_ARCHITECT_URL);

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

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    @ResponseBody
    public String insert(@RequestParam("validate")String s){
        if(!s.equals("AEDIWLKESDKF")){
            return  "faild";
        }
        String pathname = "/opt/www/";
        File file =new File(pathname+"architect/product");
        File[] productArray = file.listFiles();

        for (File product : productArray) {
            if(product.getName().contains(".")){
                continue;
            }
            File[] subFile = product.listFiles();

            //保存detial图片
            ArchitectDto architectDto = new ArchitectDto();
            architectDto.setName(product.getName());
            architectDto.setCreateDate(new Date());
            for (File sub : subFile) {
                if (sub.getName().contains(".png")) {
                    architectDto.setImagePath("architect/product/" + sub.getParentFile().getName() + "/"+ sub.getName());
                    architectDto.setSort(Integer.valueOf(product.getName().substring(0,2)));
                }
            }
            architectDto.setType("IMAGE");
            architectMapper.save(architectDto);
            for (int i = 0; i < subFile.length; i++) {
                File sub = subFile[i];
                if (sub.getName().contains(".jpg")) {
                    ArchitectDetailDto architectDetailDto = new ArchitectDetailDto();
                    architectDetailDto.setName(sub.getName());
                    architectDetailDto.setImagePath("architect/product/" + sub.getParentFile().getName() + "/" + sub.getName());
                    architectDetailDto.setCreateDate(new Date());
                    architectDetailDto.setArchitectId(architectDto.getId());
                    architectDetailDto.setSort(Integer.valueOf(sub.getName().substring(0, sub.getName().indexOf("."))));

                    architectDetailMapper.save(architectDetailDto);
                }
            }
        }
        return "success";
    }
}
