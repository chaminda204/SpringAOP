/**
 * 
 */
package com.chaminda.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author chaminda
 *         <p/>
 *         date 11/12/2013
 */
@Aspect
public class Logger {

	@Before("execution(* com.chaminda.aop.service.*.save*(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("Before Advice : AOP is invoked method " + joinPoint.getSignature().getName());

	}

	@After("execution(* com.chaminda.aop.service.*.delete*(..))")
	public void logAfter(JoinPoint joinPoint) {

		System.out.println("After Advice : AOP is invoked method " + joinPoint.getSignature().getName());

	}

	@Around("execution(* com.chaminda.aop.service.*.get*(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("Around Advice -  Before JointPoint : AOP is intercepted method "
				+ joinPoint.getSignature().getName());

		joinPoint.proceed(); // continue on the intercepted method
		System.out.println("Around Advice -  After JointPoint  ");

	}

}
