package day24_thread;

public class demo_priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(){
			public void run() {
				for(int i=0;i<1000;i++){
					System.out.println(getName()+".....aaaa");
					
				}
			}
		};
		
		Thread t2=new Thread(){
			public void run() {
				for(int i=0;i<1000;i++){
					System.out.println(getName()+".....bbbbb");
					
				}
			}
		};
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
	}

}
