package testiostream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class demo_software {
	public static void main(String[] args) throws IOException {
		BufferedReader bReader=new BufferedReader(new FileReader("config.txt"));
		String line=bReader.readLine();
		int times=Integer.parseInt(line);
		if (times>0) {
			System.out.println("还有"+times--+"次数");
			FileWriter fw=new FileWriter("config.txt");
			fw.write(String.valueOf(times));
			fw.close();  //一定要关流，因为存在缓冲区
		}else{
			System.out.println("到期");
		}
		
	}

}
