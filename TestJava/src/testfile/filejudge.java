package testfile;

import java.io.File;

public class filejudge {
public static void main(String[] args) {
	File file1=new File("xxx");
	File file2=new File("folder");
	
	System.out.println(file2.isDirectory());  //true
	System.out.println(file2.exists());   //true
}
}
