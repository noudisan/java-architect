package com.ztt.controller;

import com.ztt.dto.ArchitectDto;
import com.ztt.dto.ArchitectSearchDto;
import com.ztt.service.ArchitectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/architect")
public class ArchitectController {
    @Autowired
    private ArchitectService architectService;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    @ResponseBody
    public List<ArchitectDto> index(ArchitectSearchDto architectSearchDto){

        List<ArchitectDto> architectDtoList = architectService.search(architectSearchDto);

        return architectDtoList;
    }

}
