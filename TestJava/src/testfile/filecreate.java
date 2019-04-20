package testfile;

import java.io.File;
import java.io.IOException;

public class filecreate {
	public static void main(String[] args) throws IOException {
//		demo1();
		
//		demo2();
		
//		File folder=new File("folder\\test");
//		System.out.println(folder.mkdirs());
	}

	public static void demo2() {
		File folder=new File("folder");
		System.out.println(folder.mkdir());
	}

	public static void demo1() throws IOException {
		File f1=new File("bbb.txt");
		System.out.println(f1.createNewFile());
		
		File f2=new File("bbb");
		System.out.println(f2.createNewFile());
	}

}
