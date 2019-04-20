
public class Testthrowable {
	public static void main(String[] args) throws Exception {
		
		demo1(-9);
	}
	
	public static void demo1(int age) throws Exception {
		if (age<0) {
//			throw new Exception("年龄非法");
			throw new AgeInvalidException("年龄非法");
		}
		
	}

}

//自定义异常类：
class AgeInvalidException extends Exception{  //继承exception要在编译时处理

	public AgeInvalidException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgeInvalidException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
}