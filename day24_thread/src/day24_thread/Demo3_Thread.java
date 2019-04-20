package day24_thread;

public class Demo3_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread=new Thread(new demo2());
		thread.start();
		for(int i=0;i<1000000;i++){
			System.out.println("main");    //交错执行
		}
		
		
		

	}

}


class demo2 implements  Runnable{
	public void run() {
		for(int i=0;i<1000000;i++){
			System.out.println("aaa");    //交错执行
		}
	}
}