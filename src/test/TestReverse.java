package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestReverse {
	public static void main(String[] args) {
		String input="59769kqqqq";
		System.out.println(reverse(input));
		System.out.println(reverseBybuffer(input));  
//		System.out.println(reverseByStack(input));
//		System.out.println(myAtoi("  +5656888uui"));
		
	}
	
	public static String reverse(String input) {
		//容错：
		if (input==null || input.length()==0) {
			return null;
		}
//		String result="";
		char[] arr=input.toCharArray();
		for (int i = arr.length-1; i >=arr.length/2; i--) {
			//
			char temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			
		}
		return new String(arr);
		
	}
	
	

	public static String reverseByStack(String input) {
		//容错：
		if (input==null || input.length()==0) {
			return null;
		}
		Stack<Character> stringStack = new Stack<>();
//		String result="";
		char[] arr=input.toCharArray();
		for (char c : arr) {
			stringStack.push(c);  //进栈
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=stringStack.pop();
		}
		
		return new String(arr);
		
	}
	
	
public int reverse(int x) {
	long temp=0;
	while(x!=0) {
		int pop=x%10;  //取余数
		temp=temp*10+pop;  //叠加
		
		if(temp>Integer.MAX_VALUE||temp<Integer.MIN_VALUE) {
			return 0;
		}
		x=x/10;  //取商
		
	}
	return (int)temp;
	
        
        
    }
	
public  static int myAtoi(String str) {
    if(str==null || str.isEmpty()) {
    	return 0;
    	
    }
    
    String pattern="^[\\+\\-]?\\d+";
    Pattern p=Pattern.compile(pattern);
    str=str.trim();
    Matcher m=p.matcher(str);
    String res="";
    
    if(m.find()) {
    	res=str.substring(m.start(), m.end());
    	
    }else {
    	return 0;
    }
   //防止移=溢出
    try{
        int r=Integer.parseInt(res);
        return r;
    }catch(Exception e){
        return res.charAt(0)=='-'?Integer.MIN_VALUE:Integer.MAX_VALUE;
    }


	
    
    //
    
    
    
}

public  static String reverseBybuffer(String input) {
	
	String result=new StringBuffer(input).reverse().toString();
	return result;
	
	
    }

public  static String invertUsingCollectionsReverse(String str) {
	String[] arr=str.split("\\s+");
    List<Object> list = Arrays.asList(arr);
    Collections.reverse(list);
	return str;

//	return String.join("", list);
}
	
}
