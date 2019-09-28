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
	//��һ���ַ�Ϊ����һ�����Ļ���ֱ�ӷ���FALSE��
	if(map.containsKey(s.charAt(0))) return false;
	//�������Ԫ�����ν�ջ����������ƥ��ľͽ���ײ��Ԫ�س�ջ;
	for (Character character : s.toCharArray()) {
	    
	     if(map.containsKey(character)) {   //�����������
	    	 if(stack.isEmpty()) return false;
	    	 if(!stack.pop().equals(map.get(character))) {
	    		 return false;
	    	 } 
	     }else {
	    	 stack.push(character);     //�����������,ֱ�ӽ�ջ
	     }
	}
	return stack.isEmpty();   
    }
}
