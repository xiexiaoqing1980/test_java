package com.itheima.aop.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyJDKProxy implements InvocationHandler {

	private UserDao userDao;
	public MyJDKProxy(UserDao userDao) {
		this.userDao = userDao;
	}
	// 编写工具方法：生成代理：
		public UserDao createProxy(){
			UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(),
					userDao.getClass().getInterfaces(), this);

			return userDaoProxy;
		}
		
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			if("save".equals(method.getName())){
				System.out.println("权限校验================");
				return method.invoke(proxy, args);
			}
			return method.invoke(proxy, args);
		}

	
	




}
