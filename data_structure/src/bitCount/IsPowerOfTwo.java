package bitCount;

public class IsPowerOfTwo {
	
	public boolean isPowerOfTwo(int n){
		if(n<0) return false;
		while(n>1){
			if((n&1)==1) return false;
			n=n/2;
		}
		return true;
	}
	
	public boolean isPowerOfTwo2(int n) {
		return n > 0 && (n & (n - 1)) == 0;
		
	}
}
