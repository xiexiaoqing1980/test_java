package testobject;

public class TestStaticInnerClass {
	public static void main(String[] args) {
		outer3 ou3=new outer3();
		ou3.name();   //局部内部类的访问
		
		
   }
}

class outer3{
	public void name() {
		final int num=10;
		class inner3{
			public void print() {
				System.out.println(num);
			}
		}
		
	
	inner3 in3=new inner3();
	in3.print();
   }
	
}