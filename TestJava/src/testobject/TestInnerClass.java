package testobject;

public class TestInnerClass {
	public static void main(String[] args) {
//		outer.inner in=new outer().new inner();  //创建类名的方式，
//		in.name();           //要访问必须创建对象
		
		outer o1=new outer();
		o1.print();
	}
}
class outer{
	
	private int num=10;
	private class inner{             //私有了内部类，outer.inner in=new outer().new inner();这样创建不行
		public void name() {
			System.out.println(num);   //内部类可以直接访问外部的变量；
		}
	}
	public void print(){              //内部类私有之后只能在外部类的内部创建类
		inner i=new inner();
		i.name();
	}
	
}