package jdk7;

public interface test {
	
	public default void name() {
		
	}

}


class Testaa {
    public void run() {
          int x = 10;   //final����ʡ�ԣ�Ĭ�ϻ����
          class Inner {
                public void method() {
                      System.out.println(x);
                }
          }

          Inner i = new Inner();
          i.method();
    }
   
}