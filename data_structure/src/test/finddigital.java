package test;

import java.util.Iterator;

/**
 * 请一个在字符串中找出连续最长的数字串，并把这个串的长度返回；如果存在长度相同的连续数字串，返回最后一个连续数字串；

注意：数字串只需要是数字组成的就可以，并不要求顺序，比如数字串“1234”的长度就小于数字串“1359055”，如果没有数字，则返回空字符串（“”）而不是NULL！
 * @author Administrator
 *
 */

public class finddigital {
	
	public static void main(String[] args) {
		String input="abcd12345ed125ss123456789";
//		int result=finddigital(input);
		int result=finddigitalByRegex(input);
		System.out.println(result);
		
	}
	
	 public static int finddigital( String input) {
		 int maxlength=0; //统计最大连续数字字符川长度
	      StringBuffer maxNumberStr = null;//统计最大连续数字字符串
	         
	      int nowlength=0;//当前连续数字字符串长度
	      StringBuffer nowNumberStr = null;//当前连续数字字符串长度
		 
		char[] arr=input.toCharArray();
		for(int i=0;i<arr.length;i++) {
			//判断是数字
	
			if (arr[i]>='0'&&arr[i]<='9') {
				
				if(nowlength==0) {  //如果是当前的第一个字符
					nowNumberStr=new StringBuffer();
					nowNumberStr.append(String.valueOf(arr[i]));
					
				}else {     //否则直接添加
					nowNumberStr.append(String.valueOf(arr[i]));
				}
				nowlength++;
				if(nowlength>=maxlength){
                    maxNumberStr = nowNumberStr;
                    maxlength = nowlength;
                }
				
			}else {
				nowlength=0;
				nowNumberStr=null;
				
			}
		}
		return maxlength;
		 
	 }
	 
	 //利用正则：
	 public static int finddigitalByRegex( String input) {
		 int maxlength=0;
		 String maxString=null;
		 String regex="\\D{1,}";  //非数字，进行切割
		 String[] arr=input.split(regex);
		 for (String string : arr) {
			if(string.length()>maxlength) {
				maxlength=string.length();
				maxString=string;
			}
				
		}
		 
		 
		return maxlength;
		 
		 
		 
	 }
	

}
