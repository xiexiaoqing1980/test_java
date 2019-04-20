package testobject;

public class TestAbstract {
	public static void main(String[] args) {
		
		
//		yuebuqun y1=new yuebuqun();
//		y1.cut();
	}
	
}
abstract class book{
	public String name;
	public int age;
	public String eat;
	
//	public book(String name, int age, String eat) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.eat = eat;
//	}

	public abstract void cut();
}
class yuebuqun extends book{
	public String habbit;

//	public yuebuqun(String name, int age, String habbit) {  //变量私有了，所以必须添加一个变量
//		super(name, age);
//		this.habbit = habbit;
//	}
	

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("牙签");
	}


}


//public yuebuqun(String name, int age, String eat, String habbit) {
//	super(name, age, eat);
//	this.habbit = habbit;
//}

 
// class linpingzhi extends book{
//
//	@Override
//	public void cut() {
//		// TODO Auto-generated method stub
//		System.out.println("用指甲刀");
//	}
//	 
// }