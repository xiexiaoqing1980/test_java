package testobject;

public class TestAbstract2 {
	public static void main(String[] args) {
		
//		yuebuqun y1=new yuebuqun();
//		y1.cut();
		base_teacher b1=new base_teacher("aaa",13);
		b1.teach();
	}
	
}

abstract class teacher{
	public String name;
	public int age;
	public abstract void teach();

	public teacher() {
		super();
	}

	public teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class base_teacher extends teacher{
public base_teacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

//	public String habbit;
	
	
@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("»ù´¡°à£º"+this.getAge()+this.getName());
	}
}
 
// class linpingzhi extends book{
//
//	@Override
//	public void cut() {
//		// TODO Auto-generated method stub
//		System.out.println("ÓÃÖ¸¼×µ¶");
//	}
//	 
// }