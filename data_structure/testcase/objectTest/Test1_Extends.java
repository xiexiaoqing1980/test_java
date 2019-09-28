package objectTest;

class Fu{
    public int num = 10;
    public Fu(){
          System.out.println("fu");
    }
    
    public static void method1() {
    	System.out.println("I am static method");
    }
}
class Zi extends Fu{
    public int num = 20;
    public Zi(){
          System.out.println("zi");
    }
    public void show(){
          int num = 30;
          System.out.println(num);
          System.out.println(this.num);
          System.out.println(super.num);
    }
    
//    public static void method1() {
//    	System.out.println("I am zi static method");
//    }
    
}
 public class Test1_Extends {
    public static void main(String[] args) {
          Zi z = new Zi();
          z.method1();
    }
}