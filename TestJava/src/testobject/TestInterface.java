package testobject;

public class TestInterface {
	public static void main(String[] args) {
		inter inter =new inter_implement();   //����ʵ��������
		inter_implement im1=new inter_implement();
		inter.print();
		System.out.println(im1.num);   //num�Ǿ�̬��,���100
		System.out.println(inter.num);   //num�Ǿ�̬��   
		
	}

}


interface inter{
	 public abstract void print();
	 int num=100;
}


class inter_implement implements inter{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("hfbjdbfj");
	}
	
	
}