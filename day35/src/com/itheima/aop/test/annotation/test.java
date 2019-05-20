package com.itheima.aop.test.annotation;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.aop.test.xml.A;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext5.xml")
public class test {
	@Resource(name="orderDao")
//    private OrderDao orderDao;
	private OrderDao orderDaoImpl;
	
	@Resource(name="A")
	private A a;
	
	
	    @Test
	    public void demo1(){
	        orderDaoImpl.save();
	        orderDaoImpl.update();
	        orderDaoImpl.delete();
	        orderDaoImpl.find();
//	       new OrderDaoImpl().other();
//	        orderDao.test1();
	    }

	    @Test
	public void demo2() {
		a.test1();
	}
}
