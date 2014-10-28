package com.ztt.service;

import com.ztt.dao.ExportFileMapper;
import com.ztt.dto.ExportFileDto;
import com.ztt.model.ExportFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhoutaotao on 2014/10/28.
 */
@Service
public class AopService {
    @Autowired
    private ExportFileMapper exportFileMapper;


    public int count(ExportFileDto exportFileDto) {
        return exportFileMapper.count(exportFileDto);
    }

    public List<ExportFile> list(ExportFileDto exportFileDto) {
        return exportFileMapper.list(exportFileDto);
    }
}
