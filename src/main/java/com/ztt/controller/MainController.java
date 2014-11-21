package com.ztt.controller;

import com.ztt.util.GlobalConfiguration;
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

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(  Model model) {
        model.addAttribute("imageHead", GlobalConfiguration.IMAGE_ARCHITECT_URL);
        return "index";
    }

}
