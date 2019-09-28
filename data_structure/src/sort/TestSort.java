package sort;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestSort {

	@Test
	public void test() {

    int[] arr=null;
    BubbleSort.bubleSort1(arr);
    Assert.assertSame(BubbleSort.bubleSort1(arr), null);
	}
	
	@Test
	public void test2() {

    int[] arr={1};
    BubbleSort.bubleSort1(arr);
    Assert.assertSame(BubbleSort.bubleSort1(arr), arr);
	}
	
	@Test
	public void test3() {

    int[] arr={9,1,5,8,3,-7};
    int[] result=BubbleSort.bubleSort1(arr);
//    Assert.assertTrue(result==new int[]{1,3,5,7,8,9});
	}
	
	@Test
	public void test4() {

    int[] arr={0,1,3,4,-7};
    int[] result=BubbleSort.bubleSort2(arr);
    System.out.println(result);
//    Assert.assertTrue(result==new int[]{1,3,5,7,8,9});
	}

}
