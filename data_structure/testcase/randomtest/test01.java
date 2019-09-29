package randomtest;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;

import algorithm.UItest;
import tree.TreeNode;

public class test01 {
	
	
	@Test
	public void test1() {
		Properties pro=System.getProperties();
		Enumeration<Object> en=pro.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
	}

	@Test
	public void test2() {
		System.out.println(System.getProperty("os.name"));
	}
	
	
	@Test
	public void test03() throws InterruptedException {
		UItest ui=new UItest();
		ui.getMethod();
	}
	
	@Test
	public void test04()  {
		int a=Integer.MAX_VALUE;
		int b=Integer.MIN_VALUE;
		System.out.println(a*a);  //1
		System.out.println(a+1);  //-2147483648
		System.out.println(b-1);  //2147483647
		System.out.println(b);  //-2^32
		System.out.println(a); // 2147483647
		System.out.println();
//		BigInteger b1=new big
		long sum=(long)a*a;
		System.out.println(sum);
		System.out.println(a*a);
		
	}
	
	@Test
	public void test05()  {
		int a=Integer.MAX_VALUE;
		double b=1;
		System.out.println(a+b);
		System.out.println(a+1f);
		
	}
	
	@Test
	public void test06()  {
		for(int i=1;i<=9;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
		
	}
	
	@Test
	public void test07()  {
		int[] arr= new int[] {2,7,0,5};
		List<Integer> list=Arrays.asList(2,3,4,5);
		Collections.reverse(list);
		for (Object i : list.toArray()) {
			System.out.println(i);
		}
		
		int[] arr2=new int[] {1,2};
		arr=new int[5];
		 
	System.out.println(arr.getClass().equals(List.class));
		
		
	}
	
	@Test
	public void test08()  {
		String str=".677.9877";
		str=str.replace('.', '_');
		System.out.print(str);
		System.out.println(String.format("%%%s", "aa"));  //%%ת��% ��_677_9877%aa
		Object[] a= {"aa",2};
		System.out.println(String.format("%1$s %2$d %%s", a));
		
	}
	
	@Test
	public void test08()  {
		LinkedList<Integer> stack = new LinkedList<>();
		stack.push(1);
		stack.push(2);
		stack.pop();
		stack.pop();
		
		
	}
	
}
