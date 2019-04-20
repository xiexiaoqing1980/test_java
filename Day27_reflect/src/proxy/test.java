package proxy;

import java.lang.reflect.Proxy;

import javax.jws.soap.SOAPBinding.Use;

public class test{
	public static void main(String[] args) {
		
		UserImplement uImplement=new UserImplement();
		uImplement.add();
		uImplement.delete();
		
		MyInvocationHandler mv=new MyInvocationHandler(uImplement);
		
		//return the interface;
		User user=(User) Proxy.newProxyInstance(uImplement.getClass().getClassLoader(), uImplement.getClass().getInterfaces()
				, mv);
		
		user.add();
		user.delete();
	}
	

	
	

}
