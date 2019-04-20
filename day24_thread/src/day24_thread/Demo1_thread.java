package day24_thread;

public class Demo1_thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10000000;i++){
			new demo();
		}
		
		for(int i=0;i<1000000;i++){
			System.out.println("aaa");
		}
			

	}

}


class demo{

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		for(int i=0;i<1000000;i++){
			System.out.println("aaa");
		}
		
	}
	
	
}