package com.ztt.test;


import com.ztt.dao.ArchitectMapper;
import com.ztt.dto.ArchitectSearchDto;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ArchitectServiceTest  extends BaseTest{

    @Autowired
    private ArchitectMapper architectMapper;

    @Test
    public void test_get(){
        ArchitectSearchDto searchDto=new ArchitectSearchDto();

        Integer count = architectMapper.count(searchDto);

        Assert.assertNotNull(count);
    }

}
