package testobject;

public class TestInterface {
	public static void main(String[] args) {
		inter inter =new inter_implement();   //创建实例化对象。
		inter_implement im1=new inter_implement();
		inter.print();
		System.out.println(im1.num);   //num是静态的,输出100
		System.out.println(inter.num);   //num是静态的   
		
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