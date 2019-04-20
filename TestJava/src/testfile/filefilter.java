package testfile;

import java.io.File;
import java.io.FilenameFilter;

public class filefilter {
public static void main(String[] args) {
	File dir=new File("D:\\");
	String[] arr=dir.list(new FilenameFilter() {
		
		@Override
		public boolean accept(File file, String name) {
			// TODO Auto-generated method stub
			File file1=new File(file,name);
			return file1.isFile()&&file1.getName().endsWith("exe");
		}
	});
	
	for (String string : arr) {
		System.out.println(string);
	}
}
}
