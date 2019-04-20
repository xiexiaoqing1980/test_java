package generic.est;

import java.awt.List;
import java.lang.reflect.Method;
import java.util.ArrayList;

//反射在运行时会被擦掉，只会在编译时校验；

public class demo1 {
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(11);
		Class clazz=Class.forName("java.util.ArrayList");
		
		Method method=clazz.getMethod("add", Object.class);  //add(E e)的e指的就是object类
		method.invoke(a1, "222");
		System.out.println(a1);   //[11, 222]
	}

}
