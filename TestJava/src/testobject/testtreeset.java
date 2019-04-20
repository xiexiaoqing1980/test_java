package testobject;

import java.util.Comparator;
import java.util.TreeSet;

public class testtreeset {
	public static void main(String[] args) {
		TreeSet<Integer> t1=new TreeSet<>();
		t1.add(2);
		t1.add(1);
		t1.add(1);
		t1.add(2);
		
//		System.out.println(t1);    //[1,2]
//--------------------��Ȼ˳������-------
		TreeSet<something> t2=new TreeSet<>();
		t2.add(new something(2, "z"));
		t2.add(new something(1, "abc"));
		t2.add(new something(1, "ab"));
		
		System.out.println(t2);    //��ֱ�ӱ�����֪���������
//----------------�Ƚ�����˳��----------------
		TreeSet<something> t3=new TreeSet<>(new demo1());
		t3.add(new something(2, "z"));
		t3.add(new something(1, "abc"));
		t3.add(new something(1, "ab"));
		System.out.println(t3);
		
		System.out.println("abc".compareTo("abcd"));  //���ȵıȽ�
		System.out.println('a'-'��');  //�ַ��ıȽ�-26271
		System.out.println("abc".compareTo("��"));  //�ַ��ıȽ�-26271
	}

}

//�Զ������
class something implements Comparable<something>{
	 int age;
	String number;
	public something(int age, String number) {
		super();
		this.age = age;
		this.number = number;
	}
//	@Override
//	public int compareTo(something o) {
//		// TODO Auto-generated method stub
//		int num= this.age-o.age;            //�Ƚϵ���Ҫ���ܴ������ֲ�ͬ��������ͬ�ı��洢
//		return num==0 ?this.number.compareTo(o.number): num;
//		
//	}
	
	@Override
	public String toString() {
		return "something [age=" + age + ", number=" + number + "]"; 
	}
@Override
//������������:unicode���ֵ
public int compareTo(something o) {
	// TODO Auto-generated method stub
	int num= this.number.compareTo(o.number);            //�Ƚϵ���Ҫ���ܴ������ֲ�ͬ��������ͬ�ı��洢
	return num==0 ?this.age-o.age: num;

	
}
	
//�������Ƶĳ��ȱȽ�
//@Override
//public int compareTo(something o) {
//	// TODO Auto-generated method stub
//	int length=this.number.length()-o.number.length();
//	int num=length==0?this.number.compareTo(o.number):length;
//	return num==0?this.age-o.age:num;   //��Ҫ����
//}

}

class demo1 implements Comparator<something>{

	@Override
	public int compare(something o1, something o2) {
		// TODO Auto-generated method stub
		int length=o1.number.length()-o2.number.length();
		int num=length==0?o1.number.compareTo(o2.number):length;
		return num==0?o1.age-o2.age:num;   //��Ҫ����
	}
	
}
	
	
	
