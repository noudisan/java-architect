package com.ztt.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SpringTaskDemo {

	@Scheduled(cron = "0/60 * * * * ?")
	void doSomethingWith() {
       // SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

      //  System.out.println("I'm doing with cron now!"+simpleDateFormat.format(new Date()));
	}
}