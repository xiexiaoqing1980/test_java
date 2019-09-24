package Sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSort {

	@Test
	void test() {
		int[] arr= {4,8,9,0,5};
		Msort.Msort(arr );
		System.out.println(arr);
	}
	
	@Test
	void test2() {
		int[] arr= {4,8,9,0,5};
		quicksort.quickSort1(arr);
		quicksort.quickSort1(arr);
		System.out.println(arr);
	}
	

}
