package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo_GetMethod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class clazz1=Class.forName("reflect.Person");
		Constructor c=clazz1.getConstructor(int.class,String.class);
		Person person=(Person) c.newInstance(23,"23");
		
		Method m1=clazz1.getMethod("test");
		m1.invoke(person);   //do something
	

	}

}
