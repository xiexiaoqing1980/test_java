package testmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class poker_project {
	public static void main(String[] args) {
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] color = {"方片","梅花","红桃","黑桃"};
		List<String> porker=new ArrayList<>();
		for (String s1 : color) {
			for (String s2 : num) {
				porker.add(s1+s2);
			}
		}
//		System.out.println(porker);
//		System.out.println(porker.size());  //52
	//洗牌：
		Collections.shuffle(porker);
//		System.out.println(porker);
	//给三个人发牌
		ArrayList<String> a=new ArrayList<>();
		ArrayList<String> b=new ArrayList<>();
		ArrayList<String> c=new ArrayList<>();
		ArrayList<String> dipai=new ArrayList<>();
		
		
		for (int i = 0; i < porker.size(); i++) {
			if (i>porker.size()-3) {
				dipai.add(porker.get(i));
			} else if (i%3==0) {
				a.add(porker.get(i));
			} else if (i%3==1) {
				b.add(porker.get(i));
			} else {
				c.add(porker.get(i));
			}{
				
			}
			{

			}
			
		}
		//看牌
		System.out.println(a); 
		System.out.println(b);
		System.out.println(c);
		System.out.println(dipai);
		
		
	}

}
