package com.ztt.test;


import com.ztt.dao.ArchitectMapper;
import com.ztt.dto.ArchitectDto;
import com.ztt.dto.ArchitectSearchDto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test-applicationContext-dao.xml")
public class ArchitectServiceTest {

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
