package test;

public class testrecurse {
	public static void main(String[] args) {
		
	}
	
	
	/**
	 * 
	 * @param n ���ݵĲ���
	 * @return
	 */
	public static  int crawlStairs( int n) {
		if(n<=0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 2;
		}
		return crawlStairs(n-1)+crawlStairs(n-2); //ʣ�µ�n-1�����ݻ���n-2��
		
	}

}
