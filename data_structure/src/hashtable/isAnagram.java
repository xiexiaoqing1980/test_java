package hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Ignore;

public class isAnagram {
	
	//method1:Sort the two Strings and judge whether they are equal
	public boolean isAnnagram(String s,String t) {
		
		 if(s==null||t==null) return false;
		 //If the length of two Strings are different,the result is false.
	        if(s.length()!=t.length()) return false;
	        char[] s1=s.toCharArray();
	        char[] t1=t.toCharArray();
	        
	        Arrays.sort(s1);
	        Arrays.sort(t1);
	        return  Arrays.equals(s1,t1);
		
	}
	
	//method2: count the number of characters of two Strings and  

//	时间复杂度：O(n)O(n)。时间复杂度为 O(n)O(n) 因为访问计数器表是一个固定的时间操作。
//	空间复杂度：O(1)O(1)。尽管我们使用了额外的空间，但是空间的复杂性是 O(1)O(1)，因为无论 NN 有多大，表的大小都保持不变。

	public boolean isAnnagram2(String s,String t) {
		
		 if(s==null||t==null) return false;
		 //If the length of two Strings are different,the result is false.
	        if(s.length()!=t.length()) return false;
	        
	        int[] counter=new int[26];
	       for(int i=0;i<s.length();i++){
	    	   counter[s.charAt(i)-'a']++;
	    	   counter[t.charAt(i)-'a']--;
	       }
	       for(int count:counter){
	    	   if(count!=0) return false ;
	       }
	       return true;
		
	}
	
	
	public static boolean isAnnagram3(String s,String t) {
		
		 if(s==null||t==null) return false;
		 //If the length of two Strings are different,the result is false.
	        if(s.length()!=t.length()) return false;
	        
	       Map<Character,Integer> map=new HashMap();
	       for(int i=0;i<s.length();i++){
	    	   char ch=s.charAt(i);
	    	   map.put(ch, map.containsKey(ch)?(map.get(ch))+1:1);
//	    	   map.put(ch2, map.containsKey(ch2)?(map.get(ch2))-1:1);
	       }
	       
	       for(int i=0;i<t.length();i++){
	    	   char ch=t.charAt(i);
	    	   if(!map.containsKey(ch)) return false;
	    	   map.put(ch,(map.get(ch))-1 );
	       }
	     for(Character key:map.keySet()){
	    	 if(map.get(key)!=0) return false;
	     }
	       return true;
		
	}
}
