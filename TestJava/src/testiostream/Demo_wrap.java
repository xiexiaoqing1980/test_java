package testiostream;

public class Demo_wrap {
	public static void main(String[] args) {
		heimastudent hs=new heimastudent(new student());
		hs.code();
		
	}

}

interface Coder{
	public void code();
}

class student implements Coder{

	@Override
	public void code() {
		// TODO Auto-generated method stub
		System.out.println("javase");
		System.out.println("javaweb");
	}
}
class heimastudent implements Coder{
	private student s; //��ȡѧ������
	 public heimastudent( student s) { //��ѧ�����а�װ
		// TODO Auto-generated constructor stub
		 this.s=s;
	}

	@Override
	public void code() {
		// TODO Auto-generated method stub
		s.code();
		System.out.println("more and more ");
	}
	
	
}
