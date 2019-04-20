package testobject;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeCompartor {
	public static void main(String[] args) {
		TreeSet<String> t1=new TreeSet<>(new ComparBylen());
		t1.add("aaaaaaa");
		t1.add("z");
		t1.add("wc");
		t1.add("nba");
		t1.add("cba");
		System.out.println(t1);  //[bb, aaa]

	}

}


class ComparBylen implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		int num=o1.length()-o2.length(); //通过长度
		return num==0?o1.compareTo(o2):num;
	}
	
}