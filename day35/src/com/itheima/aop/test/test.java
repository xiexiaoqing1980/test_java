package com.itheima.aop.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.aop.test.xml.A;
import com.itheima.aop.test.xml.OrderDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class test {
	

//	@Test
//	public void test() {
//		ApplicationContext aContext=new ClassPathXmlApplicationContext("applicationContext3.xml");
//		UserDao userDao=(UserDao) aContext.getBean("userDao");
//		userDao.save();
//	}
//	
//	@Test
//	public void test2() {
//		ApplicationContext aContext=new ClassPathXmlApplicationContext("applicationContext3.xml");
//		UserService userService =(UserService) aContext.getBean("userService");
//		UserService userService2 =(UserService) aContext.getBean("userService");
//		System.out.println(userService2);
//		System.out.println(userService);
//		userService.sayHell();;
//	}
//	
//	@Test
//	public void test3() {
//		UserDao myJDKProxy=new MyJDKProxy(new UserDaoImpl()).createProxy();
//		myJDKProxy.save();
//		
//	}
	
	//bean同样可以用注解的方式
		@Resource(name="userDao")
//	    private OrderDao orderDao;
		private UserDaoImpl orderDaoImpl;
		
		
		
		    @Test
		    public void demo1(){
		        orderDaoImpl.save();
		        orderDaoImpl.delete();
		       
//		       new OrderDaoImpl().other();
//		        orderDao.test1();
		    }

		
}
