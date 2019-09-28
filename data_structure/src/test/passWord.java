package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class passWord {
	
	private String password;
	public void setname( String name) {
		this.password=name;
	}
	
	public static void main(String[] args) {
		List<Integer> result= setPassword2(5);
		for (Integer integer : result) {
			System.out.println(integer);
			
		}
		
	}
	
	
	
	public static List<Integer> setPassword( int n) {
		List<Integer> result =new ArrayList<>();
		if(n<2 || n>5) return result;
		int value=1;
		int[][] arr = new int[3][3];
       for(int i=0;i<3;i++) {
    	   for(int j=0;j<3;j++) {
    		   arr[i][j]=value;
    		   value++;
    	   }
		}
		//记住上一次生成的索引值；
		int index1 = 0;
		int index2=0;
		Random ran=new Random();
		while(result.size()<n) {
			int value1=ran.nextInt(3);
			int value2=ran.nextInt(3);
			//判断索引的值
			if(result.size() > 0 && (result.contains(arr[value1][value2])  || (Math.abs(value1-index1)==0&&Math.abs(value2-index2)==2||Math.abs(value1-index1)==2&&Math.abs(value2-index2)==0||Math.abs(value1-index1)==2&&Math.abs(value2-index2)==2))) {
				continue;  //退出循环，重新取数

			}
			result.add(arr[value1][value2]);
			index1=value1;
			index2=value2;
		}
			
		
		return result;
		
	}
	
	
	public static List<Integer> setPassword2( int n) {
		
//		int value=1;
//		int[][] arr = new int[3][3];
//       for(int i=0;i<3;i++) {
//    	   for(int j=0;j<3;j++) {
//    		   arr[i][j]=value;
//    		   value++;
//    	   }
//		}
		
       List<Integer> alist=new ArrayList<>();
       for(int i=1;i<10;i++) {
    	   alist.add(i);
       }
       
       List<Integer> result =new ArrayList<>();
       Random ran=new Random();
       while(result.size()<n) {
    	   int value1=ran.nextInt(alist.size());
    	   result.add((Integer) alist.get(value1));
    	   
    	   alist.remove(value1);
    	   
    	   
    	   
       }
		
		return result;
		
		
		
		
		
		
		
	}
	
	

}
