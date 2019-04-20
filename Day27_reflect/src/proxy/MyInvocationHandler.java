package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	private  Object target;

	public MyInvocationHandler(Object target) {
		super();
		this.target = target;
	}


	@Override
	public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Authority check");
//	
		paramMethod.invoke(target, paramArrayOfObject);
		System.out.println("logging..");
		return null;
	}

}
