package com.it.heima.spring.jdbc.transcation;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

public class transferdaoimpl  extends JdbcDaoSupport implements transferdao {

	@Override
	public void transferfrom(String from, double money) {
		// TODO Auto-generated method stub
		this.getJdbcTemplate().update("UPDATE bank SET Famount=Famount-? WHERE Fname=?",money,from);
		
	}

	@Override
	public void transferto(String to, double money) {
		// TODO Auto-generated method stub
		this.getJdbcTemplate().update("UPDATE bank SET Famount=Famount+? WHERE Fname=?",money,to);
		
	}

	

	

}
