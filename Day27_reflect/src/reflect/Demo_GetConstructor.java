package reflect;

import java.lang.reflect.Constructor;

public class Demo_GetConstructor {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class clazz1=Class.forName("reflect.Person");
		Constructor c=clazz1.getConstructor(int.class,String.class);
		Person person=(Person) c.newInstance(23,"23");
		System.out.println(person);

	}

}
