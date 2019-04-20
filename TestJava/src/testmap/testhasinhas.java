package testmap;

import java.util.HashMap;
import java.util.Map;

public class testhasinhas {
	public static void main(String[] args) {
		HashMap<student, String> hMap=new HashMap<>();
		hMap.put(new student("aa", 13), "shenhen");
		hMap.put(new student("aa", 13), "shenhen");
		hMap.put(new student("cc", 14), "guangzhou");
//		System.out.println(hMap);
		
		HashMap<student, String> hMap2=new HashMap<>();
		hMap2.put(new student("dd", 13), "shenhen");
		
		Map<HashMap<student, String>, String> hMap3=new HashMap<>();
		hMap3.put(hMap, "1");   //只能放子类的map
		hMap3.put(hMap2, "2");
//		System.out.println(hMap3);
		//分开遍历：
		for ( HashMap<student, String> h1: hMap3.keySet()) {
			String value=hMap3.get(h1);
			for (student s1 : h1.keySet()) {
				String value2=hMap3.get(s1);
				System.out.println();
				
			}
			
		}
	}

}
