package testobject;

public class TestAbstract4 {
	public static void main(String[] args) {
		cat c1=new cat();
		c1.eat();
		jumpcat jum =new jumpcat("hhaha", 15);    //构造方法是不继承的；
		jum.jump();
				
	}
	
}

abstract class Animal{
	public String name;
	public int age;
	public abstract void eat();
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Animal() {
		super();
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

interface jumping{
	public abstract void jump();
}

class cat extends Animal{
	public cat(){}
	 public cat(String name, int age){
		 super(name,age);
	 }
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猫吃鱼");
	}
	
}
 class jumpcat extends cat implements jumping{

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+"猫跳高");   //方法里面可以设置获取到参数
	}
	 
	public jumpcat() {
		// TODO Auto-generated constructor stub
	}
	 public jumpcat(String name, int age){
		super(name, age);
	}
	 
 }