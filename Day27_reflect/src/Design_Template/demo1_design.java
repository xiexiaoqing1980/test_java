package Design_Template;

public class demo1_design {
	public static void main(String[] args) {
		System.out.println(new demo().getTime());
	}
}

abstract class GetTime{
	public  final long getTime() {     // The method cannot be modified by extended class
		long start=System.currentTimeMillis();
		testedCode();  //code or method to be tested

		long end=System.currentTimeMillis();
		return end-start;
	}
	public  abstract void testedCode();     //tested code or method,need to be overide by sonclass
}

class demo extends GetTime{

	@Override
	public void testedCode() {
		// TODO Auto-generated method stub
		for(int i=1;i<10000;i++){
			System.out.println("**");
		}
	}
	
}
