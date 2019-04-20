package testiostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile_demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readonebyte();
//		readallbyte();
//		readarrbyte();
//		readlbuffer();
	}

	public static void readlbuffer() throws FileNotFoundException, IOException {
		BufferedInputStream biStream=new BufferedInputStream(new FileInputStream("bbb.txt"));
		BufferedOutputStream boStream=new BufferedOutputStream(new FileOutputStream("text.txt"));
		int b;
		while ((b=biStream.read())!=-1) {
			boStream.write(b);
			
		}
		boStream.close(); //没有关闭的话会出现拷贝的文件偏小
//		boStream.flush();  //
	}

	public static void readonebyte() throws FileNotFoundException, IOException {
		FileInputStream fileInputStream=new FileInputStream("AA.jpg");
		FileOutputStream fileOutputStream=new FileOutputStream("copy.jpg");
		int b;
		while ((b=fileInputStream.read())!=-1) {
			fileOutputStream.write(b);
			
		}
		
		fileInputStream.close();
//		fileOutputStream.close(); 
	}
	
	public static void readallbyte() throws IOException {
		FileInputStream fileInputStream=new FileInputStream("AA.jpg");
		FileOutputStream fileOutputStream=new FileOutputStream("copy.jpg");
//		int len=fileInputStream.available();//获取所有的字节数
//		System.out.println(len);
		byte[] arr=new byte[fileInputStream.available()];
		fileInputStream.read(arr);  //将文件字节读取到内存中
		fileOutputStream.write(arr);  //将
		fileInputStream.close();
		fileOutputStream.close();
		
		
	}
	
	public static void readarrbyte() throws IOException {
		FileInputStream fileInputStream=new FileInputStream("bbb.txt");
		FileOutputStream fileOutputStream=new FileOutputStream("output.txt");
		byte[]pics=new byte[2];
//		int c=fileInputStream.read(pics);  //读取到的有效字节个数
//		System.out.println(c);
//		for (byte b : pics) {
//			System.out.println(b);
//		}
//		
//		
//		int d=fileInputStream.read(pics); 
//		System.out.println(d);
//		for (byte b : pics) {
//			System.out.println(b);
//		}
//		fileInputStream.close();
		int len;
		while ((len=fileInputStream.read(pics))!=-1) {
//			fileOutputStream.write(pics, 0, len);  //读取有效的字节个数
			fileOutputStream.write(pics); 
			//如果用这种方式的话，没有新数据覆盖，那很可能数据会重新读取过去,复制的文件会乱码，不推荐这种
			
			System.out.println(new String(pics,0,len));
			
	
		}
		fileInputStream.close();
//		fileOutputStream.close();
	}

}
