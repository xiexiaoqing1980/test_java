package testiostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoTryFinally {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream=null;
		FileOutputStream fileOutputStream=null;
        try {
        	fileInputStream=new FileInputStream("bbb.txt");
        	fileOutputStream=new FileOutputStream("output.txt");
			int b = fileInputStream.read();
			while ((b = fileInputStream.read()) != -1) {
				fileOutputStream.write(b);
			}
			
		} finally {
			try {
				// TODO: handle finally clause
				if (fileInputStream != null) {
					fileInputStream.close();
				} 
			} finally {
				// TODO: handle finally clause
				if (fileOutputStream!=null) {
					fileOutputStream.close();
				}
			}
			
			
			
		}
		
	}
}
