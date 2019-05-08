package com.itheima.aop.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository(value="userDao")
public class UserDaoImpl implements UserDao {
	
	@Value("hhahh")
	private String name;

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("saving"+this.name);

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
		System.out.println("deleing"+this.name);
	}

}
