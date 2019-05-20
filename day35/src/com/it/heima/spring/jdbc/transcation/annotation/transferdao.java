package com.it.heima.spring.jdbc.transcation.annotation;

public interface transferdao {
	
	void transferfrom(String from, double money);
	void transferto(String to, double money);
	

}
