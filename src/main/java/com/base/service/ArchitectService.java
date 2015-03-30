package com.base.service;

import com.base.dao.ArchitectDetailMapper;
import com.base.dao.ArchitectInfoMapper;
import com.base.dao.ArchitectMapper;
import com.base.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ArchitectService {
    @Autowired
    private ArchitectMapper architectMapper;

    @Autowired
    private ArchitectDetailMapper architectDetailMapper;

    @Autowired
    private ArchitectInfoMapper architectInfoMapper;

    public List<ArchitectDto> search(ArchitectSearchDto architectSearchDto) {

        List<ArchitectDto> architectDtoList = architectMapper.query(architectSearchDto);

        for(ArchitectDto dto :architectDtoList){
            List<ArchitectDetailDto> architectDetailList = architectDetailMapper.query(dto.getId());
            dto.setArchitectDetailDtoList(architectDetailList);

            ArchitectInfoDto architectInfoDto = architectInfoMapper.getByArchitectId(dto.getId());
            dto.setArchitectInfoDto(architectInfoDto);
        }

        return architectDtoList;
    }

    public ArchitectDto getById(Long id) {
        ArchitectDto dto = architectMapper.getById(id);

        List<ArchitectDetailDto> architectDetailList = architectDetailMapper.query(dto.getId());
        dto.setArchitectDetailDtoList(architectDetailList);

        ArchitectInfoDto architectInfoDto = architectInfoMapper.getByArchitectId(dto.getId());
        dto.setArchitectInfoDto(architectInfoDto);

        return dto;
    }
}
