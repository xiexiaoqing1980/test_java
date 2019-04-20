package testiostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ReverseFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader=new BufferedReader(new FileReader("bbb.txt"));
	    BufferedWriter bWriter=new BufferedWriter(new FileWriter("test.txt"));
		
		 //创建集合对象
		ArrayList<String> text=new ArrayList<>();
		String line;
		while ((line=bReader.readLine())!=null) {
			text.add(line);
		}
		bReader.close();
		for (int i = text.size()-1;i>0 ;i--) {
			
			bWriter.write(text.get(i)+"\r\n");
		}
		
		
		bWriter.close();

	}

}
