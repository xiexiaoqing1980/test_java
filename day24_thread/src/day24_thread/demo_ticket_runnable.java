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
	/*static */int ticket=100;   //���ö���Ϊ��̬�ģ���Ϊ����ֻ��һ��

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		while (true) {
			synchronized (this) {   //�������Ψһ�ģ�Ҳ������this
				if (ticket==0) {
					break;
				}
				System.out.println(Thread.currentThread().getName()+String.format("���ǵ�%sƱ", ticket--));
				
			}
			
	}
		
	}
}
	
