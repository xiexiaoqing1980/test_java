package search;

public class OrderFind {

public  static int findIndex(int[] arr,int target) {
		
		if (arr==null || arr.length==0) return -1;
		for(int i=0;i<arr.length;i++){
			if (arr[i]==target) {
				return i;
			}
		}
		return -1;
		
	}
	
public  static int findIndex2(int[] arr,int target) {
		
		if (arr==null || arr.length==0) return -1;
		arr[0]=target;
		int i=arr.length-1;
		while(arr[i]!=target){
			i--;
		}
		return -1;
		
	}
}
