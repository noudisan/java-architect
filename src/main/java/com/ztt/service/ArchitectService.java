package com.ztt.service;

import com.ztt.dao.ArchitectMapper;
import com.ztt.dto.ArchitectDto;
import com.ztt.dto.ArchitectSearchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhoutaotao on 2014/10/29.
 */
@Service
public class ArchitectService {
    @Autowired
    private ArchitectMapper architectMapper;

    public List<ArchitectDto> search(ArchitectSearchDto architectSearchDto) {

        return architectMapper.query(architectSearchDto);
    }
}
