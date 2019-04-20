package reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;

public class Demo1_ReflectQuiz {
	public static void main(String[] args) throws Exception {
		
		BufferedReader bs=new BufferedReader(new FileReader("config.properties"));
		Class clazz=Class.forName(bs.readLine()); //获得class对象
		DemoClass dClass=(DemoClass) clazz.newInstance();
		Method method=clazz.getMethod("run");
		method.invoke(dClass);
		
		
		
	}

	

}



 class DemoClass {
//	private String name;
//	
//    public DemoClass(String name) {
//		super();
//		this.name = name;
//	}

	public void run() {
          System.out.println("welcome to heima!");
    }
}