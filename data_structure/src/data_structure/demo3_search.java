package data_structure;

public class demo3_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={1,33,66,77,99,0};
		int key=77;
		System.out.println(binarySearch(arr, key));
		
		
		

	}
	
	//顺序表查找 ：复杂度：o(n)
	
	public static int getindex(int[]arr,int key){  //一般的查找算法
		
		for(int i=0;i<arr.length;i++){
			if (arr[i]==key) {
				return i;
			}
		}
		return -1;
		
		
	}
	public static int getindex2(int[]arr,int key) {
		arr[0]=key; //设置哨兵
		int i=arr.length;
		
		while (arr[i-1]!=key) {
			
		}
		return 0;
		
	}

	//有序表查找
	public static int binarySearch(int[] arr,int key) {
		int low=0;
		int high=arr.length-1;
		while (low<=high) {
			int mid=(low+high)/2;  //mid需要重新赋值，所以赋值语句要写在里面
			if (key<arr[mid]) {
				high=mid-1;
			}else if (key>arr[mid]) {
				low=mid+1;
			}else {
				return mid;
			}
			
		}
		
		
		return -1;
		
		
	}
	
	public static int insertSearch(int[] arr,int key) {
		int low=0;
		int high=arr.length-1;
		while (low<=high) {
			int mid=(low+high)/2;  //mid需要重新赋值，所以赋值语句要写在里面
			if (key<arr[mid]) {
				high=mid-1;
			}else if (key>arr[mid]) {
				low=mid+1;
			}else {
				return mid;
			}
			
		}
		
		
		return -1;
		
		
	}
	
	//二叉树排序树的查找
	
	public static int treeSearch(int[] arr,int key) {
		int low=0;
		int high=arr.length-1;
		while (low<=high) {
			int mid=(low+high)/2;  //mid需要重新赋值，所以赋值语句要写在里面
			if (key<arr[mid]) {
				high=mid-1;
			}else if (key>arr[mid]) {
				low=mid+1;
			}else {
				return mid;
			}
			
		}
		
		
		return -1;
		
		
	}
	
}

//插值查找


