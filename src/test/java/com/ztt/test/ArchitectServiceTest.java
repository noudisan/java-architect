package com.ztt.test;


import com.ztt.dao.ArchitectDetailMapper;
import com.ztt.dao.ArchitectMapper;
import com.ztt.dto.ArchitectDetailDto;
import com.ztt.dto.ArchitectDto;
import com.ztt.dto.ArchitectSearchDto;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.Date;
import java.util.List;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:test-applicationContext-dao.xml")
public class ArchitectServiceTest {

    @Autowired
    private ArchitectMapper architectMapper;
    @Autowired
    private ArchitectDetailMapper architectDetailMapper;

    //@Test
    public void test_save() {
        File file = new File("C:\\Users\\zhoutaotao\\Downloads\\作品整理");

        File[] productArray = file.listFiles();

        for (File product : productArray) {
            ArchitectDto architectDto = new ArchitectDto();

            File[] subFile = product.listFiles();
            architectDto.setName(product.getName());
            architectDto.setCreateDate(new Date());
            for (File sub : subFile) {
                if (sub.getName().contains(".png")) {
                    architectDto.setImagePath("/images/product/" + sub.getName());
                }
            }
            architectDto.setType("IMAGE");
            architectMapper.save(architectDto);


            for (int i = 0; i < subFile.length; i++) {
                File sub = subFile[i];
                if (sub.getName().contains(".jpg")) {
                    ArchitectDetailDto architectDetailDto = new ArchitectDetailDto();
                    architectDetailDto.setName(sub.getName());
                    architectDetailDto.setImagePath("/images/product/detail/" + sub.getParentFile().getName() + "/" + sub.getName());
                    architectDetailDto.setCreateDate(new Date());
                    architectDetailDto.setArchitectId(architectDto.getId());
                    architectDetailDto.setSort(i);

                    architectDetailMapper.save(architectDetailDto);
                }
            }


        }
    }

    //@Test
    public void test_get() {
        ArchitectSearchDto searchDto = new ArchitectSearchDto();
        Integer count = architectMapper.count(searchDto);

        Assert.assertNotNull(count);
    }

   // @Test
    public void test_page() {
        ArchitectSearchDto searchDto = new ArchitectSearchDto();
        searchDto.setCurrentPage(0);
        searchDto.setPageSize(10);

        List<ArchitectDto> result = architectMapper.query(searchDto);

        Assert.assertNotNull(result);
    }
}
