package sort;

import java.util.Iterator;

public class BubbleSort {
	
	public static int[] bubleSort1( int[] arr) {
		if (arr==null||arr.length==0||arr.length==1) return arr;
		for (int i = 0; i < arr.length; i++) {
			for(int j=arr.length-1;j>i;j--){
				if (arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					
				}
			}
			
		}
		return arr;
		
	}

	//算法改良，设置flag，防止已经排序的序列也重复排序
	
	public static int[] bubleSort2( int[] arr) {
		if (arr==null||arr.length==0||arr.length==1) return arr;
		boolean flag=true;
		for (int i = 0; i < arr.length&&flag; i++) {
			flag=false;
			for(int j=arr.length-1;j>i;j--){
				if (arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					flag=true;  //标明这趟有数据交换，否则没有数据交换，就不用进行下一次的循环
				}
			}
			
		}
		return arr;
		
	}
}
