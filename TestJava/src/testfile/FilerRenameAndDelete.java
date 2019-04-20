package testfile;

import java.io.File;

public class FilerRenameAndDelete {
	public static void main(String[] args) {
//		renamefile();
//		renamefile2();
		File f1=new File("bbb");
		System.out.println(f1.delete()); //删除文件
		
		File f2=new File("folder\\test");  //文件夹没问题
		System.out.println(f2.delete());
	}

	public static void renamefile2() {
		File file1=new File("xxx");
		File file2=new File("folder");  //false,文件夹里面需要是空的
		System.out.println(file1.renameTo(file2));
	}

	public static void renamefile() {
		File file1=new File("aaa.txt");
		File file2=new File("xxx");
		System.out.println(file1.renameTo(file2));
	}

}
