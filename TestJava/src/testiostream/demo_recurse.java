package testiostream;

public class demo_recurse {
	public static void main(String[] args) {
		
		System.out.println(mul(1000));
	}
	
	//5µÄ½×³Ë
	public static int mul(int num ) {
		if (num==1) {
			return 1;
		} else {
			return num*mul(num-1);
		}
	}

}
