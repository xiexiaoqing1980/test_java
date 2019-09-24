package test;

import java.util.Arrays;
import java.util.Collections;
 
 
public class sort {
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String demos[]= {"sbg","dyh","yhjjjj"};
//		method1(demos);
		method2(demos);
		
	}

	private static  void method1(String[] demos) {
		Collections.sort(Arrays.asList(demos));
		for(int i=0;i<demos.length;i++){
			System.out.println(demos[i]);
		}
	}

	/**
	 * 字符串排序
	 * @param demos
	 */
	
	private static  void method2(String[] demos) {
		
		for(int i=0;i<demos.length-1;i++) {
			for(int j=0;j<demos.length-1-i;j++) {
				if(bigger(demos[j],demos[j+1])) {
					String temp=demos[j];
					demos[j]=demos[j+1];
					demos[j+1]=temp;
				}
			}
		}
		
		for (String string : demos) {
			System.out.println(string);
			
		}
		
	}
	
	
	
	private static boolean bigger(String first,String second) {
		if(first==null||second==null||first.isEmpty()||second.isEmpty()) {
			return false;
		}
		
		char[] arrayfirst=first.toCharArray();
        char[] arraysecond=second.toCharArray();
        
        //比较两个字符串的大小
        int minsize=Math.min(arrayfirst.length, arraysecond.length);
        for (int i = 0; i < minsize; i++) {
			if(arrayfirst[i]>arraysecond[i]) {
				return true;
			}else {
				return false;
			}
		}
		
		if(arrayfirst.length>arraysecond.length) {
			return true;
		}else {
			return false;
		}
	}

}
