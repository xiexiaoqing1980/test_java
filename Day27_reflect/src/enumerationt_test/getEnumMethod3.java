package enumerationt_test;

public class getEnumMethod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		week3 mon=week3.Mon;
		week3 tue=week3.Tue;
		mon.show();
	}

}


 abstract class week3{
	
	//饿汉式
	public static final week3 Mon=new week3("monday") {

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("monday");
		}
		
	};
	public static final week3 Tue=new week3("Tuesday") {

		@Override
		public void show() {
			// TODO Auto-generated method stub
			
		}
		
	};
	public static final week3 Wed=new week3("Wedsday") {

		@Override
		public void show() {
			// TODO Auto-generated method stub
			
		}
		
	};
	
	private String name;
	
	private week3(String name){   //私有构造
		this.name=name;
	}

	public String getName() {
		return name;
	}
	
	abstract public void show();

	
	
	
}