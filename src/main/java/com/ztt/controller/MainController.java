package com.ztt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by noudisan on 2014/11/2.
 */
@Controller
public class MainController {

    @Value("${image.architect.url}")
    private String imageUrl;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(  Model model) {
        model.addAttribute("imageHead",imageUrl);
        return "index";
    }

}
