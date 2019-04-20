package testexception;

public class Demo1 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int[] arr={1,2,3,4,5};
		try{
			arr=null;
			System.out.println(arr[10]);
		}
//			catch ( e) {
//			// TODO: handle exception
//			System.out.println("越界了");
//		}
			catch (NullPointerException |IndexOutOfBoundsException e) {
			System.out.println("null");
			// TODO: handle exception
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("出错了");
		}
	}

	}
