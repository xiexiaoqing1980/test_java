package testiostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Demo1 {
	public static void main(String[] args) throws IOException {
	   FileInputStream fiStream=new FileInputStream("bbb.txt");
	   int x;
	  
	   while ((x=fiStream.read())!=-1) {
//		   System.out.println((char)x);   //输出102,类型强转输出字符
		   System.out.println(x);  //   a你：97,196,227（打印出的是每个字符的编码  ）
		
	}
	               //文件可能不可读,要抛出异常从硬盘上读取一个字节到内存 
	   fiStream.close();
	   
	   
	}
	

}
