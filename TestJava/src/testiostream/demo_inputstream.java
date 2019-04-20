package testiostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import org.omg.CORBA.portable.InputStream;

public class demo_inputstream {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("bbb.txt"));
		System.setOut(new PrintStream("test.txt"));
		
//		InputStream in=System.in;                                //获取标准输入流
//        PrintStream ps = System.out;                               //获取标准输出流
	}

}
