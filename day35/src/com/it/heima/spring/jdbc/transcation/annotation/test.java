package com.it.heima.spring.jdbc.transcation.annotation;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext8.xml")
public class test {
	
	@Resource(name="transferservice")
	private transferdaoservice transferdaoservice;
	
	//可以全程运用注解的方式去进行
	@Test
	public void demo1() {
		transferdaoservice.transfer("a", "b", 100);
	}

}
