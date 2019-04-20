package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class demo_property {
	public static void main(String[] args) throws IOException, IOException {
		
//		demo1();
//		demo2();
		Properties pt=new Properties();   //hash算法
		pt.load(new FileInputStream("config.properties"));//将文件键值对对象读到集合中
//		System.out.println(pt);
		pt.setProperty("tel", "879579");  //知识写到内存中的，并没有修改文件
		System.out.println(pt);
		pt.store(new FileOutputStream("config.properties"), "修改电话");
		
	}

	public static void demo2() {
		Properties pt=new Properties();
		pt.setProperty("name", "123");
		pt.setProperty("tel", "188888");
//		System.out.println(pt);
		Enumeration<String> en=(Enumeration<String>) pt.propertyNames()  ;//默认为object，所以要强转
		while (en.hasMoreElements()) {
//			System.out.println(en.nextElement());
			String key=en.nextElement();
			System.out.println(pt.getProperty(key));
		}
	}

	public static void demo1() {
		Properties pt=new Properties();
		pt.put("abc", 123);
		System.out.println(pt);  //{abc=123}
	}

}
