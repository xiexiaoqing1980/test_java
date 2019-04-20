package day24_thread;

public class demo_synchronized_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printer2 p=new printer2();
		new Thread(){
			public void run() {
				for(int i=0;i<10000;i++){
					p.print1();
				}
			}
			
		}.start();
		
		new Thread(){
			public void run() {
				for(int i=1;i<10000;i++){
					p.print2();
				}
			}
			
		}.start();

	}

}

class printer2{
	lock l1=new lock();
	public  static synchronized void  print1() {
			System.out.print("a");
			System.out.print("b");
			System.out.print("c");
			System.out.print("d");
			System.out.print("e");
			System.out.println("f");
		
	}
	
	public void print2() {
		
		synchronized (printer2.class) {
			System.out.print("1");
			System.out.print("2");
			System.out.print("3");
			System.out.print("4");
			System.out.print("5");
			System.out.println("6");
		}
		
	}
}

