package testiostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadBytechinese {
	public static void main(String[] args) throws IOException {
		//GBK��������������ֽ��ڴ洢��
		//д���ֽ�����
		FileOutputStream foStream=new FileOutputStream("output.txt");
		foStream.write("��ã���ã����".getBytes());
		
	}

}
