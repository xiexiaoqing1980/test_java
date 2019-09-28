package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

//方法一 （两个队列，压入 -O(1)O(1)， 弹出 -O(n)O(n)）

public class QueueToStack {
	private Queue<Integer> q1=new LinkedList();  //
	private Queue<Integer> q2=new LinkedList();
	private int top;
	//时间复杂度：O(1)
    //队列是通过链表来实现的，入队（add）操作的时间复杂度为 O(1)O(1)
	
	//入栈
	public void push(Integer value) {
		q1.add(value);
		top=value;
	}
	
	//时间复杂度：O(n)
   //算法让 q1 中的 nn 个元素出队，让 n - 1n−1 个元素从 q2 入队，在这里 nn 是栈的大小。这个过程总共产生了 2n - 12n−1 次操作，时间复杂度为 O(n)O(n)。

   //出栈
	public void pop() {
		while(q1.size()>1){   //将q1的除最后一个元素外的其他元素放入q2中，将q1中的最后一个元素弹出即可
			top = q1.remove();
	        q2.add(top);
		}
		q1.poll();
		Queue<Integer> temp = q1;
	    q1 = q2;
	    q2 = temp;//
	}
	
	
	/**
	 * 时间复杂度：O(n)
       算法会让 q1 出队 n 个元素，同时入队 n + 1 个元素到 q2。这个过程会产生 2n+1 步操作，同时链表中 插入 操作和 移除 操作的时间复杂度为 O(1)，因此时间复杂度为 O(n)。

     空间复杂度：O(1)

	 * @param value
	 */
//	方法二 （两个队列， 压入 - O(n)， 弹出 - O(1)）
	
	public void push2(Integer value) {
		q2.add(value);
		top=value;
		while(!q1.isEmpty()){
			q2.add(q1.remove());
		}
		
		Queue<Integer> temp = q1;
	    q1 = q2;
	    q2 = temp;//
		
	}
	
	/**
	 * 时间复杂度：O(1)O(1)
                  空间复杂度：O(1)O(1)
	 */
	public void pop2() {
		q1.poll(); //直接让q1头元素出队即可
		if (!q1.isEmpty()) {
	    	top = q1.peek();  //获取队列的头部元素
	    }
	}

	//方法三 （一个队列， 压入 - O(n)， 弹出 - O(1)）
	public void push3(Integer value) {
		q1.add(value);
		int size=q1.size();
		while(size>1){
			q1.add(q1.remove());
			size--;
		}
	}
	public void pop3() {
		q1.remove();
//		top=q1.peek();
	}
	
	public boolean isEmpty() {
		return q1.isEmpty();
	}
	public int top(){
		return q1.peek();
	}
}
