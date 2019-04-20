package testfile;

import java.io.File;
import java.lang.reflect.Field;

public class filedemo1 {
	public static void main(String[] args) {
//		 * File(String pathname)：根据一个路径得到File对象
//	      * File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
//	      * File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
//		demo1();
		demo2();
		
	}

	public static void demo2() {
		String parent="F:\\JAVA视频";
		String child="java就业班视频";
		
		File file2=new File(parent, child);
		System.out.println(file2.exists());
	}

	public static void demo1() {
		File file=new File("aaa.txt");
		System.out.println(file.exists());
	}

}
