package reflect;

public class Demo2_ClassForName {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class clazz1=Class.forName("reflect.Person");
		Class clazz2=new Person().getClass();
		Class clazz3=Person.class;
		System.out.println(clazz1==clazz2);     //true
		System.out.println(clazz2==clazz3);

	}

}
