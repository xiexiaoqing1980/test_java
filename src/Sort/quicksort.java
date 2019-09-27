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
		int temp;   //��׼��
		if(left>right) return;
		temp=arr[left];
		while(i!=j) {    
			
			///˳�����Ҫ��Ҫ�ȴ��ұ߿�ʼ�ң���Ϊ�������Ϊ��׼��
			while(arr[j]>=temp && j>i) {  // j>i����j�ķ�Χ
				j--;
			}
			
			while(arr[i]<=temp && j>i) {  // j>i����j�ķ�Χ
				i++;
			}
			if(i<j) {
				t=arr[i];
			    arr[i]=arr[j];
			    arr[j]=t;
				
			}
			
		}
		//����׼������������������λ��
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
		int temp;   //��׼��
		if(left>right) return;
		temp=arr[left];
		while(i!=j) {    
			
			///˳�����Ҫ��Ҫ�ȴ��ұ߿�ʼ�ң���Ϊ�������Ϊ��׼��
			while(arr[j]>=temp && j>i) {  // j>i����j�ķ�Χ
				j--;
			}
			
			if(i<j) {
				arr[i++]=arr[j];
				
			}
			
			while(arr[j]<=temp && j>i) {  // j>i����j�ķ�Χ
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
