package day24_thread;

public class Demo4_inner {
	
	public static void main(String[] args) {
		
//		demo1_sleep();
		demo_protect();
			
			
			
		}

	public static void demo1_sleep() {
		Thread t1=new Thread(){
			public void run() {
				for(int i=0;i<10;i++){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					};
					System.out.println(getName());
				}
			}
				
			};
	}
		
	
	public static void demo_protect() {
		
		Thread t1=new Thread(){
			public void run() {
				for(int i=0;i<10;i++){
					System.out.println(getName());
				}
			}
			
		};
				
			
		
		Thread t2=new Thread(){
			public void run() {
				for(int i=0;i<10;i++){
					System.out.println(getName());
				}
			}
			
		};
		
		t2.setDaemon(true);
		t1.start();
		t2.start();
	}
	

}
