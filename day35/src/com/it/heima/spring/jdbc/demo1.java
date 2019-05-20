package com.it.heima.spring.jdbc;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * jdbc模板类
 * @author asus-pc
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext6.xml")
public class demo1 {
	@Resource(name="jdbcTemplate")
	private JdbcTemplate template;
	@Test
	public void test1() {
		template.update("INSERT INTO bank VALUES(NULL,?,?)","e",300);
		
		
	}

}
