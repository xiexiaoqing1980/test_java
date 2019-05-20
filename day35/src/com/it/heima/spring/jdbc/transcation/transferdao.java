package com.it.heima.spring.jdbc.transcation;

public interface transferdao {
	
	void transferfrom(String from, double money);
	void transferto(String to, double money);
	

}
