package Sort;

public class quicksort {
	
	public static void quickSort1(int[] arr) {
		if(arr==null || arr.length<=1) return;
		sort2(arr, 0, arr.length-1);
		
	}
	
	
	private static void sort(int[] arr,int left,int right) {
		// TODO Auto-generated method stub
		int i=left;
		int j=right;
		int t;  
		int temp;   //基准数
		if(left>right) return;
		temp=arr[left];
		while(i!=j) {    
			
			///顺序很重要，要先从右边开始找，因为是以左边为基准数
			while(arr[j]>=temp && j>i) {  // j>i控制j的范围
				j--;
			}
			
			while(arr[i]<=temp && j>i) {  // j>i控制j的范围
				i++;
			}
			if(i<j) {
				t=arr[i];
			    arr[i]=arr[j];
			    arr[j]=t;
				
			}
			
		}
		//将基准数交换到两者相遇的位置
		arr[left]=arr[i];
		arr[i]=temp;
		//

		sort(arr,left,i-1);
		sort(arr,i+1,right);
	}
	
	public static void sort2(int[] arr,int left,int right) {
		// TODO Auto-generated method stub
		int i=left;
		int j=right;
		int t;  
		int temp;   //基准数
		if(left>right) return;
		temp=arr[left];
		while(i!=j) {    
			
			///顺序很重要，要先从右边开始找，因为是以左边为基准数
			while(arr[j]>=temp && j>i) {  // j>i控制j的范围
				j--;
			}
			
			if(i<j) {
				arr[i++]=arr[j];
				
			}
			
			while(arr[j]<=temp && j>i) {  // j>i控制j的范围
				i++;
			}
			if(i<j) {
				arr[j--]=arr[i];
				
			}
			
		}
		arr[i]=temp;

		sort(arr,left,i-1);
		sort(arr,i+1,right);
	}

}
