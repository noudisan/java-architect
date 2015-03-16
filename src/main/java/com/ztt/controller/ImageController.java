package com.ztt.controller;

import com.ztt.dto.ImageDto;
import com.ztt.util.GlobalConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhoutaotao on 3/6/15.
 */
@Controller
@RequestMapping("/image")
public class ImageController {
    /*1.运河之门“洞天福地”-淮安世界运河文化旅游区
    2.铁路局站-乌鲁木齐地铁1号线
    3.南门站-乌鲁木齐地铁1号线
    4.湖南韶山文化旅游基地
    5.湖南韶山文化旅游基地
    6.北京社会职业管理学院
    7.北京社会职业管理学院
    8.龙城帝景-吉林龙城东山项目
    9.龙城帝景-吉林龙城东山项目
    10.毅徳·首誉-济宁豪德住宅项目
    11.毅徳·首誉-济宁豪德住宅项目*/

    @RequestMapping(value = "homeSlider")
    @ResponseBody
    public List<ImageDto> homeSlider() {
        List<ImageDto> imageList =new ArrayList<>();
        List<String> titleList = getImageList();
        String imageHead = GlobalConfiguration.IMAGE_ARCHITECT_URL;
        for(int i=1;i<12;i++){
            ImageDto dto =new ImageDto();
            dto.setUrl(imageHead + "/architect/home_slider/" + i + ".png");
            dto.setTitle(titleList.get(i - 1));

            imageList.add(dto);
        }

        return imageList;
    }


    public List<String> getImageList(){
        List<String> imageList = new ArrayList<>();
        imageList.add("运河之门“洞天福地”-淮安世界运河文化旅游区");
        imageList.add("铁路局站-乌鲁木齐地铁1号线");
        imageList.add("南门站-乌鲁木齐地铁1号线");
        imageList.add("润泽东方文化城一期规划设计方案");
        imageList.add("润泽东方文化城一期规划设计方案");

        imageList.add("北京社会职业管理学院");
        imageList.add("北京社会职业管理学院");
        imageList.add("龙城帝景-吉林龙城东山项目");
        imageList.add("龙城帝景-吉林龙城东山项目");
        imageList.add("毅徳·首誉-济宁豪德住宅项目");
        imageList.add("毅徳·首誉-济宁豪德住宅项目");

        return imageList;
    }
}
