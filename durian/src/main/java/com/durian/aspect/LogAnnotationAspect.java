package com.durian.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAnnotationAspect {
	@Pointcut("execution(* com.durian.service..*.*(..))")
	private void allMethod(){}
	
	@Before(value="execution(* com.durian.service..*.*(..))")
	public void before(JoinPoint call){
		String className = call.getTarget().getClass().getName();     
        String methodName = call.getSignature().getName();      
        System.out.println("[Annotation-before message]:" + className + "'s method " + methodName + " is starting..."); 
	}
}
