package reflect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo2_ClassForName2 {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		// TODO Auto-generated method stub

		/**
         * 榨汁机(Juicer)榨汁的案例
         * 分别有水果(Fruit)苹果(Apple)香蕉(Banana)桔子(Orange)榨汁(squeeze)
         * @throws Exception
         * 反射的好处就是主方法中的代码不用被修改
         */
              /*Juicer j = new Juicer();
              //j.run(new Apple());
              j.run(new Orange());*/
              BufferedReader br = new BufferedReader(new FileReader("config.properties")); //创建输入流对象,关联配置文件
              Class<?> clazz = Class.forName(br.readLine());   //获取字节么文件                                                   //读取配置文件一行内容,获取该类的字节码对象
              Fruit f = (Fruit) clazz.newInstance();   //创建苹果对象                                                           //通过字节码对象创建实例对象
              Juicer j = new Juicer();  //创建榨汁机
              j.run(f);
        }
 
  }
  interface Fruit {                  //接口，抽取出共同的方法
        public void squeeze();
  }
 
  class Apple implements Fruit {
        public void squeeze() {
              System.out.println("榨出一杯苹果汁儿");
        }
  }
 
  class Orange implements Fruit {             //实现接口，补充每个类中具体的方法
        public void squeeze() {
              System.out.println("榨出一杯桔子汁儿");
        }
  }
 
  class Juicer {                             //第三方，接收方法，实现方法
        public void run(Fruit f) {
              f.squeeze();
        }
 
  }
