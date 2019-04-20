package day24_thread;

public class demo_ticket_runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket2 t1=new Ticket2();
		new Thread(t1).start();
		new Thread(t1).start();
		new Thread(t1).start();
		new Thread(t1).start();

	}

}

class Ticket2 implements Runnable{
	/*static */int ticket=100;   //不用定义为静态的，因为对象只有一份

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		while (true) {
			synchronized (this) {   //类对象是唯一的，也可以是this
				if (ticket==0) {
					break;
				}
				System.out.println(Thread.currentThread().getName()+String.format("这是第%s票", ticket--));
				
			}
			
	}
		
	}
}
	
