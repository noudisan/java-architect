package com.base.dao;

import com.base.dto.ArchitectDto;
import com.base.dto.ArchitectSearchDto;

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
