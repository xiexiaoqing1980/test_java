package testiostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class testfilereader {
	public static void main(String[] args) throws IOException {
		FileReader f1=new FileReader("bbb.txt");
		
		int b;
		while ((b=f1.read())!=-1) {
//			System.out.println((char)b); //ÀàÐÍÇ½×©
			System.out.println(b);//97,20320(×Ö·ûµÄGBKÂë)
			
		}
	}

}
