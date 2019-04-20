package testiostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadBytechinese {
	public static void main(String[] args) throws IOException {
		//GBK码表，中文是两个字节在存储；
		//写出字节数组
		FileOutputStream foStream=new FileOutputStream("output.txt");
		foStream.write("你好，你好，你好".getBytes());
		
	}

}
