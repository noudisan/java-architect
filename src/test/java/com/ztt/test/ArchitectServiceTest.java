package com.ztt.test;


import com.ztt.dao.ArchitectMapper;
import com.ztt.dto.ArchitectDto;
import com.ztt.dto.ArchitectSearchDto;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArchitectServiceTest  extends BaseTest{

    @Autowired
    private ArchitectMapper architectMapper;

    @Test
    public void test_get(){
        ArchitectSearchDto searchDto=new ArchitectSearchDto();

        Integer count = architectMapper.count(searchDto);

        Assert.assertNotNull(count);
    }

    @Test
    public void test_page(){
        ArchitectSearchDto searchDto=new ArchitectSearchDto();
        searchDto.setCurrentPage(0);
        searchDto.setPageSize(10);

        List<ArchitectDto> result = architectMapper.query(searchDto);

        Assert.assertNotNull(result);
    }
}
