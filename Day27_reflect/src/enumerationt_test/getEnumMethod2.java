package enumerationt_test;

public class getEnumMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		week mon=week.Mon;
		week tue=week.Tue;
	}

}


class week{
	
	//����ʽ
	public static final week Mon=new week();
	public static final week Tue=new week();
	public static final week Wed=new week();
	
	private week(){   //˽�й���
		
	}
	
}