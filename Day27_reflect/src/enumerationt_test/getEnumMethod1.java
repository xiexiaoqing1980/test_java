package enumerationt_test;

public class getEnumMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		week2 mon=week2.Mon;
		week2 tue=week2.Tue;
		System.out.println(mon.getName());
		

	}

}


class week2{
	
	//����ʽ
	public static final week2 Mon=new week2("monday");
	public static final week2 Tue=new week2("Tuesday");
	public static final week2 Wed=new week2("Wedsday");
	
	private String name;
	
	private week2(String name){   //˽�й���
		this.name=name;
	}

	public String getName() {
		return name;
	}

	
	
	
}