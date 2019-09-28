package find;

import static org.junit.Assert.*;

import org.junit.Test;

public class demo1 {

	@Test
	public void test() {
		System.out.println(OrderFind.findIndex(new int[]{1, 6,7,9},10));
	}
	
	@Test
	public void test2() {
		System.out.println(OrderFind.binarySearch(new int[]{1, 6,7,9},9));
		System.out.println(OrderFind.binarySearch2(new int[]{1, 6,7,9},9,0,3));
	}

}
