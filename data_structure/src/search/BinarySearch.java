package search;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

	
	public static int BS(int[] arr, int target) {
		if(arr==null || arr.length==0) return -1;
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2 ; //��ֹintԽ�磬������ò�Ҫ��(int +high)/2��
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]>target) {
				high=mid-1;
			}else {
				low=mid+1;
			}
					
		}
		
		
		return -1;  //û�ҵ�����-1
	}
	
	public static int  binarySearch2( int [] arr,int target,int low,int high) {
		if (arr==null || arr.length==0) return -1;
		
		int mid=low+(high-low)/2;
		if (low>high) {
			return -1;
		}
		if (arr[mid]==target) {
			return mid;
		}
		if (arr[mid]<target) {
			return binarySearch2(arr, target, mid+1, high);
		}else {
			 return binarySearch2(arr, target, low, mid-1);
		}
		
	}

}
