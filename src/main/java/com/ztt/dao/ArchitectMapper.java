package com.ztt.dao;

import com.ztt.dto.ArchitectDto;
import com.ztt.dto.ArchitectSearchDto;

import java.util.List;

/**
 * Created by zhoutaotao on 2014/10/29.
 */
public interface ArchitectMapper {

    public Long save(ArchitectDto architectDto);

    public List<ArchitectDto> query(ArchitectSearchDto architectSearchDto);

    public Integer count(ArchitectSearchDto architectSearchDto);

    public void delete(Long architectDtoId);

    ArchitectDto queryByName(String name);

    void update(ArchitectDto dto);
}
