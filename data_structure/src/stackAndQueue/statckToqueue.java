package stackAndQueue;

import java.util.LinkedList;
import java.util.Stack;

public class statckToqueue {
	
	private Stack<Integer> s1 = new Stack<>();
	private Stack<Integer> s2 = new Stack<>();
	private  int front;

	//方法一（使用两个栈 入队 - O(n)， 出队 - O(1)）
	public void offer(Integer x){
		 if (s1.empty())
		        front = x;
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		s1.push(x);
			
		while (!s2.isEmpty())
	        s1.push(s2.pop());
		
	}
	
	public void poll(){
	
		    s1.pop();
		    if (!s1.empty())
		        front = s1.peek();

}
	//方法二（使用两个栈 入队 - O(1)，出队 - 摊还复杂度 O(1)
	/*
	 * 根据栈 LIFO 的特性，s1 中第一个压入的元素在栈底。为了弹出 s1 的栈底元素，我们得把 s1 中所有的元素全部弹出，再把它们压入到另一个栈 s2 中，这个操作会让元素的入栈顺序反转过来。通过这样的方式，s1 中栈底元素就变成了 s2 的栈顶元素，这样就可以直接从 s2 将它弹出了。一旦 s2 变空了，我们只需把 s1 中的元素再一次转移到 s2 就可以了
	 */
	
	public void push(int x) {
	    if (s1.empty())
	        front = x;
	    s1.push(x);
	}
	
	public void pop() {
	    if (s2.isEmpty()) {
	        while (!s1.isEmpty())
	            s2.push(s1.pop());
	    }
	    s2.pop();    
	}
	
}




