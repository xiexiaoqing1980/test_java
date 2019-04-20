package testiostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class encryptionpic {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream=new FileInputStream("AA.jpg");
		FileOutputStream fileOutputStream=new FileOutputStream("copy.jpg");  //º”√‹Õº∆¨
		int b = fileInputStream.read();
		while ((b = fileInputStream.read()) != -1) {
			fileOutputStream.write(b^123);
		}
		
		fileInputStream.close();
		fileOutputStream.close();
	}

}
