package testiostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyScanTofile {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("text.txt");
 
        while(true) {
               System.out.println("ÇëÂ¼ÈëÊý¾Ý£º");
              String line = sc.nextLine();
              if("quit".equals(line))
                    break;
              else{
            	  fos.write(line.getBytes());
                  fos.write("\r\n".getBytes());
              }
              
        }
       
        fos.close();    //
	}

}
