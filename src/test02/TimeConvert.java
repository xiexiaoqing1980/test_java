package test02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConvert {
	
	public static void main(String[] args) {
		
		 Long timeStamp = System.currentTimeMillis();  //��ȡ��ǰʱ���
		 System.out.println(timeStamp);
		 SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		 
		String sd=format.format(new Date(timeStamp));
		System.out.println(sd);
		
	
	}

}
