package find;

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

public static int  binarySearch( int [] arr,int target) {
	if (arr==null || arr.length==0) return -1;
	int low=0;
	int high=arr.length-1;
	int mid;
	while (low<=high) {
		mid=low+(high-low)/2;
		if (arr[mid]==target) {
			return mid;
		}else if (arr[mid]>target) {
			high=mid-1;
			
		}else {
			low=mid+1;
		}
	}
	
	return -1;
	
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
