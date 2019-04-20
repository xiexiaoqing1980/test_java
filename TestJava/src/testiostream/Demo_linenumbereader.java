package testiostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Demo_linenumbereader {
	public static void main(String[] args) throws IOException {
		LineNumberReader lnReader=new LineNumberReader(new FileReader("bbb.txt"));
		
		String line;
		lnReader.setLineNumber(100);
		while ((line=lnReader.readLine())!=null) {
			System.out.println(lnReader.getLineNumber()+" "+line+"\r\n");
			
			
		}
	}

}
