package test;

public class testrecurse {
	public static void main(String[] args) {
		
	}
	
	
	/**
	 * 
	 * @param n 阶梯的层数
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
		return crawlStairs(n-1)+crawlStairs(n-2); //剩下的n-1个阶梯或者n-2个
		
	}

}
