package test02;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {
	
	public static void main(String[] args) {
//		int[] arr= new int[] {};
		int[] arr= {1,23,56,7};
//		System.err.println(BS(arr,4));
		Arrays.sort(arr);
//		for (int i : arr) {
//			System.out.println(i);
//		}
		
		
//		System.out.println(1.0/3.0);
//		float a=3;
//		System.out.println(a);
		
         System.out.println(sqrt(4,1e-5));
		
		
	}

	
	public static int BS(int[] arr, int target) {
		if(arr==null || arr.length==0) return -1;
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2 ; //防止int越界，所以最好不要用(int +high)/2；
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]>target) {
				high=mid-1;
			}else {
				low=mid+1;
			}
					
		}
		
		
		return -1;  //没找到返回-1
	}

    public static float sqrt(int x, double d) {
    	
    	if(x==1||x==0) return (float)x;
    	
    	float low=1;    //直接转为浮点数
    	float high=x;
    	float mid = 0;
    	while(high-low>d){
    		 mid=(low+high)/2;
    		
    		if(x/mid<mid) {
    			high=mid;
    			
    		}else if(x/mid>mid) {
    			low=mid;
    		}else {
    			return mid;
    		}
    	}
    	
    	
    	
		return mid;
    	
    	
    }
  
    


}
