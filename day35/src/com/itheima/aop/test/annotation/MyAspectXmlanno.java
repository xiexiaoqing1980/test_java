package com.itheima.aop.test.annotation;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


/**
 * 使用注解的方式实现
 * @author asus-pc
 *
 */

@Aspect
public class MyAspectXmlanno {

	 // 前置增强
	@Before(value="MyAspectXmlanno.fun()")
    public void before(){
        System.out.println("前置增强===========");
    }
    
	@After(value="MyAspectXmlanno.fun()")
    //环绕
//    public void after(Object result){
//        System.out.println("logging==========="+result);
//    }
    
	public void after(){
        System.out.println("logging===========");
    }
  //环绕
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("before===========");
        Object obj=joinPoint.proceed();
        System.out.println("after===========");
//        return obj;
    }
    
    public void afterThrow(){
        System.out.println("throwable===========");
    }
    
    public void afterfinal(){
        System.out.println("final===========");
    }
    
    @Pointcut(value="execution(* com.itheima.aop.test.annotation.OrderDaoImpl.save())")
    public void fun(){
    	System.out.println("I am pointcut");
    }

}
