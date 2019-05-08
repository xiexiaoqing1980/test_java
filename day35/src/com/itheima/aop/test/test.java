package com.itheima.aop.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	@Test
	public void test() {
		ApplicationContext aContext=new ClassPathXmlApplicationContext("applicationContext3.xml");
		UserDao userDao=(UserDao) aContext.getBean("userDao");
		userDao.save();
	}
	
	@Test
	public void test2() {
		ApplicationContext aContext=new ClassPathXmlApplicationContext("applicationContext3.xml");
		UserService userService =(UserService) aContext.getBean("userService");
		UserService userService2 =(UserService) aContext.getBean("userService");
		System.out.println(userService2);
		System.out.println(userService);
		userService.sayHell();;
	}
	
	@Test
	public void test3() {
		UserDao myJDKProxy=new MyJDKProxy(new UserDaoImpl()).createProxy();
		myJDKProxy.save();
		
	}
}
