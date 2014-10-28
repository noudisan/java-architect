package com.ztt.dao;

import com.ztt.dto.ExportFileDto;
import com.ztt.model.ExportFile;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ExportFileMapper {


    public void save(ExportFile exportFile);

    ExportFile query(ExportFileDto exportFileDto);

    void updateByFileName(ExportFile exportFile);

    List<ExportFile> list(ExportFileDto exportFileDto);

    int count(ExportFileDto exportFileDto);

    void delete(Long id);
}
