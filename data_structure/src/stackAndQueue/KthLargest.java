package stackAndQueue;

import java.util.Arrays;
import java.util.PriorityQueue;


public class KthLargest {
	private int k;
	private int[] nums;
	private PriorityQueue<Integer> queue=new PriorityQueue();    //优先队列就是小顶堆
	public KthLargest(int k, int[] nums) {
		super();
		this.k = k;
		this.nums = nums;
		for (int i : nums) {
			add(i);
		}
		
	}
	public Integer add(Integer value){
		if (queue.size()<k) {
			queue.offer(value);
		}else if(queue.peek()<value){
			queue.poll(); //弹出栈顶元素
			queue.offer(value);	
		}
		
		return queue.peek();
		
	}
	
	

}
