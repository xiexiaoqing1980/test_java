package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demo_GetFields {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class clazz1=Class.forName("reflect.Person");
		Constructor c=clazz1.getConstructor(int.class,String.class);
		Person person=(Person) c.newInstance(23,"23");
		
//		Field f1=clazz1.getField("name"); //�׳����쳣
		Field f1=clazz1.getDeclaredField("name");   //��������
		Field f2=clazz1.getDeclaredField("age");
		System.out.println(f1);  
		
		f1.setAccessible(true); //ȥ��˽��Ȩ��
		f1.set(person,"444");
		System.out.println(person);  

	}

}
