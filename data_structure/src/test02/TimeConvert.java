package test02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConvert {
	
	public static void main(String[] args) {
		
		 Long timeStamp = System.currentTimeMillis();  //获取当前时间戳
		 System.out.println(timeStamp);
		 SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		 
		String sd=format.format(new Date(timeStamp));
		System.out.println(sd);
		
	
	}

}
