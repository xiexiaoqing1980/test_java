package testobject;

import java.util.ArrayList;
import java.util.Iterator;

public class testArraylist {
	public static void main(String[] args) {	
//	demo1();
		demo2();
		System.out.println();
		
	
	
	}

	public static void demo1() {
		ArrayList<ArrayList<String>> list=new ArrayList<>();
		ArrayList<String> first=new ArrayList<>();
		first.add("a");
		first.add("b");
		ArrayList<String> second=new ArrayList<>();
		second.add("c");
		list.add(first);
		list.add(second); 
		System.out.println(list);   //  [[a, b], [c]]
	}
	
	public static void demo2() {
		
		ArrayList<ArrayList<animal2>> list=new ArrayList<>();
		ArrayList<animal2> first=new ArrayList<>();
		first.add(new animal2(12, "a"));
		first.add(new animal2(10, "c"));
		ArrayList<animal2> second=new ArrayList<>();
		second.add(new animal2(13, "b"));
		list.add(second);
		list.add(first);
		System.out.println(list);  //要重写tostring的方法,否则打印出来的就是地址值
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//			
//		}

	}
}

class animal2{
	int age;
	String number;
	public animal2(int age, String number) {
		super();
		this.age = age;
		this.number = number;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "animal:"+this.age+this.number;
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		animal2 other = (animal2) obj;
		if (age != other.age)
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	
	
	
}