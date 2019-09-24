package Sort;

public class Msort {
	
	public static void Msort (int []arr) {
		int []temp = new int[arr.length];//������ǰ���Ƚ���һ�����ȵ���ԭ���鳤�ȵ���ʱ���飬����ݹ���Ƶ�����ٿռ�
		sort(arr, 0, arr.length-1, temp);
		
	}
	
	public static void sort(int[] arr,int left,int right,int[] temp) {
		
		if(left>=right) return;
		int mid=(left+right)/2;
		sort(arr, left, mid, temp);  //��ߵݹ�����
		sort(arr, mid+1, right, temp);//�ұ߹鲢����ʹ��������������
		merge(arr,left,mid,right,temp);//����������������ϲ�����
		
	}

	private  static void merge(int[] arr, int left, int mid, int right, int[] temp) {
		// TODO Auto-generated method stub
		int i=left;  //������ָ��
		int j=mid+1;   //������ָ��
		int t=0;   //��ʱ����ָ��
		while(i<=mid && j<=right) {
			if(arr[i]<=arr[j]) {
				temp[t++]=arr[i++];
			}else {
				temp[t++]=arr[j++];
			}
		}
		while(i<=mid){//�����ʣ��Ԫ������temp��
            temp[t++] = arr[i++];
        }
        while(j<=right){//��������ʣ��Ԫ������temp��
            temp[t++] = arr[j++];
        }
        t = 0;
        //��temp�е�Ԫ��ȫ��������ԭ������
        while(left <= right){
            arr[left++] = temp[t++];
        }
	}

}

