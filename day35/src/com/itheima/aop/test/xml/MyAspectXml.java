package com.itheima.aop.test.xml;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectXml {

	 // 前置增强
    public void before(){
        System.out.println("前置增强===========");
    }
    
    //环绕
    public void after(Object result){
        System.out.println("logging==========="+result);
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

}
