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
			System.out.println("����"+times--+"����");
			FileWriter fw=new FileWriter("config.txt");
			fw.write(String.valueOf(times));
			fw.close();  //һ��Ҫ��������Ϊ���ڻ�����
		}else{
			System.out.println("����");
		}
		
	}

}
