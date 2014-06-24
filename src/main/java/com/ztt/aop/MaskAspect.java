package com.ztt.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MaskAspect {

	@Around("execution(public * *(..))  && @annotation(mask)")
	public Object get(ProceedingJoinPoint jp, Mask mask) throws Throwable {
		Object[] parames = jp.getArgs();// 获取目标方法体参数
		System.out.println(parames);
		
		String className = jp.getTarget().getClass().toString();// 获取目标类名
		className = className.substring(className.indexOf("com"));
		String signature = jp.getSignature().toString();// 获取目标方法签名
		String methodName = signature.substring(signature.lastIndexOf(".") + 1,
				signature.indexOf("("));

		Object result = jp.proceed();

		return result == null ? "" : result.toString() + "methodName:"
				+ methodName;
	}
}
