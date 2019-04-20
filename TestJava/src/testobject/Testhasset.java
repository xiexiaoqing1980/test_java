package testobject;

import java.util.HashSet;
import java.util.Random;

public class Testhasset {
	public static void main(String[] args) {

		demo1();
		
	}

//	产生10个1-20之间的随机数要求随机数不能重复
	public static void demo1() {
		Random r1=new Random();
		HashSet<Integer> h1=new HashSet<>();
		while (h1.size()<10) {
			int num = r1.nextInt(20) + 1;  //1-20
			h1.add(num);
		}
		for (Integer integer : h1) {
			System.out.println(integer);
			
		}
		
	}
}
