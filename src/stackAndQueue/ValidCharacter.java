package stackAndQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import javax.print.attribute.HashAttributeSet;

public class ValidCharacter {
public boolean isValid(String s) {
	
	if(s==null) return false;
	if(s.isEmpty()) return true;
	
	Stack<Character> stack=new Stack<>();
	Map map=new HashMap();
	map.put(')', '(');
	map.put('}', '{');
	map.put(']', '[');
	//第一个字符为其中一个键的话，直接返回FALSE；
	if(map.containsKey(s.charAt(0))) return false;
	//将数组的元素依次进栈，碰到符合匹配的就将最底层的元素出栈;
	for (Character character : s.toCharArray()) {
	    
	     if(map.containsKey(character)) {   //如果是右括号
	    	 if(stack.isEmpty()) return false;
	    	 if(!stack.pop().equals(map.get(character))) {
	    		 return false;
	    	 }
	    	 
	     }else {
	    	 stack.push(character);     //如果是左括号,直接进栈
	     }
		
	}
	
	
	return stack.isEmpty();
        
        
    }

}
