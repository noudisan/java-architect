package com.ztt.test.thread;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ForkJoinPoolFactoryBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

/**
 * Created by noudisan on 2014/9/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:test-applicationContext-test.xml" })
public class ForkJoinTest  {
    @Autowired
    public ForkJoinPoolFactoryBean forkJoinPoolFactoryBean;
    @Test
    public void test(){
        ForkJoinPool forkJoinPool =forkJoinPoolFactoryBean.getObject();
        // 生成一个计算任务
        CountTask countTask = new CountTask(1, 30);
        Future<Integer> result = forkJoinPool.submit(countTask);

        try {
            System.out.println(result.get());
        } catch (Exception e) {
        }
        //异步问题
        if(countTask.isCompletedAbnormally()){
            System.out.println("任务执行失败："+countTask.getException());
        }
    }
}
