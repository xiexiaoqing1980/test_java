package testiostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Demo1 {
	public static void main(String[] args) throws IOException {
	   FileInputStream fiStream=new FileInputStream("bbb.txt");
	   int x;
	  
	   while ((x=fiStream.read())!=-1) {
//		   System.out.println((char)x);   //���102,����ǿת����ַ�
		   System.out.println(x);  //   a�㣺97,196,227����ӡ������ÿ���ַ��ı���  ��
		
	}
	               //�ļ����ܲ��ɶ�,Ҫ�׳��쳣��Ӳ���϶�ȡһ���ֽڵ��ڴ� 
	   fiStream.close();
	   
	   
	}
	

}
