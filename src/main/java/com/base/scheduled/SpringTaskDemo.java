package com.base.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SpringTaskDemo {

	@Scheduled(cron = "0/60 * * * * ?")
	void doSomethingWith() {
       // SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

      //  System.out.println("I'm doing with cron now!"+simpleDateFormat.format(new Date()));
	}
}