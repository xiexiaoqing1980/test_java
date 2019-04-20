package testiostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_Demo2 {
	public static void main(String[] args) throws IOException {
	   FileInputStream fiStream=new FileInputStream("bbb.txt");
	   FileOutputStream fOutputStream=new FileOutputStream("output.txt",true);
	   int x;
	   while ((x=fiStream.read())!=-1) {
//		   System.out.println(x);   //输出102
		   fOutputStream.write(x);   //将原来的文件清空，清空后再写入
		
	}
	               //文件可能不可读,要抛出异常从硬盘上读取一个字节到内存 
	   fiStream.close();
	   fOutputStream.close();
	   
	}
	

}
