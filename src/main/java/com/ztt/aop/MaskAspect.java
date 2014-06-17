package com.ztt.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class MaskAspect {
	
	@Around("execution(public * *(..))  && @annotation(mask)")
	public Object get(ProceedingJoinPoint jp,Mask mask)
			throws Throwable {
		Object result = jp.proceed();
		//System.out.println(1/0);
		//this is a new test
		return result==null?"":result.toString()+"new result";
	}
}
