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
		Properties pt=new Properties();   //hash�㷨
		pt.load(new FileInputStream("config.properties"));//���ļ���ֵ�Զ������������
//		System.out.println(pt);
		pt.setProperty("tel", "879579");  //֪ʶд���ڴ��еģ���û���޸��ļ�
		System.out.println(pt);
		pt.store(new FileOutputStream("config.properties"), "�޸ĵ绰");
		
	}

	public static void demo2() {
		Properties pt=new Properties();
		pt.setProperty("name", "123");
		pt.setProperty("tel", "188888");
//		System.out.println(pt);
		Enumeration<String> en=(Enumeration<String>) pt.propertyNames()  ;//Ĭ��Ϊobject������Ҫǿת
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
