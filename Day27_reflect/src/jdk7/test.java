package jdk7;

public interface test {
	
	public default void name() {
		
	}

}


class Testaa {
    public void run() {
          int x = 10;   //final可以省略，默认会加上
          class Inner {
                public void method() {
                      System.out.println(x);
                }
          }

          Inner i = new Inner();
          i.method();
    }
   
}