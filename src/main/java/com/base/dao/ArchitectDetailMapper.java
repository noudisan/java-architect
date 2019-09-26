package com.base.dao;

import com.base.dto.ArchitectDetailDto;

import java.util.List;

/**
 * Created by zhoutaotao on 2014-11-14.
 */
public interface ArchitectDetailMapper {

    public List<ArchitectDetailDto> query(Long architectId) ;

    public void save(ArchitectDetailDto architectDetailDto);
}
