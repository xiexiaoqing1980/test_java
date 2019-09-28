package stackAndQueue;

import org.junit.Test;

import junit.framework.Assert;

public class TestKkthLargest {
	@Test
	public void test01(){
		 KthLargest k1=new KthLargest(2, new int[]{1,9,6,4});
		 int value=k1.add(5);
		 Assert.assertEquals(6, value);
	}

}
