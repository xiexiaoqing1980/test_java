package reflect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo2_ClassForName2 {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		// TODO Auto-generated method stub

		/**
         * ե֭��(Juicer)ե֭�İ���
         * �ֱ���ˮ��(Fruit)ƻ��(Apple)�㽶(Banana)����(Orange)ե֭(squeeze)
         * @throws Exception
         * ����ĺô������������еĴ��벻�ñ��޸�
         */
              /*Juicer j = new Juicer();
              //j.run(new Apple());
              j.run(new Orange());*/
              BufferedReader br = new BufferedReader(new FileReader("config.properties")); //��������������,���������ļ�
              Class<?> clazz = Class.forName(br.readLine());   //��ȡ�ֽ�ô�ļ�                                                   //��ȡ�����ļ�һ������,��ȡ������ֽ������
              Fruit f = (Fruit) clazz.newInstance();   //����ƻ������                                                           //ͨ���ֽ�����󴴽�ʵ������
              Juicer j = new Juicer();  //����ե֭��
              j.run(f);
        }
 
  }
  interface Fruit {                  //�ӿڣ���ȡ����ͬ�ķ���
        public void squeeze();
  }
 
  class Apple implements Fruit {
        public void squeeze() {
              System.out.println("ե��һ��ƻ��֭��");
        }
  }
 
  class Orange implements Fruit {             //ʵ�ֽӿڣ�����ÿ�����о���ķ���
        public void squeeze() {
              System.out.println("ե��һ������֭��");
        }
  }
 
  class Juicer {                             //�����������շ�����ʵ�ַ���
        public void run(Fruit f) {
              f.squeeze();
        }
 
  }
