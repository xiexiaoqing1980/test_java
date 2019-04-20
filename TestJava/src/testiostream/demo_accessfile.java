package testiostream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class demo_accessfile {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("bbb.txt", "rw");
		raf.seek(0);
		raf.writeByte(97);
		raf.close();
	}

}
