package day24_thread;

public class Demo_ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();

	}

}


class Ticket extends Thread{
	static int ticket=100;

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		while (true) {
			synchronized (Ticket.class) {   //�������Ψһ��
				if (ticket==0) {
					break;
				}
				System.out.println(getName()+String.format("���ǵ�%sƱ", ticket--));
				
			}
			
	}
		
}
	
	
}
