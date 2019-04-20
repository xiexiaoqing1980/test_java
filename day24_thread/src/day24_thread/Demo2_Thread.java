package day24_thread;

public class Demo2_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread mtMythread=new Mythread();
		mtMythread.start();   //开启线程需要时间
		
		for(int i=0;i<1000000;i++){
			System.out.println("main");    //交错执行
		}

	}

}


class Mythread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		for(int i=0;i<1000000;i++){
			System.out.println("aaa");
		}
		
	}
	
}