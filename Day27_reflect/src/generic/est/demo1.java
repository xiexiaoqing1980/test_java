package generic.est;

import java.awt.List;
import java.lang.reflect.Method;
import java.util.ArrayList;

//����������ʱ�ᱻ������ֻ���ڱ���ʱУ�飻

public class demo1 {
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(11);
		Class clazz=Class.forName("java.util.ArrayList");
		
		Method method=clazz.getMethod("add", Object.class);  //add(E e)��eָ�ľ���object��
		method.invoke(a1, "222");
		System.out.println(a1);   //[11, 222]
	}

}
