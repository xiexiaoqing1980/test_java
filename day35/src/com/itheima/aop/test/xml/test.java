package com.itheima.aop.test.xml;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class test {
	@Resource(name="orderDao")
    private OrderDao orderDao;
	
	    @Test
	    public void demo1(){
	        orderDao.save();
	        orderDao.update();
	        orderDao.delete();
	        orderDao.find();
	       new OrderDaoImpl().other();
	    }

	
}
