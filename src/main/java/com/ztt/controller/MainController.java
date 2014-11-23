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

/**
 * Created by noudisan on 2014/11/2.
 */
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

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    @ResponseBody
    public String insert(@RequestParam("validate")String s){
        if(!s.equals("AEDIWLKESDKF")){
            return  "faild";
        }
        File file = new File("/usr/share/nginx/html/product/detail");

        File[] productArray = file.listFiles();

        for (File product : productArray) {
            ArchitectDto architectDto = new ArchitectDto();

            File[] subFile = product.listFiles();
            architectDto.setName(product.getName());
            architectDto.setCreateDate(new Date());
            for (File sub : subFile) {
                if (sub.getName().contains(".png")) {
                    architectDto.setImagePath("/product/" + sub.getName());
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
                    architectDetailDto.setImagePath("/product/detail/" + sub.getParentFile().getName() + "/" + sub.getName());
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
