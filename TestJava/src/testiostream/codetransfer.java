package testiostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class codetransfer {
	public static void main(String[] args) throws IOException {
//		demo1();
		InputStreamReader is=new InputStreamReader(new FileInputStream("bbb.txt"), "utf-8");
//		int i=1;
//		int y=i++;
//		System.out.println(y); //1
		
	
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileReader f1=new FileReader("utf-8.txt");
		FileWriter f2=new FileWriter("gbk.txt");
		int c;
		while ((c=f1.read())!=-1) {
			System.out.println((char)c);
//			f2.write(c);
		}
		
		f1.close();
		f2.close();  //±ØÐë¹ØÁ÷
	}

}
