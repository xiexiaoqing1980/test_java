package testmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class iterate_map {
	public static void main(String[] args) {
		 iterate1();
		 iterate2();  //第二种遍历
	}
	
	public static void iterate2() {
		Map<String, Integer> m1=new HashMap<>();
		 m1.put("a", 1);
		 m1.put("b", 2);
		 
		 Set<Map.Entry<String, Integer>> s1=m1.entrySet();
		 for (Entry<String, Integer> entry : s1) {
			 System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		 
	}

	public static void iterate1() {
		Map<String, Integer> m1=new HashMap<>();
		 m1.put("a", 1);
		 m1.put("b", 2);
		 Set<String> s1=m1.keySet();  //遍历
		 for (String string : s1) {
			
			System.out.println(m1.get(string));
		}
	}

}
