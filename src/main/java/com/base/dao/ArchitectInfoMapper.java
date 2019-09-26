package com.base.dao;

import com.base.dto.ArchitectInfoDto;

/**
 * Created by zhoutaotao on 3/16/15.
 */
public interface ArchitectInfoMapper {

    public void save(ArchitectInfoDto architectInfoDto);

    public ArchitectInfoDto get(Long id);

    public void  update(ArchitectInfoDto architectInfoDto);

    ArchitectInfoDto getByArchitectId(Long architectId);
}
