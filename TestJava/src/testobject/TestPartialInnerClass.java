package testobject;

public class TestPartialInnerClass {
	public static void main(String[] args) {
		outer2.inner2 in2=new outer2.inner2(); 
		in2.name();
		outer2.inner2.print();  //静态方法直接类名调用
	}
}

class outer2{
	static class inner2{
		public void name() {
			System.out.println("haj");
		}
		
		public static void print(){
			System.out.println("djfjhd");
		}
	}
}