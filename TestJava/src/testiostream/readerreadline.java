package testiostream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readerreadline {
	public static void main(String[] args) throws IOException  {
		BufferedReader bReader=new BufferedReader(new FileReader("bbb.txt"));
	    BufferedWriter bWriter=new BufferedWriter(new FileWriter("test.txt"));
		String line;
		
		while ((line=bReader.readLine())!=null) {
//			System.out.println(line);s
			bWriter.write(line+"\r\n");
//			bWriter.newLine(); //Ð´³ö»»ÐÐ
//			bWriter.write("\r\n");
			
		}
		bReader.close();
		bWriter.close();
		
		
	}

}
