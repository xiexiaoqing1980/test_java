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
//		   System.out.println(x);   //���102
		   fOutputStream.write(x);   //��ԭ�����ļ���գ���պ���д��
		
	}
	               //�ļ����ܲ��ɶ�,Ҫ�׳��쳣��Ӳ���϶�ȡһ���ֽڵ��ڴ� 
	   fiStream.close();
	   fOutputStream.close();
	   
	}
	

}
