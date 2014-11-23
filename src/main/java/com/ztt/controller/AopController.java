package com.ztt.controller;

import com.ztt.dto.ExportFileDto;
import com.ztt.model.ExportFile;
import com.ztt.query.DtPagerResponse;
import com.ztt.query.DtRequest;
import com.ztt.query.PagerQueryResult;
import com.ztt.service.AopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

    @RequestMapping(value = "file", method = RequestMethod.GET)
    public String file(Model model) throws ParseException {
        DtRequest dtReq = new DtRequest();
        dtReq.setiDisplayStart(0);
        dtReq.setiDisplayLength(10);
        dtReq.setsEcho(1);
        ExportFileDto exportFileDto = new ExportFileDto();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");

        exportFileDto.setStartDate(simpleDateFormat.parse("2014-08-00"));
        exportFileDto.setEndDate(new Date());

        int exportFileCount = aopService.count(exportFileDto);
        exportFileDto.setPageSize(dtReq.getPageSize());
        exportFileDto.setCurrentPage(dtReq.getCurrentPage());
        List<ExportFile> exportFileList = aopService.list(exportFileDto);

        DtPagerResponse<ExportFile> dpr = new DtPagerResponse<ExportFile>();
        dpr.setsEcho(dtReq.getsEcho());
        PagerQueryResult<ExportFile> pQR = new PagerQueryResult<ExportFile>();
        pQR.setDataList(exportFileList);
        pQR.setTotal(exportFileCount);

        dpr.setupResult(pQR);

        model.addAttribute("name",  exportFileList.get(0).getFileName());
        String aa = "hello";
        return aa;
    }


}
