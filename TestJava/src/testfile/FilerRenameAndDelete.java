package testfile;

import java.io.File;

public class FilerRenameAndDelete {
	public static void main(String[] args) {
//		renamefile();
//		renamefile2();
		File f1=new File("bbb");
		System.out.println(f1.delete()); //ɾ���ļ�
		
		File f2=new File("folder\\test");  //�ļ���û����
		System.out.println(f2.delete());
	}

	public static void renamefile2() {
		File file1=new File("xxx");
		File file2=new File("folder");  //false,�ļ���������Ҫ�ǿյ�
		System.out.println(file1.renameTo(file2));
	}

	public static void renamefile() {
		File file1=new File("aaa.txt");
		File file2=new File("xxx");
		System.out.println(file1.renameTo(file2));
	}

}
