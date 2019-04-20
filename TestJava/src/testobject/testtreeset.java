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
//--------------------自然顺序排序-------
		TreeSet<something> t2=new TreeSet<>();
		t2.add(new something(2, "z"));
		t2.add(new something(1, "abc"));
		t2.add(new something(1, "ab"));
		
		System.out.println(t2);    //会直接报错，不知道如何排序
//----------------比较器的顺序----------------
		TreeSet<something> t3=new TreeSet<>(new demo1());
		t3.add(new something(2, "z"));
		t3.add(new something(1, "abc"));
		t3.add(new something(1, "ab"));
		System.out.println(t3);
		
		System.out.println("abc".compareTo("abcd"));  //长度的比较
		System.out.println('a'-'最');  //字符的比较-26271
		System.out.println("abc".compareTo("最"));  //字符的比较-26271
	}

}

//自定义对象：
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
//		int num= this.age-o.age;            //比较的主要可能存在名字不同，年领相同的被存储
//		return num==0 ?this.number.compareTo(o.number): num;
//		
//	}
	
	@Override
	public String toString() {
		return "something [age=" + age + ", number=" + number + "]"; 
	}
@Override
//按照姓名排序:unicode码表值
public int compareTo(something o) {
	// TODO Auto-generated method stub
	int num= this.number.compareTo(o.number);            //比较的主要可能存在名字不同，年领相同的被存储
	return num==0 ?this.age-o.age: num;

	
}
	
//按照名称的长度比较
//@Override
//public int compareTo(something o) {
//	// TODO Auto-generated method stub
//	int length=this.number.length()-o.number.length();
//	int num=length==0?this.number.compareTo(o.number):length;
//	return num==0?this.age-o.age:num;   //次要条件
//}

}

class demo1 implements Comparator<something>{

	@Override
	public int compare(something o1, something o2) {
		// TODO Auto-generated method stub
		int length=o1.number.length()-o2.number.length();
		int num=length==0?o1.number.compareTo(o2.number):length;
		return num==0?o1.age-o2.age:num;   //次要条件
	}
	
}
	
	
	
