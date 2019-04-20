package testobject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.TreeSet;

import testobject.outer2.inner2;

public class collectionquiz {
public static void main(String[] args) {
//在一个集合中存储了无序并且重复的字符串,定义一个方法,让其有序(字典顺序),而且还不能去除重复
//   demo1();
//* 从键盘接收一个字符串, 程序对其中所有字符进行排序,例如键盘输入: helloitcast程序打印:acehillostt
//  demo2();

//程序启动后, 可以从键盘输入接收多个整数, 直到输入quit时结束输入. 把所有输入的整数倒序排列打印.
//demo3();
  

 
}


public static void demo3() {
	Scanner scanner=new Scanner(System.in);
	TreeSet<Integer> t1=new TreeSet<>(new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			int num=o2.compareTo(o1);
			return num==0?1:num;
		}
	});
	
//	
	while(scanner.hasNextLine()){
		String line=scanner.nextLine();
		if (line.equals("quit")) {
			break;
		}
		Integer i=Integer.parseInt(line);
		t1.add(i);
	}
	System.out.println(t1);
}

public static void demo2() {
	String a="fhgjhruti";
	char[] arr=a.toCharArray(); //存储在字符数组中
	TreeSet<Character> t1=new TreeSet<>(new Comparator<Character>() {

		@Override
		public int compare(Character o1, Character o2) {
			// TODO Auto-generated method stub
			int num=o1.compareTo(o2);
			return num==0? -1:num;
		}
		
	});
			
	for (Character character : arr) {
		
		t1.add(character);  //添加到t1中
		}
	StringBuilder sBuilder=new StringBuilder();  //字符串输出
	for (Character character : t1) {
		sBuilder.append(character);
	}
	System.out.println(sBuilder);
	

}
public static void demo1() {
	//思路：根据compareto方法来完成
		
	//	1、创建List存储重复的字符串
	//    2、创建方法存储重复的字符串并排序 （在方法中再创建treeset集合）
	//       1、创建treeset集合对象 ，因为String本身具备比较功能，但是重复的不会保留，所                   以我们用比较器
	//        2、将LIST的元素添加到treeset集合，对其排序，保留重复
	//        3、清空list
	//        4、将treeset存储到list中
		ArrayList<String> list=new ArrayList<>();
		list.add("aaa");
		list.add("aaa");
		list.add("bb");
		sort_arr(list);   //输出[aaa, aaa, bb]
}

  public static void sort_arr(List<String> list) {
	TreeSet<String> ts=new TreeSet<>(new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			int num=o1.compareTo(o2);
			return num==0?-1:num;
			// TODO Auto-generated method stub
			
		}

	});
ts.addAll(list);
list.clear();
list.addAll(ts);

System.out.println(list);
	
}
  
  
}
