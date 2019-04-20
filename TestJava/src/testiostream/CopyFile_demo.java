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
		boStream.close(); //û�йرյĻ�����ֿ������ļ�ƫС
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
//		int len=fileInputStream.available();//��ȡ���е��ֽ���
//		System.out.println(len);
		byte[] arr=new byte[fileInputStream.available()];
		fileInputStream.read(arr);  //���ļ��ֽڶ�ȡ���ڴ���
		fileOutputStream.write(arr);  //��
		fileInputStream.close();
		fileOutputStream.close();
		
		
	}
	
	public static void readarrbyte() throws IOException {
		FileInputStream fileInputStream=new FileInputStream("bbb.txt");
		FileOutputStream fileOutputStream=new FileOutputStream("output.txt");
		byte[]pics=new byte[2];
//		int c=fileInputStream.read(pics);  //��ȡ������Ч�ֽڸ���
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
//			fileOutputStream.write(pics, 0, len);  //��ȡ��Ч���ֽڸ���
			fileOutputStream.write(pics); 
			//��������ַ�ʽ�Ļ���û�������ݸ��ǣ��Ǻܿ������ݻ����¶�ȡ��ȥ,���Ƶ��ļ������룬���Ƽ�����
			
			System.out.println(new String(pics,0,len));
			
	
		}
		fileInputStream.close();
//		fileOutputStream.close();
	}

}
