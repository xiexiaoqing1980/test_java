package testfile;

import java.io.File;
import java.lang.reflect.Field;

public class filedemo1 {
	public static void main(String[] args) {
//		 * File(String pathname)������һ��·���õ�File����
//	      * File(String parent, String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
//	      * File(File parent, String child):����һ����File�����һ�����ļ�/Ŀ¼�õ�File����
//		demo1();
		demo2();
		
	}

	public static void demo2() {
		String parent="F:\\JAVA��Ƶ";
		String child="java��ҵ����Ƶ";
		
		File file2=new File(parent, child);
		System.out.println(file2.exists());
	}

	public static void demo1() {
		File file=new File("aaa.txt");
		System.out.println(file.exists());
	}

}
