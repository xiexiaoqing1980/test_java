
public class Testthrowable {
	public static void main(String[] args) throws Exception {
		
		demo1(-9);
	}
	
	public static void demo1(int age) throws Exception {
		if (age<0) {
//			throw new Exception("����Ƿ�");
			throw new AgeInvalidException("����Ƿ�");
		}
		
	}

}

//�Զ����쳣�ࣺ
class AgeInvalidException extends Exception{  //�̳�exceptionҪ�ڱ���ʱ����

	public AgeInvalidException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgeInvalidException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
}