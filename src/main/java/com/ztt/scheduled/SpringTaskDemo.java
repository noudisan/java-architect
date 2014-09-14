package com.ztt.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SpringTaskDemo {

	@Scheduled(cron = "0/60 * * * * ?")
	void doSomethingWith() {
		System.out.println("I'm doing with cron now!");
	}
}