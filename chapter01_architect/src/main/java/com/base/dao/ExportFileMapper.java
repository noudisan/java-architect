package com.base.dao;

import com.base.dto.ExportFileDto;
import com.base.model.ExportFile;

import java.util.List;

public interface ExportFileMapper {


    public void save(ExportFile exportFile);

    ExportFile query(ExportFileDto exportFileDto);

    void updateByFileName(ExportFile exportFile);

    List<ExportFile> list(ExportFileDto exportFileDto);

    int count(ExportFileDto exportFileDto);

    void delete(Long id);
}
