package testmap;

import java.util.HashMap;
import java.util.Map;

public class quiz {
public static void main(String[] args) {
	demo1();
	
}

public static void demo1() {
	String string="gfeyruaabb";
	Map<Character, Integer> m1=new HashMap<>();
	char[] ch=string.toCharArray();
	for (char c : ch) {
//		if (!m1.containsKey(c)) {
//			m1.put(c, 1);
//		}else {
//			m1.put(c, m1.get(c)+1);
//		
//		}
		
//优化：三元运算符
		m1.put(c, !m1.containsKey(c)?1:m1.get(c)+1);
	}
	for (Character c : m1.keySet()) {
		System.out.println(c+"="+m1.get(c));
	}
	
	
	
	
}
}
